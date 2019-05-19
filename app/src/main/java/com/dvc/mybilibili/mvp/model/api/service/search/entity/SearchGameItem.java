package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchGameItem extends BaseSearchItem {
    @JSONField(name = "download")
    public int download;
    @JSONField(name = "rating")
    public float rating;
    @Nullable
    @JSONField(name = "reserve")
    public String reserve;
}
