package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.BaseInfoItem */
public class BaseInfoItem implements IAdReportInfo {
    public static final Creator<BaseInfoItem> CREATOR = new C29581();
    @JSONField(name = "ad_index")
    public long adIndex;
    @Nullable
    @JSONField(name = "ad_cb")
    public String ad_cb;
    public boolean buttonShow;
    @JSONField(name = "card_index")
    public long cardIndex;
    @Nullable
    @JSONField(name = "click_url")
    public String clickUrl;
    @Nullable
    @JSONField(name = "cm_mark")
    public long cmMark;
    @Nullable
    @JSONField(name = "creative_id")
    public long creativeId;
    @Nullable
    @JSONField(name = "creative_type")
    public long creativeType;
    @Nullable
    @JSONField(name = "extra")
    public FeedExtra extra;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f8679id;
    @Nullable
    @JSONField(name = "client_ip")
    /* renamed from: ip */
    public String f8680ip;
    @Nullable
    @JSONField(name = "is_ad")
    public boolean isAd;
    @Nullable
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    @Nullable
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "resource_id")
    public long resourceId;
    @JSONField(name = "server_type")
    public long serverType;
    @Nullable
    @JSONField(name = "show_url")
    public String showUrl;
    @Nullable
    @JSONField(name = "src_id")
    public long srcId;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.feed.model.BaseInfoItem$1 */
    static class C29581 implements Creator<BaseInfoItem> {
        C29581() {
        }

        /* renamed from: a */
        public BaseInfoItem createFromParcel(Parcel parcel) {
            return new BaseInfoItem(parcel);
        }

        /* renamed from: a */
        public BaseInfoItem[] newArray(int i) {
            return new BaseInfoItem[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public long getAvId() {
        return 0;
    }

    public String getCardType() {
        return "";
    }

    public long getCmReasonId() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.cmMark);
        parcel.writeByte((byte) (this.isAdLoc?1:0));
        parcel.writeByte((byte) (this.isAd?1:0));
        parcel.writeLong(this.srcId);
        parcel.writeString(this.requestId);
        parcel.writeLong(this.creativeId);
        parcel.writeLong(this.creativeType);
        parcel.writeString(this.ad_cb);
        parcel.writeString(this.f8680ip);
        parcel.writeString(this.showUrl);
        parcel.writeString(this.clickUrl);
        parcel.writeLong(this.serverType);
        parcel.writeLong(this.resourceId);
        parcel.writeLong(this.f8679id);
        parcel.writeLong(this.adIndex);
        parcel.writeLong(this.cardIndex);
        parcel.writeByte((byte) (this.buttonShow?1:0));
        parcel.writeParcelable(this.extra, i);
    }

    public BaseInfoItem() {
        this.serverType = -1;
        this.cardIndex = -1;
        this.buttonShow = false;
    }

    protected BaseInfoItem(Parcel parcel) {
        this.serverType = -1;
        this.cardIndex = -1;
        boolean z = false;
        this.buttonShow = false;
        this.cmMark = parcel.readLong();
        this.isAdLoc = parcel.readByte() != (byte) 0;
        this.isAd = parcel.readByte() != (byte) 0;
        this.srcId = parcel.readLong();
        this.requestId = parcel.readString();
        this.creativeId = parcel.readLong();
        this.creativeType = parcel.readLong();
        this.ad_cb = parcel.readString();
        this.f8680ip = parcel.readString();
        this.showUrl = parcel.readString();
        this.clickUrl = parcel.readString();
        this.serverType = parcel.readLong();
        this.resourceId = parcel.readLong();
        this.f8679id = parcel.readLong();
        this.adIndex = parcel.readLong();
        this.cardIndex = parcel.readLong();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.buttonShow = z;
        this.extra = (FeedExtra) parcel.readParcelable(FeedExtra.class.getClassLoader());
    }

    public long getCmMark() {
        return this.cmMark;
    }

    public boolean getIsAdLoc() {
        return this.isAdLoc;
    }

    public boolean getIsAd() {
        return this.isAd;
    }

    public long getSrcId() {
        return this.srcId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public long getCreativeId() {
        return this.creativeId;
    }

    public long getCreativeType() {
        return this.creativeType;
    }

    public String getAdCb() {
        return this.ad_cb;
    }

    public String getIp() {
        return this.f8680ip;
    }

    public String getShowUrl() {
        return this.showUrl;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public long getServerType() {
        return this.serverType;
    }

    public long getResourceId() {
        return this.resourceId;
    }

    public long getId() {
        return this.f8679id;
    }

    public long getAdIndex() {
        return this.adIndex;
    }

    public long getCardIndex() {
        return this.cardIndex;
    }

    public boolean getIsButtonShow() {
        return this.buttonShow;
    }

    public FeedExtra getExtra() {
        return this.extra;
    }
}
