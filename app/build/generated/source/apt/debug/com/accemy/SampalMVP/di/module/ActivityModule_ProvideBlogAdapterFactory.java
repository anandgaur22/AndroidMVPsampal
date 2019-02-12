package com.accemy.SampalMVP.di.module;

import com.accemy.SampalMVP.ui.feed.blogs.BlogAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideBlogAdapterFactory implements Factory<BlogAdapter> {
  private final ActivityModule module;

  public ActivityModule_ProvideBlogAdapterFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BlogAdapter get() {
    return Preconditions.checkNotNull(
        module.provideBlogAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BlogAdapter> create(ActivityModule module) {
    return new ActivityModule_ProvideBlogAdapterFactory(module);
  }

  /** Proxies {@link ActivityModule#provideBlogAdapter()}. */
  public static BlogAdapter proxyProvideBlogAdapter(ActivityModule instance) {
    return instance.provideBlogAdapter();
  }
}
