package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnFavoriteData extends BaseResponse {
    @JSONField(name = "favorites")
    public List<Column> list;
    @JSONField(name = "page")
    public Page page;

    @Keep
    /* compiled from: BL */
    public static class Page {
        @JSONField(name = "pn")
        /* renamed from: pn */
        public int f6138pn;
        @JSONField(name = "ps")
        /* renamed from: ps */
        public int f6139ps;
        @JSONField(name = "total")
        public int total;
    }
}
