package com.dvc.mybilibili.mvp.presenter.fragment;


import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.mvp.model.DataManager;
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

    public void loadData(int idx, boolean pull) {
        int login_event = this.dataManager.getUser().isLogin()?2:1;

        this.dataManager.getApiHelper().getPegasusFeedIndexList(idx, pull, login_event)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(appIndices -> {
                    RxLogTool.d(appIndices);
                });

        this.dataManager.getApiHelper().getPegasusFeedIndexListV2(this.dataManager.getUser().getAccessKey(),idx,pull, login_event, "", 0, 0,"",0)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(pegasusFeedResponse -> {
                    ifViewAttached(view -> view.setData(pegasusFeedResponse.items));
                    RxLogTool.d(pegasusFeedResponse);
                });
    }
}
