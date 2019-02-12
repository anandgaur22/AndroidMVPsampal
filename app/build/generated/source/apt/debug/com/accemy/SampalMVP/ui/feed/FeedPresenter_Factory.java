package com.accemy.SampalMVP.ui.feed;

import com.accemy.SampalMVP.data.DataManager;
import com.accemy.SampalMVP.ui.base.MvpView;
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
public final class FeedPresenter_Factory<V extends MvpView> implements Factory<FeedPresenter<V>> {
  private final MembersInjector<FeedPresenter<V>> feedPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public FeedPresenter_Factory(
      MembersInjector<FeedPresenter<V>> feedPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert feedPresenterMembersInjector != null;
    this.feedPresenterMembersInjector = feedPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public FeedPresenter<V> get() {
    return MembersInjectors.injectMembers(
        feedPresenterMembersInjector,
        new FeedPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends MvpView> Factory<FeedPresenter<V>> create(
      MembersInjector<FeedPresenter<V>> feedPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new FeedPresenter_Factory<V>(
        feedPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
