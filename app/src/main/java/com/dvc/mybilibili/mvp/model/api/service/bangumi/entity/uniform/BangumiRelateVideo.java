package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiRelateVideo {
    @JSONField(name = "aid")
    public int aid;
    @Nullable
    @JSONField(name = "owner")
    public Owner author;
    @JSONField(name = "pic")
    public String cover;
    @JSONField(name = "duration")
    public int duration;
    @Nullable
    @JSONField(name = "stat")
    public Stat stat;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "url")
    public String url;

    @Keep
    /* compiled from: BL */
    public static class Owner {
        @JSONField(name = "face")
        public String avatar;
        @JSONField(name = "mid")
        public int mid;
        @JSONField(name = "name")
        public String name;
    }

    @Keep
    /* compiled from: BL */
    public static class Stat {
        @JSONField(name = "danmaku")
        public int danmakus;
        @JSONField(name = "view")
        public int views;
    }
}
