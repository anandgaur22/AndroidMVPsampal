package com.accemy.SampalMVP.di.module;

import com.accemy.SampalMVP.ui.feed.blogs.BlogMvpPresenter;
import com.accemy.SampalMVP.ui.feed.blogs.BlogMvpView;
import com.accemy.SampalMVP.ui.feed.blogs.BlogPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideBlogMvpPresenterFactory
    implements Factory<BlogMvpPresenter<BlogMvpView>> {
  private final ActivityModule module;

  private final Provider<BlogPresenter<BlogMvpView>> presenterProvider;

  public ActivityModule_ProvideBlogMvpPresenterFactory(
      ActivityModule module, Provider<BlogPresenter<BlogMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public BlogMvpPresenter<BlogMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideBlogMvpPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BlogMvpPresenter<BlogMvpView>> create(
      ActivityModule module, Provider<BlogPresenter<BlogMvpView>> presenterProvider) {
    return new ActivityModule_ProvideBlogMvpPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideBlogMvpPresenter(BlogPresenter)}. */
  public static BlogMvpPresenter<BlogMvpView> proxyProvideBlogMvpPresenter(
      ActivityModule instance, BlogPresenter<BlogMvpView> presenter) {
    return instance.provideBlogMvpPresenter(presenter);
  }
}
