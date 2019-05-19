package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomBoxActive {
    @JSONField(name = "ACTIVITY_ID")
    public int mActivityID;
    @JSONField(name = "ACTIVITY_PIC")
    public String mActivityPicUrl;
}
