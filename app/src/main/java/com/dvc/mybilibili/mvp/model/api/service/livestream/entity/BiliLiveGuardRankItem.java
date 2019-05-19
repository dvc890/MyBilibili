package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveGuardRankItem {
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "guard_level")
    public int mGuardLevel;
    @JSONField(name = "is_alive")
    public int mIsAlive;
    @JSONField(name = "rank")
    public int mRank;
    @JSONField(name = "ruid")
    public String mRuid;
    @JSONField(name = "uid")
    public String mUid;
    @JSONField(name = "username")
    public String mUserName;
}
