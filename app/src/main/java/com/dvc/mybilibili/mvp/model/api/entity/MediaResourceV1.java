package com.dvc.mybilibili.mvp.model.api.entity;


import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
public class MediaResourceV1 extends IMediaResource{

    @JSONField(name = "url")
    public String url;

    public MediaResourceV1() {}

    @Override
    public String getVideoUrl() {
        return url;
    }
}
