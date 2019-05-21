package com.dvc.mybilibili.di.module.activity;


import android.arch.lifecycle.Lifecycle;
import android.support.v7.app.AppCompatActivity;

import com.dvc.mybilibili.mvp.ui.activity.HomeActivity;
import com.trello.lifecycle2.android.lifecycle.AndroidLifecycle;
import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityModule {
    @Provides
    static AppCompatActivity provideAppComatActivity(HomeActivity activity) {
        return activity;
    }

    @Provides
    static LifecycleProvider<Lifecycle.Event> provideLifecycleProvider(AppCompatActivity mAppCompatActivity) {
        return AndroidLifecycle.createLifecycleProvider(mAppCompatActivity);
    }
}
