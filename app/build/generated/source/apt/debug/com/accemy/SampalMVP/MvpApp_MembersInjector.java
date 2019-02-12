package com.accemy.SampalMVP;

import com.accemy.SampalMVP.data.DataManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MvpApp_MembersInjector implements MembersInjector<MvpApp> {
  private final Provider<DataManager> mDataManagerProvider;

  private final Provider<CalligraphyConfig> mCalligraphyConfigProvider;

  public MvpApp_MembersInjector(
      Provider<DataManager> mDataManagerProvider,
      Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    assert mDataManagerProvider != null;
    this.mDataManagerProvider = mDataManagerProvider;
    assert mCalligraphyConfigProvider != null;
    this.mCalligraphyConfigProvider = mCalligraphyConfigProvider;
  }

  public static MembersInjector<MvpApp> create(
      Provider<DataManager> mDataManagerProvider,
      Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    return new MvpApp_MembersInjector(mDataManagerProvider, mCalligraphyConfigProvider);
  }

  @Override
  public void injectMembers(MvpApp instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDataManager = mDataManagerProvider.get();
    instance.mCalligraphyConfig = mCalligraphyConfigProvider.get();
  }

  public static void injectMDataManager(
      MvpApp instance, Provider<DataManager> mDataManagerProvider) {
    instance.mDataManager = mDataManagerProvider.get();
  }

  public static void injectMCalligraphyConfig(
      MvpApp instance, Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    instance.mCalligraphyConfig = mCalligraphyConfigProvider.get();
  }
}
