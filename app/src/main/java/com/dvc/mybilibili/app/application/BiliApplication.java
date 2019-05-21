package com.dvc.mybilibili.app.application;

import android.content.Context;
import android.support.multidex.MultiDex;

import com.dvc.base.net.NetWorkStatusManager;
import com.dvc.mybilibili.di.component.DaggerAppComponent;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.vondear.rxtool.RxTool;

import javax.inject.Inject;

import cn.bingoogolapple.swipebacklayout.BGASwipeBackHelper;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class BiliApplication extends DaggerApplication {
    private static BiliApplication base;

    @Inject
    DataManager dataManager;
    @Inject
    NetWorkStatusManager netWorkStatusManager;

    public static BiliApplication get(){
        return base;
    }

    public static Context getContext(){
        return base.getApplicationContext();
    }

    public static DataManager getDataManager() {
        return get().dataManager;
    }

    public static NetWorkStatusManager getNetWorkStatusManager() {
        return get().netWorkStatusManager;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        base = this;
        RxTool.init(this);
        BGASwipeBackHelper.init(this, null);
        netWorkStatusManager.registerReceiver();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        netWorkStatusManager.unregisterReceiver();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
