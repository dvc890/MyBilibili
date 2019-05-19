package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class LiveRoomFeedRank {
    @JSONField(name = "coin")
    public long mCoin;
    @JSONField(name = "list")
    public List<BiliLiveFeedRankUser> mList;
    @JSONField(name = "rank")
    public int mRank;
    @JSONField(name = "uname")
    public String mUname;
    @JSONField(name = "unlogin")
    public int mUnlogin;

    @Keep
    /* compiled from: BL */
    public static class BiliLiveFeedRankUser {
        @JSONField(name = "coin")
        public long mCoin;
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "uid")
        public int mUid;
        @JSONField(name = "uname")
        public String mUname;
    }
}
