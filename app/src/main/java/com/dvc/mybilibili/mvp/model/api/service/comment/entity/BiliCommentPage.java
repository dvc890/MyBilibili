package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliCommentPage {
    @JSONField(name = "acount")
    public int acount;
    @JSONField(name = "count")
    public int count;
    @JSONField(name = "num")
    public int num;
    @JSONField(name = "size")
    public int size;
}
