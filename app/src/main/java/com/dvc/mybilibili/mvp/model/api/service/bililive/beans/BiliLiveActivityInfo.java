package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveActivityInfo {
    @JSONField(name = "activity_name")
    public String mActivityName;
    @JSONField(name = "gift_list")
    public List<BiliLiveActivityGift> mReceive;
}
