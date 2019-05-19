package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveTitleMaterial {
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "img")
    public String mImg;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "num")
    public int mNum;
    @JSONField(name = "score")
    public long mScore;
    public int mSelectedNum;
}
