// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import org.blayboy.newpipe.R;

public final class DrawerLayoutBinding implements ViewBinding {
  @NonNull
  private final NavigationView rootView;

  @NonNull
  public final NavigationView navigation;

  private DrawerLayoutBinding(@NonNull NavigationView rootView,
      @NonNull NavigationView navigation) {
    this.rootView = rootView;
    this.navigation = navigation;
  }

  @Override
  @NonNull
  public NavigationView getRoot() {
    return rootView;
  }

  @NonNull
  public static DrawerLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DrawerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.drawer_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DrawerLayoutBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    NavigationView navigation = (NavigationView) rootView;

    return new DrawerLayoutBinding((NavigationView) rootView, navigation);
  }
}
