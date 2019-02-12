package com.accemy.SampalMVP.ui.main.rating;

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
public final class RatingDialogPresenter_Factory<V extends RatingDialogMvpView>
    implements Factory<RatingDialogPresenter<V>> {
  private final MembersInjector<RatingDialogPresenter<V>> ratingDialogPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public RatingDialogPresenter_Factory(
      MembersInjector<RatingDialogPresenter<V>> ratingDialogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert ratingDialogPresenterMembersInjector != null;
    this.ratingDialogPresenterMembersInjector = ratingDialogPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public RatingDialogPresenter<V> get() {
    return MembersInjectors.injectMembers(
        ratingDialogPresenterMembersInjector,
        new RatingDialogPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends RatingDialogMvpView> Factory<RatingDialogPresenter<V>> create(
      MembersInjector<RatingDialogPresenter<V>> ratingDialogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new RatingDialogPresenter_Factory<V>(
        ratingDialogPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
