package com.accemy.SampalMVP.service;

import com.accemy.SampalMVP.data.DataManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncService_MembersInjector implements MembersInjector<SyncService> {
  private final Provider<DataManager> mDataManagerProvider;

  public SyncService_MembersInjector(Provider<DataManager> mDataManagerProvider) {
    assert mDataManagerProvider != null;
    this.mDataManagerProvider = mDataManagerProvider;
  }

  public static MembersInjector<SyncService> create(Provider<DataManager> mDataManagerProvider) {
    return new SyncService_MembersInjector(mDataManagerProvider);
  }

  @Override
  public void injectMembers(SyncService instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDataManager = mDataManagerProvider.get();
  }

  public static void injectMDataManager(
      SyncService instance, Provider<DataManager> mDataManagerProvider) {
    instance.mDataManager = mDataManagerProvider.get();
  }
}
