package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.FeedAdInfo */
public class FeedAdInfo implements IAdReportInfo {
    public static final Creator<FeedAdInfo> CREATOR = new C29591();
    @JSONField(name = "ad_cb")
    public String ad_cb;
    public boolean buttonShow;
    @JSONField(name = "card_index")
    public long cardIndex;
    public String cardType;
    @JSONField(name = "card_type")
    public long card_type;
    @Nullable
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(name = "cm_mark")
    public long cmMark;
    public long cmReasonId;
    @JSONField(name = "creative_id")
    public long creativeId;
    @JSONField(name = "creative_type")
    public long creativeType;
    @JSONField(name = "extra")
    public FeedExtra extra;
    @JSONField(name = "index")
    public long index;
    @JSONField(name = "client_ip")
    /* renamed from: ip */
    public String f8681ip;
    @JSONField(name = "is_ad")
    public boolean isAd;
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "resource")
    public long resource;
    @JSONField(name = "server_type")
    public long serverType;
    @Nullable
    @JSONField(name = "show_url")
    public String showUrl;
    @JSONField(name = "source")
    public long srcId;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.feed.model.FeedAdInfo$1 */
    static class C29591 implements Creator<FeedAdInfo> {
        C29591() {
        }

        /* renamed from: a */
        public FeedAdInfo createFromParcel(Parcel parcel) {
            return new FeedAdInfo(parcel);
        }

        /* renamed from: a */
        public FeedAdInfo[] newArray(int i) {
            return new FeedAdInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public long getAvId() {
        return 0;
    }

    public long getId() {
        return 0;
    }

    public boolean getIsAdLoc() {
        return this.isAdLoc;
    }

    public boolean getIsAd() {
        return this.isAd;
    }

    public String getAdCb() {
        return this.ad_cb;
    }

    public long getSrcId() {
        return this.srcId;
    }

    public long getAdIndex() {
        return this.index;
    }

    public String getIp() {
        return this.f8681ip;
    }

    public long getServerType() {
        return this.serverType;
    }

    public long getResourceId() {
        return this.resource;
    }

    public boolean getIsButtonShow() {
        return this.buttonShow;
    }

    public long getCardIndex() {
        return this.cardIndex;
    }

    public String getCardType() {
        return this.cardType;
    }

    public long getCmReasonId() {
        return this.cmReasonId;
    }

    public long getCmMark() {
        return this.cmMark;
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

    public String getShowUrl() {
        return this.showUrl;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public FeedExtra getExtra() {
        return this.extra;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardType);
        parcel.writeLong(this.creativeId);
        parcel.writeLong(this.creativeType);
        parcel.writeLong(this.card_type);
        parcel.writeString(this.ad_cb);
        parcel.writeLong(this.resource);
        parcel.writeLong(this.srcId);
        parcel.writeString(this.requestId);
        parcel.writeByte((byte) (this.isAd?1:0));
        parcel.writeLong(this.cmMark);
        parcel.writeLong(this.index);
        parcel.writeByte((byte) (this.isAdLoc?1:0));
        parcel.writeLong(this.cardIndex);
        parcel.writeLong(this.serverType);
        parcel.writeString(this.showUrl);
        parcel.writeString(this.clickUrl);
        parcel.writeString(this.f8681ip);
        parcel.writeParcelable(this.extra, i);
        parcel.writeByte((byte) (this.buttonShow?1:0));
    }

    public FeedAdInfo() {
        this.cardIndex = -1;
        this.serverType = -1;
        this.buttonShow = false;
    }

    protected FeedAdInfo(Parcel parcel) {
        this.cardIndex = -1;
        this.serverType = -1;
        boolean z = false;
        this.buttonShow = false;
        this.cardType = parcel.readString();
        this.creativeId = parcel.readLong();
        this.creativeType = parcel.readLong();
        this.card_type = parcel.readLong();
        this.ad_cb = parcel.readString();
        this.resource = parcel.readLong();
        this.srcId = parcel.readLong();
        this.requestId = parcel.readString();
        this.isAd = parcel.readByte() != (byte) 0;
        this.cmMark = parcel.readLong();
        this.index = parcel.readLong();
        this.isAdLoc = parcel.readByte() != (byte) 0;
        this.cardIndex = parcel.readLong();
        this.serverType = parcel.readLong();
        this.showUrl = parcel.readString();
        this.clickUrl = parcel.readString();
        this.f8681ip = parcel.readString();
        this.extra = (FeedExtra) parcel.readParcelable(FeedExtra.class.getClassLoader());
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.buttonShow = z;
    }
}
