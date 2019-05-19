package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiPrevious {
    @JSONField(name = "list")
    public List<BangumiBrief> bangumis;
    @JSONField(name = "season")
    public int season;
    @JSONField(name = "year")
    public int year;
}
