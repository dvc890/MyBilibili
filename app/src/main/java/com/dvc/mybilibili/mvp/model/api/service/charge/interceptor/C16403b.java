package com.dvc.mybilibili.mvp.model.api.service.charge.interceptor;

import android.content.Context;

import com.dvc.mybilibili.mvp.model.api.baseinterceptor.BaseIntercept;
import com.vondear.rxtool.RxAppTool;

import java.util.Map;

/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.net.b */
public class C16403b extends BaseIntercept {

    public final static String CLASSNAME = "com.dvc.mybilibili.mvp.model.api.service.charge.interceptor.C16403b";

    public C16403b(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    @Override
    public void putParams(Map<String, String> map) {
        super.putParams((Map) map);
        map.put("act", "appkey");
    }
}
