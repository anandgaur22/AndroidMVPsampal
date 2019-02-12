package com.accemy.SampalMVP.di.module;

import com.accemy.SampalMVP.data.network.ApiHeader;
import com.accemy.SampalMVP.data.prefs.PreferencesHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideProtectedApiHeaderFactory
    implements Factory<ApiHeader.ProtectedApiHeader> {
  private final ApplicationModule module;

  private final Provider<String> apiKeyProvider;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  public ApplicationModule_ProvideProtectedApiHeaderFactory(
      ApplicationModule module,
      Provider<String> apiKeyProvider,
      Provider<PreferencesHelper> preferencesHelperProvider) {
    assert module != null;
    this.module = module;
    assert apiKeyProvider != null;
    this.apiKeyProvider = apiKeyProvider;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
  }

  @Override
  public ApiHeader.ProtectedApiHeader get() {
    return Preconditions.checkNotNull(
        module.provideProtectedApiHeader(apiKeyProvider.get(), preferencesHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApiHeader.ProtectedApiHeader> create(
      ApplicationModule module,
      Provider<String> apiKeyProvider,
      Provider<PreferencesHelper> preferencesHelperProvider) {
    return new ApplicationModule_ProvideProtectedApiHeaderFactory(
        module, apiKeyProvider, preferencesHelperProvider);
  }

  /** Proxies {@link ApplicationModule#provideProtectedApiHeader(String, PreferencesHelper)}. */
  public static ApiHeader.ProtectedApiHeader proxyProvideProtectedApiHeader(
      ApplicationModule instance, String apiKey, PreferencesHelper preferencesHelper) {
    return instance.provideProtectedApiHeader(apiKey, preferencesHelper);
  }
}
