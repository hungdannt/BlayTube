// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class DownloadDialogBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RadioButton audioButton;

  @NonNull
  public final EditText fileName;

  @NonNull
  public final TextView fileNameTextView;

  @NonNull
  public final Spinner qualitySpinner;

  @NonNull
  public final RadioButton subtitleButton;

  @NonNull
  public final SeekBar threads;

  @NonNull
  public final TextView threadsCount;

  @NonNull
  public final LinearLayout threadsLayout;

  @NonNull
  public final TextView threadsTextView;

  @NonNull
  public final ToolbarLayoutBinding toolbarLayout;

  @NonNull
  public final RadioGroup videoAudioGroup;

  @NonNull
  public final RadioButton videoButton;

  private DownloadDialogBinding(@NonNull RelativeLayout rootView, @NonNull RadioButton audioButton,
      @NonNull EditText fileName, @NonNull TextView fileNameTextView,
      @NonNull Spinner qualitySpinner, @NonNull RadioButton subtitleButton,
      @NonNull SeekBar threads, @NonNull TextView threadsCount, @NonNull LinearLayout threadsLayout,
      @NonNull TextView threadsTextView, @NonNull ToolbarLayoutBinding toolbarLayout,
      @NonNull RadioGroup videoAudioGroup, @NonNull RadioButton videoButton) {
    this.rootView = rootView;
    this.audioButton = audioButton;
    this.fileName = fileName;
    this.fileNameTextView = fileNameTextView;
    this.qualitySpinner = qualitySpinner;
    this.subtitleButton = subtitleButton;
    this.threads = threads;
    this.threadsCount = threadsCount;
    this.threadsLayout = threadsLayout;
    this.threadsTextView = threadsTextView;
    this.toolbarLayout = toolbarLayout;
    this.videoAudioGroup = videoAudioGroup;
    this.videoButton = videoButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DownloadDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DownloadDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.download_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DownloadDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.audio_button;
      RadioButton audioButton = rootView.findViewById(id);
      if (audioButton == null) {
        break missingId;
      }

      id = R.id.file_name;
      EditText fileName = rootView.findViewById(id);
      if (fileName == null) {
        break missingId;
      }

      id = R.id.file_name_text_view;
      TextView fileNameTextView = rootView.findViewById(id);
      if (fileNameTextView == null) {
        break missingId;
      }

      id = R.id.quality_spinner;
      Spinner qualitySpinner = rootView.findViewById(id);
      if (qualitySpinner == null) {
        break missingId;
      }

      id = R.id.subtitle_button;
      RadioButton subtitleButton = rootView.findViewById(id);
      if (subtitleButton == null) {
        break missingId;
      }

      id = R.id.threads;
      SeekBar threads = rootView.findViewById(id);
      if (threads == null) {
        break missingId;
      }

      id = R.id.threads_count;
      TextView threadsCount = rootView.findViewById(id);
      if (threadsCount == null) {
        break missingId;
      }

      id = R.id.threads_layout;
      LinearLayout threadsLayout = rootView.findViewById(id);
      if (threadsLayout == null) {
        break missingId;
      }

      id = R.id.threads_text_view;
      TextView threadsTextView = rootView.findViewById(id);
      if (threadsTextView == null) {
        break missingId;
      }

      id = R.id.toolbar_layout;
      View toolbarLayout = rootView.findViewById(id);
      if (toolbarLayout == null) {
        break missingId;
      }
      ToolbarLayoutBinding binding_toolbarLayout = ToolbarLayoutBinding.bind(toolbarLayout);

      id = R.id.video_audio_group;
      RadioGroup videoAudioGroup = rootView.findViewById(id);
      if (videoAudioGroup == null) {
        break missingId;
      }

      id = R.id.video_button;
      RadioButton videoButton = rootView.findViewById(id);
      if (videoButton == null) {
        break missingId;
      }

      return new DownloadDialogBinding((RelativeLayout) rootView, audioButton, fileName,
          fileNameTextView, qualitySpinner, subtitleButton, threads, threadsCount, threadsLayout,
          threadsTextView, binding_toolbarLayout, videoAudioGroup, videoButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
