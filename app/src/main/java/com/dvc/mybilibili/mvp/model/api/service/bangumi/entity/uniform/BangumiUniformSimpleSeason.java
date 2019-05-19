package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiUniformSimpleSeason {
    public List<Area> areas;
    public String badge;
    @JSONField(name = "badge_type")
    public int badgeType;
    public String cover;
    @JSONField(name = "follow_count")
    public long followCount;
    @JSONField(name = "is_finish")
    public boolean isFinish;
    @JSONField(name = "is_new")
    public boolean isNew;
    @JSONField(name = "is_started")
    public boolean isStarted;
    @JSONField(name = "is_watch_newest")
    public boolean isWatchNewest;
    public int mode;
    @JSONField(name = "newest_ep_cover")
    public String newestEpCover;
    @JSONField(name = "newest_ep_index")
    public String newestEpIndex;
    public String progress;
    @JSONField(name = "pub_time_show")
    public String pubTimeShow;
    @JSONField(name = "season_id")
    public String seasonId;
    @JSONField(name = "season_status")
    public int seasonStatus;
    @JSONField(name = "season_type")
    public int seasonType;
    @JSONField(name = "season_type_name")
    public String seasonTypeName;
    public String title;
    @JSONField(name = "total_count")
    public int totalCount;
    @JSONField(name = "url")
    public String url;
    @JSONField(name = "watching_count")
    public long watchingCount;

    @Keep
    /* compiled from: BL */
    public static class Area {
        /* renamed from: id */
        public int f5759id;
        public String name;
    }
}
