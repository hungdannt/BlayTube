// Generated by view binder compiler. Do not edit!
package org.blayboy.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.blayboy.newpipe.R;

public final class FragmentImportBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView infoTextView;

  @NonNull
  public final Button inputButton;

  @NonNull
  public final EditText inputText;

  @NonNull
  public final LinearLayout inputsPanel;

  private FragmentImportBinding(@NonNull RelativeLayout rootView, @NonNull TextView infoTextView,
      @NonNull Button inputButton, @NonNull EditText inputText, @NonNull LinearLayout inputsPanel) {
    this.rootView = rootView;
    this.infoTextView = infoTextView;
    this.inputButton = inputButton;
    this.inputText = inputText;
    this.inputsPanel = inputsPanel;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentImportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentImportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_import, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentImportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.info_text_view;
      TextView infoTextView = rootView.findViewById(id);
      if (infoTextView == null) {
        break missingId;
      }

      id = R.id.input_button;
      Button inputButton = rootView.findViewById(id);
      if (inputButton == null) {
        break missingId;
      }

      id = R.id.input_text;
      EditText inputText = rootView.findViewById(id);
      if (inputText == null) {
        break missingId;
      }

      id = R.id.inputs_panel;
      LinearLayout inputsPanel = rootView.findViewById(id);
      if (inputsPanel == null) {
        break missingId;
      }

      return new FragmentImportBinding((RelativeLayout) rootView, infoTextView, inputButton,
          inputText, inputsPanel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
