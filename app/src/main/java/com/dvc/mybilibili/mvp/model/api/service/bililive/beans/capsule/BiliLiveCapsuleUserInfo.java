package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.capsule;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveCapsuleUserInfo {
    @JSONField(name = "colorful")
    public Colorful mColorful;
    @JSONField(name = "normal")
    public Normal mNormal;

    @Keep
    /* compiled from: BL */
    public static class Colorful {
        @JSONField(name = "change")
        public int mChange;
        @JSONField(name = "coin")
        public int mCoin;
        @JSONField(name = "progress")
        public Normal.Progress mProgress;
        @JSONField(name = "status")
        public boolean mStatus;
    }

    @Keep
    /* compiled from: BL */
    public static class Normal {
        @JSONField(name = "change")
        public int mChange;
        @JSONField(name = "coin")
        public int mCoin;
        @JSONField(name = "progress")
        public Progress mProgress;
        @JSONField(name = "status")
        public boolean mStatus;

        @Keep
        /* compiled from: BL */
        public static class Progress {
            @JSONField(name = "max")
            public int mMax;
            @JSONField(name = "now")
            public int mNow;
        }
    }
}
