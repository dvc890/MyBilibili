package com.dvc.mybilibili.mvp.model.account;

import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.CookieInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.model.api.service.passport.entity.AccessToken;

public interface IAccountHelper {
    boolean isLogin();

    AccessToken getToken();

    void loadToLoginInfo(LoginInfo loginInfo);

    void setToken(AccessToken accessToken);

    AccountInfo getAccountInfo();

    CookieInfo getCookieInfo();

    String getBrithday();

    void save();
}
