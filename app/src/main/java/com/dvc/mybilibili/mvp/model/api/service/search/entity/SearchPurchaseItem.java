package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchPurchaseItem extends BaseSearchItem {
    @Nullable
    @JSONField(name = "badge")
    public String badge;
    @Nullable
    @JSONField(name = "city")
    public String city;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f9835id;
    @JSONField(name = "price")
    public int price;
    @Nullable
    @JSONField(name = "price_complete")
    public String priceShow;
    @JSONField(name = "price_type")
    public int priceType;
    @JSONField(name = "required_number")
    public int requiredNumber;
    @Nullable
    @JSONField(name = "shop_name")
    public String shopName;
    @Nullable
    @JSONField(name = "show_time")
    public String showTime;
    @Nullable
    @JSONField(name = "venue")
    public String venue;

    public String getPrice() {
        if (TextUtils.isEmpty(this.priceShow)) {
            return String.valueOf(this.price);
        }
        return this.priceShow;
    }

    public String getLocation() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(this.city)) {
            stringBuilder.append(this.city);
            stringBuilder.append(" ");
        }
        if (!TextUtils.isEmpty(this.venue)) {
            stringBuilder.append(this.venue);
        }
        return stringBuilder.toString();
    }

    public boolean isLowestPrice() {
        return this.priceType == 1;
    }
}
