package com.accemy.SampalMVP.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideDatabaseNameFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideDatabaseNameFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideDatabaseName(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(ApplicationModule module) {
    return new ApplicationModule_ProvideDatabaseNameFactory(module);
  }

  /** Proxies {@link ApplicationModule#provideDatabaseName()}. */
  public static String proxyProvideDatabaseName(ApplicationModule instance) {
    return instance.provideDatabaseName();
  }
}
