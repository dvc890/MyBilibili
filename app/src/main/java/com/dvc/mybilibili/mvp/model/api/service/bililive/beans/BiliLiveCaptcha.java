package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveCaptcha {
    @JSONField(name = "image")
    public String mImage;
    @JSONField(name = "token")
    public String mToken;
}
