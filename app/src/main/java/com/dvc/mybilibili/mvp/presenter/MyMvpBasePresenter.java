package com.dvc.mybilibili.mvp.presenter;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.MvpBasePresenter;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.trello.rxlifecycle2.LifecycleProvider;

public abstract class MyMvpBasePresenter<V extends MvpView> extends MvpBasePresenter<V> {

    protected final DataManager dataManager;
    protected final ApiHelper apiHelper;
    protected final LifecycleProvider<Lifecycle.Event> provider;
    protected final Context context;
    protected final IAccountHelper user;

    public MyMvpBasePresenter(Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.context = context;
        this.dataManager = dataManager;
        this.apiHelper = dataManager.getApiHelper();
        this.user = this.dataManager.getUser();
        this.provider = provider;
    }

}
