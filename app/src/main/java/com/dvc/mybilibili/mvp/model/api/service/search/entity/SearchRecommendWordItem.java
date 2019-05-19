package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class SearchRecommendWordItem extends BaseSearchItem {
    @Nullable
    @JSONField(name = "list")
    public List<RecommendWord> list;

    @Keep
    /* compiled from: BL */
    public static class RecommendWord {
        @Nullable
        @JSONField(name = "from_source")
        public String fromSource;
        @Nullable
        @JSONField(name = "param")
        public String param;
        @Nullable
        @JSONField(name = "title")
        public String title;
        @Nullable
        @JSONField(name = "type")
        public String type;
    }
}
