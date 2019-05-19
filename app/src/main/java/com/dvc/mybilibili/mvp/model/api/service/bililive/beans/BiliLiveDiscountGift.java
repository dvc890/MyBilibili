package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BiliLiveDiscountGift {
    @JSONField(name = "discount_list")
    public ArrayList<DiscountGift> mDiscountList;

    @Keep
    /* compiled from: BL */
    public static class DiscountGift {
        @JSONField(name = "corner_color")
        public String mCornerColor;
        @JSONField(name = "corner_mark")
        public String mCornerMark;
        @JSONField(name = "corner_position")
        public int mCornerPosition;
        @JSONField(name = "discount_price")
        public int mDiscountPrice;
        @JSONField(name = "gift_id")
        public int mGiftId;
        @JSONField(name = "price")
        public int mPrice;
    }
}
