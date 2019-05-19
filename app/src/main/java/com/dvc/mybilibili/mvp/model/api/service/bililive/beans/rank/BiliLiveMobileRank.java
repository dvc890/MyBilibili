package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveMobileRank {
    @Nullable
    @JSONField(name = "list")
    public List<RankItem> list;
    @JSONField(name = "next_offset")
    public int nextOffset;
    @Nullable
    @JSONField(name = "own")
    public Own own;

    @Keep
    /* compiled from: BL */
    public static class Own {
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "guard_level")
        public int guardLevel;
        @JSONField(name = "icon")
        public String icon;
        @JSONField(name = "isSelf")
        public int isSelf;
        @JSONField(name = "rank")
        public int rank;
        @JSONField(name = "rank_text")
        public String rankText;
        @JSONField(name = "score")
        public long score;
        @JSONField(name = "uid")
        public long uid;
        @JSONField(name = "uname")
        public String uname;
    }

    @Keep
    /* compiled from: BL */
    public static class RankItem {
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
        @JSONField(name = "uname")
        public String uname;
    }
}
