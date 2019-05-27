package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArticleList */
public class BiliSpaceArticleList extends BiliSpaceItemCount {
    @JSONField(name = "item")
    public List<BiliSpaceArticle> articles;

    public boolean isEmpty() {
        return this.articles == null || this.articles.isEmpty();
    }
}
