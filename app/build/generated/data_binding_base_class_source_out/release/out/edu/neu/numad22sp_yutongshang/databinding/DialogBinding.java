// Generated by view binder compiler. Do not edit!
package edu.neu.numad22sp_yutongshang.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import edu.neu.numad22sp_yutongshang.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText ownername;

  @NonNull
  public final EditText ownerphone;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView2;

  private DialogBinding(@NonNull LinearLayout rootView, @NonNull EditText ownername,
      @NonNull EditText ownerphone, @NonNull TextView textView1, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.ownername = ownername;
    this.ownerphone = ownerphone;
    this.textView1 = textView1;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ownername;
      EditText ownername = ViewBindings.findChildViewById(rootView, id);
      if (ownername == null) {
        break missingId;
      }

      id = R.id.ownerphone;
      EditText ownerphone = ViewBindings.findChildViewById(rootView, id);
      if (ownerphone == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new DialogBinding((LinearLayout) rootView, ownername, ownerphone, textView1,
          textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}