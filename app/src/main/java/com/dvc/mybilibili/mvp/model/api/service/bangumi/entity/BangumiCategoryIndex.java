package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiCategoryIndex {
    public int count;
    public List<Bangumi> list;
    public int pages;

    @Keep
    /* compiled from: BL */
    public static class Bangumi {
        @JSONField(name = "badge")
        public String badge;
        public String cover;
        public int favorites;
        @JSONField(name = "is_finish")
        public int isFinish;
        @JSONField(name = "newest_ep_index")
        public String newestIndex;
        @JSONField(name = "pub_time")
        public long pubTime;
        @JSONField(name = "season_id")
        public String seasonId;
        @JSONField(name = "season_status")
        public int seasonStatus;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "total_count")
        public String totalCount;
        @JSONField(name = "update_time")
        public long updateTime;
    }
}
