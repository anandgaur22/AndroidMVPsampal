// Generated code from Butter Knife. Do not modify!
package com.accemy.SampalMVP.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.accemy.SampalMVP.R;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mDrawer = Utils.findRequiredViewAsType(source, R.id.drawer_view, "field 'mDrawer'", DrawerLayout.class);
    target.mNavigationView = Utils.findRequiredViewAsType(source, R.id.navigation_view, "field 'mNavigationView'", NavigationView.class);
    target.mAppVersionTextView = Utils.findRequiredViewAsType(source, R.id.tv_app_version, "field 'mAppVersionTextView'", TextView.class);
    target.mCardsContainerView = Utils.findRequiredViewAsType(source, R.id.cards_container, "field 'mCardsContainerView'", SwipePlaceHolderView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.mDrawer = null;
    target.mNavigationView = null;
    target.mAppVersionTextView = null;
    target.mCardsContainerView = null;
  }
}
