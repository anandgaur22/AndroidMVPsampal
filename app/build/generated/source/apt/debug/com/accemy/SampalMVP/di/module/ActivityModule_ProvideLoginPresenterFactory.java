package com.accemy.SampalMVP.di.module;

import com.accemy.SampalMVP.ui.login.LoginMvpPresenter;
import com.accemy.SampalMVP.ui.login.LoginMvpView;
import com.accemy.SampalMVP.ui.login.LoginPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideLoginPresenterFactory
    implements Factory<LoginMvpPresenter<LoginMvpView>> {
  private final ActivityModule module;

  private final Provider<LoginPresenter<LoginMvpView>> presenterProvider;

  public ActivityModule_ProvideLoginPresenterFactory(
      ActivityModule module, Provider<LoginPresenter<LoginMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public LoginMvpPresenter<LoginMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideLoginPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoginMvpPresenter<LoginMvpView>> create(
      ActivityModule module, Provider<LoginPresenter<LoginMvpView>> presenterProvider) {
    return new ActivityModule_ProvideLoginPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideLoginPresenter(LoginPresenter)}. */
  public static LoginMvpPresenter<LoginMvpView> proxyProvideLoginPresenter(
      ActivityModule instance, LoginPresenter<LoginMvpView> presenter) {
    return instance.provideLoginPresenter(presenter);
  }
}
