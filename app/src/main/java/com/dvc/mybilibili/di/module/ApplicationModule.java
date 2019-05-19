package com.dvc.mybilibili.di.module;

import android.app.Application;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.di.DatabaseName;
import com.dvc.base.di.PreferenceFileName;
import com.dvc.base.net.AppNetWorkStatusManager;
import com.dvc.base.net.NetWorkStatusManager;
import com.dvc.mybilibili.app.utils.AppCacheUtils;
import com.dvc.mybilibili.di.AccountPreferenceFileName;
import com.dvc.mybilibili.mvp.model.AppDataManager;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.account.AccountHelper;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.dvc.mybilibili.mvp.model.api.AppApiHelper;
import com.dvc.mybilibili.mvp.model.api.cache.CacheProviders;
import com.dvc.mybilibili.mvp.model.pref.AppPreferencesHelper;
import com.dvc.mybilibili.mvp.model.pref.PreferencesHelper;

import java.io.File;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

@Module
public abstract class ApplicationModule {
    private static final String TAG = ApplicationModule.class.getSimpleName();

    @Binds
    @ApplicationContext
    abstract Context bindContext(Application application);

    @Provides
    @PreferenceFileName
    static String providePreferenceName(@ApplicationContext Context context) {
        return context.getPackageName() + "_preferences";
    }

    @Provides
    @AccountPreferenceFileName
    static String provideAccountPreferenceName() {
        return "account_preferences";
    }

    @Provides
    @DatabaseName
    static String provideDatabaseName() {
        return "bili_db";
    }

    @Singleton
    @Provides
    static NetWorkStatusManager providesNetWorkStatusManager(AppNetWorkStatusManager appNetWorkStatusManager) {
        return appNetWorkStatusManager;
    }

    @Singleton
    @Provides
    static DataManager providesDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Singleton
    @Provides
    static ApiHelper providesApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Singleton
    @Provides
    static PreferencesHelper providesPreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Singleton
    @Provides
    static IAccountHelper providesIAccountHelper(AccountHelper accountHelper) {
        return accountHelper;
    }

    @Singleton
    @Provides
    static CacheProviders providesCacheProviders(@ApplicationContext Context context) {
        File cacheDir = AppCacheUtils.getRxCacheDir(context);
        return new RxCache.Builder()
                .persistence(cacheDir, new GsonSpeaker())
                .using(CacheProviders.class);
    }
}
