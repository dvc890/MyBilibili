package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveRecommendVideos {
    @JSONField(name = "partition")
    public BiliLiveAreaAF mArea;
    @JSONField(name = "lives")
    public List<BiliLive> mLives;
    @JSONField(name = "banner_data")
    public List<BiliLive> mLivesLarge;
}
