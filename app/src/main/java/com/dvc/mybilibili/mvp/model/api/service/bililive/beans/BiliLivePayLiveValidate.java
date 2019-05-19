package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLivePayLiveValidate {
    @JSONField(name = "permission")
    public boolean permission;
    @JSONField(name = "pic")
    public String pic;
}
