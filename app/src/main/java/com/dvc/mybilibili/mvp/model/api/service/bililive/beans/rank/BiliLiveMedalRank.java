package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank.BiliLiveDayRank.LiveDayRankItem;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank.BiliLiveDayRank.LiveDayRankOwn;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveMedalRank {
    @Nullable
    @JSONField(name = "list")
    public List<LiveMedalRankItem> list;
    @Nullable
    @JSONField(name = "medal")
    public LiveMedalInfo medal;
    @Nullable
    @JSONField(name = "own")
    public LiveMedalRankOwn own;
    @JSONField(name = "page")
    public int page;
    @JSONField(name = "total_page")
    public int totalPage;

    @Keep
    /* compiled from: BL */
    public static class LiveMedalInfo {
        @JSONField(name = "status")
        public int status;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveMedalRankItem extends LiveDayRankItem {
        @JSONField(name = "color")
        public int color;
        @JSONField(name = "level")
        public int level;
        @Nullable
        @JSONField(name = "medal_name")
        public String medalName;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveMedalRankOwn extends LiveDayRankOwn {
        @JSONField(name = "color")
        public int color;
        @JSONField(name = "isMax")
        public int isMax;
        @JSONField(name = "level")
        public int level;
        @Nullable
        @JSONField(name = "medal_name")
        public String medalName;
    }
}
