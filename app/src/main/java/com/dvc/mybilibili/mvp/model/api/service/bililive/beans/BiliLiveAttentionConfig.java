package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveAttentionConfig {
    @Nullable
    @JSONField(name = "filterRule")
    public List<Config> filterConfigs;
    @Nullable
    @JSONField(name = "sortRule")
    public List<Config> sortConfigs;

    @Keep
    /* compiled from: BL */
    public static class Config {
        @JSONField(name = "id")
        /* renamed from: id */
        public int f5992id;
        @Nullable
        @JSONField(name = "title")
        public String title;
    }
}
