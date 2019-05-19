package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class
BangumiCategoryOld {
    public List<BangumiBriefPlus> list;
    @JSONField(name = "info")
    public BangumiTag tag;
}
