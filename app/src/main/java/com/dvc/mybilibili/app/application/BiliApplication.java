package com.dvc.mybilibili.app.application;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.multidex.MultiDex;

import com.dvc.base.net.NetWorkStatusManager;
import com.dvc.mybilibili.di.component.DaggerAppComponent;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.ui.widget.CustomRefreshHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
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

    public static IAccountHelper getUser() {
        return get().dataManager.getUser();
    }

    public static NetWorkStatusManager getNetWorkStatusManager() {
        return get().netWorkStatusManager;
    }

    static {
        //预设下拉刷新控件样式
        SmartRefreshLayout.setDefaultRefreshHeaderCreator((context, layout) -> new CustomRefreshHeader(context));
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
