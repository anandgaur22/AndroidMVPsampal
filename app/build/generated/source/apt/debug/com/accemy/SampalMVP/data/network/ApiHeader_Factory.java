package com.accemy.SampalMVP.data.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiHeader_Factory implements Factory<ApiHeader> {
  private final Provider<ApiHeader.PublicApiHeader> publicApiHeaderProvider;

  private final Provider<ApiHeader.ProtectedApiHeader> protectedApiHeaderProvider;

  public ApiHeader_Factory(
      Provider<ApiHeader.PublicApiHeader> publicApiHeaderProvider,
      Provider<ApiHeader.ProtectedApiHeader> protectedApiHeaderProvider) {
    assert publicApiHeaderProvider != null;
    this.publicApiHeaderProvider = publicApiHeaderProvider;
    assert protectedApiHeaderProvider != null;
    this.protectedApiHeaderProvider = protectedApiHeaderProvider;
  }

  @Override
  public ApiHeader get() {
    return new ApiHeader(publicApiHeaderProvider.get(), protectedApiHeaderProvider.get());
  }

  public static Factory<ApiHeader> create(
      Provider<ApiHeader.PublicApiHeader> publicApiHeaderProvider,
      Provider<ApiHeader.ProtectedApiHeader> protectedApiHeaderProvider) {
    return new ApiHeader_Factory(publicApiHeaderProvider, protectedApiHeaderProvider);
  }
}
