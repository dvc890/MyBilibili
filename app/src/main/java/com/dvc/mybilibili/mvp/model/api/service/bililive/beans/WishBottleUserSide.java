package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class WishBottleUserSide {
    @JSONField(name = "list")
    public ArrayList<WishBottle> mList;
    @JSONField(name = "status")
    public int mStatus;

    @Keep
    /* compiled from: BL */
    public static class WishBottle {
        @JSONField(name = "content")
        public String mContent;
        @JSONField(name = "count_map")
        public List<Integer> mCountMap;
        @JSONField(name = "ctime")
        public String mCtime;
        @JSONField(name = "id")
        public int mId;
        public boolean mIsSelected = false;
        @JSONField(name = "status")
        public int mStatus;
        @JSONField(name = "type")
        public int mType;
        @JSONField(name = "type_id")
        public int mTypeId;
        @JSONField(name = "uid")
        public long mUid;
        @JSONField(name = "wish_limit")
        public int mWishLimit;
        @JSONField(name = "wish_progress")
        public int mWishProgress;
    }
}
