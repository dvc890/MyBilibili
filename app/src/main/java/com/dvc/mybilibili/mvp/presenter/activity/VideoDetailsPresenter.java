package com.dvc.mybilibili.mvp.presenter.activity;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.FtVideoUrlInfoBean;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.activity.VideoDetailsView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class VideoDetailsPresenter extends MyMvpBasePresenter<VideoDetailsView> {


    @Inject
    public VideoDetailsPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
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

    public void getVideoUrl(int aid, long cid, int quality) {
        //等quic协议支持后，这里改为调用getFTVideoMaterialUrl
//        this.apiHelper.getFTVideoUrl(this.user.getAccessKey(), aid, cid, quality)
        this.apiHelper.getFTVideoMaterialUrl(this.user.getAccessKey(), aid, cid, quality)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .subscribe(new ObserverCallback<FtVideoUrlInfoBean>() {
                    @Override
                    public void onSuccess(FtVideoUrlInfoBean ftVideoUrlInfoBean) {
                        ifViewAttached(view -> view.onLoadVideoUrlCompleted(ftVideoUrlInfoBean));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        ifViewAttached(view -> view.onLoadVideoUrlFailed(apiException));
                    }
                });
    }
}
