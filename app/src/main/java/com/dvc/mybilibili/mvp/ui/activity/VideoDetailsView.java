package com.dvc.mybilibili.mvp.ui.activity;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface VideoDetailsView extends MvpView{
    void onLoadDetailCompleted(BiliVideoDetail biliVideoDetail);

    void onLoadDetailFailed(BiliApiException apiException);
}
