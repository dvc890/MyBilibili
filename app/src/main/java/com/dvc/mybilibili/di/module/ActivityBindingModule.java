package com.dvc.mybilibili.di.module;

import com.dvc.base.di.PerActivity;
import com.dvc.mybilibili.di.module.activity.AccountVerifyWebActivityModule;
import com.dvc.mybilibili.di.module.activity.HomeActivityModule;
import com.dvc.mybilibili.di.module.activity.LoginActivityModule;
import com.dvc.mybilibili.di.module.activity.SplashActivityModule;
import com.dvc.mybilibili.mvp.ui.activity.AccountVerifyWebActivity;
import com.dvc.mybilibili.mvp.ui.activity.HomeActivity;
import com.dvc.mybilibili.mvp.ui.activity.LoginActivity;
import com.dvc.mybilibili.mvp.ui.activity.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

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
}
