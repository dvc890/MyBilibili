package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchOfficialVerify {
    public static final int COMPANY_V = 1;
    public static final int NORMAL = -1;
    public static final int PERSON_V = 0;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "type")
    public int type;

    public boolean isNormal() {
        return this.type == -1;
    }

    public boolean isAuthority() {
        return this.type == 0 || this.type == 1;
    }
}
