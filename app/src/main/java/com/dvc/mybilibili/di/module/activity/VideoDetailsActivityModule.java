package com.dvc.mybilibili.di.module.activity;

import android.arch.lifecycle.Lifecycle;
import android.support.v7.app.AppCompatActivity;

import com.dvc.base.di.PerFragment;
import com.dvc.mybilibili.di.module.fragment.VideoCommentFragmentModule;
import com.dvc.mybilibili.di.module.fragment.VideoDetailPageFragmentModule;
import com.dvc.mybilibili.mvp.ui.activity.VideoDetailsActivity;
import com.dvc.mybilibili.mvp.ui.fragment.home.HomeFragment;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoCommentFragment;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoDetailPageFragment;
import com.trello.lifecycle2.android.lifecycle.AndroidLifecycle;
import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class VideoDetailsActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = VideoDetailPageFragmentModule.class)
    abstract VideoDetailPageFragment videoDetailPageFragment();

    @PerFragment
    @ContributesAndroidInjector(modules = VideoCommentFragmentModule.class)
    abstract VideoCommentFragment videoCommentFragment();

    @Provides
    static AppCompatActivity provideAppComatActivity(VideoDetailsActivity activity) {
        return activity;
    }

    @Provides
    static LifecycleProvider<Lifecycle.Event> provideLifecycleProvider(AppCompatActivity mAppCompatActivity) {
        return AndroidLifecycle.createLifecycleProvider(mAppCompatActivity);
    }
}
