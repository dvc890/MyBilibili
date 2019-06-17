package com.dvc.mybilibili.mvp.model.api.service.bililive.interceptor;

import android.content.Context;

import com.dvc.mybilibili.mvp.model.api.baseinterceptor.BaseIntercept;

import java.util.Map;

import okhttp3.Request;

public class bej extends BaseIntercept {
    private static final String f78742c = "Bilibili Freedoooooom/MarkII";
    private static final String f78743d = "x-bilibili-mid";
    public final static String CLASSNAME = "com.dvc.mybilibili.mvp.model.api.service.bililive.interceptor.bej";

    public bej(Context context) {
        super(context);
    }

    @Override
    public void putParams(Map<String, String> map) {
        super.putParams(map);
        map.put("device", "android");
        map.put("platform", "android");
        if(getiAccountHelper().isLogin()) {
            map.put("access_key", getiAccountHelper().getToken().access_token);
        }
        map.put("appkey", m122271a(3, "fSDRQgpusmIbrzyc"));
    }

    public void setHeader(Request.Builder request) {
        super.setHeader(request);
        request.addHeader("User-Agent", f78742c);
        if(getiAccountHelper().isLogin())
            request.addHeader(f78743d, getiAccountHelper().getToken().mid+"");
    }

    public static String m122271a(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = i;
        for (byte b : str.getBytes()) {
            int i3 = (((b + i2) - 65) % 57) + 65;
            int i4 = 0;
            while (i3 > 90 && i3 < 97) {
                i2 += i4 * i2;
                i4++;
                i3 = (((b + i2) - 65) % 57) + 65;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("t");
                stringBuilder2.append(i2);
                System.out.println(stringBuilder2.toString());
            }
            stringBuilder.append((char) i3);
        }
        return stringBuilder.toString();
    }
}
