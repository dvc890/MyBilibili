package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public final class BiliCommentUpper {
    @JSONField(name = "mid")
    public long mid;
    @JSONField(name = "top")
    public BiliComment top;
}
