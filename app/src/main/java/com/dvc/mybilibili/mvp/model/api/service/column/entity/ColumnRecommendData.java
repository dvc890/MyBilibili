package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnRecommendData extends GeneralResponse<List<Column>> {
    @JSONField(name = "aids_len")
    public int aidsLen;
}
