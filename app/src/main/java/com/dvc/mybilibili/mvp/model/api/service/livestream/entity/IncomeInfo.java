package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class IncomeInfo {
    @JSONField(name = "brokerage")
    public double brokerage;
    @JSONField(name = "hamster")
    public long hamster;
    @JSONField(name = "isA100")
    public int isA100;
    @JSONField(name = "monthHamster")
    public long monthHamster;
}
