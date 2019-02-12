package com.accemy.SampalMVP.ui.about;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AboutFragment_MembersInjector implements MembersInjector<AboutFragment> {
  private final Provider<AboutMvpPresenter<AboutMvpView>> mPresenterProvider;

  public AboutFragment_MembersInjector(
      Provider<AboutMvpPresenter<AboutMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<AboutFragment> create(
      Provider<AboutMvpPresenter<AboutMvpView>> mPresenterProvider) {
    return new AboutFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(AboutFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      AboutFragment instance, Provider<AboutMvpPresenter<AboutMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
