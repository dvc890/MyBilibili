package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class Episode {
    @Nullable
    @JSONField(name = "badges")
    public List<Tag> badges;
    @Nullable
    @JSONField(name = "index")
    public String index;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @JSONField(deserialize = false, serialize = false)
    public int position;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
}
