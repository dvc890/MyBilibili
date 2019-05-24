package com.dvc.mybilibili.mvp.presenter.fragment;


import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerListItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.PegasusFeedResponse;
import com.dvc.mybilibili.mvp.ui.fragment.home.RecommendFragView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.vondear.rxtool.RxLogTool;

import javax.inject.Inject;

public class RecommendFragPresenter extends MvpBasePresenter<RecommendFragView> {

    private final Context context;
    private final DataManager dataManager;
    private final LifecycleProvider<Lifecycle.Event> provider;

    @Inject
    public RecommendFragPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.context = context;
        this.dataManager = dataManager;
        this.provider = provider;
    }

    public void loadData(int idx, boolean pull, String banner_hash) {
        int login_event = this.dataManager.getUser().isLogin()?2:1;

//        this.dataManager.getApiHelper().getPegasusFeedIndexList(idx, pull, login_event)
//                .compose(RxSchedulersHelper.ioAndMainThread())
//                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
//                .subscribe(appIndices -> {
//                    RxLogTool.d(appIndices);
//                });

        this.dataManager.getApiHelper().getPegasusFeedIndexListV2(this.dataManager.getUser().getAccessKey(),idx,pull, login_event, "", 0, 0,banner_hash,0)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .filter(pegasusFeedResponse -> {
                    if(pegasusFeedResponse.items.get(0) instanceof BannerListItem) {
                        if (((BannerListItem) pegasusFeedResponse.items.get(0)).hash.equals(banner_hash))
                            pegasusFeedResponse.items.remove(0);
                    }
                    return true;
                })
                .subscribe(new ObserverCallback<PegasusFeedResponse>() {
                    @Override
                    public void onSuccess(PegasusFeedResponse pegasusFeedResponse) {
                        ifViewAttached(view -> {
                            if(pull) {
                                view.loadDataCompleted(pegasusFeedResponse.items);
                            } else {
                                view.loadMoreDataComplete(pegasusFeedResponse.items);
                            }
                        });
                        RxLogTool.d(pegasusFeedResponse);
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        ifViewAttached(view -> {
                            if(pull) {

                            }else {
                                view.loadMoreFailed();
                            }
                        });
                    }
                });
    }
}
