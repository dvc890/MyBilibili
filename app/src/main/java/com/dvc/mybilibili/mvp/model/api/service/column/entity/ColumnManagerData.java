package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;

import java.io.Serializable;
import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnManagerData extends BaseResponse {
    @JSONField(name = "artlist")
    public ArticleBean articleBean;

    @Keep
    /* compiled from: BL */
    public static class ArticleBean {
        @JSONField(name = "articles")
        public List<ArticlesList> articleList;
        @JSONField(name = "page")
        public Page page;
    }

    @Keep
    /* compiled from: BL */
    public static class Page {
        @JSONField(name = "pn")
        /* renamed from: pn */
        public int f6141pn;
        @JSONField(name = "ps")
        /* renamed from: ps */
        public int f6142ps;
        @JSONField(name = "total")
        public int total;
    }

    @Keep
    /* compiled from: BL */
    public static class Stats implements Serializable {
        @JSONField(name = "dislike")
        public int dislike;
        @JSONField(name = "favorite")
        public int favorite;
        @JSONField(name = "likes")
        public int likes;
        @JSONField(name = "reply")
        public int reply;
        @JSONField(name = "share")
        public int share;
        @JSONField(name = "view")
        public int view;
    }

    @Keep
    /* compiled from: BL */
    public static class ArticlesList extends ColumnBaseItemData {
    }
}
