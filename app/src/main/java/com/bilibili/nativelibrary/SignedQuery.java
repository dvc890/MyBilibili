package com.bilibili.nativelibrary;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: BL */
public final class SignedQuery {
    /* renamed from: c */
    private static final char[] c = "0123456789ABCDEF".toCharArray();
    /* renamed from: a */
    public final String a;
    /* renamed from: b */
    public final String b;

    public SignedQuery(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String toString() {
        if (this.a == null) {
            return "";
        }
        if (this.b == null) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("&sign=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    /* renamed from: r */
    public static String r(Map<String, String> map) {
        if (!(map instanceof SortedMap)) {
            map = new TreeMap(map);
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!TextUtils.isEmpty(str)) {
                stringBuilder.append(a(str));
                stringBuilder.append(HttpUtils.EQUAL_SIGN);
                String str2 = (String) entry.getValue();
                if (str2 == null) {
                    str2 = "";
                } else {
                    str2 = a(str2);
                }
                stringBuilder.append(str2);
                stringBuilder.append(HttpUtils.PARAMETERS_SEPARATOR);
            }
        }
        int length = stringBuilder.length();
        if (length > 0) {
            stringBuilder.deleteCharAt(length - 1);
        }
        if (length == 0) {
            return null;
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String a(String str) {
        return a(str, null);
    }

    /* renamed from: a */
    static String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder stringBuilder = null;
        int i = 0;
        while (i < length) {
            int i2 = i;
            while (i2 < length && a(str.charAt(i2), str2)) {
                i2++;
            }
            if (i2 != length) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                if (i2 > i) {
                    stringBuilder.append(str, i, i2);
                }
                i = i2 + 1;
                while (i < length && !a(str.charAt(i), str2)) {
                    i++;
                }
                try {
                    byte[] bytes = str.substring(i2, i).getBytes(HttpUtils.ENCODING_UTF_8);
                    int length2 = bytes.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        stringBuilder.append('%');
                        stringBuilder.append(c[(bytes[i3] & 240) >> 4]);
                        stringBuilder.append(c[bytes[i3] & 15]);
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            } else if (i == 0) {
                return str;
            } else {
                stringBuilder.append(str, i, length);
                return stringBuilder.toString();
            }
        }
        if (stringBuilder != null) {
            str = stringBuilder.toString();
        }
        return str;
    }

    /* renamed from: a */
    private static boolean a(char c, String str) {
        return (c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || !((c < '0' || c > '9') && "-_.~".indexOf(c) == -1 && (str == null || str.indexOf(c) == -1)));
    }

    public class HttpUtils {
        public static final String ENCODING_UTF_8 = "UTF-8";
        public static final String EQUAL_SIGN = "=";
        public static final String HTTP_DEFUALT_PROXY = "10.0.0.172";
        public static final String PARAMETERS_SEPARATOR = "&";
        public static final String PATHS_SEPARATOR = "/";
        public static final String URL_AND_PARA_SEPARATOR = "?";
    }
}
