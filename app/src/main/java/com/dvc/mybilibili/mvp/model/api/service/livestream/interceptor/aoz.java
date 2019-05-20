package com.dvc.mybilibili.mvp.model.api.service.livestream.interceptor;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;

import com.dvc.mybilibili.app.constants.SocialConstants;
import com.dvc.mybilibili.mvp.model.api.baseinterceptor.BaseIntercept;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.vondear.rxtool.RxAppTool;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* compiled from: BL */
/* renamed from: b.aoz */
public class aoz extends BaseIntercept {
    public final static String CLASSNAME = "com.dvc.mybilibili.mvp.model.api.service.livestream.interceptor.aoz";

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmsssss", Locale.getDefault());
    private String httpurl;
    private String paramstr;

    public aoz(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    @Override
    public void putParams(Map<String, String> map) {
        super.putParams((Map) map);
        map.put("src", "master");
        map.put("version", getVerStr());
        map.put("trace_id", this.simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
        AccountInfo accountInfo = getiAccountHelper().getAccountInfo();// = C2198d.m8642a(C1905b.m8107a()).mo11365d();
        if (getiAccountHelper().isLogin()) {
            map.put("access_key", getiAccountHelper().getToken().access_token);//AccessToken.access_token
        }
        int i = 0;
        Object obj = 1;
        if (this.httpurl.startsWith("http://club.bilibili.com") || this.httpurl.startsWith("http://message.bilibili.com") || this.httpurl.startsWith("http://www.im9.com") || this.httpurl.startsWith("https://pay.bilibili.com")) {
            map.put("actionKey", "appkey");
        } else if (this.httpurl.startsWith("http://app.bilibili.com") || this.httpurl.startsWith("https://app.bilibili.com")) {
            i = this.paramstr.indexOf("/x/") > 0? 1 : 0;
        } else if (this.httpurl.startsWith("http://elec.bilibili.com")) {
            map.put(SocialConstants.PARAM_ACT, "appkey");
        } else if (this.httpurl.startsWith("http://api.bilibili.com") || this.httpurl.startsWith("http://live.bilibili.com") || this.httpurl.startsWith("http://api.live.bilibili.com") || this.httpurl.startsWith("http://api.vc.bilibili.com") || this.httpurl.startsWith("http://vc.bilibili.com")) {
            i = 1;
            obj = null;
        }
        if (obj != null) {
            map.put("ts", String.valueOf((System.currentTimeMillis() / 1000) * 1000));
        }
        if (i != 0) {
            map.put("_device", "android");
            String k = m92843c();
            if (!TextUtils.isEmpty(k)) {
                map.put("_hwid", k);
            }
            if (map.containsKey("access_key") || accountInfo == null || accountInfo.getRank() <= 0) {
                map.remove("_ulv");
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(accountInfo.getRank());
            map.put("_ulv", stringBuilder.toString());
        }
    }

    /* renamed from: a */

    private String ver_str;
    private String getVerStr() {
        if (this.ver_str == null) {
            synchronized (this) {
                if (this.ver_str == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(RxAppTool.getAppVersionName(context));
                    stringBuilder.append(".");
                    stringBuilder.append(RxAppTool.getAppVersionCode(context));
                    this.ver_str = stringBuilder.toString();
                }
            }
        }
        return this.ver_str;
    }

    /* renamed from: c */
    String m92843c() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Settings.Secure.getString(context.getContentResolver(), "android_id"));
            stringBuilder.append("@");
            stringBuilder.append(m8578d(Build.MODEL));
        return m92839a(stringBuilder.toString());
    }

    /* renamed from: d */
    public static String m8578d(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                int i3 = i + 1;
                cArr[i] = str.charAt(i2);
                i = i3;
            }
        }
        if (i == length) {
            return str;
        }
        return new String(cArr, 0, i);
    }
    static String m92839a(String str) {
        byte[] bytes = str.getBytes();
        bytes[0] = (byte) (bytes[0] ^ ((byte) (bytes.length & 255)));
        for (int i = 1; i < bytes.length; i++) {
            bytes[i] = (byte) ((bytes[i - 1] ^ bytes[i]) & 255);
        }
        try {
            return new String(Base64.encode(bytes, 11));
        } catch (Exception unused) {
            return str;
        }
    }
}
