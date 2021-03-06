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
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;
import org.blayboy.newpipe.views.CollapsibleView;

public final class FeedImportExportGroupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout exportToOptions;

  @NonNull
  public final TextView exportToTitle;

  @NonNull
  public final TextView headerTitle;

  @NonNull
  public final LinearLayout importExport;

  @NonNull
  public final ImageView importExportExpandIcon;

  @NonNull
  public final CollapsibleView importExportOptions;

  @NonNull
  public final LinearLayout importFromOptions;

  @NonNull
  public final TextView importFromTitle;

  private FeedImportExportGroupBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout exportToOptions, @NonNull TextView exportToTitle,
      @NonNull TextView headerTitle, @NonNull LinearLayout importExport,
      @NonNull ImageView importExportExpandIcon, @NonNull CollapsibleView importExportOptions,
      @NonNull LinearLayout importFromOptions, @NonNull TextView importFromTitle) {
    this.rootView = rootView;
    this.exportToOptions = exportToOptions;
    this.exportToTitle = exportToTitle;
    this.headerTitle = headerTitle;
    this.importExport = importExport;
    this.importExportExpandIcon = importExportExpandIcon;
    this.importExportOptions = importExportOptions;
    this.importFromOptions = importFromOptions;
    this.importFromTitle = importFromTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FeedImportExportGroupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FeedImportExportGroupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.feed_import_export_group, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FeedImportExportGroupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.export_to_options;
      LinearLayout exportToOptions = rootView.findViewById(id);
      if (exportToOptions == null) {
        break missingId;
      }

      id = R.id.export_to_title;
      TextView exportToTitle = rootView.findViewById(id);
      if (exportToTitle == null) {
        break missingId;
      }

      id = R.id.header_title;
      TextView headerTitle = rootView.findViewById(id);
      if (headerTitle == null) {
        break missingId;
      }

      id = R.id.import_export;
      LinearLayout importExport = rootView.findViewById(id);
      if (importExport == null) {
        break missingId;
      }

      id = R.id.import_export_expand_icon;
      ImageView importExportExpandIcon = rootView.findViewById(id);
      if (importExportExpandIcon == null) {
        break missingId;
      }

      id = R.id.import_export_options;
      CollapsibleView importExportOptions = rootView.findViewById(id);
      if (importExportOptions == null) {
        break missingId;
      }

      id = R.id.import_from_options;
      LinearLayout importFromOptions = rootView.findViewById(id);
      if (importFromOptions == null) {
        break missingId;
      }

      id = R.id.import_from_title;
      TextView importFromTitle = rootView.findViewById(id);
      if (importFromTitle == null) {
        break missingId;
      }

      return new FeedImportExportGroupBinding((LinearLayout) rootView, exportToOptions,
          exportToTitle, headerTitle, importExport, importExportExpandIcon, importExportOptions,
          importFromOptions, importFromTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
