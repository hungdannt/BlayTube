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
import androidx.viewbinding.ViewBinding;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class ListCommentsItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView detailThumbsUpCountView;

  @NonNull
  public final ImageView detailThumbsUpImgView;

  @NonNull
  public final TextView itemCommentContentView;

  @NonNull
  public final TextView itemPublishedTime;

  @NonNull
  public final RelativeLayout itemRoot;

  @NonNull
  public final CircleImageView itemThumbnailView;

  @NonNull
  public final TextView itemTitleView;

  private ListCommentsItemBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView detailThumbsUpCountView, @NonNull ImageView detailThumbsUpImgView,
      @NonNull TextView itemCommentContentView, @NonNull TextView itemPublishedTime,
      @NonNull RelativeLayout itemRoot, @NonNull CircleImageView itemThumbnailView,
      @NonNull TextView itemTitleView) {
    this.rootView = rootView;
    this.detailThumbsUpCountView = detailThumbsUpCountView;
    this.detailThumbsUpImgView = detailThumbsUpImgView;
    this.itemCommentContentView = itemCommentContentView;
    this.itemPublishedTime = itemPublishedTime;
    this.itemRoot = itemRoot;
    this.itemThumbnailView = itemThumbnailView;
    this.itemTitleView = itemTitleView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListCommentsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListCommentsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_comments_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListCommentsItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.detail_thumbs_up_count_view;
      TextView detailThumbsUpCountView = rootView.findViewById(id);
      if (detailThumbsUpCountView == null) {
        break missingId;
      }

      id = R.id.detail_thumbs_up_img_view;
      ImageView detailThumbsUpImgView = rootView.findViewById(id);
      if (detailThumbsUpImgView == null) {
        break missingId;
      }

      id = R.id.itemCommentContentView;
      TextView itemCommentContentView = rootView.findViewById(id);
      if (itemCommentContentView == null) {
        break missingId;
      }

      id = R.id.itemPublishedTime;
      TextView itemPublishedTime = rootView.findViewById(id);
      if (itemPublishedTime == null) {
        break missingId;
      }

      RelativeLayout itemRoot = (RelativeLayout) rootView;

      id = R.id.itemThumbnailView;
      CircleImageView itemThumbnailView = rootView.findViewById(id);
      if (itemThumbnailView == null) {
        break missingId;
      }

      id = R.id.itemTitleView;
      TextView itemTitleView = rootView.findViewById(id);
      if (itemTitleView == null) {
        break missingId;
      }

      return new ListCommentsItemBinding((RelativeLayout) rootView, detailThumbsUpCountView,
          detailThumbsUpImgView, itemCommentContentView, itemPublishedTime, itemRoot,
          itemThumbnailView, itemTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
