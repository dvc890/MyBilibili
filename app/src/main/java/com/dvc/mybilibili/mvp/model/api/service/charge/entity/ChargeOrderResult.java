package com.dvc.mybilibili.mvp.model.api.service.charge.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ChargeOrderResult {
    @Nullable
    @JSONField(name = "order_no")
    public String orderNo;
    @Nullable
    @JSONField(name = "integration")
    public Integer point;
    @JSONField(name = "status")
    public int status;
}
