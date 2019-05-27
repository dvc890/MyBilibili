package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnArticleList implements Serializable {
    @JSONField(name = "articles")
    public List<Article> articles;
    @JSONField(name = "attention")
    public boolean attention;
    @JSONField(name = "author")
    public Author author;
    @JSONField(name = "last")
    public Article lastReadArticle;
    @JSONField(name = "list")
    public ArticleList list;
    public boolean order;

    public boolean isFirstRead() {
        return this.lastReadArticle != null && this.lastReadArticle.f6129id == 0;
    }

    public boolean isAttention() {
        return this.attention;
    }

    public void setAttention(boolean z) {
        this.attention = z;
    }

    public ArticleList getList() {
        return this.list;
    }

    public void setList(ArticleList articleList) {
        this.list = articleList;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Article> getArticles() {
        return this.articles;
    }

    public void setArticles(List<Article> list) {
        this.articles = list;
    }

    public boolean getAuthorVip() {
        boolean z = false;
        if (this.author == null || this.author.vip == null) {
            return false;
        }
        if (this.author.vip.status == 1 && this.author.vip.type == 2) {
            z = true;
        }
        return z;
    }
}
