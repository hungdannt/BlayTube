package org.blayboy.newpipe;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.multidex.MultiDexApplication;
import androidx.preference.PreferenceManager;

import com.nostra13.universalimageloader.cache.memory.impl.LRULimitedMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import org.acra.ACRA;
import org.acra.config.ACRAConfigurationException;
import org.acra.config.CoreConfiguration;
import org.acra.config.CoreConfigurationBuilder;
import org.blayboy.newpipe.R;
import org.blayboy.newpipe.error.ErrorActivity;
import org.blayboy.newpipe.error.ErrorInfo;
import org.blayboy.newpipe.error.ReCaptchaActivity;
import org.blayboy.newpipe.error.UserAction;
import org.schabi.newpipe.extractor.NewPipe;
import org.schabi.newpipe.extractor.downloader.Downloader;
import org.blayboy.newpipe.ktx.ExceptionUtils;
import org.blayboy.newpipe.settings.SettingsActivity;
import org.blayboy.newpipe.util.Localization;
import org.blayboy.newpipe.util.ServiceHelper;
import org.blayboy.newpipe.util.StateSaver;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;


public class App extends MultiDexApplication {
    protected static final String TAG = App.class.toString();
    private static App app;
    public static final String PACKAGE_NAME = BuildConfig.APPLICATION_ID;

    @Nullable
    private Disposable disposable = null;

    @NonNull
    public static App getApp() {
        return app;
    }

    @Override
    protected void attachBaseContext(final Context base) {
        super.attachBaseContext(base);
        initACRA();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;

        // Initialize settings first because others inits can use its values
        SettingsActivity.initSettings(this);

        NewPipe.init(getDownloader(),
            Localization.getPreferredLocalization(this),
            Localization.getPreferredContentCountry(this));
        Localization.initPrettyTime(Localization.resolvePrettyTime(getApplicationContext()));

        StateSaver.init(this);
        initNotificationChannels();

        ServiceHelper.initServices(this);

        // Initialize image loader
        ImageLoader.getInstance().init(getImageLoaderConfigurations(10, 50));

        configureRxJavaErrorHandler();

        // Check for new version
//        disposable = null;
    }

    @Override
    public void onTerminate() {
        if (disposable != null) {
            disposable.dispose();
        }
        super.onTerminate();
    }

    protected Downloader getDownloader() {
        final DownloaderImpl downloader = DownloaderImpl.init(null);
        setCookiesToDownloader(downloader);
        return downloader;
    }

    protected void setCookiesToDownloader(final DownloaderImpl downloader) {
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(
                getApplicationContext());
        final String key = getApplicationContext().getString(R.string.recaptcha_cookies_key);
        downloader.setCookie(ReCaptchaActivity.RECAPTCHA_COOKIES_KEY, prefs.getString(key, ""));
        downloader.updateYoutubeRestrictedModeCookies(getApplicationContext());
    }

