package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchComicItem extends BaseSearchItem {
    @Nullable
    @JSONField(name = "badge")
    public String badge;
    @Nullable
    @JSONField(name = "comic_url")
    public String comicUrl;
    @Nullable
    @JSONField(name = "name")
    public String name;
    @Nullable
    @JSONField(name = "style")
    public String style;
}
