
package org.blayboy.newpipe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.PreferenceManager;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import org.blayboy.newpipe.R;
import org.blayboy.newpipe.databinding.ActivityMainBinding;
import org.blayboy.newpipe.databinding.DrawerHeaderBinding;
import org.blayboy.newpipe.databinding.DrawerLayoutBinding;
import org.blayboy.newpipe.databinding.InstanceSpinnerLayoutBinding;
import org.blayboy.newpipe.databinding.ToolbarLayoutBinding;
import org.blayboy.newpipe.error.ErrorActivity;
import org.schabi.newpipe.extractor.NewPipe;
import org.schabi.newpipe.extractor.StreamingService;
import org.schabi.newpipe.extractor.exceptions.ExtractionException;
import org.schabi.newpipe.extractor.services.peertube.PeertubeInstance;
import org.blayboy.newpipe.fragments.BackPressable;
import org.blayboy.newpipe.fragments.MainFragment;
import org.blayboy.newpipe.fragments.detail.VideoDetailFragment;
import org.blayboy.newpipe.fragments.list.search.SearchFragment;
import org.blayboy.newpipe.player.Player;
import org.blayboy.newpipe.player.event.OnKeyDownListener;
import org.blayboy.newpipe.player.helper.PlayerHolder;
import org.blayboy.newpipe.player.playqueue.PlayQueue;
import org.blayboy.newpipe.util.Constants;
import org.blayboy.newpipe.util.DeviceUtils;
import org.blayboy.newpipe.util.KioskTranslator;
import org.blayboy.newpipe.util.Localization;
import org.blayboy.newpipe.util.NavigationHelper;
import org.blayboy.newpipe.util.PeertubeHelper;
import org.blayboy.newpipe.util.PermissionHelper;
import org.blayboy.newpipe.util.SerializedCache;
import org.blayboy.newpipe.util.ServiceHelper;
import org.blayboy.newpipe.util.StateSaver;
import org.blayboy.newpipe.util.TLSSocketFactoryCompat;
import org.blayboy.newpipe.util.ThemeHelper;
import org.blayboy.newpipe.views.FocusOverlayView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.blayboy.newpipe.util.Localization.assureCorrectAppLanguage;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final boolean DEBUG = !BuildConfig.BUILD_TYPE.equals("release");

    private ActivityMainBinding mainBinding;
    private DrawerHeaderBinding drawerHeaderBinding;
    private DrawerLayoutBinding drawerLayoutBinding;
    private ToolbarLayoutBinding toolbarLayoutBinding;

    private ActionBarDrawerToggle toggle;

    private boolean servicesShown = false;

    private BroadcastReceiver broadcastReceiver;

    private static final int ITEM_ID_BOOKMARKS = -3;
    private static final int ITEM_ID_DOWNLOADS = -4;
    private static final int ITEM_ID_HISTORY = -5;
    private static final int ITEM_ID_SETTINGS = 0;
    private static final int ORDER = 0;

    /*//////////////////////////////////////////////////////////////////////////
    // Activity's LifeCycle
    //////////////////////////////////////////////////////////////////////////*/

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        if (DEBUG) {
            Log.d(TAG, "onCreate() called with: "
                    + "savedInstanceState = [" + savedInstanceState + "]");
        }


        ThemeHelper.setDayNightMode(this);
        ThemeHelper.setTheme(this, ServiceHelper.getSelectedServiceId(this));

        assureCorrectAppLanguage(this);
        super.onCreate(savedInstanceState);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        drawerLayoutBinding = mainBinding.drawerLayout;
        drawerHeaderBinding = DrawerHeaderBinding.bind(drawerLayoutBinding.navigation
                .getHeaderView(0));
        toolbarLayoutBinding = mainBinding.toolbarLayout;
        setContentView(mainBinding.getRoot());

        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            initFragments();
        }

        setSupportActionBar(toolbarLayoutBinding.toolbar);
        try {
            setupDrawer();
        } catch (final Exception e) {
            ErrorActivity.reportUiErrorInSnackbar(this, "Setting up drawer", e);
        }

        if (DeviceUtils.isTv(this)) {
            FocusOverlayView.setupFocusObserver(this);
        }
        openMiniPlayerUponPlayerStarted();
    }

    private void setupDrawer() throws Exception {
        //Tabs
        final int currentServiceId = ServiceHelper.getSelectedServiceId(this);
        final StreamingService service = NewPipe.getService(currentServiceId);

        int kioskId = 0;

        for (final String ks : service.getKioskList().getAvailableKiosks()) {
            drawerLayoutBinding.navigation.getMenu()
                    .add(R.id.menu_tabs_group, kioskId, 0, KioskTranslator
                            .getTranslatedKioskName(ks, this))
                    .setIcon(KioskTranslator.getKioskIcon(ks, this));
            kioskId++;
        }

        drawerLayoutBinding.navigation.getMenu()
                .add(R.id.menu_tabs_group, ITEM_ID_BOOKMARKS, ORDER, R.string.tab_bookmarks)
                .setIcon(R.drawable.ic_bookmark);
        drawerLayoutBinding.navigation.getMenu()
                .add(R.id.menu_tabs_group, ITEM_ID_DOWNLOADS, ORDER, R.string.downloads)
                .setIcon(R.drawable.ic_file_download);
        drawerLayoutBinding.navigation.getMenu()
                .add(R.id.menu_tabs_group, ITEM_ID_HISTORY, ORDER, R.string.action_history)
                .setIcon(R.drawable.ic_history);

        //Settings and About
        drawerLayoutBinding.navigation.getMenu()
                .add(R.id.menu_options_about_group, ITEM_ID_SETTINGS, ORDER, R.string.settings)
                .setIcon(R.drawable.ic_settings);

        toggle = new ActionBarDrawerToggle(this, mainBinding.getRoot(),
                toolbarLayoutBinding.toolbar, R.string.drawer_open, R.string.drawer_close);
        toggle.syncState();
        mainBinding.getRoot().addDrawerListener(toggle);
        mainBinding.getRoot().addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            private int lastService;

            @Override
            public void onDrawerOpened(final View drawerView) {
                lastService = ServiceHelper.getSelectedServiceId(MainActivity.this);
            }

            @Override
            public void onDrawerClosed(final View drawerView) {
                if (servicesShown) {
                    toggleServices();
                }
                if (lastService != ServiceHelper.getSelectedServiceId(MainActivity.this)) {
                    ActivityCompat.recreate(MainActivity.this);
                }
            }
        });
        drawerLayoutBinding.navigation.setNavigationItemSelectedListener(this::drawerItemSelected);
        setupDrawerHeader();
    }

    private boolean drawerItemSelected(final MenuItem item) {
        switch (item.getGroupId()) {
            case R.id.menu_services_group:
                changeService(item);
                break;
            case R.id.menu_tabs_group:
                try {
                    tabSelected(item);
                } catch (final Exception e) {
                    ErrorActivity.reportUiErrorInSnackbar(this, "Selecting main page tab", e);
                }
                break;
            case R.id.menu_options_about_group:
                optionsAboutSelected(item);
                break;
            default:
                return false;
        }

        mainBinding.getRoot().closeDrawers();
        return true;
    }

    private void changeService(final MenuItem item) {
        drawerLayoutBinding.navigation.getMenu()
                .getItem(ServiceHelper.getSelectedServiceId(this))
                .setChecked(false);
        ServiceHelper.setSelectedServiceId(this, item.getItemId());
        drawerLayoutBinding.navigation.getMenu()
                .getItem(ServiceHelper.getSelectedServiceId(this))
                .setChecked(true);
    }

    private void tabSelected(final MenuItem item) throws ExtractionException {
        switch (item.getItemId()) {

            case ITEM_ID_BOOKMARKS:
                NavigationHelper.openBookmarksFragment(getSupportFragmentManager());
                break;
            case ITEM_ID_DOWNLOADS:
                NavigationHelper.openDownloads(this);
                break;
            case ITEM_ID_HISTORY:
                NavigationHelper.openStatisticFragment(getSupportFragmentManager());
                break;
            default:
                final int currentServiceId = 0;
                final StreamingService service = NewPipe.getService(currentServiceId);
                String serviceName = "";

                int kioskId = 0;
                for (final String ks : service.getKioskList().getAvailableKiosks()) {
                    if (kioskId == item.getItemId()) {
                        serviceName = ks;
                    }
                    kioskId++;
                }

                NavigationHelper.openKioskFragment(getSupportFragmentManager(), currentServiceId,
                        serviceName);
                break;
        }
    }

    private void optionsAboutSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case ITEM_ID_SETTINGS:
                NavigationHelper.openSettings(this);
                break;
        }
    }

    private void setupDrawerHeader() {
            final ViewGroup.LayoutParams layoutParams =
                    drawerHeaderBinding.drawerHeaderNewpipeTitle.getLayoutParams();
            layoutParams.width = ViewGroup.LayoutParams.WRAP_CONTENT;
            drawerHeaderBinding.drawerHeaderNewpipeTitle.setLayoutParams(layoutParams);
            drawerHeaderBinding.drawerHeaderNewpipeTitle.setMaxLines(2);
            drawerHeaderBinding.drawerHeaderNewpipeTitle.setMinWidth(getResources()
                    .getDimensionPixelSize(R.dimen.drawer_header_newpipe_title_default_width));
            drawerHeaderBinding.drawerHeaderNewpipeTitle.setMaxWidth(getResources()
                    .getDimensionPixelSize(R.dimen.drawer_header_newpipe_title_max_width));
    }

    private void toggleServices() {
        servicesShown = !servicesShown;

        drawerLayoutBinding.navigation.getMenu().removeGroup(R.id.menu_services_group);
        drawerLayoutBinding.navigation.getMenu().removeGroup(R.id.menu_tabs_group);
        drawerLayoutBinding.navigation.getMenu().removeGroup(R.id.menu_options_about_group);

        if (servicesShown) {
//            showServices();
        } else {
            try {
                showTabs();
            } catch (final Exception e) {
                ErrorActivity.reportUiErrorInSnackbar(this, "Showing main page tabs", e);
            }
        }
    }