    private void configureRxJavaErrorHandler() {
        // https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling
        RxJavaPlugins.setErrorHandler(new Consumer<Throwable>() {
            @Override
            public void accept(@NonNull final Throwable throwable) {
                Log.e(TAG, "RxJavaPlugins.ErrorHandler called with -> : "
                        + "throwable = [" + throwable.getClass().getName() + "]");

                final Throwable actualThrowable;
                if (throwable instanceof UndeliverableException) {
                    // As UndeliverableException is a wrapper,
                    // get the cause of it to get the "real" exception
                    actualThrowable = throwable.getCause();
                } else {
                    actualThrowable = throwable;
                }

                final List<Throwable> errors;
                if (actualThrowable instanceof CompositeException) {
                    errors = ((CompositeException) actualThrowable).getExceptions();
                } else {
                    errors = Collections.singletonList(actualThrowable);
                }

                for (final Throwable error : errors) {
                    if (isThrowableIgnored(error)) {
                        return;
                    }
                    if (isThrowableCritical(error)) {
                        reportException(error);
                        return;
                    }
                }

                // Out-of-lifecycle exceptions should only be reported if a debug user wishes so,
                // When exception is not reported, log it
                if (isDisposedRxExceptionsReported()) {
                    reportException(actualThrowable);
                } else {
                    Log.e(TAG, "RxJavaPlugin: Undeliverable Exception received: ", actualThrowable);
                }
            }

            private boolean isThrowableIgnored(@NonNull final Throwable throwable) {
                // Don't crash the application over a simple network problem
                return ExceptionUtils.hasAssignableCause(throwable,
                        // network api cancellation
                        IOException.class, SocketException.class,
                        // blocking code disposed
                        InterruptedException.class, InterruptedIOException.class);
            }

            private boolean isThrowableCritical(@NonNull final Throwable throwable) {
                // Though these exceptions cannot be ignored
                return ExceptionUtils.hasAssignableCause(throwable,
                        NullPointerException.class, IllegalArgumentException.class, // bug in app
                        OnErrorNotImplementedException.class, MissingBackpressureException.class,
                        IllegalStateException.class); // bug in operator
            }

            private void reportException(@NonNull final Throwable throwable) {
                // Throw uncaught exception that will trigger the report system
                Thread.currentThread().getUncaughtExceptionHandler()
                        .uncaughtException(Thread.currentThread(), throwable);
            }
        });
    }

    private ImageLoaderConfiguration getImageLoaderConfigurations(final int memoryCacheSizeMb,
                                                                  final int diskCacheSizeMb) {
        return new ImageLoaderConfiguration.Builder(this)
                .memoryCache(new LRULimitedMemoryCache(memoryCacheSizeMb * 1024 * 1024))
                .diskCacheSize(diskCacheSizeMb * 1024 * 1024)
                .imageDownloader(new ImageDownloader(getApplicationContext()))
                .build();
    }

    /**
     * Called in {@link #attachBaseContext(Context)} after calling the {@code super} method.
     * Should be overridden if MultiDex is enabled, since it has to be initialized before ACRA.
     */
    protected void initACRA() {
        if (ACRA.isACRASenderServiceProcess()) {
            return;
        }

        try {
            final CoreConfiguration acraConfig = new CoreConfigurationBuilder(this)
                    .setBuildConfigClass(BuildConfig.class)
                    .build();
            ACRA.init(this, acraConfig);
        } catch (final ACRAConfigurationException exception) {
            exception.printStackTrace();
            ErrorActivity.reportError(this, new ErrorInfo(exception,
                    UserAction.SOMETHING_ELSE, "Could not initialize ACRA crash report"));
        }
    }

    private void initNotificationChannels() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            return;
        }

        String id = getString(R.string.notification_channel_id);
        String name = getString(R.string.notification_channel_name);
        String description = getString(R.string.notification_channel_description);

        // Keep this below DEFAULT to avoid making noise on every notification update for the main
        // and update channels
        int importance = NotificationManager.IMPORTANCE_LOW;

        final NotificationChannel mainChannel = new NotificationChannel(id, name, importance);
        mainChannel.setDescription(description);

        id = getString(R.string.app_update_notification_channel_id);
        name = getString(R.string.app_update_notification_channel_name);
        description = getString(R.string.app_update_notification_channel_description);

        final NotificationChannel appUpdateChannel = new NotificationChannel(id, name, importance);
        appUpdateChannel.setDescription(description);

        id = getString(R.string.hash_channel_id);
        name = getString(R.string.hash_channel_name);
        description = getString(R.string.hash_channel_description);
        importance = NotificationManager.IMPORTANCE_HIGH;

        final NotificationChannel hashChannel = new NotificationChannel(id, name, importance);
        hashChannel.setDescription(description);

        final NotificationManager notificationManager = getSystemService(NotificationManager.class);
        notificationManager.createNotificationChannels(Arrays.asList(mainChannel,
                appUpdateChannel, hashChannel));
    }

    protected boolean isDisposedRxExceptionsReported() {
        return false;
    }
}
