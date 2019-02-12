// Generated code from Butter Knife. Do not modify!
package com.accemy.SampalMVP.ui.about;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.accemy.SampalMVP.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutFragment_ViewBinding implements Unbinder {
  private AboutFragment target;

  private View view2131230846;

  @UiThread
  public AboutFragment_ViewBinding(final AboutFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.nav_back_btn, "method 'onNavBackClick'");
    view2131230846 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNavBackClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131230846.setOnClickListener(null);
    view2131230846 = null;
  }
}
