package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Arrays;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.lib.account.model.b */
public class CookieInfo {
    @JSONField(name = "cookies")
    /* renamed from: a */
    public List<Cookie> cookies;
    @JSONField(name = "domains")
    /* renamed from: b */
    public String[] domains;

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.b$a */
    public static class Cookie {
        @JSONField(name = "name")
        /* renamed from: a */
        public String name;
        @JSONField(name = "value")
        /* renamed from: b */
        public String value;
        @JSONField(name = "http_only")
        /* renamed from: c */
        public int http_only;
        @JSONField(name = "expires")
        /* renamed from: d */
        public long expires;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cookie)) {
                return false;
            }
            Cookie cookie = (Cookie) obj;
            if (!(cookie.name.equals(this.name) && cookie.value.equals(this.value) && cookie.http_only == this.http_only && cookie.expires == this.expires)) {
                z = false;
            }
            return z;
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CookieInfo)) {
            return false;
        }
        CookieInfo c2207b = (CookieInfo) obj;
        if (!(c2207b.cookies.equals(this.cookies) && Arrays.equals(c2207b.domains, this.domains))) {
            z = false;
        }
        return z;
    }
}
