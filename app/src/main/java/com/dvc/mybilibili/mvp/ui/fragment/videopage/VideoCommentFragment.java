package com.dvc.mybilibili.mvp.ui.fragment.videopage;

import android.support.annotation.NonNull;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.presenter.fragment.VideoCommentFragPresenter;

import javax.inject.Inject;

public class VideoCommentFragment extends MvpBaseFragment<VideoCommentFragView, VideoCommentFragPresenter> implements VideoCommentFragView{

    @Inject
    VideoCommentFragPresenter videoCommentFragPresenter;

    @NonNull
    @Override
    public VideoCommentFragPresenter createPresenter() {
        return videoCommentFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.content_main;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadDatas() {

    }
}
