package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ColumnUploadImage {
    @JSONField(name = "size")
    public int size;
    @JSONField(name = "url")
    public String url;
}
