package org.blayboy.newpipe.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceManager;

import com.nononsenseapps.filepicker.Utils;
import com.nostra13.universalimageloader.core.ImageLoader;

import org.blayboy.newpipe.DownloaderImpl;
import org.blayboy.newpipe.NewPipeDatabase;
import org.blayboy.newpipe.R;
import org.blayboy.newpipe.error.ErrorActivity;
import org.blayboy.newpipe.error.ReCaptchaActivity;
import org.blayboy.newpipe.util.FilePickerActivityHelper;
import org.blayboy.newpipe.util.ZipHelper;
import org.schabi.newpipe.extractor.NewPipe;
import org.schabi.newpipe.extractor.localization.ContentCountry;
import org.schabi.newpipe.extractor.localization.Localization;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ContentSettingsFragment extends BasePreferenceFragment {
    private static final int REQUEST_IMPORT_PATH = 8945;
    private static final int REQUEST_EXPORT_PATH = 30945;

    private ContentSettingsManager manager;

    private String thumbnailLoadToggleKey;
    private String youtubeRestrictedModeEnabledKey;

    private Localization initialSelectedLocalization;
    private ContentCountry initialSelectedContentCountry;
    private String initialLanguage;

    @Override
    public void onCreatePreferences(final Bundle savedInstanceState, final String rootKey) {
        final File homeDir = ContextCompat.getDataDir(requireContext());
        manager = new ContentSettingsManager(new NewPipeFileLocator(homeDir));
        manager.deleteSettingsFile();

        addPreferencesFromResource(R.xml.content_settings);

//

        thumbnailLoadToggleKey = getString(R.string.download_thumbnail_key);
        youtubeRestrictedModeEnabledKey = getString(R.string.youtube_restricted_mode_enabled);

        initialSelectedLocalization = org.blayboy.newpipe.util.Localization
                .getPreferredLocalization(requireContext());
        initialSelectedContentCountry = org.blayboy.newpipe.util.Localization
                .getPreferredContentCountry(requireContext());
        initialLanguage = PreferenceManager
                .getDefaultSharedPreferences(requireContext()).getString("app_language_key", "vi");
    }

    @Override
    public boolean onPreferenceTreeClick(final Preference preference) {
        if (preference.getKey().equals(thumbnailLoadToggleKey)) {
            final ImageLoader imageLoader = ImageLoader.getInstance();
            imageLoader.stop();
            imageLoader.clearDiskCache();
            imageLoader.clearMemoryCache();
            imageLoader.resume();
            Toast.makeText(preference.getContext(), R.string.thumbnail_cache_wipe_complete_notice,
                    Toast.LENGTH_SHORT).show();
        }

        if (preference.getKey().equals(youtubeRestrictedModeEnabledKey)) {
            final Context context = getContext();
            if (context != null) {
                DownloaderImpl.getInstance().updateYoutubeRestrictedModeCookies(context);
            } else {
                Log.w(TAG, "onPreferenceTreeClick: null context");
            }
        }

        return super.onPreferenceTreeClick(preference);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        final Localization selectedLocalization = org.blayboy.newpipe.util.Localization
                .getPreferredLocalization(requireContext());
        final ContentCountry selectedContentCountry = org.blayboy.newpipe.util.Localization
                .getPreferredContentCountry(requireContext());
        final String selectedLanguage = PreferenceManager
                .getDefaultSharedPreferences(requireContext()).getString("app_language_key", "vi");

        if (!selectedLocalization.equals(initialSelectedLocalization)
                || !selectedContentCountry.equals(initialSelectedContentCountry)
                || !selectedLanguage.equals(initialLanguage)) {
            Toast.makeText(requireContext(), R.string.localization_changes_requires_app_restart,
                    Toast.LENGTH_LONG).show();

            NewPipe.setupLocalization(selectedLocalization, selectedContentCountry);
        }
    }

    @Override
    public void onActivityResult(final int requestCode, final int resultCode,
                                 @NonNull final Intent data) {
        org.blayboy.newpipe.util.Localization.assureCorrectAppLanguage(getContext());
        super.onActivityResult(requestCode, resultCode, data);
    }

}
