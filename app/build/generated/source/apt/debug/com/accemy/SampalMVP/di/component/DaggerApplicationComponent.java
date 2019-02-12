package com.accemy.SampalMVP.di.component;

import android.app.Application;
import android.content.Context;
import com.accemy.SampalMVP.MvpApp;
import com.accemy.SampalMVP.MvpApp_MembersInjector;
import com.accemy.SampalMVP.data.AppDataManager;
import com.accemy.SampalMVP.data.AppDataManager_Factory;
import com.accemy.SampalMVP.data.DataManager;
import com.accemy.SampalMVP.data.db.AppDbHelper;
import com.accemy.SampalMVP.data.db.AppDbHelper_Factory;
import com.accemy.SampalMVP.data.db.DbHelper;
import com.accemy.SampalMVP.data.db.DbOpenHelper;
import com.accemy.SampalMVP.data.db.DbOpenHelper_Factory;
import com.accemy.SampalMVP.data.network.ApiHeader;
import com.accemy.SampalMVP.data.network.ApiHeader_Factory;
import com.accemy.SampalMVP.data.network.ApiHeader_PublicApiHeader_Factory;
import com.accemy.SampalMVP.data.network.ApiHelper;
import com.accemy.SampalMVP.data.network.AppApiHelper;
import com.accemy.SampalMVP.data.network.AppApiHelper_Factory;
import com.accemy.SampalMVP.data.prefs.AppPreferencesHelper;
import com.accemy.SampalMVP.data.prefs.AppPreferencesHelper_Factory;
import com.accemy.SampalMVP.data.prefs.PreferencesHelper;
import com.accemy.SampalMVP.di.module.ApplicationModule;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideApiHelperFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideApiKeyFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideApplicationFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideCalligraphyDefaultConfigFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideContextFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideDataManagerFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideDatabaseNameFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideDbHelperFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvidePreferenceNameFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvidePreferencesHelperFactory;
import com.accemy.SampalMVP.di.module.ApplicationModule_ProvideProtectedApiHeaderFactory;
import com.accemy.SampalMVP.service.SyncService;
import com.accemy.SampalMVP.service.SyncService_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Context> provideContextProvider;

  private Provider<String> provideDatabaseNameProvider;

  private Provider<DbOpenHelper> dbOpenHelperProvider;

  private Provider<AppDbHelper> appDbHelperProvider;

  private Provider<DbHelper> provideDbHelperProvider;

  private Provider<String> providePreferenceNameProvider;

  private Provider<AppPreferencesHelper> appPreferencesHelperProvider;

  private Provider<PreferencesHelper> providePreferencesHelperProvider;

  private Provider<String> provideApiKeyProvider;

  private Provider<ApiHeader.PublicApiHeader> publicApiHeaderProvider;

  private Provider<ApiHeader.ProtectedApiHeader> provideProtectedApiHeaderProvider;

  private Provider<ApiHeader> apiHeaderProvider;

  private Provider<AppApiHelper> appApiHelperProvider;

  private Provider<ApiHelper> provideApiHelperProvider;

  private Provider<AppDataManager> appDataManagerProvider;

  private Provider<DataManager> provideDataManagerProvider;

  private Provider<CalligraphyConfig> provideCalligraphyDefaultConfigProvider;

  private MembersInjector<MvpApp> mvpAppMembersInjector;

  private MembersInjector<SyncService> syncServiceMembersInjector;

  private Provider<Application> provideApplicationProvider;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        ApplicationModule_ProvideContextFactory.create(builder.applicationModule);

    this.provideDatabaseNameProvider =
        ApplicationModule_ProvideDatabaseNameFactory.create(builder.applicationModule);

    this.dbOpenHelperProvider =
        DoubleCheck.provider(
            DbOpenHelper_Factory.create(
                MembersInjectors.<DbOpenHelper>noOp(),
                provideContextProvider,
                provideDatabaseNameProvider));

    this.appDbHelperProvider =
        DoubleCheck.provider(AppDbHelper_Factory.create(dbOpenHelperProvider));

    this.provideDbHelperProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideDbHelperFactory.create(
                builder.applicationModule, appDbHelperProvider));

    this.providePreferenceNameProvider =
        ApplicationModule_ProvidePreferenceNameFactory.create(builder.applicationModule);

    this.appPreferencesHelperProvider =
        DoubleCheck.provider(
            AppPreferencesHelper_Factory.create(
                provideContextProvider, providePreferenceNameProvider));

    this.providePreferencesHelperProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvidePreferencesHelperFactory.create(
                builder.applicationModule, appPreferencesHelperProvider));

    this.provideApiKeyProvider =
        ApplicationModule_ProvideApiKeyFactory.create(builder.applicationModule);

    this.publicApiHeaderProvider = ApiHeader_PublicApiHeader_Factory.create(provideApiKeyProvider);

    this.provideProtectedApiHeaderProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideProtectedApiHeaderFactory.create(
                builder.applicationModule,
                provideApiKeyProvider,
                providePreferencesHelperProvider));

    this.apiHeaderProvider =
        DoubleCheck.provider(
            ApiHeader_Factory.create(publicApiHeaderProvider, provideProtectedApiHeaderProvider));

    this.appApiHelperProvider =
        DoubleCheck.provider(AppApiHelper_Factory.create(apiHeaderProvider));

    this.provideApiHelperProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideApiHelperFactory.create(
                builder.applicationModule, appApiHelperProvider));

    this.appDataManagerProvider =
        DoubleCheck.provider(
            AppDataManager_Factory.create(
                provideContextProvider,
                provideDbHelperProvider,
                providePreferencesHelperProvider,
                provideApiHelperProvider));

    this.provideDataManagerProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideDataManagerFactory.create(
                builder.applicationModule, appDataManagerProvider));

    this.provideCalligraphyDefaultConfigProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideCalligraphyDefaultConfigFactory.create(
                builder.applicationModule));

    this.mvpAppMembersInjector =
        MvpApp_MembersInjector.create(
            provideDataManagerProvider, provideCalligraphyDefaultConfigProvider);

    this.syncServiceMembersInjector =
        SyncService_MembersInjector.create(provideDataManagerProvider);

    this.provideApplicationProvider =
        ApplicationModule_ProvideApplicationFactory.create(builder.applicationModule);
  }

  @Override
  public void inject(MvpApp app) {
    mvpAppMembersInjector.injectMembers(app);
  }

  @Override
  public void inject(SyncService service) {
    syncServiceMembersInjector.injectMembers(service);
  }

  @Override
  public Context context() {
    return provideContextProvider.get();
  }

  @Override
  public Application application() {
    return provideApplicationProvider.get();
  }

  @Override
  public DataManager getDataManager() {
    return provideDataManagerProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }
}
