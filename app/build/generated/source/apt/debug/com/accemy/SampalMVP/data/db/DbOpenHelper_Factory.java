package com.accemy.SampalMVP.data.db;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DbOpenHelper_Factory implements Factory<DbOpenHelper> {
  private final MembersInjector<DbOpenHelper> dbOpenHelperMembersInjector;

  private final Provider<Context> contextProvider;

  private final Provider<String> nameProvider;

  public DbOpenHelper_Factory(
      MembersInjector<DbOpenHelper> dbOpenHelperMembersInjector,
      Provider<Context> contextProvider,
      Provider<String> nameProvider) {
    assert dbOpenHelperMembersInjector != null;
    this.dbOpenHelperMembersInjector = dbOpenHelperMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert nameProvider != null;
    this.nameProvider = nameProvider;
  }

  @Override
  public DbOpenHelper get() {
    return MembersInjectors.injectMembers(
        dbOpenHelperMembersInjector, new DbOpenHelper(contextProvider.get(), nameProvider.get()));
  }

  public static Factory<DbOpenHelper> create(
      MembersInjector<DbOpenHelper> dbOpenHelperMembersInjector,
      Provider<Context> contextProvider,
      Provider<String> nameProvider) {
    return new DbOpenHelper_Factory(dbOpenHelperMembersInjector, contextProvider, nameProvider);
  }
}
