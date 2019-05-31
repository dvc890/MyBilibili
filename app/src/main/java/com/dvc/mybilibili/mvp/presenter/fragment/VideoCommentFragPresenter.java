package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentCursorList;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoCommentFragView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class VideoCommentFragPresenter extends MvpBasePresenter<VideoCommentFragView> {

    private final Context context;
    private final DataManager dataManager;
    private final ApiHelper apiHelper;
    private final LifecycleProvider<Lifecycle.Event> provider;
    private final IAccountHelper user;

    @Inject
    public VideoCommentFragPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.context = context;
        this.dataManager = dataManager;
        this.provider = provider;
        this.apiHelper = this.dataManager.getApiHelper();
        this.user = this.dataManager.getUser();
    }

    public void getCommentListByCursorV2(int aid, int ps, int mode, int next) {
        this.apiHelper.getCommentListByCursorV2(aid, ps, mode, next)
                .compose(RxSchedulersHelper.ioAndMainThread())
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
