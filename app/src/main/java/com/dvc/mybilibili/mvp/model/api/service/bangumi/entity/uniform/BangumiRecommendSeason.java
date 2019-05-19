package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiRecommendSeason {
    @JSONField(name = "badge")
    public String badge;
    @JSONField(name = "badge_type")
    public int badgeType;
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "follow_count")
    public int followCount;
    @JSONField(name = "from")
    public int from;
    @JSONField(name = "index_show")
    public String indexShow;
    @JSONField(name = "is_finish")
    public boolean isFinish;
    @JSONField(name = "is_started")
    public boolean isStarted;
    @JSONField(name = "new_ep")
    public NewEP newEp;
    @JSONField(name = "newest_ep_cover")
    public String newestEpCover;
    @JSONField(name = "newest_ep_index")
    public String newestEpIndex;
    @JSONField(name = "play_count")
    public int playCount;
    @JSONField(name = "rating")
    public Rating rating;
    @JSONField(name = "season_id")
    public int seasonId;
    @JSONField(name = "season_status")
    public int seasonStatus = 2;
    @JSONField(name = "season_type")
    public int seasonType;
    @JSONField(name = "season_type_name")
    public String seasonTypeName;
    @JSONField(name = "stat")
    public Stat stat;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "total_count")
    public int totalCount;
    @JSONField(name = "url")
    public String url;
    @JSONField(name = "score")
    public float voteScore;
    @JSONField(name = "user_count")
    public int voteUserCount;

    @Keep
    /* compiled from: BL */
    public static class NewEP {
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "index_show")
        public String indexShow;
    }

    @Keep
    /* compiled from: BL */
    public static class Rating {
        @JSONField(name = "count")
        public long peopleCount;
        @JSONField(name = "score")
        public float scoreNum;
    }

    @Keep
    /* compiled from: BL */
    public static class Stat {
        @JSONField(name = "danmaku")
        public long danmaku;
        @JSONField(name = "follow")
        public long followNum;
        @JSONField(name = "view")
        public long view;
    }

    public String getIsAuto() {
        int i = this.from;
        return (i == 0 || i == 2) ? "1" : "";
    }
}
