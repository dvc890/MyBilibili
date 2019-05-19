package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class LiveRoomHistoryMsg {
    @JSONField(name = "room")
    public List<Msg> mRooms;

    @Keep
    /* compiled from: BL */
    public static class Msg {
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

        @Keep
        /* compiled from: BL */
        public static class ActivityInfo {
            @JSONField(name = "uname_color")
            public String mUnameColor;
        }
    }
}
