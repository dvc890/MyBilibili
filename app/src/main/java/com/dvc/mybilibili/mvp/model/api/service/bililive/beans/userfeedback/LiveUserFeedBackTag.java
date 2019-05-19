package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.userfeedback;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class LiveUserFeedBackTag {
    @JSONField(name = "id")
    /* renamed from: id */
    public String f6018id;
    @JSONField(name = "name")
    public String name;

    public LiveUserFeedBackTag(String str, String str2) {
        this.f6018id = str;
        this.name = str2;
    }
}
