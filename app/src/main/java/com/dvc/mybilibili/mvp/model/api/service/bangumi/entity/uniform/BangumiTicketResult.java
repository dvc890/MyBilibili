package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiTicketResult {
    @Nullable
    @JSONField(name = "expire_time_text")
    public String expireTime;
    @JSONField(name = "text")
    public String failMsg;
    @JSONField(name = "status")
    public boolean isSuccess;
    @JSONField(name = "order_id")
    public String orderId;
    @Nullable
    @JSONField(name = "pay_pendant_activity")
    public BangumiPayActivities pendant;
}
