package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiCinemaTab {
    public List<BangumiModuleBanner> banners;
    public List<BangumiModule> modules;
    @JSONField(name = "next_cursor")
    public String nextCursor;
    public List<BangumiModule.Head> regions;
}
