package com.dvc.mybilibili.mvp.model.api.baseinterceptor;

import android.content.Context;
import android.support.annotation.CallSuper;

import com.bilibili.nativelibrary.LibBili;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

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

//    public Map<String, String> mo7410e() {
//        HashMap<String, String> f6674c = new HashMap(1);
//        if (this.f6673b) {
//            m7911a(f6674c);
//        }
//        this.f6674c.putAll(C2495h.f6671a.m9389a());
//        return this.f6674c;
//    }
//
//    /* renamed from: a */
//    public static void m7911a(@NonNull Map<String, String> map) {
//        if (C1814a.m7905a() > 0) {
//            map.put("parent_mode", "1");
//        } else {
//            map.remove("parent_mode");
//        }
//        String jSONObject = null;
//        try {
//            jSONObject = new JSONObject().put("appId", 1)
//                    .put("platform", 3)
//                    .put("version", "5.41.0")
//                    .put("abtest", ""/*C1812a.m7902b()*/).toString();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        map.put("statistics", jSONObject);
//
//    }
}
