package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Arrays;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.lib.account.model.b */
public class C2207b {
    @JSONField(name = "cookies")
    /* renamed from: a */
    public List<C2206a> f6239a;
    @JSONField(name = "domains")
    /* renamed from: b */
    public String[] f6240b;

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.b$a */
    public static class C2206a {
        @JSONField(name = "name")
        /* renamed from: a */
        public String f6235a;
        @JSONField(name = "value")
        /* renamed from: b */
        public String f6236b;
        @JSONField(name = "http_only")
        /* renamed from: c */
        public int f6237c;
        @JSONField(name = "expires")
        /* renamed from: d */
        public long f6238d;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2206a)) {
                return false;
            }
            C2206a c2206a = (C2206a) obj;
            if (!(c2206a.f6235a.equals(this.f6235a) && c2206a.f6236b.equals(this.f6236b) && c2206a.f6237c == this.f6237c && c2206a.f6238d == this.f6238d)) {
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
        if (!(obj instanceof C2207b)) {
            return false;
        }
        C2207b c2207b = (C2207b) obj;
        if (!(c2207b.f6239a.equals(this.f6239a) && Arrays.equals(c2207b.f6240b, this.f6240b))) {
            z = false;
        }
        return z;
    }
}
