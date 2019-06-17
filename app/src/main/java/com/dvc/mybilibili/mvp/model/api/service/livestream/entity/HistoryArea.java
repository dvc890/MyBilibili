package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class HistoryArea extends BaseLiveArea {
    @JSONField(name = "act_flag")
    /* renamed from: d */
    public int act_flag = 0;

    public HistoryArea(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public boolean mo17443a() {
        return this.act_flag == 1;
    }
}
