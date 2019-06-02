package com.dvc.mybilibili.mvp.model.api.service.bililive.interceptor;

import android.content.Context;

import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.mvp.model.api.baseinterceptor.BaseIntercept;

import java.util.Map;

public class beg extends BaseIntercept {

    public final static String CLASSNAME = "com.dvc.mybilibili.mvp.model.api.service.bililive.interceptor.beg";

    public beg(Context context) {
        super(context);
    }

    public void putParams(Map<String, String> map) {
        super.putParams(map);
        map.put("actionKey", "appkey");
        if(getiAccountHelper().isLogin()) {
            map.put("access_key", getiAccountHelper().getToken().access_token);
        }
        map.put("device", "android");
    }
}
