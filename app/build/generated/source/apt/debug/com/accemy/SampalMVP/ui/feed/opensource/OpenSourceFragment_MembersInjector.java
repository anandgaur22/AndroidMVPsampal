package com.accemy.SampalMVP.ui.feed.opensource;

import android.support.v7.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OpenSourceFragment_MembersInjector
    implements MembersInjector<OpenSourceFragment> {
  private final Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> mPresenterProvider;

  private final Provider<OpenSourceAdapter> mOpenSourceAdapterProvider;

  private final Provider<LinearLayoutManager> mLayoutManagerProvider;

  public OpenSourceFragment_MembersInjector(
      Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> mPresenterProvider,
      Provider<OpenSourceAdapter> mOpenSourceAdapterProvider,
      Provider<LinearLayoutManager> mLayoutManagerProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mOpenSourceAdapterProvider != null;
    this.mOpenSourceAdapterProvider = mOpenSourceAdapterProvider;
    assert mLayoutManagerProvider != null;
    this.mLayoutManagerProvider = mLayoutManagerProvider;
  }

  public static MembersInjector<OpenSourceFragment> create(
      Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> mPresenterProvider,
      Provider<OpenSourceAdapter> mOpenSourceAdapterProvider,
      Provider<LinearLayoutManager> mLayoutManagerProvider) {
    return new OpenSourceFragment_MembersInjector(
        mPresenterProvider, mOpenSourceAdapterProvider, mLayoutManagerProvider);
  }

  @Override
  public void injectMembers(OpenSourceFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
    instance.mOpenSourceAdapter = mOpenSourceAdapterProvider.get();
    instance.mLayoutManager = mLayoutManagerProvider.get();
  }

  public static void injectMPresenter(
      OpenSourceFragment instance,
      Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMOpenSourceAdapter(
      OpenSourceFragment instance, Provider<OpenSourceAdapter> mOpenSourceAdapterProvider) {
    instance.mOpenSourceAdapter = mOpenSourceAdapterProvider.get();
  }

  public static void injectMLayoutManager(
      OpenSourceFragment instance, Provider<LinearLayoutManager> mLayoutManagerProvider) {
    instance.mLayoutManager = mLayoutManagerProvider.get();
  }
}
