package com.dvc.mybilibili.mvp.ui.activity.web;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface IAccountVerify extends MvpView{
    void loginFailed(BiliApiException exception);

    void loginCompleted(LoginInfo loginInfo, String target_url, String callbackId);
}
