package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveActivityReceiveInfo {
    @JSONField(name = "giftlist")
    public List<BiliLiveActivityInfo> mLists;
}
