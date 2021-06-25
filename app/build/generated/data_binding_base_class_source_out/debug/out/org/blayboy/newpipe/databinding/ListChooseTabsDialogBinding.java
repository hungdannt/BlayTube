// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ListChooseTabsDialogBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatImageView tabIcon;

  @NonNull
  public final TextView tabName;

  private ListChooseTabsDialogBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatImageView tabIcon, @NonNull TextView tabName) {
    this.rootView = rootView;
    this.tabIcon = tabIcon;
    this.tabName = tabName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListChooseTabsDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListChooseTabsDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_choose_tabs_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListChooseTabsDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tabIcon;
      AppCompatImageView tabIcon = rootView.findViewById(id);
      if (tabIcon == null) {
        break missingId;
      }

      id = R.id.tabName;
      TextView tabName = rootView.findViewById(id);
      if (tabName == null) {
        break missingId;
      }

      return new ListChooseTabsDialogBinding((RelativeLayout) rootView, tabIcon, tabName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
