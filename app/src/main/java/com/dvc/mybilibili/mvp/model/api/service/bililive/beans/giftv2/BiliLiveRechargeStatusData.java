package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.giftv2;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRechargeStatusData {
    @JSONField(name = "color")
    public String mColor;
    @JSONField(name = "config_id")
    public int mConfigId;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "type")
    public int mType;
    @JSONField(name = "value")
    public String mValue;
}
