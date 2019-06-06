package com.dvc.mybilibili.mvp.ui.fragment.home;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface HomeFragView extends MvpView {
    void onLoginUpdate(AccountInfo accountInfo);

    void onLoginError(BiliApiException apiException);
}
