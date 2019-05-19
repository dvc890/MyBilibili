package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class SearchRecommendPreSection {
    @Nullable
    @JSONField(name = "item")
    public ArrayList<PreRecommendItem> item;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    public String trackId;
}
