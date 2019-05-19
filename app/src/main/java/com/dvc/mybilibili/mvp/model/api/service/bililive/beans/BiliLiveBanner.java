package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveBanner {
    @JSONField(name = "img")
    public String mImage;
    @JSONField(name = "remark")
    public String mRemark;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "link")
    public String mUri;
}
