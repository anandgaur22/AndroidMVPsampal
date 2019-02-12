package com.accemy.SampalMVP.ui.feed.blogs;

import android.support.v7.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlogFragment_MembersInjector implements MembersInjector<BlogFragment> {
  private final Provider<BlogMvpPresenter<BlogMvpView>> mPresenterProvider;

  private final Provider<BlogAdapter> mBlogAdapterProvider;

  private final Provider<LinearLayoutManager> mLayoutManagerProvider;

  public BlogFragment_MembersInjector(
      Provider<BlogMvpPresenter<BlogMvpView>> mPresenterProvider,
      Provider<BlogAdapter> mBlogAdapterProvider,
      Provider<LinearLayoutManager> mLayoutManagerProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mBlogAdapterProvider != null;
    this.mBlogAdapterProvider = mBlogAdapterProvider;
    assert mLayoutManagerProvider != null;
    this.mLayoutManagerProvider = mLayoutManagerProvider;
  }

  public static MembersInjector<BlogFragment> create(
      Provider<BlogMvpPresenter<BlogMvpView>> mPresenterProvider,
      Provider<BlogAdapter> mBlogAdapterProvider,
      Provider<LinearLayoutManager> mLayoutManagerProvider) {
    return new BlogFragment_MembersInjector(
        mPresenterProvider, mBlogAdapterProvider, mLayoutManagerProvider);
  }

  @Override
  public void injectMembers(BlogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
    instance.mBlogAdapter = mBlogAdapterProvider.get();
    instance.mLayoutManager = mLayoutManagerProvider.get();
  }

  public static void injectMPresenter(
      BlogFragment instance, Provider<BlogMvpPresenter<BlogMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMBlogAdapter(
      BlogFragment instance, Provider<BlogAdapter> mBlogAdapterProvider) {
    instance.mBlogAdapter = mBlogAdapterProvider.get();
  }

  public static void injectMLayoutManager(
      BlogFragment instance, Provider<LinearLayoutManager> mLayoutManagerProvider) {
    instance.mLayoutManager = mLayoutManagerProvider.get();
  }
}
