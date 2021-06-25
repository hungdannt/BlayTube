// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;
import org.blayboy.newpipe.views.ExpandableSurfaceView;
import org.blayboy.newpipe.views.FocusAwareSeekBar;

public final class PlayerBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout bottomControls;

  @NonNull
  public final ImageView brightnessImageView;

  @NonNull
  public final ProgressBar brightnessProgressBar;

  @NonNull
  public final RelativeLayout brightnessRelativeLayout;

  @NonNull
  public final TextView captionTextView;

  @NonNull
  public final TextView channelTextView;

  @NonNull
  public final Button closeButton;

  @NonNull
  public final View closingOverlay;

  @NonNull
  public final ImageView controlAnimationView;

  @NonNull
  public final TextView currentDisplaySeek;

  @NonNull
  public final ImageView endScreen;

  @NonNull
  public final AppCompatImageButton fullScreenButton;

  @NonNull
  public final RecyclerView itemsList;

  @NonNull
  public final AppCompatImageButton itemsListClose;

  @NonNull
  public final RelativeLayout itemsListControl;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-large-land/</li>
   * </ul>
   */
  @Nullable
  public final AppCompatTextView itemsListHeaderDuration;

  @NonNull
  public final AppCompatTextView itemsListHeaderTitle;

  @NonNull
  public final RelativeLayout itemsListPanel;

  @NonNull
  public final RelativeLayout loadingPanel;

  @NonNull
  public final LinearLayout metadataView;

  @NonNull
  public final AppCompatImageButton moreOptionsButton;

  @NonNull
  public final AppCompatImageButton openInBrowser;

  @NonNull
  public final AppCompatImageButton playNextButton;

  @NonNull
  public final AppCompatImageButton playPauseButton;

  @NonNull
  public final AppCompatImageButton playPreviousButton;

  @NonNull
  public final AppCompatImageButton playWithKodi;

  @NonNull
  public final RelativeLayout playbackControlRoot;

  @NonNull
  public final TextView playbackCurrentTime;

  @NonNull
  public final TextView playbackEndTime;

  @NonNull
  public final TextView playbackLiveSync;

  @NonNull
  public final FocusAwareSeekBar playbackSeekBar;

  @NonNull
  public final TextView playbackSpeed;

  @NonNull
  public final RelativeLayout playbackWindowRoot;

  @NonNull
  public final View playerBottomShadow;

  @NonNull
  public final AppCompatImageButton playerCloseButton;

  @NonNull
  public final RelativeLayout playerOverlays;

  @NonNull
  public final View playerTopShadow;

  @NonNull
  public final LinearLayout primaryControls;

  @NonNull
  public final ProgressBar progressBarLoadingPanel;

  @NonNull
  public final TextView qualityTextView;

  @NonNull
  public final AppCompatImageButton queueButton;

  @NonNull
  public final View repeatButton;

  @NonNull
  public final TextView resizeTextView;

  @NonNull
  public final AppCompatImageButton screenRotationButton;

  @NonNull
  public final LinearLayout secondaryControls;

  @NonNull
  public final AppCompatImageButton segmentsButton;

  @NonNull
  public final AppCompatImageButton share;

  @NonNull
  public final AppCompatImageButton shuffleButton;

  @NonNull
  public final SubtitleView subtitleView;

  @NonNull
  public final View surfaceForeground;

  @NonNull
  public final ExpandableSurfaceView surfaceView;

  @NonNull
  public final AppCompatImageButton switchMute;

  @NonNull
  public final TextView titleTextView;

  @NonNull
  public final LinearLayout topControls;

  @NonNull
  public final ImageView volumeImageView;

  @NonNull
  public final ProgressBar volumeProgressBar;

  @NonNull
  public final RelativeLayout volumeRelativeLayout;

  private PlayerBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout bottomControls,
      @NonNull ImageView brightnessImageView, @NonNull ProgressBar brightnessProgressBar,
      @NonNull RelativeLayout brightnessRelativeLayout, @NonNull TextView captionTextView,
      @NonNull TextView channelTextView, @NonNull Button closeButton, @NonNull View closingOverlay,
      @NonNull ImageView controlAnimationView, @NonNull TextView currentDisplaySeek,
      @NonNull ImageView endScreen, @NonNull AppCompatImageButton fullScreenButton,
      @NonNull RecyclerView itemsList, @NonNull AppCompatImageButton itemsListClose,
      @NonNull RelativeLayout itemsListControl, @Nullable AppCompatTextView itemsListHeaderDuration,
      @NonNull AppCompatTextView itemsListHeaderTitle, @NonNull RelativeLayout itemsListPanel,
      @NonNull RelativeLayout loadingPanel, @NonNull LinearLayout metadataView,
      @NonNull AppCompatImageButton moreOptionsButton, @NonNull AppCompatImageButton openInBrowser,
      @NonNull AppCompatImageButton playNextButton, @NonNull AppCompatImageButton playPauseButton,
      @NonNull AppCompatImageButton playPreviousButton, @NonNull AppCompatImageButton playWithKodi,
      @NonNull RelativeLayout playbackControlRoot, @NonNull TextView playbackCurrentTime,
      @NonNull TextView playbackEndTime, @NonNull TextView playbackLiveSync,
      @NonNull FocusAwareSeekBar playbackSeekBar, @NonNull TextView playbackSpeed,
      @NonNull RelativeLayout playbackWindowRoot, @NonNull View playerBottomShadow,
      @NonNull AppCompatImageButton playerCloseButton, @NonNull RelativeLayout playerOverlays,
      @NonNull View playerTopShadow, @NonNull LinearLayout primaryControls,
      @NonNull ProgressBar progressBarLoadingPanel, @NonNull TextView qualityTextView,
      @NonNull AppCompatImageButton queueButton, @NonNull View repeatButton,
      @NonNull TextView resizeTextView, @NonNull AppCompatImageButton screenRotationButton,
      @NonNull LinearLayout secondaryControls, @NonNull AppCompatImageButton segmentsButton,
      @NonNull AppCompatImageButton share, @NonNull AppCompatImageButton shuffleButton,
      @NonNull SubtitleView subtitleView, @NonNull View surfaceForeground,
      @NonNull ExpandableSurfaceView surfaceView, @NonNull AppCompatImageButton switchMute,
      @NonNull TextView titleTextView, @NonNull LinearLayout topControls,
      @NonNull ImageView volumeImageView, @NonNull ProgressBar volumeProgressBar,
      @NonNull RelativeLayout volumeRelativeLayout) {
    this.rootView = rootView;
    this.bottomControls = bottomControls;
    this.brightnessImageView = brightnessImageView;
    this.brightnessProgressBar = brightnessProgressBar;
    this.brightnessRelativeLayout = brightnessRelativeLayout;
    this.captionTextView = captionTextView;
    this.channelTextView = channelTextView;
    this.closeButton = closeButton;
    this.closingOverlay = closingOverlay;
    this.controlAnimationView = controlAnimationView;
    this.currentDisplaySeek = currentDisplaySeek;
    this.endScreen = endScreen;
    this.fullScreenButton = fullScreenButton;
    this.itemsList = itemsList;
    this.itemsListClose = itemsListClose;
    this.itemsListControl = itemsListControl;
    this.itemsListHeaderDuration = itemsListHeaderDuration;
    this.itemsListHeaderTitle = itemsListHeaderTitle;
    this.itemsListPanel = itemsListPanel;
    this.loadingPanel = loadingPanel;
    this.metadataView = metadataView;
    this.moreOptionsButton = moreOptionsButton;
    this.openInBrowser = openInBrowser;
    this.playNextButton = playNextButton;
    this.playPauseButton = playPauseButton;
    this.playPreviousButton = playPreviousButton;
    this.playWithKodi = playWithKodi;
    this.playbackControlRoot = playbackControlRoot;
    this.playbackCurrentTime = playbackCurrentTime;
    this.playbackEndTime = playbackEndTime;
    this.playbackLiveSync = playbackLiveSync;
    this.playbackSeekBar = playbackSeekBar;
    this.playbackSpeed = playbackSpeed;
    this.playbackWindowRoot = playbackWindowRoot;
    this.playerBottomShadow = playerBottomShadow;
    this.playerCloseButton = playerCloseButton;
    this.playerOverlays = playerOverlays;
    this.playerTopShadow = playerTopShadow;
    this.primaryControls = primaryControls;
    this.progressBarLoadingPanel = progressBarLoadingPanel;
    this.qualityTextView = qualityTextView;
    this.queueButton = queueButton;
    this.repeatButton = repeatButton;
    this.resizeTextView = resizeTextView;
    this.screenRotationButton = screenRotationButton;
    this.secondaryControls = secondaryControls;
    this.segmentsButton = segmentsButton;
    this.share = share;
    this.shuffleButton = shuffleButton;
    this.subtitleView = subtitleView;
    this.surfaceForeground = surfaceForeground;
    this.surfaceView = surfaceView;
    this.switchMute = switchMute;
    this.titleTextView = titleTextView;
    this.topControls = topControls;
    this.volumeImageView = volumeImageView;
    this.volumeProgressBar = volumeProgressBar;
    this.volumeRelativeLayout = volumeRelativeLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlayerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.player, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlayerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomControls;
      LinearLayout bottomControls = rootView.findViewById(id);
      if (bottomControls == null) {
        break missingId;
      }

      id = R.id.brightnessImageView;
      ImageView brightnessImageView = rootView.findViewById(id);
      if (brightnessImageView == null) {
        break missingId;
      }

      id = R.id.brightnessProgressBar;
      ProgressBar brightnessProgressBar = rootView.findViewById(id);
      if (brightnessProgressBar == null) {
        break missingId;
      }

      id = R.id.brightnessRelativeLayout;
      RelativeLayout brightnessRelativeLayout = rootView.findViewById(id);
      if (brightnessRelativeLayout == null) {
        break missingId;
      }

      id = R.id.captionTextView;
      TextView captionTextView = rootView.findViewById(id);
      if (captionTextView == null) {
        break missingId;
      }

      id = R.id.channelTextView;
      TextView channelTextView = rootView.findViewById(id);
      if (channelTextView == null) {
        break missingId;
      }

      id = R.id.closeButton;
      Button closeButton = rootView.findViewById(id);
      if (closeButton == null) {
        break missingId;
      }

      id = R.id.closingOverlay;
      View closingOverlay = rootView.findViewById(id);
      if (closingOverlay == null) {
        break missingId;
      }

      id = R.id.controlAnimationView;
      ImageView controlAnimationView = rootView.findViewById(id);
      if (controlAnimationView == null) {
        break missingId;
      }

      id = R.id.currentDisplaySeek;
      TextView currentDisplaySeek = rootView.findViewById(id);
      if (currentDisplaySeek == null) {
        break missingId;
      }

      id = R.id.endScreen;
      ImageView endScreen = rootView.findViewById(id);
      if (endScreen == null) {
        break missingId;
      }

      id = R.id.fullScreenButton;
      AppCompatImageButton fullScreenButton = rootView.findViewById(id);
      if (fullScreenButton == null) {
        break missingId;
      }

      id = R.id.itemsList;
      RecyclerView itemsList = rootView.findViewById(id);
      if (itemsList == null) {
        break missingId;
      }

      id = R.id.itemsListClose;
      AppCompatImageButton itemsListClose = rootView.findViewById(id);
      if (itemsListClose == null) {
        break missingId;
      }

      id = R.id.itemsListControl;
      RelativeLayout itemsListControl = rootView.findViewById(id);
      if (itemsListControl == null) {
        break missingId;
      }

      id = R.id.itemsListHeaderDuration;
      AppCompatTextView itemsListHeaderDuration = rootView.findViewById(id);

      id = R.id.itemsListHeaderTitle;
      AppCompatTextView itemsListHeaderTitle = rootView.findViewById(id);
      if (itemsListHeaderTitle == null) {
        break missingId;
      }

      id = R.id.itemsListPanel;
      RelativeLayout itemsListPanel = rootView.findViewById(id);
      if (itemsListPanel == null) {
        break missingId;
      }

      id = R.id.loading_panel;
      RelativeLayout loadingPanel = rootView.findViewById(id);
      if (loadingPanel == null) {
        break missingId;
      }

      id = R.id.metadataView;
      LinearLayout metadataView = rootView.findViewById(id);
      if (metadataView == null) {
        break missingId;
      }

      id = R.id.moreOptionsButton;
      AppCompatImageButton moreOptionsButton = rootView.findViewById(id);
      if (moreOptionsButton == null) {
        break missingId;
      }

      id = R.id.openInBrowser;
      AppCompatImageButton openInBrowser = rootView.findViewById(id);
      if (openInBrowser == null) {
        break missingId;
      }

      id = R.id.playNextButton;
      AppCompatImageButton playNextButton = rootView.findViewById(id);
      if (playNextButton == null) {
        break missingId;
      }

      id = R.id.playPauseButton;
      AppCompatImageButton playPauseButton = rootView.findViewById(id);
      if (playPauseButton == null) {
        break missingId;
      }

      id = R.id.playPreviousButton;
      AppCompatImageButton playPreviousButton = rootView.findViewById(id);
      if (playPreviousButton == null) {
        break missingId;
      }

      id = R.id.playWithKodi;
      AppCompatImageButton playWithKodi = rootView.findViewById(id);
      if (playWithKodi == null) {
        break missingId;
      }

      id = R.id.playbackControlRoot;
      RelativeLayout playbackControlRoot = rootView.findViewById(id);
      if (playbackControlRoot == null) {
        break missingId;
      }

      id = R.id.playbackCurrentTime;
      TextView playbackCurrentTime = rootView.findViewById(id);
      if (playbackCurrentTime == null) {
        break missingId;
      }

      id = R.id.playbackEndTime;
      TextView playbackEndTime = rootView.findViewById(id);
      if (playbackEndTime == null) {
        break missingId;
      }

      id = R.id.playbackLiveSync;
      TextView playbackLiveSync = rootView.findViewById(id);
      if (playbackLiveSync == null) {
        break missingId;
      }

      id = R.id.playbackSeekBar;
      FocusAwareSeekBar playbackSeekBar = rootView.findViewById(id);
      if (playbackSeekBar == null) {
        break missingId;
      }

      id = R.id.playbackSpeed;
      TextView playbackSpeed = rootView.findViewById(id);
      if (playbackSpeed == null) {
        break missingId;
      }

      id = R.id.playbackWindowRoot;
      RelativeLayout playbackWindowRoot = rootView.findViewById(id);
      if (playbackWindowRoot == null) {
        break missingId;
      }

      id = R.id.playerBottomShadow;
      View playerBottomShadow = rootView.findViewById(id);
      if (playerBottomShadow == null) {
        break missingId;
      }

      id = R.id.playerCloseButton;
      AppCompatImageButton playerCloseButton = rootView.findViewById(id);
      if (playerCloseButton == null) {
        break missingId;
      }

      id = R.id.player_overlays;
      RelativeLayout playerOverlays = rootView.findViewById(id);
      if (playerOverlays == null) {
        break missingId;
      }

      id = R.id.playerTopShadow;
      View playerTopShadow = rootView.findViewById(id);
      if (playerTopShadow == null) {
        break missingId;
      }

      id = R.id.primaryControls;
      LinearLayout primaryControls = rootView.findViewById(id);
      if (primaryControls == null) {
        break missingId;
      }

      id = R.id.progressBarLoadingPanel;
      ProgressBar progressBarLoadingPanel = rootView.findViewById(id);
      if (progressBarLoadingPanel == null) {
        break missingId;
      }

      id = R.id.qualityTextView;
      TextView qualityTextView = rootView.findViewById(id);
      if (qualityTextView == null) {
        break missingId;
      }

      id = R.id.queueButton;
      AppCompatImageButton queueButton = rootView.findViewById(id);
      if (queueButton == null) {
        break missingId;
      }

      id = R.id.repeatButton;
      View repeatButton = rootView.findViewById(id);
      if (repeatButton == null) {
        break missingId;
      }

      id = R.id.resizeTextView;
      TextView resizeTextView = rootView.findViewById(id);
      if (resizeTextView == null) {
        break missingId;
      }

      id = R.id.screenRotationButton;
      AppCompatImageButton screenRotationButton = rootView.findViewById(id);
      if (screenRotationButton == null) {
        break missingId;
      }

      id = R.id.secondaryControls;
      LinearLayout secondaryControls = rootView.findViewById(id);
      if (secondaryControls == null) {
        break missingId;
      }

      id = R.id.segmentsButton;
      AppCompatImageButton segmentsButton = rootView.findViewById(id);
      if (segmentsButton == null) {
        break missingId;
      }

      id = R.id.share;
      AppCompatImageButton share = rootView.findViewById(id);
      if (share == null) {
        break missingId;
      }

      id = R.id.shuffleButton;
      AppCompatImageButton shuffleButton = rootView.findViewById(id);
      if (shuffleButton == null) {
        break missingId;
      }

      id = R.id.subtitleView;
      SubtitleView subtitleView = rootView.findViewById(id);
      if (subtitleView == null) {
        break missingId;
      }

      id = R.id.surfaceForeground;
      View surfaceForeground = rootView.findViewById(id);
      if (surfaceForeground == null) {
        break missingId;
      }

      id = R.id.surfaceView;
      ExpandableSurfaceView surfaceView = rootView.findViewById(id);
      if (surfaceView == null) {
        break missingId;
      }

      id = R.id.switchMute;
      AppCompatImageButton switchMute = rootView.findViewById(id);
      if (switchMute == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = rootView.findViewById(id);
      if (titleTextView == null) {
        break missingId;
      }

      id = R.id.topControls;
      LinearLayout topControls = rootView.findViewById(id);
      if (topControls == null) {
        break missingId;
      }

      id = R.id.volumeImageView;
      ImageView volumeImageView = rootView.findViewById(id);
      if (volumeImageView == null) {
        break missingId;
      }

      id = R.id.volumeProgressBar;
      ProgressBar volumeProgressBar = rootView.findViewById(id);
      if (volumeProgressBar == null) {
        break missingId;
      }

      id = R.id.volumeRelativeLayout;
      RelativeLayout volumeRelativeLayout = rootView.findViewById(id);
      if (volumeRelativeLayout == null) {
        break missingId;
      }

      return new PlayerBinding((RelativeLayout) rootView, bottomControls, brightnessImageView,
          brightnessProgressBar, brightnessRelativeLayout, captionTextView, channelTextView,
          closeButton, closingOverlay, controlAnimationView, currentDisplaySeek, endScreen,
          fullScreenButton, itemsList, itemsListClose, itemsListControl, itemsListHeaderDuration,
          itemsListHeaderTitle, itemsListPanel, loadingPanel, metadataView, moreOptionsButton,
          openInBrowser, playNextButton, playPauseButton, playPreviousButton, playWithKodi,
          playbackControlRoot, playbackCurrentTime, playbackEndTime, playbackLiveSync,
          playbackSeekBar, playbackSpeed, playbackWindowRoot, playerBottomShadow, playerCloseButton,
          playerOverlays, playerTopShadow, primaryControls, progressBarLoadingPanel,
          qualityTextView, queueButton, repeatButton, resizeTextView, screenRotationButton,
          secondaryControls, segmentsButton, share, shuffleButton, subtitleView, surfaceForeground,
          surfaceView, switchMute, titleTextView, topControls, volumeImageView, volumeProgressBar,
          volumeRelativeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}