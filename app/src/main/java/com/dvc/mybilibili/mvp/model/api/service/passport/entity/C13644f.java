package com.dvc.mybilibili.mvp.model.api.service.passport.entity;

import android.annotation.SuppressLint;
import android.util.Base64;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

/* compiled from: BL */
/* renamed from: com.bilibili.lib.passport.f */
class C13644f {
    @SuppressLint({"TrulyRandom", "DefaultCharset"})
    /* renamed from: a */
    static byte[] m50444a(String str, String str2) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2.getBytes(), 0)));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            instance.init(1, generatePublic);
            return instance.doFinal(str.getBytes());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static String m50445b(String str, String str2) {
        byte[] a = C13644f.m50444a(str, str2);
        return a != null ? Base64.encodeToString(a, 0) : null;
    }
}
