package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.NonNull;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.model.a */
public class C2262a {
    @JSONField(name = "uri")
    @NonNull
    /* renamed from: a */
    public String f6341a = "";
    @JSONField(name = "name")
    @NonNull
    /* renamed from: b */
    public String f6342b = "";
    @JSONField(name = "tab_id")
    @NonNull
    /* renamed from: c */
    public String f6343c = "";

    /* renamed from: a */
    public boolean mo12037a() {
        return (this.f6341a.length() * this.f6342b.length()) * this.f6343c.length() != 0;
    }
}
