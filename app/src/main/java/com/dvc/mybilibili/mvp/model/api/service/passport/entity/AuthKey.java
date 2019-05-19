package com.dvc.mybilibili.mvp.model.api.service.passport.entity;

import android.support.annotation.Keep;

@Keep
/* compiled from: BL */
public class AuthKey {
    public String hash;
    public String key;

    public String encryptPassword(String str) {
        String replace = this.key.replaceFirst("-----BEGIN PUBLIC KEY-----\n", "").replace("\n-----END PUBLIC KEY-----\n", "");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.hash);
        stringBuilder.append(str);
        return C13644f.m50445b(stringBuilder.toString(), replace);
    }
}
