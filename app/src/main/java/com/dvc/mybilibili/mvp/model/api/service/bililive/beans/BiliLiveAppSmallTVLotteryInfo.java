package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BiliLiveAppSmallTVLotteryInfo {
    @JSONField(name = "imgurl")
    public String mImgurl;
    @JSONField(name = "join")
    public ArrayList<BiliLiveAppSmallTVData> mJoin;
    @JSONField(name = "lastid")
    public int mLastId;
    @JSONField(name = "unjoin")
    public ArrayList<BiliLiveAppSmallTVData> mUnjoin;
}
