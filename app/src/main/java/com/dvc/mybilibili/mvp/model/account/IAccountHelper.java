package com.dvc.mybilibili.mvp.model.account;

import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.CookieInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.model.api.service.passport.entity.AccessToken;

public interface IAccountHelper {
    boolean isLogin();

    AccessToken getToken();

    String getAccessKey();

    void loadToLoginInfo(LoginInfo loginInfo);

    void setToken(AccessToken accessToken);

    void setAccountInfo(AccountInfo accountInfo);

    AccountInfo getAccountInfo();

    CookieInfo getCookieInfo();

    String getBrithday();

    void save();

    void clear();
}
