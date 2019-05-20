package com.dvc.mybilibili.mvp.model.account;

import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.model.api.service.passport.entity.AccessToken;

public interface IAccountHelper {
    boolean isLogin();

    AccessToken getToken();

    void setToken(AccessToken accessToken);

    AccountInfo getAccountInfo();

    String getBrithday();

    void save();
}
