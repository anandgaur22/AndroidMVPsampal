package com.accemy.SampalMVP.di.module;

import com.accemy.SampalMVP.ui.feed.FeedMvpPresenter;
import com.accemy.SampalMVP.ui.feed.FeedMvpView;
import com.accemy.SampalMVP.ui.feed.FeedPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideFeedPresenterFactory
    implements Factory<FeedMvpPresenter<FeedMvpView>> {
  private final ActivityModule module;

  private final Provider<FeedPresenter<FeedMvpView>> presenterProvider;

  public ActivityModule_ProvideFeedPresenterFactory(
      ActivityModule module, Provider<FeedPresenter<FeedMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public FeedMvpPresenter<FeedMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideFeedPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FeedMvpPresenter<FeedMvpView>> create(
      ActivityModule module, Provider<FeedPresenter<FeedMvpView>> presenterProvider) {
    return new ActivityModule_ProvideFeedPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideFeedPresenter(FeedPresenter)}. */
  public static FeedMvpPresenter<FeedMvpView> proxyProvideFeedPresenter(
      ActivityModule instance, FeedPresenter<FeedMvpView> presenter) {
    return instance.provideFeedPresenter(presenter);
  }
}
