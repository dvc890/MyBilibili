package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;

import com.dvc.base.MvpBasePresenter;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.ui.fragment.web.GuideFragView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class GuideFragPresenter extends MvpBasePresenter<GuideFragView> {

    private DataManager dataManager;
    private LifecycleProvider<Lifecycle.Event> provider;

    @Inject
    public GuideFragPresenter(DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.dataManager = dataManager;
        this.provider = provider;
    }
}
