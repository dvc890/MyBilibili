package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.fragment.home.BangumiFragView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class BangumiFragPresenter extends MyMvpBasePresenter<BangumiFragView> {

    @Inject
    public BangumiFragPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }
}
