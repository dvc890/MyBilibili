package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BililiveBuyGoldOrder {
    @JSONField(name = "cashier_url")
    public String mCashierUrl;
    @JSONField(name = "code")
    public int mCode;
    @JSONField(name = "order")
    public String mOrder;
    @JSONField(name = "order_no")
    public String mOrderNo;
    @JSONField(name = "ts")
    public String mTs;

    public boolean hasOrder() {
        return !TextUtils.isEmpty(this.mOrderNo);
    }
}
