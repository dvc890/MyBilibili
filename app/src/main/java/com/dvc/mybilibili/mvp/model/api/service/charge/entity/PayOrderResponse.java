package com.dvc.mybilibili.mvp.model.api.service.charge.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class PayOrderResponse {
    @Nullable
    @JSONField(name = "cashier_url")
    public String cashUrl;
    @Nullable
    @JSONField(name = "elec_pay_order_no")
    public String elecPayOrderNO;
    @Nullable
    @JSONField(name = "elec_recharge_order_no")
    public String elecRechargeOrderNo;
    @Nullable
    @JSONField(name = "experience")
    public String payExperiences;
    @Nullable
    @JSONField(name = "pay_pay_order_no")
    public String payOrderNO;
}
