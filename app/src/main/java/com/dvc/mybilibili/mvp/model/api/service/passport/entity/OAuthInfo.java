package com.dvc.mybilibili.mvp.model.api.service.passport.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class OAuthInfo {
    @JSONField(name = "access_token")
    public String accessKey;
    @JSONField(name = "expires_in")
    public long expiresIn;
    @JSONField(name = "mid")
    public long mid;
    @JSONField(name = "uname")
    public String nickName;
    @JSONField(name = "userid")
    public String userId;
}
