package com.accemy.SampalMVP.di.module;

import com.accemy.SampalMVP.ui.feed.opensource.OpenSourceMvpPresenter;
import com.accemy.SampalMVP.ui.feed.opensource.OpenSourceMvpView;
import com.accemy.SampalMVP.ui.feed.opensource.OpenSourcePresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideOpenSourcePresenterFactory
    implements Factory<OpenSourceMvpPresenter<OpenSourceMvpView>> {
  private final ActivityModule module;

  private final Provider<OpenSourcePresenter<OpenSourceMvpView>> presenterProvider;

  public ActivityModule_ProvideOpenSourcePresenterFactory(
      ActivityModule module, Provider<OpenSourcePresenter<OpenSourceMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public OpenSourceMvpPresenter<OpenSourceMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideOpenSourcePresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OpenSourceMvpPresenter<OpenSourceMvpView>> create(
      ActivityModule module, Provider<OpenSourcePresenter<OpenSourceMvpView>> presenterProvider) {
    return new ActivityModule_ProvideOpenSourcePresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideOpenSourcePresenter(OpenSourcePresenter)}. */
  public static OpenSourceMvpPresenter<OpenSourceMvpView> proxyProvideOpenSourcePresenter(
      ActivityModule instance, OpenSourcePresenter<OpenSourceMvpView> presenter) {
    return instance.provideOpenSourcePresenter(presenter);
  }
}
