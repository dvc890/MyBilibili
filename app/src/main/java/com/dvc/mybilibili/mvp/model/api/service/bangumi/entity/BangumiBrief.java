package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiBrief {
    @JSONField(name = "badge")
    public String badge;
    public String cover;
    public int favourites;
    @JSONField(name = "follow")
    public int followers;
    @JSONField(name = "is_auto")
    public int isAuto;
    @JSONField(name = "is_finish")
    public boolean isFinish;
    @JSONField(name = "is_started")
    public int isStarted;
    @JSONField(name = "last_time")
    public long lastTime;
    @JSONField(name = "wid")
    public int mWid;
    @JSONField(name = "newest_ep_index")
    public String newestIndex;
    @JSONField(name = "pub_time")
    public String pubTime;
    @JSONField(name = "season_id")
    public String seasonId;
    @JSONField(name = "season_status")
    public int seasonStatus;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "total_count")
    public String totalCount;
    @JSONField(name = "watching_count")
    public int watchingCount;
}
