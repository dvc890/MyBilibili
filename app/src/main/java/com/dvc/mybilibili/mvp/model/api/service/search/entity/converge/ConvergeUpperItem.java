package com.dvc.mybilibili.mvp.model.api.service.search.entity.converge;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.search.entity.SearchUpperItem;

@Keep
/* compiled from: BL */
public class ConvergeUpperItem extends SearchUpperItem {
    @JSONField(name = "is_atten")
    public int isAtten;
    @Nullable
    @JSONField(name = "mid")
    public String mid;

    public boolean isAttention() {
        return this.isAtten == 1;
    }

    public boolean toggleAttention() {
        this.isAtten = 1 - this.isAtten;
        return isAttention();
    }
}
