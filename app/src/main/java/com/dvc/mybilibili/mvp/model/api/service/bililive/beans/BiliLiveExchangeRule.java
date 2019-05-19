package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveExchangeRule {
    @JSONField(name = "coin_2_silver_fee")
    public float c2sFee;
    @JSONField(name = "coin_2_silver_limit")
    public int c2sLimit;
    @JSONField(name = "coin_2_silver_rate")
    public int c2sRate;
    @JSONField(name = "coin_2_silver_real_rate")
    public int c2sRealRate;
    @JSONField(name = "coin_2_silver_limit_vip")
    public int c2sVipLimit;
    @JSONField(name = "silver_2_coin_limit")
    public int s2cLimit;
    @JSONField(name = "silver_2_coin_price")
    public int s2cPrice;
}
