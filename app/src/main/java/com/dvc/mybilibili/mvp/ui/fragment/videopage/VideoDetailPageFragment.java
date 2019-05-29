package com.dvc.mybilibili.mvp.ui.fragment.videopage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.presenter.fragment.VideoDetailPagePresenter;

import javax.inject.Inject;

public class VideoDetailPageFragment extends MvpBaseFragment<VideoDetailPageFragView, VideoDetailPagePresenter> implements VideoDetailPageFragView {

    @Inject
    VideoDetailPagePresenter videoDetailPagePresenter;

    @NonNull
    @Override
    public VideoDetailPagePresenter createPresenter() {
        return videoDetailPagePresenter;
    }

    @Override
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_fragment_video_page_list;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadDatas() {

    }

    @Override
    public void onLoadDetailCompleted(BiliVideoDetail biliVideoDetail) {

    }

    @Override
    public void onLoadDetailFailed(BiliApiException apiException) {

    }
}
