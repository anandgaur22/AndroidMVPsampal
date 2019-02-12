package com.accemy.SampalMVP.ui.feed;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FeedActivity_MembersInjector implements MembersInjector<FeedActivity> {
  private final Provider<FeedMvpPresenter<FeedMvpView>> mPresenterProvider;

  private final Provider<FeedPagerAdapter> mPagerAdapterProvider;

  public FeedActivity_MembersInjector(
      Provider<FeedMvpPresenter<FeedMvpView>> mPresenterProvider,
      Provider<FeedPagerAdapter> mPagerAdapterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mPagerAdapterProvider != null;
    this.mPagerAdapterProvider = mPagerAdapterProvider;
  }

  public static MembersInjector<FeedActivity> create(
      Provider<FeedMvpPresenter<FeedMvpView>> mPresenterProvider,
      Provider<FeedPagerAdapter> mPagerAdapterProvider) {
    return new FeedActivity_MembersInjector(mPresenterProvider, mPagerAdapterProvider);
  }

  @Override
  public void injectMembers(FeedActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
    instance.mPagerAdapter = mPagerAdapterProvider.get();
  }

  public static void injectMPresenter(
      FeedActivity instance, Provider<FeedMvpPresenter<FeedMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPagerAdapter(
      FeedActivity instance, Provider<FeedPagerAdapter> mPagerAdapterProvider) {
    instance.mPagerAdapter = mPagerAdapterProvider.get();
  }
}
