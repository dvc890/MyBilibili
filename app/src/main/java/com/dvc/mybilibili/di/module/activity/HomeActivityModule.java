package com.dvc.mybilibili.di.module.activity;


import android.arch.lifecycle.Lifecycle;
import android.support.v7.app.AppCompatActivity;

import com.dvc.base.di.PerFragment;
import com.dvc.mybilibili.mvp.ui.activity.HomeActivity;
import com.dvc.mybilibili.mvp.ui.fragment.home.BangumiFragment;
import com.dvc.mybilibili.mvp.ui.fragment.home.HomeFragment;
import com.dvc.mybilibili.mvp.ui.fragment.home.HotFragment;
import com.dvc.mybilibili.mvp.ui.fragment.home.LiveFragment;
import com.dvc.mybilibili.mvp.ui.fragment.home.RecommendFragment;
import com.trello.lifecycle2.android.lifecycle.AndroidLifecycle;
import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class HomeActivityModule {

    @PerFragment
    @ContributesAndroidInjector
    abstract HomeFragment homeFragment();

    @PerFragment
    @ContributesAndroidInjector
    abstract LiveFragment liveFragment();

    @PerFragment
    @ContributesAndroidInjector
    abstract RecommendFragment recommendFragment();

    @PerFragment
    @ContributesAndroidInjector
    abstract HotFragment hotFragment();

    @PerFragment
    @ContributesAndroidInjector
    abstract BangumiFragment bangumiFragment();


    @Provides
    static AppCompatActivity provideAppComatActivity(HomeActivity activity) {
        return activity;
    }

    @Provides
    static LifecycleProvider<Lifecycle.Event> provideLifecycleProvider(AppCompatActivity mAppCompatActivity) {
        return AndroidLifecycle.createLifecycleProvider(mAppCompatActivity);
    }
}
