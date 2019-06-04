package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoDetailPageFragView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class VideoDetailPagePresenter extends MyMvpBasePresenter<VideoDetailPageFragView> {


    @Inject
    public VideoDetailPagePresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }


    public void loadVideoDetails(int avid) {
        this.apiHelper.getVideoDetails(avid, this.user.getAccessKey())
                .compose(RxSchedulersHelper.ioAndMainThread())
                .subscribe(new ObserverCallback<BiliVideoDetail>() {
                    @Override
                    public void onSuccess(BiliVideoDetail biliVideoDetail) {
                        ifViewAttached(view -> view.onLoadDetailCompleted(biliVideoDetail));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        ifViewAttached(view -> view.onLoadDetailFailed(apiException));
                    }
                });
    }
}
