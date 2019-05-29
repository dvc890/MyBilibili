package com.dvc.mybilibili.mvp.presenter.activity;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.alibaba.fastjson.JSONObject;
import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.ui.activity.VideoDetailsView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class VideoDetailsPresenter extends MvpBasePresenter<VideoDetailsView>{


    private final Context context;
    private final DataManager dataManager;
    private final ApiHelper apiHelper;
    private final IAccountHelper user;
    private final LifecycleProvider<Lifecycle.Event> provider;

    @Inject
    public VideoDetailsPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.context = context;
        this.dataManager = dataManager;
        this.provider = provider;
        this.apiHelper = this.dataManager.getApiHelper();
        this.user = this.dataManager.getUser();
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

    public void getVideoUrl(int aid, long cid, int quality) {
        this.apiHelper.getFTVideoUrlV2(this.user.getAccessKey(), aid, cid, quality)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .subscribe(new ObserverCallback<JSONObject>() {
                    @Override
                    public void onSuccess(JSONObject jsonObject) {

                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {

                    }
                });
    }
}
