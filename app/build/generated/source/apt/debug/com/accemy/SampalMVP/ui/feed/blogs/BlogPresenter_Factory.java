package com.accemy.SampalMVP.ui.feed.blogs;

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
public final class BlogPresenter_Factory<V extends BlogMvpView>
    implements Factory<BlogPresenter<V>> {
  private final MembersInjector<BlogPresenter<V>> blogPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public BlogPresenter_Factory(
      MembersInjector<BlogPresenter<V>> blogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert blogPresenterMembersInjector != null;
    this.blogPresenterMembersInjector = blogPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public BlogPresenter<V> get() {
    return MembersInjectors.injectMembers(
        blogPresenterMembersInjector,
        new BlogPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends BlogMvpView> Factory<BlogPresenter<V>> create(
      MembersInjector<BlogPresenter<V>> blogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new BlogPresenter_Factory<V>(
        blogPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
