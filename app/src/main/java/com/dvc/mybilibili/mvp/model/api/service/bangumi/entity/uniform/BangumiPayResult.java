package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiPayResult {
    @Nullable
    @JSONField(name = "pay_pendant_activity")
    public BangumiPayActivities activities;
    @Nullable
    @JSONField(name = "expire_time_text")
    public String expireTime;
    @JSONField(name = "state")
    public String state;

    public boolean paySucceed() {
        return "SUCCESS".equalsIgnoreCase(this.state);
    }
}
