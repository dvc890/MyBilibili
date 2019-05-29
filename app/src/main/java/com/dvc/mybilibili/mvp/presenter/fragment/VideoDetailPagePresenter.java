package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoDetailPageFragView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class VideoDetailPagePresenter extends MvpBasePresenter<VideoDetailPageFragView> {

    private final Context context;
    private final DataManager dataManager;
    private final ApiHelper apiHelper;
    private final IAccountHelper user;
    private final LifecycleProvider<Lifecycle.Event> provider;

    @Inject
    public VideoDetailPagePresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.context = context;
        this.dataManager = dataManager;
        this.provider = provider;
        this.apiHelper = this.dataManager.getApiHelper();
        this.user = this.dataManager.getUser();
    }

}
