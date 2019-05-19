package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveAwardInfo {
    @JSONField(name = "user_address")
    public String mUserAddress;
    @JSONField(name = "user_area")
    public String mUserArea;
    @JSONField(name = "user_city")
    public String mUserCity;
    @JSONField(name = "user_name")
    public String mUserName;
    @JSONField(name = "user_phone")
    public String mUserPhone;
    @JSONField(name = "user_post_code")
    public String mUserPostCode;
    @JSONField(name = "user_province")
    public String mUserProvince;
}
