package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class NewSDKConfig {
    @JSONField(name = "app_version")
    public int appVersion;
    @JSONField(name = "enable")
    public boolean enable;
    @JSONField(name = "scale")
    public int scale;
}
