package com.dvc.mybilibili.di.module.fragment;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.dvc.mybilibili.mvp.ui.activity.VideoDetailsActivity;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoDetailPageFragment;
import com.trello.lifecycle2.android.lifecycle.AndroidLifecycle;
import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class VideoDetailPageFragmentModule {

    @Provides
    static Fragment provideVideoDetailPageFragment(VideoDetailPageFragment fragment) {
        return fragment;
    }

    @Provides
    static LifecycleProvider<Lifecycle.Event> provideLifecycleProvider(Fragment fragment) {
        return AndroidLifecycle.createLifecycleProvider(fragment);
    }
}
