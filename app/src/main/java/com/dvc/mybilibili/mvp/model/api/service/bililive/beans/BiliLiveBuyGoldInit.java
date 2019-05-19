package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveBuyGoldInit {
    @JSONField(name = "bp")
    public int mBP;
    @JSONField(name = "gold")
    public long mGold;
    @JSONField(name = "silver")
    public long mSilver;
}
