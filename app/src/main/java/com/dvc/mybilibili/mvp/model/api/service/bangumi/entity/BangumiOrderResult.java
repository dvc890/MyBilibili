package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiOrderResult {
    @JSONField(name = "cashier_url")
    public String cashierUrl;
    @JSONField(name = "order_id")
    public String orderId;
    @JSONField(name = "pay_pay_order_no")
    public String payPayOrderNo;
    @JSONField(name = "qrcode")
    public String qrCode;
    @JSONField(name = "recharge_order_no")
    public String rechargeOrderNno;
}
