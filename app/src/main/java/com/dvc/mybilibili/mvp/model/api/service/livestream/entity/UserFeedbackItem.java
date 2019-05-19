package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class UserFeedbackItem {
    public String content;
    public long ctime;
    public boolean guide;
    @JSONField(name = "img_url")
    public String imgUrl;
    @JSONField(name = "reply_id")
    public String replyId;
    public int type;
}
