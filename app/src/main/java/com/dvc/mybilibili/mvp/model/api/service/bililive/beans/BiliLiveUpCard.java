package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveUpCard {
    @JSONField(name = "area_name")
    public String mAreaName;
    @JSONField(name = "desc")
    public String mDesc;
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "follow_num")
    public int mFollowNum;
    @JSONField(name = "glory_info")
    public List<GloryInfo> mGloryInfo;
    @JSONField(name = "level")
    public int mLevel;
    @JSONField(name = "level_color")
    public int mLevelColor;
    @JSONField(name = "main_vip")
    public int mMainVip;
    @JSONField(name = "pendant")
    public String mPendant;
    @JSONField(name = "pendant_from")
    public int mPendantFrom;
    @JSONField(name = "relation_status")
    public int mRelationStatus;
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "uid")
    public long mUid;
    @JSONField(name = "uname")
    public String mUname;
    @JSONField(name = "uname_color")
    public int mUnameColor;
    @JSONField(name = "verify_type")
    public int mVerifyType;

    @Keep
    /* compiled from: BL */
    public static class GloryInfo {
        @JSONField(name = "activity_date")
        public String mActivityDate;
        @JSONField(name = "activity_name")
        public String mActivityName;
        @JSONField(name = "gid")
        public String mGid;
        @JSONField(name = "jump_url")
        public String mJumpUrl;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "pic_url")
        public String mPicUrl;
    }
}
