package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliCommentFolder {
    @JSONField(name = "has_folded")
    public boolean hasFolded;
    @JSONField(name = "rule")
    public String rule;
}
