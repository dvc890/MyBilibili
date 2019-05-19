package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.userfeedback;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class LiveUserFeedBackItem {
    public String content;
    public long ctime;
    public boolean guide;
    @JSONField(name = "img_url")
    public String imgUrl;
    @JSONField(name = "log_url")
    public String logUrl;
    @JSONField(name = "reply_id")
    public String replyId;
    public int type;
}
