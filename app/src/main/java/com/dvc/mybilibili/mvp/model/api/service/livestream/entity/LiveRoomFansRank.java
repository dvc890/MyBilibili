package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class LiveRoomFansRank {
    @JSONField(name = "list")
    public List<BiliLiveRankMedal> mList;
    @JSONField(name = "medal_color")
    public int mMedalColor;
    @JSONField(name = "medal_level")
    public int mMedalLevel;
    @JSONField(name = "medal_name")
    public String mMedalName;
    @JSONField(name = "rank")
    public int mRank;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "uname")
    public String mUname;
    @JSONField(name = "unlogin")
    public int mUnlogin;
    @JSONField(name = "unwear")
    public int mUnwear;

    @Keep
    /* compiled from: BL */
    public static class BiliLiveRankMedal {
        @JSONField(name = "color")
        public int mColor;
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "level")
        public int mLevel;
        @JSONField(name = "medal_name")
        public String mMedalName;
        @JSONField(name = "uname")
        public String mUname;
    }
}
