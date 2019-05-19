package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;

@Keep
/* compiled from: BL */
public class BiliNotice extends BaseResponse {
    public Data data;
    public boolean isCancel;
    public String ver;

    @Keep
    /* compiled from: BL */
    public static class Data {
        public String content;
        @JSONField(name = "end_time")
        public long endTime;
        /* renamed from: id */
        public int f6321id;
        @JSONField(name = "start_time")
        public long startTime;
        public String title;
        public String uri;
    }
}
