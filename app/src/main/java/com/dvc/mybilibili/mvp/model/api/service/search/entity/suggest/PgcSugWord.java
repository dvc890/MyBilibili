package com.dvc.mybilibili.mvp.model.api.service.search.entity.suggest;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class PgcSugWord extends C2278a {
    @Nullable
    @JSONField(name = "label")
    public String label;
    @JSONField(name = "rating")
    public float rating;
    @Nullable
    @JSONField(name = "style")
    public String style;
    @Nullable
    @JSONField(name = "styles")
    public String styles;
    @JSONField(name = "vote")
    public int vote;
}
