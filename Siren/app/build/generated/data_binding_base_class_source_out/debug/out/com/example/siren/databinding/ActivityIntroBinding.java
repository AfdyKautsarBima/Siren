// Generated by view binder compiler. Do not edit!
package com.example.siren.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.siren.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIntroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final ImageView ivIntro;

  @NonNull
  public final TextView tvIntro;

  @NonNull
  public final TextView tvName;

  private ActivityIntroBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogin,
      @NonNull Button btnRegister, @NonNull FrameLayout frameLayout, @NonNull ImageView ivIntro,
      @NonNull TextView tvIntro, @NonNull TextView tvName) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.btnRegister = btnRegister;
    this.frameLayout = frameLayout;
    this.ivIntro = ivIntro;
    this.tvIntro = tvIntro;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIntroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIntroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_intro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIntroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btnRegister;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.ivIntro;
      ImageView ivIntro = ViewBindings.findChildViewById(rootView, id);
      if (ivIntro == null) {
        break missingId;
      }

      id = R.id.tvIntro;
      TextView tvIntro = ViewBindings.findChildViewById(rootView, id);
      if (tvIntro == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      return new ActivityIntroBinding((ConstraintLayout) rootView, btnLogin, btnRegister,
          frameLayout, ivIntro, tvIntro, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
