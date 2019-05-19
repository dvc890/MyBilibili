package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiMovie {
    public String badge;
    public String img;
    public int index;
    @JSONField(name = "is_auto")
    public int isAuto;
    public String link;
    @JSONField(name = "movie_id")
    public int movieId;
    @JSONField(name = "movie_status")
    public int movieStatus;
    public String title;
}
