package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveAwardList {
    @JSONField(name = "list")
    public List<BiliLiveAward> mList;
    @JSONField(name = "page")
    public int mPage;
    @JSONField(name = "total_page")
    public int mTotalPage;
}
