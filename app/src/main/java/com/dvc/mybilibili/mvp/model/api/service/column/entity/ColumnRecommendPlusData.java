package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnRecommendPlusData extends GeneralResponse<ColumnRecommendPlusData.Data> {
    @JSONField(name = "aids_len")
    public int aidsLen;

    @Keep
    /* compiled from: BL */
    public static class Data {
        @JSONField(name = "banners")
        public List<ColumnBanner> banners;
        @JSONField(name = "articles")
        public List<Column> columns;
    }
}
