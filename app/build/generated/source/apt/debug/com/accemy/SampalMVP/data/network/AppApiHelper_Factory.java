package com.accemy.SampalMVP.data.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppApiHelper_Factory implements Factory<AppApiHelper> {
  private final Provider<ApiHeader> apiHeaderProvider;

  public AppApiHelper_Factory(Provider<ApiHeader> apiHeaderProvider) {
    assert apiHeaderProvider != null;
    this.apiHeaderProvider = apiHeaderProvider;
  }

  @Override
  public AppApiHelper get() {
    return new AppApiHelper(apiHeaderProvider.get());
  }

  public static Factory<AppApiHelper> create(Provider<ApiHeader> apiHeaderProvider) {
    return new AppApiHelper_Factory(apiHeaderProvider);
  }
}
