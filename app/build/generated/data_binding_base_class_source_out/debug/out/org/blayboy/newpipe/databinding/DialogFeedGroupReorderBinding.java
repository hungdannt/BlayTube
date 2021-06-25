// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class DialogFeedGroupReorderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button confirmButton;

  @NonNull
  public final RecyclerView feedGroupsList;

  private DialogFeedGroupReorderBinding(@NonNull LinearLayout rootView,
      @NonNull Button confirmButton, @NonNull RecyclerView feedGroupsList) {
    this.rootView = rootView;
    this.confirmButton = confirmButton;
    this.feedGroupsList = feedGroupsList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogFeedGroupReorderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogFeedGroupReorderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_feed_group_reorder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogFeedGroupReorderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirm_button;
      Button confirmButton = rootView.findViewById(id);
      if (confirmButton == null) {
        break missingId;
      }

      id = R.id.feed_groups_list;
      RecyclerView feedGroupsList = rootView.findViewById(id);
      if (feedGroupsList == null) {
        break missingId;
      }

      return new DialogFeedGroupReorderBinding((LinearLayout) rootView, confirmButton,
          feedGroupsList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
