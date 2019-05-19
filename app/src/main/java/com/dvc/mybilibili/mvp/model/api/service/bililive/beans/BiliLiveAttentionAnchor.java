package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveAttentionAnchor implements C2064d {
    @JSONField(name = "count")
    public int mCount;
    @JSONField(name = "list")
    public List<BiliLiveAnchor> mList;
    @JSONField(name = "page")
    public int mPage;
    @JSONField(name = "pagesize")
    public int mPagesize;
    @JSONField(name = "total_page")
    public int mTotalPage;
    @JSONField(name = "total_status")
    public int mTotalStatus;

    public boolean isMainSwitchOpened() {
        return this.mTotalStatus == 1;
    }

    public int getTotalPage() {
        return this.mTotalPage;
    }
}
