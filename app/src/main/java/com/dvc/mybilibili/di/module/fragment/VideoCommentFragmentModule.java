package com.dvc.mybilibili.di.module.fragment;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.Fragment;

import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoCommentFragment;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoDetailPageFragment;
import com.trello.lifecycle2.android.lifecycle.AndroidLifecycle;
import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class VideoCommentFragmentModule {

    @Provides
    static Fragment provideVideoCommentFragment(VideoCommentFragment fragment) {
        return fragment;
    }

    @Provides
    static LifecycleProvider<Lifecycle.Event> provideLifecycleProvider(Fragment fragment) {
        return AndroidLifecycle.createLifecycleProvider(fragment);
    }
}
