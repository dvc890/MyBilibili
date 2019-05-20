package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.passport.entity.AccessToken;

/* compiled from: BL */
/* renamed from: com.bilibili.lib.account.model.a */
public class LoginInfo {
    @JSONField(name = "token_info")
    /* renamed from: a */
    public AccessToken token_info;
    @JSONField(name = "cookie_info")
    /* renamed from: b */
    public CookieInfo cookie_info;
    @JSONField(name = "status")
    /* renamed from: c */
    public int status;
    @JSONField(name = "url")
    /* renamed from: d */
    public String url;
    @JSONField(name = "message")
    /* renamed from: e */
    public String message;
}
