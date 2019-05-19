package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiBriefPlus extends BangumiBrief {
    @JSONField(name = "favorites")
    public int favouritesOld;
    @JSONField(name = "brief")
    public String introduction;
    public List<BangumiTag> tags;
}
