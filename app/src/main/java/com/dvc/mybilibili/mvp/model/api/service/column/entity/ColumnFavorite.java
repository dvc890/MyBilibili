package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ColumnFavorite extends Column {
    @JSONField(name = "goto")
    public String gotoPage;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "param")
    public long param;
    @JSONField(name = "uri")
    public String uri;

    public String getAuthorName() {
        return (this.name == null || TextUtils.isEmpty(this.name)) ? "-" : this.name;
    }
}
