// Generated code from Butter Knife. Do not modify!
package com.accemy.SampalMVP.ui.feed;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.accemy.SampalMVP.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeedActivity_ViewBinding implements Unbinder {
  private FeedActivity target;

  @UiThread
  public FeedActivity_ViewBinding(FeedActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FeedActivity_ViewBinding(FeedActivity target, View source) {
    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.feed_view_pager, "field 'mViewPager'", ViewPager.class);
    target.mTabLayout = Utils.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", TabLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FeedActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.mViewPager = null;
    target.mTabLayout = null;
  }
}
