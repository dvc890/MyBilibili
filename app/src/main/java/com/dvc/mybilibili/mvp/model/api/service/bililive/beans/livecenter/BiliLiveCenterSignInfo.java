package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livecenter;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveCenterSignInfo {
    @JSONField(name = "awards")
    public List<DaysAward> mAward;
    @JSONField(name = "days")
    public int mDays;
    @JSONField(name = "days_award")
    public List<DaysAward> mDaysAward;
    @JSONField(name = "h5_url")
    public String mH5Url;
    @JSONField(name = "is_signed")
    public boolean mIsSigned;
    @JSONField(name = "sign_days")
    public int mSignDays;

    @Keep
    /* compiled from: BL */
    public static class DaysAward {
        @JSONField(name = "award")
        public String mAwardType;
        @JSONField(name = "count")
        public int mCount;
        @JSONField(name = "day")
        public int mDay;
        @JSONField(name = "img")
        public Img mImg;
        @JSONField(name = "text")
        public String mText;
    }

    @Keep
    /* compiled from: BL */
    public static class Img {
        @JSONField(name = "height")
        public int mHeight;
        @JSONField(name = "src")
        public String mSrc;
        @JSONField(name = "width")
        public int mWidth;
    }
}
