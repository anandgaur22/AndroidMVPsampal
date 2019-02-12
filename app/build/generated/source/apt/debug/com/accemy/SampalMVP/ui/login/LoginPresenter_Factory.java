package com.accemy.SampalMVP.ui.login;

import com.accemy.SampalMVP.data.DataManager;
import com.accemy.SampalMVP.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginPresenter_Factory<V extends LoginMvpView>
    implements Factory<LoginPresenter<V>> {
  private final MembersInjector<LoginPresenter<V>> loginPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public LoginPresenter_Factory(
      MembersInjector<LoginPresenter<V>> loginPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert loginPresenterMembersInjector != null;
    this.loginPresenterMembersInjector = loginPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public LoginPresenter<V> get() {
    return MembersInjectors.injectMembers(
        loginPresenterMembersInjector,
        new LoginPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends LoginMvpView> Factory<LoginPresenter<V>> create(
      MembersInjector<LoginPresenter<V>> loginPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new LoginPresenter_Factory<V>(
        loginPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
