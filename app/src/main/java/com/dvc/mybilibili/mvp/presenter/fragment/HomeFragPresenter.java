package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.text.TextUtils;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.fragment.home.HomeFragView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class HomeFragPresenter extends MyMvpBasePresenter<HomeFragView> {


    @Inject
    public HomeFragPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }

    public void loadAccountInfo() {
        if(!this.user.isLogin()) {
            ifViewAttached(view -> view.onLoginUpdate(null));
            return;
        }
        if(!TextUtils.isEmpty(this.user.getAccountInfo().getUserName())){
            ifViewAttached(view -> view.onLoginUpdate(this.user.getAccountInfo()));
            return;
        }
        this.apiHelper.getAccountInfo(this.user.getToken().access_token)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .subscribe(new ObserverCallback<AccountInfo>() {
                    @Override
                    public void onSuccess(AccountInfo accountInfo) {
                        user.setAccountInfo(accountInfo);
                        ifViewAttached(view -> view.onLoginUpdate(accountInfo));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        user.setAccountInfo(null);
                        ifViewAttached(view -> view.onLoginError(apiException));
                    }
                });
    }
}
