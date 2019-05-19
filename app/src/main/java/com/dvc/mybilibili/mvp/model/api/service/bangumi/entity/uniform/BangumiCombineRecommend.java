package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BangumiCombineRecommend {
    @Nullable
    @JSONField(name = "more")
    public RecommendList<BangumiRecommendSeason> recommendSeasons;

    @Keep
    /* compiled from: BL */
    public static class RecommendList<T> {
        @Nullable
        @JSONField(name = "data")
        public ArrayList<T> data;
        @JSONField(name = "from")
        public int from;

        public int getDataSize() {
            return this.data != null ? this.data.size() : 0;
        }

        @Nullable
        public T getData(int i) {
            return this.data != null ? this.data.get(i) : null;
        }
    }

    public int getSeasonSize() {
        return this.recommendSeasons != null ? this.recommendSeasons.getDataSize() : 0;
    }

    @Nullable
    public BangumiRecommendSeason getSeason(int i) {
        return this.recommendSeasons != null ? (BangumiRecommendSeason) this.recommendSeasons.getData(i) : null;
    }
}
