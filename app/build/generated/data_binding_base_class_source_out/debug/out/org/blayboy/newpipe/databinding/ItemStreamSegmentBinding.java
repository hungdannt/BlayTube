// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class ItemStreamSegmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView previewImage;

  @NonNull
  public final LinearLayout textContainer;

  @NonNull
  public final TextView textViewChannel;

  @NonNull
  public final TextView textViewStartSeconds;

  @NonNull
  public final TextView textViewTitle;

  private ItemStreamSegmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView previewImage, @NonNull LinearLayout textContainer,
      @NonNull TextView textViewChannel, @NonNull TextView textViewStartSeconds,
      @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.previewImage = previewImage;
    this.textContainer = textContainer;
    this.textViewChannel = textViewChannel;
    this.textViewStartSeconds = textViewStartSeconds;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemStreamSegmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemStreamSegmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_stream_segment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemStreamSegmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.previewImage;
      ImageView previewImage = rootView.findViewById(id);
      if (previewImage == null) {
        break missingId;
      }

      id = R.id.textContainer;
      LinearLayout textContainer = rootView.findViewById(id);
      if (textContainer == null) {
        break missingId;
      }

      id = R.id.textViewChannel;
      TextView textViewChannel = rootView.findViewById(id);
      if (textViewChannel == null) {
        break missingId;
      }

      id = R.id.textViewStartSeconds;
      TextView textViewStartSeconds = rootView.findViewById(id);
      if (textViewStartSeconds == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = rootView.findViewById(id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new ItemStreamSegmentBinding((ConstraintLayout) rootView, previewImage, textContainer,
          textViewChannel, textViewStartSeconds, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
