package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class SearchStarItem extends BaseSearchItem {
    public static final int URI_TYPE_CHANNEL = 2;
    public static final int URI_TYPE_UPPER = 1;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "is_atten")
    public int isAtten;
    @JSONField(name = "mid")
    public int mid;
    @JSONField(name = "tag_id")
    public int tagId;
    @Nullable
    @JSONField(name = "tag_items")
    public List<TagItems> tagItems;
    @JSONField(name = "uri_type")
    public int uriType;

    @Keep
    /* compiled from: BL */
    public static class TagItems {
        @Nullable
        @JSONField(name = "item")
        public List<SearchVideoItem> items;
        @Nullable
        @JSONField(name = "keyword")
        public String keyword;
        @Nullable
        @JSONField(name = "title")
        public String title;
    }
}
