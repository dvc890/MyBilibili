package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliCommentTop {
    @JSONField(name = "admin")
    public BiliComment admin;
    @JSONField(name = "upper")
    public BiliComment upper;
    @JSONField(name = "vote")
    public BiliComment vote;
}
