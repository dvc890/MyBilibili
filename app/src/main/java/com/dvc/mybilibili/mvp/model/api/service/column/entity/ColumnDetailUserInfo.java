package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;

@Keep
/* compiled from: BL */
public class ColumnDetailUserInfo extends BaseResponse {
    public boolean alreadyLoaded;
    @JSONField(name = "count")
    public int count;
    @JSONField(name = "data")
    public ColumnViewInfo data;
    @JSONField(name = "ttl")
    public int ttl;
}
