package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchLiveItem extends BaseSearchItem {
    @Nullable
    @JSONField(name = "badge")
    public String badge;
    @Nullable
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "online")
    public int online;
}
