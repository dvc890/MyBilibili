package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnSpace {
    @JSONField(name = "item")
    public List<Column> columns;
    @JSONField(name = "count")
    public int count;
}
