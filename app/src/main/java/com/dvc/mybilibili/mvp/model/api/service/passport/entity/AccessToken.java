package com.dvc.mybilibili.mvp.model.api.service.passport.entity;

import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

//import kotlinx.serialization.json.JsonParserKt;

/* compiled from: BL */
/* renamed from: com.bilibili.lib.passport.a */
public class AccessToken {
    @JSONField(name = "expires_in")
    /* renamed from: a */
    public long expires_in;
    @JSONField(name = "mid")
    /* renamed from: b */
    public long mid;
    @JSONField(name = "access_token")
    /* renamed from: c */
    public String access_token;
    @JSONField(name = "refresh_token")
    /* renamed from: d */
    public String refresh_token;
    @JSONField(name = "expires")
    /* renamed from: e */
    public long expires;

    /**
     * 是否过期
     * @return
     */
    public final boolean isExpires() {
        return System.currentTimeMillis() > this.expires * 1000;
    }

    /* renamed from: b */
    public final boolean hasAccessKey() {
        return this.mid > 0 && !TextUtils.isEmpty(this.access_token);
    }

    /* renamed from: c */
    public boolean hasRefreshToken() {
        return this.mid > 0 && !TextUtils.isEmpty(this.refresh_token);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken c2217a = (AccessToken) obj;
        if (this.mid != c2217a.mid) {
            return false;
        }
        return this.access_token == null ? c2217a.access_token == null : this.access_token.equals(c2217a.access_token);
    }

    public int hashCode() {
        return (((int) (this.mid ^ (this.mid >>> 32))) * 31) + (this.access_token != null ? this.access_token.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AccessToken{mExpiresIn=");
        stringBuilder.append(this.expires_in);
        stringBuilder.append(", mMid=");
        stringBuilder.append(this.mid);
        stringBuilder.append(", mAccessKey='");
        stringBuilder.append(this.access_token);
        stringBuilder.append('\'');
        stringBuilder.append(", mRefreshToken='");
        stringBuilder.append(this.refresh_token);
        stringBuilder.append('\'');
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
