package com.dvc.mybilibili.mvp.model.api.baseinterceptor;

import java.util.Map;

import okhttp3.Request;

public interface Iintercept {

    public void putParams(Map<String, String> map);
    public void setHeader(Request.Builder request);
}
