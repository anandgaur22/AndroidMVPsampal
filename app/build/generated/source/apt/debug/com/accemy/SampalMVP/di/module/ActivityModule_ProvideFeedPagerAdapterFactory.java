package com.accemy.SampalMVP.di.module;

import android.support.v7.app.AppCompatActivity;
import com.accemy.SampalMVP.ui.feed.FeedPagerAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideFeedPagerAdapterFactory
    implements Factory<FeedPagerAdapter> {
  private final ActivityModule module;

  private final Provider<AppCompatActivity> activityProvider;

  public ActivityModule_ProvideFeedPagerAdapterFactory(
      ActivityModule module, Provider<AppCompatActivity> activityProvider) {
    assert module != null;
    this.module = module;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
  }

  @Override
  public FeedPagerAdapter get() {
    return Preconditions.checkNotNull(
        module.provideFeedPagerAdapter(activityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FeedPagerAdapter> create(
      ActivityModule module, Provider<AppCompatActivity> activityProvider) {
    return new ActivityModule_ProvideFeedPagerAdapterFactory(module, activityProvider);
  }

  /** Proxies {@link ActivityModule#provideFeedPagerAdapter(AppCompatActivity)}. */
  public static FeedPagerAdapter proxyProvideFeedPagerAdapter(
      ActivityModule instance, AppCompatActivity activity) {
    return instance.provideFeedPagerAdapter(activity);
  }
}
