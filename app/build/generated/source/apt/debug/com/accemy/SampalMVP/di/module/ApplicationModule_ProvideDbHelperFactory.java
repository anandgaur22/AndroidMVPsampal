package com.accemy.SampalMVP.di.module;

import com.accemy.SampalMVP.data.db.AppDbHelper;
import com.accemy.SampalMVP.data.db.DbHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideDbHelperFactory implements Factory<DbHelper> {
  private final ApplicationModule module;

  private final Provider<AppDbHelper> appDbHelperProvider;

  public ApplicationModule_ProvideDbHelperFactory(
      ApplicationModule module, Provider<AppDbHelper> appDbHelperProvider) {
    assert module != null;
    this.module = module;
    assert appDbHelperProvider != null;
    this.appDbHelperProvider = appDbHelperProvider;
  }

  @Override
  public DbHelper get() {
    return Preconditions.checkNotNull(
        module.provideDbHelper(appDbHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DbHelper> create(
      ApplicationModule module, Provider<AppDbHelper> appDbHelperProvider) {
    return new ApplicationModule_ProvideDbHelperFactory(module, appDbHelperProvider);
  }

  /** Proxies {@link ApplicationModule#provideDbHelper(AppDbHelper)}. */
  public static DbHelper proxyProvideDbHelper(ApplicationModule instance, AppDbHelper appDbHelper) {
    return instance.provideDbHelper(appDbHelper);
  }
}
