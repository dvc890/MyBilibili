package com.bilibili.nativelibrary;


import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: BL */
public final class LibBili {
    /* renamed from: a */
    private static native String m8856a(String str);

    /* renamed from: b */
    private static native IvParameterSpec m8858b(String str) throws InvalidKeyException;

    public static native int getCpuCount();

    @Deprecated
    public static native int getCpuId();

    /* renamed from: s */
    static native SignedQuery m8861s(SortedMap<String, String> sortedMap);

    static {
        System.loadLibrary("bili");
    }

    @Deprecated
    /* renamed from: a */
    public static String m8855a() {
        return m8860c("android");
    }

    /* renamed from: c */
    public static String m8860c(String str) {
        return m8856a(str);
    }

    /* renamed from: a */
    public static SignedQuery m8854a(Map<String, String> map) {
        return m8861s(map == null ? new TreeMap() : new TreeMap(map));
    }

    /* renamed from: a */
    public static byte[] m8857a(String str, byte[] bArr) throws InvalidKeyException {
        try {
            byte[] bytes = str.getBytes(SignedQuery.HttpUtils.ENCODING_UTF_8);
            try {
                return C16894a.m66575a(new SecretKeySpec(Arrays.copyOf(bytes, 16), "AES"), m8858b(str), bArr);
            } catch (Exception unused) {
                return bArr;
            }
        } catch (UnsupportedEncodingException unused2) {
            return bArr;
        }
    }

    /* renamed from: b */
    public static byte[] m8859b(String str, byte[] bArr) throws InvalidKeyException {
        try {
            byte[] bytes = str.getBytes(SignedQuery.HttpUtils.ENCODING_UTF_8);
            try {
                return C16894a.m66576b(new SecretKeySpec(Arrays.copyOf(bytes, 16), "AES"), m8858b(str), bArr);
            } catch (Exception unused) {
                return bArr;
            }
        } catch (UnsupportedEncodingException unused2) {
            return bArr;
        }
    }
}
