package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveGuardOrderInfo {
    @JSONField(name = "ruid")
    public long anchorId;
    @JSONField(name = "rusername")
    public String anchorUserName;
    @JSONField(name = "coin")
    public String coin;
    @JSONField(name = "expired_time")
    public String expired_time;
    @JSONField(name = "face")
    public String face;
    @JSONField(name = "guard_level")
    public int guardLevel;
    @JSONField(name = "price_info")
    public List<PriceInfo> priceInfos;
    @JSONField(name = "room_id")
    public long roomId;
    @JSONField(name = "sell_status")
    public int sell_status;
    @JSONField(name = "uid")
    public long uid;
    @JSONField(name = "username")
    public String username;

    @Keep
    /* compiled from: BL */
    public static class PriceInfo {
        @JSONField(name = "guard_level")
        public int guardLevel;
        @JSONField(name = "num")
        public int num;
        @JSONField(name = "price")
        public long price;
    }

    public long getGoldBalance() {
        if (TextUtils.isEmpty(this.coin)) {
            return 0;
        }
        try {
            return Long.parseLong(this.coin);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public long getPrice(int i) {
        if (this.priceInfos != null && this.priceInfos.size() > 0) {
            for (PriceInfo priceInfo : this.priceInfos) {
                if (priceInfo != null && i == priceInfo.guardLevel) {
                    return priceInfo.price;
                }
            }
        }
        return 0;
    }

    public boolean canBuy(int i) {
        boolean z = true;
        if (this.guardLevel <= 0) {
            return true;
        }
        if (i <= 0 || this.guardLevel < i) {
            z = false;
        }
        return z;
    }
}
