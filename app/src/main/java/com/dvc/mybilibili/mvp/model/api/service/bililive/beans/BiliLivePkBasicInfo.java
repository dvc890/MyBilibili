package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLivePkBasicInfo {
    public static final int PK_END = 1000;
    public static final int PK_ESCAPE = 1200;
    public static final int PK_GOING = 300;
    public static final int PK_INTERRUPT = 1100;
    public static final int PK_MATCH = 100;
    public static final int PK_PREPARE = 200;
    public static final int PK_PUBLISHING = 400;
    @JSONField(name = "end_time")
    public int mEndTime;
    @JSONField(name = "exception_id")
    public int mExceptionId;
    @JSONField(name = "init_info")
    public PkRoomInfo mInitRoomInfo;
    @JSONField(name = "match_info")
    public PkRoomInfo mMatchRoomInfo;
    @JSONField(name = "pk_end_time")
    public int mPkEndTime;
    @JSONField(name = "pk_id")
    public int mPkId;
    @JSONField(name = "pk_pre_time")
    public int mPkPreTime;
    @JSONField(name = "pk_start_time")
    public int mPkStartTime;
    @JSONField(name = "pk_topic")
    public String mPkTopic;
    @JSONField(name = "punish_topic")
    public String mPunishTopic;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "timestamp")
    public int mTimestamp;
    @JSONField(name = "user_votes")
    public int mUserVotes;

    @Keep
    /* compiled from: BL */
    public static class PkRoomInfo {
        @JSONField(name = "escape_time")
        public int mEscapeTime;
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "init_id")
        public int mInitId;
        @JSONField(name = "is_portrait")
        public boolean mIsPortrait;
        @JSONField(name = "match_id")
        public int mMatchId;
        @JSONField(name = "uid")
        public long mUid;
        @JSONField(name = "uname")
        public String mUname;
        @JSONField(name = "votes")
        public int mVotes;

        public int getRoomId() {
            return this.mInitId > 0 ? this.mInitId : this.mMatchId;
        }
    }
}
