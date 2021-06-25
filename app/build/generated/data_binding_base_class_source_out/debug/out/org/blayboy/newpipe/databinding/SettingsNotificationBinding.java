// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class SettingsNotificationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final SettingsNotificationActionBinding notificationAction0;

  @NonNull
  public final SettingsNotificationActionBinding notificationAction1;

  @NonNull
  public final SettingsNotificationActionBinding notificationAction2;

  @NonNull
  public final SettingsNotificationActionBinding notificationAction3;

  @NonNull
  public final SettingsNotificationActionBinding notificationAction4;

  @NonNull
  public final TextView textView;

  private SettingsNotificationBinding(@NonNull ConstraintLayout rootView,
      @NonNull SettingsNotificationActionBinding notificationAction0,
      @NonNull SettingsNotificationActionBinding notificationAction1,
      @NonNull SettingsNotificationActionBinding notificationAction2,
      @NonNull SettingsNotificationActionBinding notificationAction3,
      @NonNull SettingsNotificationActionBinding notificationAction4, @NonNull TextView textView) {
    this.rootView = rootView;
    this.notificationAction0 = notificationAction0;
    this.notificationAction1 = notificationAction1;
    this.notificationAction2 = notificationAction2;
    this.notificationAction3 = notificationAction3;
    this.notificationAction4 = notificationAction4;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SettingsNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SettingsNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.settings_notification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SettingsNotificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.notificationAction0;
      View notificationAction0 = rootView.findViewById(id);
      if (notificationAction0 == null) {
        break missingId;
      }
      SettingsNotificationActionBinding binding_notificationAction0 = SettingsNotificationActionBinding.bind(notificationAction0);

      id = R.id.notificationAction1;
      View notificationAction1 = rootView.findViewById(id);
      if (notificationAction1 == null) {
        break missingId;
      }
      SettingsNotificationActionBinding binding_notificationAction1 = SettingsNotificationActionBinding.bind(notificationAction1);

      id = R.id.notificationAction2;
      View notificationAction2 = rootView.findViewById(id);
      if (notificationAction2 == null) {
        break missingId;
      }
      SettingsNotificationActionBinding binding_notificationAction2 = SettingsNotificationActionBinding.bind(notificationAction2);

      id = R.id.notificationAction3;
      View notificationAction3 = rootView.findViewById(id);
      if (notificationAction3 == null) {
        break missingId;
      }
      SettingsNotificationActionBinding binding_notificationAction3 = SettingsNotificationActionBinding.bind(notificationAction3);

      id = R.id.notificationAction4;
      View notificationAction4 = rootView.findViewById(id);
      if (notificationAction4 == null) {
        break missingId;
      }
      SettingsNotificationActionBinding binding_notificationAction4 = SettingsNotificationActionBinding.bind(notificationAction4);

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      return new SettingsNotificationBinding((ConstraintLayout) rootView,
          binding_notificationAction0, binding_notificationAction1, binding_notificationAction2,
          binding_notificationAction3, binding_notificationAction4, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
