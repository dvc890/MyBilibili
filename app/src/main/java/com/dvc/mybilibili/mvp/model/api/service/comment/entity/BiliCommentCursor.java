package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliCommentCursor {
    @JSONField(name = "all_count")
    public int allCount;
    @JSONField(name = "is_begin")
    public boolean isBegin;
    @JSONField(name = "is_end")
    public boolean isEnd;
    @JSONField(name = "max_id")
    public long maxId;
    @JSONField(name = "min_id")
    public long minId;
    @JSONField(name = "mode")
    public int mode;
    @JSONField(name = "next")
    public int next;
    @JSONField(name = "prev")
    public int prev;
    @JSONField(name = "size")
    public int size;
    @JSONField(name = "support_mode")
    public int[] supportMode;
}
