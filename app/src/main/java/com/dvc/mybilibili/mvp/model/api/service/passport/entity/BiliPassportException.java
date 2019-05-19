package com.dvc.mybilibili.mvp.model.api.service.passport.entity;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;

/* compiled from: BL */
public class BiliPassportException extends Exception {
    public int code;
    public String payLoad;

    public BiliPassportException(int i) {
        this(i, (Throwable) null);
    }

    public BiliPassportException(Throwable th) {
        this(-1, th);
    }

    public BiliPassportException(String str) {
        this(-1, str);
    }

    public BiliPassportException(int i, Throwable th) {
        this(i, null, th);
    }

    public BiliPassportException(int i, String str) {
        this(i, str, null);
    }

    public BiliPassportException(int i, String str, Throwable th) {
        super(str, th);
        this.code = i;
    }

    public boolean isTokenInvalid() {
        return this.code == -101 || this.code == -2 || this.code == BiliApiException.E_ACCOUNT_IS_NOT_LOGIN_OAUTH;
    }
}
