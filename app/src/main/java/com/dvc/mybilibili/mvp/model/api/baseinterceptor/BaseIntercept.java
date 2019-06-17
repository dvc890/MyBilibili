package com.dvc.mybilibili.mvp.model.api.baseinterceptor;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.text.TextUtils;

import com.bilibili.nativelibrary.LibBili;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

import okhttp3.Request;

/* compiled from: BL */
/* renamed from: b.ewf */
public class BaseIntercept implements Iintercept{
    public final static String CLASSNAME = "com.dvc.mybilibili.mvp.model.api.baseinterceptor.BaseIntercept";
    private final IAccountHelper iAccountHelper;

    /* Access modifiers changed, original: protected */
    protected Context context;

    public BaseIntercept(Context context) {
        this.context = context;
        this.iAccountHelper = BiliApplication.getDataManager().getUser();
    }

    public IAccountHelper getiAccountHelper() {
        return iAccountHelper;
    }

    @CallSuper
    /* renamed from: a */
    @Override
    public void putParams(Map<String, String> map) {
        map.put("platform", "android");
        map.put("mobi_app", "android");//
        if(!map.containsKey("appkey"))
            map.put("appkey", LibBili.getAndroidAppKey());
        map.put("build", String.valueOf(5410000));
        map.put("channel", "master");
        try {
            map.put("statistics", new JSONObject().put("appId", 1)
                    .put("platform", 3)
                    .put("version", "5.41.0")
                    .put("abtest", "506_734_728").toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setHeader(Request.Builder request) {
//        String a = C4377d.m19745a();
//        if (!TextUtils.isEmpty(a)) {
//            request.mo79987a("Display-ID", a);
//        }
//        a = C4376c.m19743a();
//        if (!TextUtils.isEmpty(a)) {
//            request.mo79987a("Buvid", a);
//        }
        request.addHeader("User-Agent", "Mozilla/5.0 BiliDroid/5.41.0 (bbcallen@gmail.com)");

//        a = C4378e.m19747a();
//        if (!TextUtils.isEmpty(a)) {
//            request.mo79987a("Device-ID", a);
//        }
    }
}
