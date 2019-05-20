package com.dvc.mybilibili.mvp.model.api.service.bililive.interceptor;

import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.baseinterceptor.BaseIntercept;
import com.vondear.rxtool.RxAppTool;

import java.util.Map;

import javax.inject.Inject;

/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.net.b */
public class C9909b extends BaseIntercept {

    public final static String CLASSNAME = "com.dvc.mybilibili.mvp.model.api.service.bililive.interceptor.C9909b";

    public C9909b(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    @Override
    public void putParams(Map<String, String> map) {
        super.putParams((Map) map);
        map.put("actionKey", "appkey");
        if(getiAccountHelper().isLogin()) {
            map.put("access_key", getiAccountHelper().getToken().access_token);
        }
        map.put("device", "android");
//        if (C7048g.m25212a("live_param_take_version", 0) == 1) {
            map.put("version", RxAppTool.getAppVersionName(context));
//        }
    }
}
