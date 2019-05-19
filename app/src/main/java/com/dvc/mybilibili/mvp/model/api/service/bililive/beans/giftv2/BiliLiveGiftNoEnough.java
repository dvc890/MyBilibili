package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.giftv2;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveGiftNoEnough {
    @JSONField(name = "available_num")
    public int mAvailableNum;
    @JSONField(name = "left_num")
    public int mLeftNum;
    @JSONField(name = "need_num")
    public int mNeedNum;
    @JSONField(name = "price")
    public int mPrice;
}
