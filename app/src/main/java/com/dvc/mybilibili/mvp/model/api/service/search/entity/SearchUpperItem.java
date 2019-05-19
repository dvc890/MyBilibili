package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class SearchUpperItem extends BaseSearchItem {
    @JSONField(name = "archives")
    public int archives;
    @JSONField(name = "attentions")
    public int attentions;
    @Nullable
    @JSONField(name = "av_items")
    public List<Video> avItems;
    @JSONField(name = "fans")
    public int fans;
    @JSONField(name = "is_up")
    public boolean isUpUser;
    @JSONField(name = "level")
    public int level;
    @JSONField(name = "live_status")
    public int liveStatus;
    @Nullable
    @JSONField(name = "official_verify")
    public SearchOfficialVerify officialVerify;
    @JSONField(name = "roomid")
    public int roomId;
    @Nullable
    @JSONField(name = "sign")
    public String sign;

    @Keep
    /* compiled from: BL */
    public static class Video {
        @Nullable
        public String author;
        @Nullable
        @JSONField(name = "badges")
        public List<Tag> badges;
        @Nullable
        public String cover;
        @Nullable
        public String ctime;
        @Nullable
        public String danmaku;
        @Nullable
        public String desc;
        @Nullable
        public String duration;
        @JSONField(name = "is_pay")
        public int isPay;
        @Nullable
        public String param;
        @Nullable
        public String play;
        @Nullable
        public String title;
        @Nullable
        public String trackId;
        @Nullable
        public String uri;
    }

    public boolean isAttention() {
        return this.attentions == 1;
    }

    public boolean toggleAttention() {
        this.attentions = 1 - this.attentions;
        return isAttention();
    }
}
