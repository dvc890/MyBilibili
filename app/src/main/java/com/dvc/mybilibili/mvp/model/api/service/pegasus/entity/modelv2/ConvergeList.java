package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ConvergeList {
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @Nullable
    @JSONField(name = "items")
    public List<ConvergeItem> items;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
}
