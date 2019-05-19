package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoundVideo {
    @JSONField(name = "aid")
    public int mAid;
    @JSONField(name = "cid")
    public int mCid;
    @JSONField(name = "pid")
    public int mPid;
    @JSONField(name = "play_time")
    public int mPlayTime;
    @JSONField(name = "title")
    public String mTitle;
}
