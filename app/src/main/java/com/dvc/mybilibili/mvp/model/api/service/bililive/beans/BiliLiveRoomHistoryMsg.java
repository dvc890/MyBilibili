package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveRoomHistoryMsg {
    @JSONField(name = "room")
    public List<Msg> mRooms;

    @Keep
    /* compiled from: BL */
    public static class Msg {
        @JSONField(name = "bubble")
        public int bubble;
        @JSONField(name = "activity_info")
        public ActivityInfo mActivityInfo;
        @JSONField(name = "guard_level")
        public int mGuardLevel;
        @JSONField(name = "isadmin")
        public int mIsadmin;
        @JSONField(name = "user_level")
        public Object[] mLevel;
        @JSONField(name = "medal")
        public Object[] mMedal;
        @JSONField(name = "vip")
        public int mMonthVip;
        @JSONField(name = "nickname")
        public String mNickName;
        @JSONField(name = "text")
        public String mText;
        @JSONField(name = "timeline")
        public String mTime;
        @JSONField(name = "title")
        public Object[] mTitle;
        @JSONField(name = "uid")
        public long mUid;
        @JSONField(name = "uname_color")
        public String mUnameColor;
        @JSONField(name = "svip")
        public int mYearVip;
        @Nullable
        @JSONField(name = "check_info")
        public ReportInfo reportInfo;

        @Keep
        /* compiled from: BL */
        public static class ActivityInfo {
            @JSONField(name = "uname_color")
            public String mUnameColor;
        }

        @Keep
        /* compiled from: BL */
        public static class ReportInfo {
            @JSONField(name = "ct")
            public String reportSign;
            @JSONField(name = "ts")
            public long reportTimeStamp;
        }
    }
}
