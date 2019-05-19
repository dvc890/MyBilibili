package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveWish {
    @JSONField(name = "list")
    public List<Wish> mList;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "user_wish_count")
    public int mUserWishCount;
    @JSONField(name = "user_wish_limit")
    public int mUserWishLimit;

    @Keep
    /* compiled from: BL */
    public static class Wish {
        @JSONField(name = "audit_status")
        public int mAuditStatus;
        @JSONField(name = "content")
        public String mContent;
        @JSONField(name = "ctime")
        public String mCtime;
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "status")
        public int mStatus;
        @JSONField(name = "type")
        public int mType;
        @JSONField(name = "type_id")
        public int mTypeId;
        @JSONField(name = "uid")
        public int mUid;
        @JSONField(name = "wish_limit")
        public int mWishLimit;
        @JSONField(name = "wish_progress")
        public int mWishProgress;
    }
}
