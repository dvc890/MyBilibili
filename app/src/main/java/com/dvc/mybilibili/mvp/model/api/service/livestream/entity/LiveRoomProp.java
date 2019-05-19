package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class LiveRoomProp {
    public static final String GOLD = "gold";
    public static final String SILVER = "silver";
    public boolean isSelected;
    @JSONField(name = "coin_type")
    public CoinType mCoinType;
    @JSONField(name = "gif_url")
    public String mGifUrl;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "price")
    public int mPrice;
    @JSONField(name = "img")
    public String mThumb;

    @Keep
    /* compiled from: BL */
    public static class CoinType {
        @JSONField(name = "gold")
        public String mGold;
        @JSONField(name = "silver")
        public String mSilver;

        public CoinType cloneObj() {
            CoinType coinType = new CoinType();
            coinType.mGold = this.mGold;
            coinType.mSilver = this.mSilver;
            return coinType;
        }
    }

    public boolean isSupportGold() {
        return (this.mCoinType == null || TextUtils.isEmpty(this.mCoinType.mGold)) ? false : true;
    }

    public boolean isSupportSilver() {
        return (this.mCoinType == null || TextUtils.isEmpty(this.mCoinType.mSilver)) ? false : true;
    }

    public static int getReportSeedType(String str) {
        return TextUtils.equals(str, "gold") ? 1 : 2;
    }

    public LiveRoomProp cloneObj() {
        LiveRoomProp liveRoomProp = new LiveRoomProp();
        liveRoomProp.mId = this.mId;
        liveRoomProp.mName = this.mName;
        liveRoomProp.mPrice = this.mPrice;
        liveRoomProp.mThumb = this.mThumb;
        liveRoomProp.mCoinType = this.mCoinType == null ? null : this.mCoinType.cloneObj();
        return liveRoomProp;
    }
}
