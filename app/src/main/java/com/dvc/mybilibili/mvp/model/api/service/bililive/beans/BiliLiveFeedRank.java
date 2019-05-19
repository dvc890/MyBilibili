package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveFeedRank {
    @JSONField(name = "coin")
    public long mCoin;
    @JSONField(name = "list")
    public List<BiliLiveFeedRankUser> mList;
    @JSONField(name = "rank")
    public int mRank;
    @JSONField(name = "rank_text")
    public String mRankText;
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
        @JSONField(name = "guard_level")
        public int mGuardLevel;
        @JSONField(name = "rank")
        public int mRank;
        @JSONField(name = "uid")
        public long mUid;
        @JSONField(name = "uname")
        public String mUname;
    }
}
