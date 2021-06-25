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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class ListPlaylistGridItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout itemRoot;

  @NonNull
  public final TextView itemStreamCountView;

  @NonNull
  public final ImageView itemThumbnailView;

  @NonNull
  public final TextView itemTitleView;

  @NonNull
  public final TextView itemUploaderView;

  private ListPlaylistGridItemBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout itemRoot, @NonNull TextView itemStreamCountView,
      @NonNull ImageView itemThumbnailView, @NonNull TextView itemTitleView,
      @NonNull TextView itemUploaderView) {
    this.rootView = rootView;
    this.itemRoot = itemRoot;
    this.itemStreamCountView = itemStreamCountView;
    this.itemThumbnailView = itemThumbnailView;
    this.itemTitleView = itemTitleView;
    this.itemUploaderView = itemUploaderView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListPlaylistGridItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListPlaylistGridItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_playlist_grid_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListPlaylistGridItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout itemRoot = (RelativeLayout) rootView;

      id = R.id.itemStreamCountView;
      TextView itemStreamCountView = rootView.findViewById(id);
      if (itemStreamCountView == null) {
        break missingId;
      }

      id = R.id.itemThumbnailView;
      ImageView itemThumbnailView = rootView.findViewById(id);
      if (itemThumbnailView == null) {
        break missingId;
      }

      id = R.id.itemTitleView;
      TextView itemTitleView = rootView.findViewById(id);
      if (itemTitleView == null) {
        break missingId;
      }

      id = R.id.itemUploaderView;
      TextView itemUploaderView = rootView.findViewById(id);
      if (itemUploaderView == null) {
        break missingId;
      }

      return new ListPlaylistGridItemBinding((RelativeLayout) rootView, itemRoot,
          itemStreamCountView, itemThumbnailView, itemTitleView, itemUploaderView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
