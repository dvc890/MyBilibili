package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveMedalInfo {
    @JSONField(name = "day_limit")
    public double mDayLimit;
    @JSONField(name = "intimacy")
    public int mIntimacy;
    @JSONField(name = "is_receive")
    public int mIsReceive;
    @JSONField(name = "level")
    public int mLevel;
    @JSONField(name = "master_status")
    public int mMasterStatus;
    @JSONField(name = "medal_color")
    public int mMedalColor;
    @JSONField(name = "medal_id")
    public int mMedalId;
    @JSONField(name = "medal_name")
    public String mMedalName;
    @JSONField(name = "next_intimacy")
    public int mNextIntimacy;
    @JSONField(name = "receive_channel")
    public int mReceiveChannel;
    @JSONField(name = "score")
    public int mScore;
    @JSONField(name = "source")
    public int mSource;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "today_feed")
    public double mTodayFeed;
}
