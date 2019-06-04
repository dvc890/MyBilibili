package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentCursorList;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoCommentFragView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class VideoCommentFragPresenter extends MyMvpBasePresenter<VideoCommentFragView> {


    @Inject
    public VideoCommentFragPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }

    public void getCommentListByCursorV2(long aid, int ps, int mode, int next) {
        this.apiHelper.getCommentListByCursorV2(aid, ps, mode, next)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(new ObserverCallback<BiliCommentCursorList>() {
                    @Override
                    public void onSuccess(BiliCommentCursorList biliCommentCursorList) {
                        ifViewAttached(view -> {
                            if(next == 1) view.loadDataCompleted(biliCommentCursorList);
                            else view.loadMoreDataComplete(biliCommentCursorList);
                        });
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        ifViewAttached(view -> view.loadFailed(code, apiException.getMessage()));
                    }
                });
    }
}
