package com.dvc.mybilibili.mvp.model.api.baseinterceptor;

import android.content.Context;
import android.support.annotation.CallSuper;


import com.bilibili.nativelibrary.LibBili;

import java.util.Map;

/* compiled from: BL */
/* renamed from: b.ewf */
public class BaseIntercept implements Iintercept{
    public final static String CLASSNAME = "com.dvc.mybilibili.mvp.model.api.baseinterceptor.BaseIntercept";

    /* Access modifiers changed, original: protected */
    protected Context context;

    public BaseIntercept(Context context) {
        this.context = context;
    }
    @CallSuper
    /* renamed from: a */
    @Override
    public void putParams(Map<String, String> map) {
        map.put("platform", "android");
        map.put("mobi_app", "android"/*C1793a.m7867e()*/);//
        map.put("appkey", LibBili.getAndroidAppKey());
        map.put("build", String.valueOf(5410000));
        map.put("channel", "master");
//        Map f = C1793a.m7868f();
//        if (f != null) {
//            map.putAll(f);
//        }
    }
}
