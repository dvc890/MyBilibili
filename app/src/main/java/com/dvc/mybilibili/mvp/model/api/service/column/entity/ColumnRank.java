package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ColumnRank extends Column {
    @JSONField(name = "article_id")
    public int articleId;
    @JSONField(name = "attention")
    public boolean attention;
    public int rankPosition;
}
