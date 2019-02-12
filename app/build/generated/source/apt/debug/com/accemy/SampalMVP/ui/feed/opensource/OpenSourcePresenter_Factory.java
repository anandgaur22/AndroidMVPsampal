package com.accemy.SampalMVP.ui.feed.opensource;

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
public final class OpenSourcePresenter_Factory<V extends OpenSourceMvpView>
    implements Factory<OpenSourcePresenter<V>> {
  private final MembersInjector<OpenSourcePresenter<V>> openSourcePresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public OpenSourcePresenter_Factory(
      MembersInjector<OpenSourcePresenter<V>> openSourcePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert openSourcePresenterMembersInjector != null;
    this.openSourcePresenterMembersInjector = openSourcePresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public OpenSourcePresenter<V> get() {
    return MembersInjectors.injectMembers(
        openSourcePresenterMembersInjector,
        new OpenSourcePresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends OpenSourceMvpView> Factory<OpenSourcePresenter<V>> create(
      MembersInjector<OpenSourcePresenter<V>> openSourcePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new OpenSourcePresenter_Factory<V>(
        openSourcePresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
