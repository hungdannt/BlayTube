// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class ActivityPlayerQueueControlBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final View anchor;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextView artistName;

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
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final RelativeLayout center;

  @NonNull
  public final AppCompatImageButton controlBackward;

  @NonNull
  public final ImageButton controlFastForward;

  @NonNull
  public final ImageButton controlFastRewind;

  @NonNull
  public final AppCompatImageButton controlForward;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final RelativeLayout controlPane;

  @NonNull
  public final ImageButton controlPlayPause;

  @NonNull
  public final ProgressBar controlProgressBar;

  @NonNull
  public final ImageButton controlRepeat;

  @NonNull
  public final ImageButton controlShuffle;

  @NonNull
  public final TextView currentTime;

  @NonNull
  public final TextView endTime;

  @NonNull
  public final TextView liveSync;

  @NonNull
  public final RelativeLayout mainContent;

  @NonNull
  public final LinearLayout metadata;

  @NonNull
  public final RecyclerView playQueue;

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
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final RelativeLayout playbackControls;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final RelativeLayout playbackControlsBottom;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final RelativeLayout playbackControlsTop;

  @NonNull
  public final LinearLayout progressBar;

  @NonNull
  public final AppCompatSeekBar seekBar;

  @NonNull
  public final TextView seekDisplay;

  @NonNull
  public final TextView songName;

  @NonNull
  public final Toolbar toolbar;

  private ActivityPlayerQueueControlBinding(@NonNull RelativeLayout rootView, @Nullable View anchor,
      @NonNull AppBarLayout appbar, @NonNull TextView artistName, @Nullable RelativeLayout center,
      @NonNull AppCompatImageButton controlBackward, @NonNull ImageButton controlFastForward,
      @NonNull ImageButton controlFastRewind, @NonNull AppCompatImageButton controlForward,
      @Nullable RelativeLayout controlPane, @NonNull ImageButton controlPlayPause,
      @NonNull ProgressBar controlProgressBar, @NonNull ImageButton controlRepeat,
      @NonNull ImageButton controlShuffle, @NonNull TextView currentTime, @NonNull TextView endTime,
      @NonNull TextView liveSync, @NonNull RelativeLayout mainContent,
      @NonNull LinearLayout metadata, @NonNull RecyclerView playQueue,
      @Nullable RelativeLayout playbackControls, @Nullable RelativeLayout playbackControlsBottom,
      @Nullable RelativeLayout playbackControlsTop, @NonNull LinearLayout progressBar,
      @NonNull AppCompatSeekBar seekBar, @NonNull TextView seekDisplay, @NonNull TextView songName,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.anchor = anchor;
    this.appbar = appbar;
    this.artistName = artistName;
    this.center = center;
    this.controlBackward = controlBackward;
    this.controlFastForward = controlFastForward;
    this.controlFastRewind = controlFastRewind;
    this.controlForward = controlForward;
    this.controlPane = controlPane;
    this.controlPlayPause = controlPlayPause;
    this.controlProgressBar = controlProgressBar;
    this.controlRepeat = controlRepeat;
    this.controlShuffle = controlShuffle;
    this.currentTime = currentTime;
    this.endTime = endTime;
    this.liveSync = liveSync;
    this.mainContent = mainContent;
    this.metadata = metadata;
    this.playQueue = playQueue;
    this.playbackControls = playbackControls;
    this.playbackControlsBottom = playbackControlsBottom;
    this.playbackControlsTop = playbackControlsTop;
    this.progressBar = progressBar;
    this.seekBar = seekBar;
    this.seekDisplay = seekDisplay;
    this.songName = songName;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPlayerQueueControlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPlayerQueueControlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_player_queue_control, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPlayerQueueControlBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.anchor;
      View anchor = rootView.findViewById(id);

      id = R.id.appbar;
      AppBarLayout appbar = rootView.findViewById(id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.artist_name;
      TextView artistName = rootView.findViewById(id);
      if (artistName == null) {
        break missingId;
      }

      id = R.id.center;
      RelativeLayout center = rootView.findViewById(id);

      id = R.id.control_backward;
      AppCompatImageButton controlBackward = rootView.findViewById(id);
      if (controlBackward == null) {
        break missingId;
      }

      id = R.id.control_fast_forward;
      ImageButton controlFastForward = rootView.findViewById(id);
      if (controlFastForward == null) {
        break missingId;
      }

      id = R.id.control_fast_rewind;
      ImageButton controlFastRewind = rootView.findViewById(id);
      if (controlFastRewind == null) {
        break missingId;
      }

      id = R.id.control_forward;
      AppCompatImageButton controlForward = rootView.findViewById(id);
      if (controlForward == null) {
        break missingId;
      }

      id = R.id.control_pane;
      RelativeLayout controlPane = rootView.findViewById(id);

      id = R.id.control_play_pause;
      ImageButton controlPlayPause = rootView.findViewById(id);
      if (controlPlayPause == null) {
        break missingId;
      }

      id = R.id.control_progress_bar;
      ProgressBar controlProgressBar = rootView.findViewById(id);
      if (controlProgressBar == null) {
        break missingId;
      }

      id = R.id.control_repeat;
      ImageButton controlRepeat = rootView.findViewById(id);
      if (controlRepeat == null) {
        break missingId;
      }

      id = R.id.control_shuffle;
      ImageButton controlShuffle = rootView.findViewById(id);
      if (controlShuffle == null) {
        break missingId;
      }

      id = R.id.current_time;
      TextView currentTime = rootView.findViewById(id);
      if (currentTime == null) {
        break missingId;
      }

      id = R.id.end_time;
      TextView endTime = rootView.findViewById(id);
      if (endTime == null) {
        break missingId;
      }

      id = R.id.live_sync;
      TextView liveSync = rootView.findViewById(id);
      if (liveSync == null) {
        break missingId;
      }

      RelativeLayout mainContent = (RelativeLayout) rootView;

      id = R.id.metadata;
      LinearLayout metadata = rootView.findViewById(id);
      if (metadata == null) {
        break missingId;
      }

      id = R.id.play_queue;
      RecyclerView playQueue = rootView.findViewById(id);
      if (playQueue == null) {
        break missingId;
      }

      id = R.id.playback_controls;
      RelativeLayout playbackControls = rootView.findViewById(id);

      id = R.id.playback_controls_bottom;
      RelativeLayout playbackControlsBottom = rootView.findViewById(id);

      id = R.id.playback_controls_top;
      RelativeLayout playbackControlsTop = rootView.findViewById(id);

      id = R.id.progress_bar;
      LinearLayout progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.seek_bar;
      AppCompatSeekBar seekBar = rootView.findViewById(id);
      if (seekBar == null) {
        break missingId;
      }

      id = R.id.seek_display;
      TextView seekDisplay = rootView.findViewById(id);
      if (seekDisplay == null) {
        break missingId;
      }

      id = R.id.song_name;
      TextView songName = rootView.findViewById(id);
      if (songName == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityPlayerQueueControlBinding((RelativeLayout) rootView, anchor, appbar,
          artistName, center, controlBackward, controlFastForward, controlFastRewind,
          controlForward, controlPane, controlPlayPause, controlProgressBar, controlRepeat,
          controlShuffle, currentTime, endTime, liveSync, mainContent, metadata, playQueue,
          playbackControls, playbackControlsBottom, playbackControlsTop, progressBar, seekBar,
          seekDisplay, songName, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
