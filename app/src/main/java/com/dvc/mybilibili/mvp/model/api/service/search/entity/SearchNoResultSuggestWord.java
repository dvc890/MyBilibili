package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchNoResultSuggestWord extends BaseSearchItem {
    @JSONField(name = "sugKeyWord_type")
    public int sugKeyWordType;

    /* compiled from: BL */
    /* renamed from: com.bilibili.search.api.SearchNoResultSuggestWord$a */
    static class C3303a {
        /* renamed from: a */
        static int f9833a = 1;
        /* renamed from: b */
        static int f9834b = 2;
    }

    public boolean isQueryCorrect() {
        return this.sugKeyWordType == C3303a.f9834b;
    }

    public boolean isNormal() {
        return this.sugKeyWordType == C3303a.f9833a;
    }
}
