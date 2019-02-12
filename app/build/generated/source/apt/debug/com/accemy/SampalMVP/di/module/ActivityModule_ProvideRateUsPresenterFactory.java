package com.accemy.SampalMVP.di.module;

import com.accemy.SampalMVP.ui.main.rating.RatingDialogMvpPresenter;
import com.accemy.SampalMVP.ui.main.rating.RatingDialogMvpView;
import com.accemy.SampalMVP.ui.main.rating.RatingDialogPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideRateUsPresenterFactory
    implements Factory<RatingDialogMvpPresenter<RatingDialogMvpView>> {
  private final ActivityModule module;

  private final Provider<RatingDialogPresenter<RatingDialogMvpView>> presenterProvider;

  public ActivityModule_ProvideRateUsPresenterFactory(
      ActivityModule module,
      Provider<RatingDialogPresenter<RatingDialogMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public RatingDialogMvpPresenter<RatingDialogMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideRateUsPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RatingDialogMvpPresenter<RatingDialogMvpView>> create(
      ActivityModule module,
      Provider<RatingDialogPresenter<RatingDialogMvpView>> presenterProvider) {
    return new ActivityModule_ProvideRateUsPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideRateUsPresenter(RatingDialogPresenter)}. */
  public static RatingDialogMvpPresenter<RatingDialogMvpView> proxyProvideRateUsPresenter(
      ActivityModule instance, RatingDialogPresenter<RatingDialogMvpView> presenter) {
    return instance.provideRateUsPresenter(presenter);
  }
}
