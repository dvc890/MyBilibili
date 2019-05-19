package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank.BiliLiveDayRank.LiveDayRankItem;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank.BiliLiveDayRank.LiveDayRankOwn;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveActivityRank {
    @Nullable
    @JSONField(name = "activity_info")
    public LiveActivityRankInfo activityInfo;
    @Nullable
    @JSONField(name = "list")
    public List<LiveActivityRankItem> list;
    @Nullable
    @JSONField(name = "own")
    public LiveDayRankOwn own;
    @JSONField(name = "page")
    public int page;
    @JSONField(name = "total_page")
    public int totalPage;

    @Keep
    /* compiled from: BL */
    public static class LiveActivityCoinUrlInfo {
        @JSONField(name = "height")
        public int height;
        @Nullable
        @JSONField(name = "src")
        public String src;
        @JSONField(name = "width")
        public int width;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveActivityRankInfo {
        @Nullable
        @JSONField(name = "cover")
        public String cover;
        @Nullable
        @JSONField(name = "url")
        public String url;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveActivityRankItem extends LiveDayRankItem {
        @Nullable
        @JSONField(name = "coin1_url")
        public LiveActivityCoinUrlInfo coinUrl;
        @JSONField(name = "id")
        /* renamed from: id */
        public long f6016id;
        @Nullable
        @JSONField(name = "link")
        public String link;
    }
}
