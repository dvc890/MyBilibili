package com.dvc.mybilibili.mvp.model.api.service.splash.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.splash.SplashData */
public class SplashData {
    public static final int DEFAULT_INTERVAL_FOR_SHOW = 14400;
    public static final int DURATION_DEFAULT_SHOW = 3;
    public static final int MAX_SHOW_COUNT = 6;
    @JSONField(name = "min_interval")
    public int intervalForShow;
    @JSONField(name = "pull_interval")
    public int intervalForUpdate;
    @JSONField(name = "max_time")
    public int maxCount;
    @JSONField(name = "list")
    public List<Splash> splashList;
    @JSONField(name = "show")
    public List<ShowStrategy> strategyList;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.splash.SplashData$ShowStrategy */
    public static class ShowStrategy {
        public long etime;
        /* renamed from: id */
        public int f6634id;
        public long stime;

        @JSONField(deserialize = false, serialize = false)
        public boolean isValid() {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            return currentTimeMillis >= this.stime && currentTimeMillis <= this.etime;
        }
    }
}
