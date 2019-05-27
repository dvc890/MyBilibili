package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnFeedList {
    @JSONField(name = "item")
    public List<ColumnFeed> list;

    public int getTotalItemCount() {
        return this.list == null ? 0 : this.list.size();
    }
}
