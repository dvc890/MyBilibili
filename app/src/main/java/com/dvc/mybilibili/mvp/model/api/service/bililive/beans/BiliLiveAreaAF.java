package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveAreaAF {
    public static final int NORMAL_VIDEOS_ITEM_COUNT = 6;
    public static final int RECOMMEND_VIDEOS_ITEM_COUNT = 6;
    public static final int RECOMMEND_VIDEOS_PARENT_AREA_ID = 0;
    public static final int STAR_SHOW_ITEM_COUNT = 4;
    public static final int STAR_SHOW_PARENT_AREA_ID = 999;
    @JSONField(name = "area")
    public String mArea;
    @JSONField(name = "count")
    public int mCount;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "hidden")
    public int mIsHidden;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "sub_icon")
    public BiliImage mSmallIcon = BiliImage.NULL;

    public static boolean isRecommendAreaAF(int i) {
        return i == 0;
    }

    public static boolean isStarShow(int i) {
        return i == 999;
    }

    public boolean isRecommendAreaAF() {
        return isRecommendAreaAF(this.mId);
    }

    public boolean isStarShow() {
        return isStarShow(this.mId);
    }

    public boolean shouldHide() {
        return this.mIsHidden == 1;
    }
}
