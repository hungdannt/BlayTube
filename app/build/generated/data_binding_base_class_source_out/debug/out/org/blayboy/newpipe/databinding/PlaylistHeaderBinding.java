// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class PlaylistHeaderBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final PlaylistControlBinding playlistControl;

  @NonNull
  public final RelativeLayout playlistMeta;

  @NonNull
  public final TextView playlistStreamCount;

  @NonNull
  public final TextView playlistTitleView;

  @NonNull
  public final CircleImageView uploaderAvatarView;

  @NonNull
  public final RelativeLayout uploaderLayout;

  @NonNull
  public final TextView uploaderName;

  private PlaylistHeaderBinding(@NonNull RelativeLayout rootView,
      @NonNull PlaylistControlBinding playlistControl, @NonNull RelativeLayout playlistMeta,
      @NonNull TextView playlistStreamCount, @NonNull TextView playlistTitleView,
      @NonNull CircleImageView uploaderAvatarView, @NonNull RelativeLayout uploaderLayout,
      @NonNull TextView uploaderName) {
    this.rootView = rootView;
    this.playlistControl = playlistControl;
    this.playlistMeta = playlistMeta;
    this.playlistStreamCount = playlistStreamCount;
    this.playlistTitleView = playlistTitleView;
    this.uploaderAvatarView = uploaderAvatarView;
    this.uploaderLayout = uploaderLayout;
    this.uploaderName = uploaderName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PlaylistHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlaylistHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.playlist_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlaylistHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.playlist_control;
      View playlistControl = rootView.findViewById(id);
      if (playlistControl == null) {
        break missingId;
      }
      PlaylistControlBinding binding_playlistControl = PlaylistControlBinding.bind(playlistControl);

      id = R.id.playlist_meta;
      RelativeLayout playlistMeta = rootView.findViewById(id);
      if (playlistMeta == null) {
        break missingId;
      }

      id = R.id.playlist_stream_count;
      TextView playlistStreamCount = rootView.findViewById(id);
      if (playlistStreamCount == null) {
        break missingId;
      }

      id = R.id.playlist_title_view;
      TextView playlistTitleView = rootView.findViewById(id);
      if (playlistTitleView == null) {
        break missingId;
      }

      id = R.id.uploader_avatar_view;
      CircleImageView uploaderAvatarView = rootView.findViewById(id);
      if (uploaderAvatarView == null) {
        break missingId;
      }

      id = R.id.uploader_layout;
      RelativeLayout uploaderLayout = rootView.findViewById(id);
      if (uploaderLayout == null) {
        break missingId;
      }

      id = R.id.uploader_name;
      TextView uploaderName = rootView.findViewById(id);
      if (uploaderName == null) {
        break missingId;
      }

      return new PlaylistHeaderBinding((RelativeLayout) rootView, binding_playlistControl,
          playlistMeta, playlistStreamCount, playlistTitleView, uploaderAvatarView, uploaderLayout,
          uploaderName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
