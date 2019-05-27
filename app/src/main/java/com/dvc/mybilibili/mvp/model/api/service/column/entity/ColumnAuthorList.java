package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnAuthorList extends BaseResponse {
    @JSONField(name = "count")
    public int count;
    @JSONField(name = "item")
    public List<Column> data;
}
