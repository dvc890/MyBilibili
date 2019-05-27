package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ColumnAppeal {
    @JSONField(name = "allow_add")
    public boolean allowAdd;
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "reason")
    public String reason;
    @JSONField(name = "type")
    public String type;
}
