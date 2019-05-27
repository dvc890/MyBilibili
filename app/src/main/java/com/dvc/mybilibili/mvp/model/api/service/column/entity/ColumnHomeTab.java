package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnHomeTab {
    @JSONField(name = "articles")
    public List<Column> articles;
    @JSONField(name = "banners")
    public List<ColumnBanner> banners;
    @JSONField(name = "categories")
    public List<Column.Category> categories;
    @JSONField(name = "hotspots")
    public List<ColumnHotspot> hotspots;
    @JSONField(name = "ranks")
    public List<Column> ranks;
}
