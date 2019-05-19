package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.Good */
public class Good implements Parcelable {
    public static final Creator<Good> CREATOR = new C17821();
    @JSONField(name = "item_id")
    public long itemId;
    @JSONField(name = "shop_id")
    public long shopId;
    @JSONField(name = "sku_id")
    public long skuId;
    @JSONField(name = "skuNum")
    public long skuNum;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.feed.model.Good$1 */
    static class C17821 implements Creator<Good> {
        C17821() {
        }

        /* renamed from: a */
        public Good createFromParcel(Parcel parcel) {
            return new Good(parcel);
        }

        /* renamed from: a */
        public Good[] newArray(int i) {
            return new Good[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected Good(Parcel parcel) {
        this.itemId = parcel.readLong();
        this.skuId = parcel.readLong();
        this.shopId = parcel.readLong();
        this.skuNum = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.itemId);
        parcel.writeLong(this.skuId);
        parcel.writeLong(this.shopId);
        parcel.writeLong(this.skuNum);
    }
}
