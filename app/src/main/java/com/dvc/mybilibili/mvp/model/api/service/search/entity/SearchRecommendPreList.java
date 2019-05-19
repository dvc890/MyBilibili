package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class SearchRecommendPreList {
    @Nullable
    @JSONField(name = "items")
    public ArrayList<SearchRecommendPreSection> items;
    @JSONField(name = "total")
    public int total;
    @Nullable
    @JSONField(name = "trackid")
    public String trackid;
}
