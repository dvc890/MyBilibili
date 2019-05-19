package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class DefaultKeyword {
    @Nullable
    @JSONField(name = "param")
    public String param;
    @Nullable
    @JSONField(name = "show")
    public String show;
    @Nullable
    @JSONField(name = "trackid")
    public String trackId;
    @Nullable
    @JSONField(name = "word")
    public String word;
}
