package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BaseListItemData<T> extends BaseData {
    @JSONField(name = "lists")
    public List<ArticleList> articleList;
    @JSONField(name = "item")
    public List<T> list;
    @JSONField(name = "lists_count")
    public int listsCount;
}
