package com.dvc.mybilibili.mvp.presenter.activity;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.activity.HomeView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class HomePresenter extends MyMvpBasePresenter<HomeView> {

    @Inject
    public HomePresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }

    public boolean isLogin() {
        return this.user.isLogin();
    }

    public AccountInfo getAccountInfo() {
        return this.user.getAccountInfo();
    }

    public void loginOut() {
        if(!isLogin()) return;

        this.apiHelper.signOut(this.user.getAccessKey(), this.user.getCookieInfo())
                .compose(RxSchedulersHelper.ioAndMainThread())
                .subscribe(new ObserverCallback<Object>() {
                    @Override
                    public void onSuccess(Object aVoid) {
                        user.clear();
                        ifViewAttached(view -> view.onLoginOut());
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {

                    }
                });
    }
}
