package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveAppSmallTVLotteryResultData {
    @JSONField(name = "reward")
    public BiliLiveAppSmallTVRewardData mReward;
    @JSONField(name = "sname")
    public String mSname;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "win")
    public int mWin;
    @JSONField(name = "fname")
    public String mfname;
}
