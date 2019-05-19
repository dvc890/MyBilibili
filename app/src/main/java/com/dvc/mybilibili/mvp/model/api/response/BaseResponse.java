package com.dvc.mybilibili.mvp.model.api.response;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public abstract class BaseResponse {
    public static final String DEFAULT_AUTH_ERROR_CODE = "-1";
    public int code;
    public String message;
    public int ttl;

    @JSONField(deserialize = false, serialize = false)
    public boolean isSuccess() {
        return this.code == 0;
    }
}
