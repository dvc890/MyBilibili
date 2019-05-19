package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveAreaRank {
    @JSONField(name = "areaRank")
    public AreaRank mAreaRank;

    @Keep
    /* compiled from: BL */
    public static class AreaRank {
        @JSONField(name = "index")
        public int mIndex;
        @JSONField(name = "rank")
        public String mRank;
    }
}
