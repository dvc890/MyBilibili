package com.dvc.mybilibili.mvp.presenter.fragment;

import android.content.Context;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.ui.fragment.home.PegasusFragView;

import javax.inject.Inject;

public class PegasusFragPresenter extends MvpBasePresenter<PegasusFragView> {

    private final DataManager dataManager;
    private final Context mContext;

    @Inject
    public PegasusFragPresenter(DataManager dataManager, @ApplicationContext Context context) {
        this.dataManager = dataManager;
        this.mContext = context;
    }
}
