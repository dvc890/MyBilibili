package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livecenter;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveCenterRedPointInfo {
    @JSONField(name = "colorful_capsule_change")
    public int mColorfulCapsuleChange;
    @JSONField(name = "normal_capsule_change")
    public int mNormalCapsuleChange;
    @JSONField(name = "unreceived_entity_count")
    public int mUnreceivedEntityCount;
}
