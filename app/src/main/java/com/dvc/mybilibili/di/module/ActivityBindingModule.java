package com.dvc.mybilibili.di.module;

import com.dvc.base.di.PerActivity;
import com.dvc.mybilibili.di.module.activity.AccountVerifyWebActivityModule;
import com.dvc.mybilibili.di.module.activity.HomeActivityModule;
import com.dvc.mybilibili.di.module.activity.LiveRoomActivityModule;
import com.dvc.mybilibili.di.module.activity.LoginActivityModule;
import com.dvc.mybilibili.di.module.activity.SplashActivityModule;
import com.dvc.mybilibili.di.module.activity.TestActivityModule;
import com.dvc.mybilibili.di.module.activity.VideoDetailsActivityModule;
import com.dvc.mybilibili.mvp.ui.activity.AccountVerifyWebActivity;
import com.dvc.mybilibili.mvp.ui.activity.HomeActivity;
import com.dvc.mybilibili.mvp.ui.activity.LiveRoomActivity;
import com.dvc.mybilibili.mvp.ui.activity.LoginActivity;
import com.dvc.mybilibili.mvp.ui.activity.SplashActivity;
import com.dvc.mybilibili.mvp.ui.activity.TestActivity;
import com.dvc.mybilibili.mvp.ui.activity.VideoDetailsActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = TestActivityModule.class)
    abstract TestActivity testActivity();

    @PerActivity
    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity splashActivity();

    @PerActivity
    @ContributesAndroidInjector(modules = HomeActivityModule.class)
    abstract HomeActivity homeActivity();

    @PerActivity
    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity loginActivity();

    @PerActivity
    @ContributesAndroidInjector(modules = AccountVerifyWebActivityModule.class)
    abstract AccountVerifyWebActivity accountVerifyWebActivity();

    @PerActivity
    @ContributesAndroidInjector(modules = VideoDetailsActivityModule.class)
    abstract VideoDetailsActivity videoDetailsActivity();

    @PerActivity
    @ContributesAndroidInjector(modules = LiveRoomActivityModule.class)
    abstract LiveRoomActivity liveRoomActivity();
}
