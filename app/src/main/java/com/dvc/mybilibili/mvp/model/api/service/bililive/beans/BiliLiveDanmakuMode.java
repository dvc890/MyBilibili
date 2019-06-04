package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveDanmakuMode {
    @JSONField(name = "hint_type")
    public String mHintType;
    @JSONField(name = "mode")
    public int mMode;
    @JSONField(name = "text")
    public String mMsg;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "status")
    public int mStatus;

    public BiliLiveDanmakuMode(String str, int i, int i2, String str2) {
        this.mName = str;
        this.mMode = i;
        this.mStatus = i2;
        this.mMsg = str2;
    }
}
