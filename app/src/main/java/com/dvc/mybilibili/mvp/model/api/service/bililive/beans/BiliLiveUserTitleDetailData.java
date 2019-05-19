package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveUserTitleDetailData {
    @JSONField(name = "colorful")
    public int mColorFul;
    @JSONField(name = "create_time")
    public String mCreateTime;
    @JSONField(name = "description")
    public String mDescription;
    @JSONField(name = "expire_time")
    public String mExpireTime;
    @JSONField(name = "level")
    public long[] mLevel;
    @JSONField(name = "pic")
    public List<BiliLiveTitle> mLevelTitles;
    @JSONField(name = "mobile_pic_url")
    public String mMobilePic;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "num")
    public int mNum;
    @JSONField(name = "score")
    public long mScore;
    @JSONField(name = "source")
    public String mSource;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "tid")
    public String mTid;
    @JSONField(name = "title_pic")
    public BiliLiveTitle mTitle;
    @JSONField(name = "title_id")
    public String mTitleId;
    @JSONField(name = "upgrade_score")
    public long mUpgradeScore;
    @JSONField(name = "url")
    public String mUrl;
    @JSONField(name = "web_pic_url")
    public String mWebP;
}
