package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveRecommend {
    @JSONField(name = "recommend")
    public List<Recommend> mRecommendList;
    @JSONField(name = "tips")
    public String mTips;

    @Keep
    /* compiled from: BL */
    public static class Recommend {
        @JSONField(name = "uid")
        public long mAnchorId;
        @JSONField(name = "broadcast_type")
        public int mBroadcastType;
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "online")
        public String mOnline;
        @JSONField(name = "pic")
        public String mPic;
        @JSONField(name = "room_id")
        public int mRoomId;
        @JSONField(name = "title")
        public String mTitle;
        @JSONField(name = "uname")
        public String mUname;
    }
}
