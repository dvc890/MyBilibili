package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;

import java.util.List;

/* compiled from: BL */
public class ColumnHotSpotsData extends GeneralResponse<ColumnHotSpotsData.Data> {
    @JSONField(name = "aids_len")
    /* renamed from: a */
    public int f9763a;

    @Keep
    /* compiled from: BL */
    public static class Data {
        @JSONField(name = "articles")
        public List<Column> columns;
        @JSONField(name = "hotspot")
        public ColumnHotspot hotspot;
    }
}
