package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.v2.bean.ImgBean */
public class ImgBean {
    /* renamed from: id */
    private long f5587id;
    @JSONField(name = "loop_count")
    private int loopCount;
    @Nullable
    private String src;

    @Nullable
    public String getSrc() {
        return this.src;
    }

    public void setSrc(@Nullable String str) {
        this.src = str;
    }

    public long getId() {
        return this.f5587id;
    }

    public void setId(long j) {
        this.f5587id = j;
    }

    public int getLoopCount() {
        return this.loopCount;
    }

    public void setLoopCount(int i) {
        this.loopCount = i;
    }
}
