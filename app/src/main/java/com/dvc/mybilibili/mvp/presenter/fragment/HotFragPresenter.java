package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.fragment.home.HotFragView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class HotFragPresenter extends MyMvpBasePresenter<HotFragView> {

    @Inject
    public HotFragPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }
}
