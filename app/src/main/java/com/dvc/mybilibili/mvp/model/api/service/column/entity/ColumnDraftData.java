package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnDraftData extends BaseResponse {
    @JSONField(name = "artlist")
    public ArticleBean articleBean;

    @Keep
    /* compiled from: BL */
    public static class ArticleBean {
        @JSONField(name = "draft_url")
        public String draftUrl;
        @JSONField(name = "drafts")
        public List<Drafts> drafts;
        @JSONField(name = "page")
        public Page page;
    }

    @Keep
    /* compiled from: BL */
    public static class Page {
        @JSONField(name = "pn")
        /* renamed from: pn */
        public int f6136pn;
        @JSONField(name = "ps")
        /* renamed from: ps */
        public int f6137ps;
        @JSONField(name = "total")
        public int total;
    }

    @Keep
    /* compiled from: BL */
    public static class Drafts extends ColumnBaseItemData {
    }
}
