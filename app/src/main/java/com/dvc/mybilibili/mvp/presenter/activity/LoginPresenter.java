package com.dvc.mybilibili.mvp.presenter.activity;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.activity.LoginView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

public class LoginPresenter extends MyMvpBasePresenter<LoginView> {

    @Inject
    public LoginPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);

    }

    public LifecycleProvider<Lifecycle.Event> getProvider() {
        return this.provider;
    }

    public void login(String name, String password) {
        this.dataManager.getApiHelper().getKey(false)
                .compose(RxSchedulersHelper.AllioThread())
                .subscribe(authKey -> {
                    this.dataManager.getApiHelper().loginV3(name,authKey.encryptPassword(password))
                            .compose(RxSchedulersHelper.ioAndMainThread())
                            .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                            .subscribe(new ObserverCallback<LoginInfo>() {
                                @Override
                                public void onSuccess(LoginInfo loginInfo) {
                                    dataManager.getUser().loadToLoginInfo(loginInfo);
                                    ifViewAttached(view -> view.loginCompleted(loginInfo));
                                }

                                @Override
                                public void onError(BiliApiException apiException, int code) {
                                    ifViewAttached(view -> view.loginFailed(apiException));
                                }
                            });
                });
    }
}
