package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveQuickPay {
    @JSONField(name = "cashier_url")
    public String mCashierUrl;
    @JSONField(name = "gold")
    public long mGold;
    @JSONField(name = "order")
    public String mOrder;
    @JSONField(name = "orderGold")
    public int mOrderGold;
    @JSONField(name = "order_no")
    public String mOrderNo;
    @JSONField(name = "silver")
    public long mSilver;
}
