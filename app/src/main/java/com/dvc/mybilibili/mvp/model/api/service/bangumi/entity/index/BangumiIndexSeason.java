package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.index;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiIndexSeason {
    public String badge;
    @JSONField(name = "badge_type")
    public int badgeType;
    public String cover;
    @JSONField(name = "index_show")
    public String indexShow;
    public String link;
    @JSONField(name = "media_id")
    public String mediaId;
    public Order order;
    @JSONField(name = "season_id")
    public String seasonId;
    public String title;

    @Keep
    /* compiled from: BL */
    public static class Order {
        /* renamed from: dm */
        public String f5655dm;
        public String follow;
        public String play;
        @JSONField(name = "pub_date")
        public long pub_date;
        @JSONField(name = "pub_real_time")
        public long pub_real_time;
        @JSONField(name = "renewal_time")
        public long renewalTime;
        public String score;
        @JSONField(name = "time_show")
        public String timeShow;
        public String type;
    }
}
