package com.accemy.SampalMVP.data.db;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppDbHelper_Factory implements Factory<AppDbHelper> {
  private final Provider<DbOpenHelper> dbOpenHelperProvider;

  public AppDbHelper_Factory(Provider<DbOpenHelper> dbOpenHelperProvider) {
    assert dbOpenHelperProvider != null;
    this.dbOpenHelperProvider = dbOpenHelperProvider;
  }

  @Override
  public AppDbHelper get() {
    return new AppDbHelper(dbOpenHelperProvider.get());
  }

  public static Factory<AppDbHelper> create(Provider<DbOpenHelper> dbOpenHelperProvider) {
    return new AppDbHelper_Factory(dbOpenHelperProvider);
  }
}
