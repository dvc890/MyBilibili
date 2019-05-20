package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Arrays;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.lib.account.model.b */
public class CookieInfo {
    @JSONField(name = "cookies")
    /* renamed from: a */
    public List<C2206a> cookies;
    @JSONField(name = "domains")
    /* renamed from: b */
    public String[] domains;

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.b$a */
    public static class C2206a {
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
            if (!(obj instanceof C2206a)) {
                return false;
            }
            C2206a c2206a = (C2206a) obj;
            if (!(c2206a.name.equals(this.name) && c2206a.value.equals(this.value) && c2206a.http_only == this.http_only && c2206a.expires == this.expires)) {
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
