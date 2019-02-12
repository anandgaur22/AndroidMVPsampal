package com.accemy.SampalMVP.ui.about;

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
public final class AboutPresenter_Factory<V extends AboutMvpView>
    implements Factory<AboutPresenter<V>> {
  private final MembersInjector<AboutPresenter<V>> aboutPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public AboutPresenter_Factory(
      MembersInjector<AboutPresenter<V>> aboutPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert aboutPresenterMembersInjector != null;
    this.aboutPresenterMembersInjector = aboutPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public AboutPresenter<V> get() {
    return MembersInjectors.injectMembers(
        aboutPresenterMembersInjector,
        new AboutPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends AboutMvpView> Factory<AboutPresenter<V>> create(
      MembersInjector<AboutPresenter<V>> aboutPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new AboutPresenter_Factory<V>(
        aboutPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
