package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveStormBeats {
    @JSONField(name = "content")
    public String mContent;
    @JSONField(name = "hasJoin")
    public int mHasJoin;
    @JSONField(name = "id")
    public String mId;
    @JSONField(name = "num")
    public int mNum;
    @JSONField(name = "roomid")
    public int mRoomid;
    @JSONField(name = "storm_gif")
    public String mStormGif;
    @JSONField(name = "time")
    public int mTime;
}
