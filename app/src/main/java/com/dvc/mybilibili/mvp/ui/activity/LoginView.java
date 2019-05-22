package com.dvc.mybilibili.mvp.ui.activity;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.hannesdorfmann.mosby3.mvp.MvpView;
public interface LoginView extends MvpView{
    void loginFailed(BiliApiException apiException);

    void loginCompleted(LoginInfo loginInfo);
}