//    private void showServices() {
//
//        for (final StreamingService s : NewPipe.getServices()) {
//            final String title = s.getServiceInfo().getName();
//            if (title == "YouTube") {
//                final MenuItem menuItem = drawerLayoutBinding.navigation.getMenu()
//                        .add(R.id.menu_services_group, s.getServiceId(), ORDER, title)
//                        .setIcon(ServiceHelper.getIcon(s.getServiceId()));
//            }
//        }
//        drawerLayoutBinding.navigation.getMenu()
//                .getItem(ServiceHelper.getSelectedServiceId(this))
//                .setChecked(true);
//    }


    private void showTabs() throws ExtractionException {

        //Tabs
        final int currentServiceId = ServiceHelper.getSelectedServiceId(this);
        final StreamingService service = NewPipe.getService(currentServiceId);

        int kioskId = 0;

        for (final String ks : service.getKioskList().getAvailableKiosks()) {
            drawerLayoutBinding.navigation.getMenu()
                    .add(R.id.menu_tabs_group, kioskId, ORDER,
                            KioskTranslator.getTranslatedKioskName(ks, this))
                    .setIcon(KioskTranslator.getKioskIcon(ks, this));
            kioskId++;
        }

        drawerLayoutBinding.navigation.getMenu()
                .add(R.id.menu_tabs_group, ITEM_ID_BOOKMARKS, ORDER, R.string.tab_bookmarks)
                .setIcon(R.drawable.ic_bookmark);
        drawerLayoutBinding.navigation.getMenu()
                .add(R.id.menu_tabs_group, ITEM_ID_DOWNLOADS, ORDER, R.string.downloads)
                .setIcon(R.drawable.ic_file_download);
        drawerLayoutBinding.navigation.getMenu()
                .add(R.id.menu_tabs_group, ITEM_ID_HISTORY, ORDER, R.string.action_history)
                .setIcon(R.drawable.ic_history);

        //Settings and About
        drawerLayoutBinding.navigation.getMenu()
                .add(R.id.menu_options_about_group, ITEM_ID_SETTINGS, ORDER, R.string.settings)
                .setIcon(R.drawable.ic_settings);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (!isChangingConfigurations()) {
            StateSaver.clearStateFiles();
        }
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }

    @Override
    protected void onResume() {
        assureCorrectAppLanguage(this);
        // Change the date format to match the selected language on resume
        Localization.initPrettyTime(Localization.resolvePrettyTime(getApplicationContext()));
        super.onResume();

        // Close drawer on return, and don't show animation,
        // so it looks like the drawer isn't open when the user returns to MainActivity
        mainBinding.getRoot().closeDrawer(GravityCompat.START, false);
        try {
//            final int selectedServiceId = ServiceHelper.getSelectedServiceId(this);
            final String selectedServiceName = NewPipe.getService(0)
                    .getServiceInfo().getName();
//            drawerHeaderBinding.drawerHeaderServiceView.setText(selectedServiceName);
//            drawerHeaderBinding.drawerHeaderServiceIcon.setImageResource(ServiceHelper
//                    .getIcon(selectedServiceId));

//            drawerHeaderBinding.drawerHeaderServiceView.post(() -> drawerHeaderBinding
//                    .drawerHeaderServiceView.setSelected(true));
        } catch (final Exception e) {
            ErrorActivity.reportUiErrorInSnackbar(this, "Setting up service toggle", e);
        }

        final SharedPreferences sharedPreferences
                = PreferenceManager.getDefaultSharedPreferences(this);
        if (sharedPreferences.getBoolean(Constants.KEY_THEME_CHANGE, false)) {
            if (DEBUG) {
                Log.d(TAG, "Theme has changed, recreating activity...");
            }
            sharedPreferences.edit().putBoolean(Constants.KEY_THEME_CHANGE, false).apply();
            ActivityCompat.recreate(this);
        }

        if (sharedPreferences.getBoolean(Constants.KEY_MAIN_PAGE_CHANGE, false)) {
            if (DEBUG) {
                Log.d(TAG, "main page has changed, recreating main fragment...");
            }
            sharedPreferences.edit().putBoolean(Constants.KEY_MAIN_PAGE_CHANGE, false).apply();
            NavigationHelper.openMainActivity(this);
        }

        final boolean isHistoryEnabled = sharedPreferences.getBoolean(
                getString(R.string.enable_watch_history_key), true);
        drawerLayoutBinding.navigation.getMenu().findItem(ITEM_ID_HISTORY)
                .setVisible(isHistoryEnabled);
    }

    @Override
    protected void onNewIntent(final Intent intent) {
        if (DEBUG) {
            Log.d(TAG, "onNewIntent() called with: intent = [" + intent + "]");
        }
        if (intent != null) {
            // Return if launched from a launcher (e.g. Nova Launcher, Pixel Launcher ...)
            // to not destroy the already created backstack
            final String action = intent.getAction();
            if ((action != null && action.equals(Intent.ACTION_MAIN))
                    && intent.hasCategory(Intent.CATEGORY_LAUNCHER)) {
                return;
            }
        }

        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent(intent);
    }

    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        final Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragment_player_holder);
        if (fragment instanceof OnKeyDownListener
                && !bottomSheetHiddenOrCollapsed()) {
            // Provide keyDown event to fragment which then sends this event
            // to the main player service
            return ((OnKeyDownListener) fragment).onKeyDown(keyCode)
                    || super.onKeyDown(keyCode, event);
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        if (DEBUG) {
            Log.d(TAG, "onBackPressed() called");
        }

        if (DeviceUtils.isTv(this)) {
            if (mainBinding.getRoot().isDrawerOpen(drawerLayoutBinding.navigation)) {
                mainBinding.getRoot().closeDrawers();
                return;
            }
        }

        // In case bottomSheet is not visible on the screen or collapsed we can assume that the user
        // interacts with a fragment inside fragment_holder so all back presses should be
        // handled by it
        if (bottomSheetHiddenOrCollapsed()) {
            final Fragment fragment = getSupportFragmentManager()
                    .findFragmentById(R.id.fragment_holder);
            // If current fragment implements BackPressable (i.e. can/wanna handle back press)
            // delegate the back press to it
            if (fragment instanceof BackPressable) {
                if (((BackPressable) fragment).onBackPressed()) {
                    return;
                }
            }

        } else {
            final Fragment fragmentPlayer = getSupportFragmentManager()
                    .findFragmentById(R.id.fragment_player_holder);
            // If current fragment implements BackPressable (i.e. can/wanna handle back press)
            // delegate the back press to it
            if (fragmentPlayer instanceof BackPressable) {
                if (!((BackPressable) fragmentPlayer).onBackPressed()) {
                    BottomSheetBehavior.from(mainBinding.fragmentPlayerHolder)
                            .setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
                return;
            }
        }

        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onRequestPermissionsResult(final int requestCode,
                                           @NonNull final String[] permissions,
                                           @NonNull final int[] grantResults) {
        for (final int i : grantResults) {
            if (i == PackageManager.PERMISSION_DENIED) {
                return;
            }
        }
        switch (requestCode) {
            case PermissionHelper.DOWNLOADS_REQUEST_CODE:
                NavigationHelper.openDownloads(this);
                break;
            case PermissionHelper.DOWNLOAD_DIALOG_REQUEST_CODE:
                final Fragment fragment = getSupportFragmentManager()
                        .findFragmentById(R.id.fragment_player_holder);
                if (fragment instanceof VideoDetailFragment) {
                    ((VideoDetailFragment) fragment).openDownloadDialog();
                }
                break;
        }
    }

    private void onHomeButtonPressed() {
        // If search fragment wasn't found in the backstack...
        if (!NavigationHelper.tryGotoSearchFragment(getSupportFragmentManager())) {
            // ...go to the main fragment
            NavigationHelper.gotoMainFragment(getSupportFragmentManager());
        }
    }

    /*//////////////////////////////////////////////////////////////////////////
    // Menu
    //////////////////////////////////////////////////////////////////////////*/

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        if (DEBUG) {
            Log.d(TAG, "onCreateOptionsMenu() called with: menu = [" + menu + "]");
        }
        super.onCreateOptionsMenu(menu);

        final Fragment fragment
                = getSupportFragmentManager().findFragmentById(R.id.fragment_holder);
        if (!(fragment instanceof SearchFragment)) {
            toolbarLayoutBinding.toolbarSearchContainer.getRoot().setVisibility(View.GONE);
        }

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
        }

        updateDrawerNavigation();

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull final MenuItem item) {
        if (DEBUG) {
            Log.d(TAG, "onOptionsItemSelected() called with: item = [" + item + "]");
        }

        if (item.getItemId() == android.R.id.home) {
            onHomeButtonPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*//////////////////////////////////////////////////////////////////////////
    // Init
    //////////////////////////////////////////////////////////////////////////*/

    private void initFragments() {
        if (DEBUG) {
            Log.d(TAG, "initFragments() called");
        }
        StateSaver.clearStateFiles();
        if (getIntent() != null && getIntent().hasExtra(Constants.KEY_LINK_TYPE)) {
            // When user watch a video inside popup and then tries to open the video in main player
            // while the app is closed he will see a blank fragment on place of kiosk.
            // Let's open it first
            if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
                NavigationHelper.openMainFragment(getSupportFragmentManager());
            }

            handleIntent(getIntent());
        } else {
            NavigationHelper.gotoMainFragment(getSupportFragmentManager());
        }
    }

    /*//////////////////////////////////////////////////////////////////////////
    // Utils
    //////////////////////////////////////////////////////////////////////////*/

    private void updateDrawerNavigation() {
        if (getSupportActionBar() == null) {
            return;
        }

        final Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.fragment_holder);
        if (fragment instanceof MainFragment) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            if (toggle != null) {
                toggle.syncState();
                toolbarLayoutBinding.toolbar.setNavigationOnClickListener(v -> mainBinding.getRoot()
                        .openDrawer(GravityCompat.START));
                mainBinding.getRoot().setDrawerLockMode(DrawerLayout.LOCK_MODE_UNDEFINED);
            }
        } else {
            mainBinding.getRoot().setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbarLayoutBinding.toolbar.setNavigationOnClickListener(v -> onHomeButtonPressed());
        }
    }

    private void handleIntent(final Intent intent) {
        try {
            if (DEBUG) {
                Log.d(TAG, "handleIntent() called with: intent = [" + intent + "]");
            }

            if (intent.hasExtra(Constants.KEY_LINK_TYPE)) {
                final String url = intent.getStringExtra(Constants.KEY_URL);
                final int serviceId = intent.getIntExtra(Constants.KEY_SERVICE_ID, 0);
                String title = intent.getStringExtra(Constants.KEY_TITLE);
                if (title == null) {
                    title = "";
                }

                final StreamingService.LinkType linkType = ((StreamingService.LinkType) intent
                        .getSerializableExtra(Constants.KEY_LINK_TYPE));
                assert linkType != null;
                switch (linkType) {
                    case STREAM:
                        final String intentCacheKey = intent.getStringExtra(
                                Player.PLAY_QUEUE_KEY);
                        final PlayQueue playQueue = intentCacheKey != null
                                ? SerializedCache.getInstance()
                                .take(intentCacheKey, PlayQueue.class)
                                : null;

                        final boolean switchingPlayers = intent.getBooleanExtra(
                                VideoDetailFragment.KEY_SWITCHING_PLAYERS, false);
                        NavigationHelper.openVideoDetailFragment(
                                getApplicationContext(), getSupportFragmentManager(),
                                serviceId, url, title, playQueue, switchingPlayers);
                        break;
                    case CHANNEL:
                        NavigationHelper.openChannelFragment(getSupportFragmentManager(),
                                serviceId, url, title);
                        break;
                    case PLAYLIST:
                        NavigationHelper.openPlaylistFragment(getSupportFragmentManager(),
                                serviceId, url, title);
                        break;
                }
            } else if (intent.hasExtra(Constants.KEY_OPEN_SEARCH)) {
                String searchString = intent.getStringExtra(Constants.KEY_SEARCH_STRING);
                if (searchString == null) {
                    searchString = "";
                }
                final int serviceId = intent.getIntExtra(Constants.KEY_SERVICE_ID, 0);
                NavigationHelper.openSearchFragment(
                        getSupportFragmentManager(),
                        serviceId,
                        searchString);

            } else {
                NavigationHelper.gotoMainFragment(getSupportFragmentManager());
            }
        } catch (final Exception e) {
            ErrorActivity.reportUiErrorInSnackbar(this, "Handling intent", e);
        }
    }

    private void openMiniPlayerIfMissing() {
        final Fragment fragmentPlayer = getSupportFragmentManager()
                .findFragmentById(R.id.fragment_player_holder);
        if (fragmentPlayer == null) {
            // We still don't have a fragment attached to the activity. It can happen when a user
            // started popup or background players without opening a stream inside the fragment.
            // Adding it in a collapsed state (only mini player will be visible).
            NavigationHelper.showMiniPlayer(getSupportFragmentManager());
        }
    }

    private void openMiniPlayerUponPlayerStarted() {
        if (getIntent().getSerializableExtra(Constants.KEY_LINK_TYPE)
                == StreamingService.LinkType.STREAM) {
            // handleIntent() already takes care of opening video detail fragment
            // due to an intent containing a STREAM link
            return;
        }

        if (PlayerHolder.isPlayerOpen()) {
            // if the player is already open, no need for a broadcast receiver
            openMiniPlayerIfMissing();
        } else {
            // listen for player start intent being sent around
            broadcastReceiver = new BroadcastReceiver() {
                @Override
                public void onReceive(final Context context, final Intent intent) {
                    if (Objects.equals(intent.getAction(),
                            VideoDetailFragment.ACTION_PLAYER_STARTED)) {
                        openMiniPlayerIfMissing();
                        // At this point the player is added 100%, we can unregister. Other actions
                        // are useless since the fragment will not be removed after that.
                        unregisterReceiver(broadcastReceiver);
                        broadcastReceiver = null;
                    }
                }
            };
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(VideoDetailFragment.ACTION_PLAYER_STARTED);
            registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    private boolean bottomSheetHiddenOrCollapsed() {
        final BottomSheetBehavior<FrameLayout> bottomSheetBehavior =
                BottomSheetBehavior.from(mainBinding.fragmentPlayerHolder);

        final int sheetState = bottomSheetBehavior.getState();
        return sheetState == BottomSheetBehavior.STATE_HIDDEN
                || sheetState == BottomSheetBehavior.STATE_COLLAPSED;
    }
}
