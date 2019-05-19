package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class LiveRoomOperationRank {
    @JSONField(name = "list")
    public List<BiliLiveOperation> mList;
    @JSONField(name = "rank")
    public int mRank;
    @JSONField(name = "score")
    public long mScore;
    @JSONField(name = "uname")
    public String mUname;

    @Keep
    /* compiled from: BL */
    public static class BiliLiveCoinImage {
        @JSONField(name = "height")
        public int mHeight;
        @JSONField(name = "src")
        public String mSrc;
        @JSONField(name = "width")
        public int mWidth;
    }

    @Keep
    /* compiled from: BL */
    public static class BiliLiveOperation {
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "coin_url")
        public BiliLiveCoinImage mImg1;
        @JSONField(name = "coin1_url")
        public BiliLiveCoinImage mImg2;
        @JSONField(name = "score")
        public long mScore;
        @JSONField(name = "uname")
        public String mUname;
    }
}
