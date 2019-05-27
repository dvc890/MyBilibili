package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;

@Keep
/* compiled from: BL */
public class ColumnHomeTabData extends GeneralResponse<ColumnHomeTab> {
    @JSONField(name = "aids_len")
    public int aidsLength;
}
