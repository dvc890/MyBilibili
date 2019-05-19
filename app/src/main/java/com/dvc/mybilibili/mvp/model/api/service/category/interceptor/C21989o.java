package com.dvc.mybilibili.mvp.model.api.service.category.interceptor;

import android.content.Context;

import com.dvc.mybilibili.mvp.model.api.baseinterceptor.BaseIntercept;

import java.util.Map;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.o */
public class C21989o extends BaseIntercept {

    public final static String CLASSNAME = "com.dvc.mybilibili.mvp.model.api.service.category.interceptor.C21989o";

    public C21989o(Context context) {
        super(context);
    }

    @Override
    public void putParams(Map<String, String> map) {
        super.putParams((Map) map);
        map.put("network", "mobile");
    }
}
