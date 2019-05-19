package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiVideo {
    public int aid;
    @JSONField(name = "pic")
    public String cover;
    @JSONField(name = "video_review")
    public String danmaku;
    @JSONField(name = "is_auto")
    public int isAuto;
    public String play;
    public String title;
}
