package com.dvc.mybilibili.mvp.presenter;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.ui.activity.HomeView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.vondear.rxtool.RxLogTool;

import javax.inject.Inject;

public class HomePresenter extends MvpBasePresenter<HomeView> {

    private final Context context;
    private final DataManager dataManager;
    private final LifecycleProvider<Lifecycle.Event> provider;

    @Inject
    public HomePresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.context = context;
        this.dataManager = dataManager;
        this.provider = provider;
    }

    public void test() {
        this.dataManager.getApiHelper().getPegasusFeedIndexList(0,true,1)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(appIndices -> {
                        RxLogTool.d(appIndices);
                });

        this.dataManager.getApiHelper().getPegasusFeedIndexListV2("",0,true, 1, "", 0, 0,"",0)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(pegasusFeedResponse -> {

                });
    }
}
