package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveUpVideoItem {
    @JSONField(name = "aid")
    public int aid;
    @JSONField(name = "duration")
    public int duration;
    @JSONField(name = "pic")
    public String pic;
    @JSONField(name = "stat")
    public StatEntity stat;
    @JSONField(name = "title")
    public String title;

    @Keep
    /* compiled from: BL */
    public static class StatEntity {
        @JSONField(name = "danmaku")
        public int danmaku;
        @JSONField(name = "view")
        public int viewCount;
    }

    @Keep
    /* compiled from: BL */
    public static class VideoCount {
        @JSONField(name = "count")
        public int count;
    }
}
