package com.dvc.mybilibili.mvp.presenter.activity;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.activity.HomeView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class HomePresenter extends MyMvpBasePresenter<HomeView> {

    @Inject
    public HomePresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }

}
