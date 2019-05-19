package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review.RecommendReview;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiFollowHome {
    @JSONField(name = "ad")
    public List<BangumiBanner> adBanners;
    @JSONField(name = "recommend_jp")
    public RecommendCartoon recommendBangumi;
    @JSONField(name = "recommend_cn")
    public RecommendCartoon recommendDomestic;
    @JSONField(name = "recommend_review")
    public List<RecommendReview> recommendReview;

    @Keep
    /* compiled from: BL */
    public static class RecommendCartoon {
        @JSONField(name = "foot")
        public List<BangumiRecommend> activityList;
        @JSONField(name = "recommend")
        public List<BangumiBrief> videoBeanList;
    }
}
