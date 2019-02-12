package com.accemy.SampalMVP.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvidePreferenceNameFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvidePreferenceNameFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.providePreferenceName(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(ApplicationModule module) {
    return new ApplicationModule_ProvidePreferenceNameFactory(module);
  }

  /** Proxies {@link ApplicationModule#providePreferenceName()}. */
  public static String proxyProvidePreferenceName(ApplicationModule instance) {
    return instance.providePreferenceName();
  }
}
