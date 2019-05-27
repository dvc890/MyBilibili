package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliCommentAddResult {
    @JSONField(name = "dialog")
    public long dialog;
    public boolean need_captcha;
    @JSONField(name = "parent")
    public long parent;
    @JSONField(name = "root")
    public long root;
    @JSONField(name = "rpid")
    public long rpid;
    public String url;
}
