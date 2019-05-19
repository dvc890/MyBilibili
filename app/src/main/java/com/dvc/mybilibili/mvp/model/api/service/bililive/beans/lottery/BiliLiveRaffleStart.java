package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.lottery;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRaffleStart {
    @JSONField(name = "asset_animation_pic")
    public String mAssetAnimationPic;
    @JSONField(name = "asset_tips_pic")
    public String mAssetTipsPic;
    @JSONField(name = "from")
    public String mFrom;
    @JSONField(name = "max_time")
    public int mMaxTime;
    @JSONField(name = "raffleId")
    public int mRaffleId;
    @JSONField(name = "time")
    public int mTime;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "type")
    public String mType;
}
