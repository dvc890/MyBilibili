package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveDanmakuColor {
    public static final int TYPE_ACHIEVEMENT = 1;
    public static final int TYPE_CAPTAIN = 4;
    public static final int TYPE_GOVERN = 6;
    public static final int TYPE_VIP_MONTH = 2;
    public static final int TYPE_VIP_YEAR = 3;
    @JSONField(name = "color_name")
    public String mColorName;
    @JSONField(name = "color")
    public int mColorValue;
    @JSONField(name = "hint_type")
    public int mHintType;
    @JSONField(name = "text")
    public String mMessage;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "type")
    public int mType;

    public BiliLiveDanmakuColor(String str, int i, int i2, String str2, int i3) {
        this.mColorName = str;
        this.mColorValue = i;
        this.mStatus = i2;
        this.mMessage = str2;
        this.mType = i3;
    }

    public boolean isColorAvailable() {
        return this.mStatus == 1;
    }
}
