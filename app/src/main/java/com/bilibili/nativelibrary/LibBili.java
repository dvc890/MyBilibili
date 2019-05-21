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
    private static native String a(String str);

    /* renamed from: b */
    private static native IvParameterSpec b(String str) throws InvalidKeyException;

    public static native int getCpuCount();

    @Deprecated
    public static native int getCpuId();

    /* renamed from: s */
    static native SignedQuery s(SortedMap<String, String> sortedMap);

    static {
        System.loadLibrary("bili");
    }

    /* renamed from: a */
    public static String getAndroidAppKey() {
        return getAppKey("android");
    }

    /* renamed from: c */
    public static String getAppKey(String str) {
//        switch (str) {
//            case "android":
//                return "1d8b6e7d45233436";
//            case "android_i":
//                return "bb3101000e232e27";
//            case "android_b":
//                return "07da50c9a0bf829f";
//            case "android_tv":
//                return "4409e2ce8ffd12b8";
//            case "biliLink":
//                return "37207f2beaebf8d7";
//        }
//        return "1d8b6e7d45233436";
        return a(str);
    }

    /* renamed from: a */
    public static SignedQuery m8854a(Map<String, String> map) {
        return s(map == null ? new TreeMap() : new TreeMap(map));
    }

    /* renamed from: a */
    public static byte[] a(String str, byte[] bArr) throws InvalidKeyException {
        try {
            byte[] bytes = str.getBytes(SignedQuery.HttpUtils.ENCODING_UTF_8);
            try {
                return C16894a.m66575a(new SecretKeySpec(Arrays.copyOf(bytes, 16), "AES"), b(str), bArr);
            } catch (Exception unused) {
                return bArr;
            }
        } catch (UnsupportedEncodingException unused2) {
            return bArr;
        }
    }

    /* renamed from: b */
    public static byte[] b(String str, byte[] bArr) throws InvalidKeyException {
        try {
            byte[] bytes = str.getBytes(SignedQuery.HttpUtils.ENCODING_UTF_8);
            try {
                return C16894a.m66576b(new SecretKeySpec(Arrays.copyOf(bytes, 16), "AES"), b(str), bArr);
            } catch (Exception unused) {
                return bArr;
            }
        } catch (UnsupportedEncodingException unused2) {
            return bArr;
        }
    }
}
