package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BaseListItemsData<T> extends BaseData {
    @JSONField(name = "items")
    public List<T> list;
}
