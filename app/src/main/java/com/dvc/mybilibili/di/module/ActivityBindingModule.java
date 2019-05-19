package com.dvc.mybilibili.di.module;

import com.dvc.base.di.PerActivity;
import com.dvc.mybilibili.di.module.activity.SplashActivityModule;
import com.dvc.mybilibili.mvp.ui.activity.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity splashActivity();
}
