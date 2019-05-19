package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class Mask {
    @Nullable
    @JSONField(name = "avatar")
    public Avatar avatar;
    @Nullable
    @JSONField(name = "button")
    public DescButton button;
    @JSONField
    public int from;
}
