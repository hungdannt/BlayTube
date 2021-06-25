// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class FragmentLicensesBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final Button licensesAppReadLicense;

  @NonNull
  public final LinearLayout licensesSoftwareComponents;

  private FragmentLicensesBinding(@NonNull NestedScrollView rootView,
      @NonNull Button licensesAppReadLicense, @NonNull LinearLayout licensesSoftwareComponents) {
    this.rootView = rootView;
    this.licensesAppReadLicense = licensesAppReadLicense;
    this.licensesSoftwareComponents = licensesSoftwareComponents;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLicensesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLicensesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_licenses, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLicensesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.licenses_app_read_license;
      Button licensesAppReadLicense = rootView.findViewById(id);
      if (licensesAppReadLicense == null) {
        break missingId;
      }

      id = R.id.licenses_software_components;
      LinearLayout licensesSoftwareComponents = rootView.findViewById(id);
      if (licensesSoftwareComponents == null) {
        break missingId;
      }

      return new FragmentLicensesBinding((NestedScrollView) rootView, licensesAppReadLicense,
          licensesSoftwareComponents);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
