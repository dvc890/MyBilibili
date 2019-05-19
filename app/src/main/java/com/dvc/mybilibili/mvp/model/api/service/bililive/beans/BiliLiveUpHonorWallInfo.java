package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveUpHonorWallInfo {
    @JSONField(name = "ctime")
    public String mCTime;
    @JSONField(name = "gid")
    public String mGid;
    @JSONField(name = "glory_info")
    public GloryInfo mGloryInfo;
    @JSONField(name = "id")
    public String mId;
    @JSONField(name = "mtime")
    public String mMTime;
    @JSONField(name = "on")
    public String mOn;
    @JSONField(name = "uid")
    public String mUid;
    @JSONField(name = "user_info")
    public UserInfo mUserInfo;

    @Keep
    /* compiled from: BL */
    public static class GloryInfo {
        @JSONField(name = "active_time")
        public String mActiveTime;
        @JSONField(name = "activity")
        public String mActivity;
        @JSONField(name = "business")
        public String mBusiness;
        @JSONField(name = "ctime")
        public String mCTime;
        @JSONField(name = "id")
        public String mId;
        @JSONField(name = "imp")
        public String mImp;
        @JSONField(name = "jump_url")
        public String mJumpUrl;
        @JSONField(name = "level")
        public String mLevel;
        @JSONField(name = "mtime")
        public String mMTime;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "pic_url")
        public String mPicUrl;
        @JSONField(name = "weight")
        public String mWeight;
    }

    @Keep
    /* compiled from: BL */
    public static class UserInfo {
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "identification")
        public String mIdentification;
        @JSONField(name = "mobile_verify")
        public String mMobileVertify;
        @JSONField(name = "uname")
        public String mName;
        @JSONField(name = "platform_user_level")
        public String mPlatFormUserLevel;
        @JSONField(name = "rank")
        public String mRank;
        @JSONField(name = "uid")
        public String mUid;
    }
}
