package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveDayRank {
    @JSONField(name = "list")
    public List<LiveDayRankItem> list;
    @JSONField(name = "own")
    public LiveDayRankOwn own;
    @JSONField(name = "page")
    public int page;
    @JSONField(name = "total_page")
    public int totalPage;

    @Keep
    /* compiled from: BL */
    public static class LiveDayRankItem {
        @Nullable
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "guard_level")
        public int guardLevel;
        @JSONField(name = "isSelf")
        public int isSelf;
        @JSONField(name = "rank")
        public int rank;
        @JSONField(name = "score")
        public long score;
        @JSONField(name = "uid")
        public long uid;
        @Nullable
        @JSONField(name = "uname")
        public String uname;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveDayRankOwn {
        @Nullable
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "guard_level")
        public int guardLevel;
        @JSONField(name = "rank")
        public int rank;
        @Nullable
        @JSONField(name = "rank_text")
        public String rankText;
        @JSONField(name = "score")
        public long score;
        @JSONField(name = "uid")
        public long uid;
        @Nullable
        @JSONField(name = "uname")
        public String uname;
    }
}
