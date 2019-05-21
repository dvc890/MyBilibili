package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class AdInfo implements Parcelable {
    public static final Creator<AdInfo> CREATOR = new C22571();
    @JSONField(name = "index")
    public long adIndex;
    @JSONField(name = "ad_cb")
    public String ad_cb;
    @JSONField(name = "card_index")
    public long cardIndex = -1;
    @JSONField(name = "card_type")
    public long card_type;
    @Nullable
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(name = "cm_mark")
    public long cmMark;
    @JSONField(name = "creative_id")
    public long creativeId;
    @JSONField(name = "creative_type")
    public long creativeType;
    @JSONField(name = "extra")
    public JSONObject extra;
    @JSONField(name = "id")
    /* renamed from: id */
    public long id;
    @JSONField(name = "client_ip")
    /* renamed from: ip */
    public String f6320ip;
    @JSONField(name = "is_ad")
    public boolean isAd;
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "resource")
    public long resourceId;
    @JSONField(name = "server_type")
    public long serverType = -1;
    @Nullable
    @JSONField(name = "show_url")
    public String showUrl;
    @JSONField(name = "source")
    public long srcId;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.model.AdInfo$1 */
    static class C22571 implements Creator<AdInfo> {
        C22571() {
        }

        /* renamed from: a */
        public AdInfo createFromParcel(Parcel parcel) {
            return new AdInfo(parcel);
        }

        /* renamed from: a */
        public AdInfo[] newArray(int i) {
            return new AdInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.creativeId);
        parcel.writeLong(this.creativeType);
        parcel.writeLong(this.card_type);
        parcel.writeString(this.ad_cb);
        parcel.writeLong(this.resourceId);
        parcel.writeLong(this.srcId);
        parcel.writeString(this.requestId);
        parcel.writeByte((byte) (this.isAd?1:0));
        parcel.writeLong(this.cmMark);
        parcel.writeLong(this.adIndex);
        parcel.writeByte((byte) (this.isAdLoc?1:0));
        parcel.writeLong(this.cardIndex);
        parcel.writeLong(this.serverType);
        parcel.writeString(this.showUrl);
        parcel.writeString(this.clickUrl);
        parcel.writeString(this.f6320ip);
        parcel.writeLong(this.id);
        parcel.writeSerializable(this.extra);
    }

    public AdInfo() {}

    protected AdInfo(Parcel parcel) {
        this.creativeId = parcel.readLong();
        this.creativeType = parcel.readLong();
        this.card_type = parcel.readLong();
        this.ad_cb = parcel.readString();
        this.resourceId = parcel.readLong();
        this.srcId = parcel.readLong();
        this.requestId = parcel.readString();
        boolean z = false;
        this.isAd = parcel.readByte() != (byte) 0;
        this.cmMark = parcel.readLong();
        this.adIndex = parcel.readLong();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.isAdLoc = z;
        this.cardIndex = parcel.readLong();
        this.serverType = parcel.readLong();
        this.showUrl = parcel.readString();
        this.clickUrl = parcel.readString();
        this.f6320ip = parcel.readString();
        this.id = parcel.readLong();
        this.extra = (JSONObject) parcel.readSerializable();
    }
}
