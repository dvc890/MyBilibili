package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveWishConfig {
    @JSONField(name = "gift_limit_max")
    public int mGiftLimitMax;
    @JSONField(name = "gift_limit_min")
    public int mGiftLimitMin;
    @JSONField(name = "gift_list")
    public List<GiftList> mGiftList;

    @Keep
    /* compiled from: BL */
    public static class GiftList {
        @JSONField(name = "coin_type")
        public CoinType mCoinType;
        @JSONField(name = "gift_id")
        public int mGiftId;
        @JSONField(name = "gift_name")
        public String mGiftName;
        @JSONField(name = "price")
        public int mPrice;

        @Keep
        /* compiled from: BL */
        public static class CoinType {
            @JSONField(name = "gold")
            public String mGold;
            @JSONField(name = "silver")
            public String mSilver;
        }

        public boolean isGoldType() {
            return !TextUtils.isEmpty(this.mCoinType.mGold);
        }
    }
}
