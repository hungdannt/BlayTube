// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class PlayQueueItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView itemAdditionalDetails;

  @NonNull
  public final TextView itemDurationView;

  @NonNull
  public final AppCompatImageView itemHandle;

  @NonNull
  public final RelativeLayout itemRoot;

  @NonNull
  public final AppCompatImageView itemSelected;

  @NonNull
  public final ImageView itemThumbnailView;

  @NonNull
  public final TextView itemVideoTitleView;

  private PlayQueueItemBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView itemAdditionalDetails, @NonNull TextView itemDurationView,
      @NonNull AppCompatImageView itemHandle, @NonNull RelativeLayout itemRoot,
      @NonNull AppCompatImageView itemSelected, @NonNull ImageView itemThumbnailView,
      @NonNull TextView itemVideoTitleView) {
    this.rootView = rootView;
    this.itemAdditionalDetails = itemAdditionalDetails;
    this.itemDurationView = itemDurationView;
    this.itemHandle = itemHandle;
    this.itemRoot = itemRoot;
    this.itemSelected = itemSelected;
    this.itemThumbnailView = itemThumbnailView;
    this.itemVideoTitleView = itemVideoTitleView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PlayQueueItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlayQueueItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.play_queue_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlayQueueItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.itemAdditionalDetails;
      TextView itemAdditionalDetails = rootView.findViewById(id);
      if (itemAdditionalDetails == null) {
        break missingId;
      }

      id = R.id.itemDurationView;
      TextView itemDurationView = rootView.findViewById(id);
      if (itemDurationView == null) {
        break missingId;
      }

      id = R.id.itemHandle;
      AppCompatImageView itemHandle = rootView.findViewById(id);
      if (itemHandle == null) {
        break missingId;
      }

      RelativeLayout itemRoot = (RelativeLayout) rootView;

      id = R.id.itemSelected;
      AppCompatImageView itemSelected = rootView.findViewById(id);
      if (itemSelected == null) {
        break missingId;
      }

      id = R.id.itemThumbnailView;
      ImageView itemThumbnailView = rootView.findViewById(id);
      if (itemThumbnailView == null) {
        break missingId;
      }

      id = R.id.itemVideoTitleView;
      TextView itemVideoTitleView = rootView.findViewById(id);
      if (itemVideoTitleView == null) {
        break missingId;
      }

      return new PlayQueueItemBinding((RelativeLayout) rootView, itemAdditionalDetails,
          itemDurationView, itemHandle, itemRoot, itemSelected, itemThumbnailView,
          itemVideoTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
