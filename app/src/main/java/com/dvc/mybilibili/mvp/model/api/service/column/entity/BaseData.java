package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BaseData extends BaseDataResponse {
    @JSONField(name = "count")
    public int count;
}
