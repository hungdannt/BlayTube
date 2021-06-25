// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class ItemInstanceBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final AppCompatImageView handle;

  @NonNull
  public final AppCompatImageView instanceIcon;

  @NonNull
  public final TextView instanceName;

  @NonNull
  public final TextView instanceUrl;

  @NonNull
  public final CardView layoutCard;

  @NonNull
  public final RadioButton selectInstanceRB;

  private ItemInstanceBinding(@NonNull CardView rootView, @NonNull AppCompatImageView handle,
      @NonNull AppCompatImageView instanceIcon, @NonNull TextView instanceName,
      @NonNull TextView instanceUrl, @NonNull CardView layoutCard,
      @NonNull RadioButton selectInstanceRB) {
    this.rootView = rootView;
    this.handle = handle;
    this.instanceIcon = instanceIcon;
    this.instanceName = instanceName;
    this.instanceUrl = instanceUrl;
    this.layoutCard = layoutCard;
    this.selectInstanceRB = selectInstanceRB;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemInstanceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemInstanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_instance, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemInstanceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.handle;
      AppCompatImageView handle = rootView.findViewById(id);
      if (handle == null) {
        break missingId;
      }

      id = R.id.instanceIcon;
      AppCompatImageView instanceIcon = rootView.findViewById(id);
      if (instanceIcon == null) {
        break missingId;
      }

      id = R.id.instanceName;
      TextView instanceName = rootView.findViewById(id);
      if (instanceName == null) {
        break missingId;
      }

      id = R.id.instanceUrl;
      TextView instanceUrl = rootView.findViewById(id);
      if (instanceUrl == null) {
        break missingId;
      }

      CardView layoutCard = (CardView) rootView;

      id = R.id.selectInstanceRB;
      RadioButton selectInstanceRB = rootView.findViewById(id);
      if (selectInstanceRB == null) {
        break missingId;
      }

      return new ItemInstanceBinding((CardView) rootView, handle, instanceIcon, instanceName,
          instanceUrl, layoutCard, selectInstanceRB);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
