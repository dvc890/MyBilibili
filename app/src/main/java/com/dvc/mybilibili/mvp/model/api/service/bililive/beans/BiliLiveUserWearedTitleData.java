package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveUserWearedTitleData {
    @JSONField(name = "category")
    public List<BiliLiveTitleTag> mCategories;
    @JSONField(name = "create_time")
    public String mCreateTime;
    @JSONField(name = "expire_time")
    public String mExpireTime;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "level")
    public long[] mLevel;
    @JSONField(name = "pic")
    public List<BiliLiveTitle> mLevelTitles;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "num")
    public int mNum;
    @JSONField(name = "score")
    public long mScore;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "title_id")
    public int mTid;
    @JSONField(name = "title_pic")
    public BiliLiveTitle mTitle;
    @JSONField(name = "uid")
    public long mUid;
    @JSONField(name = "upgrade_score")
    public long mUpgradeScore;
}
