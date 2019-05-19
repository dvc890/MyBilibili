package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.FeedExtra */
public class FeedExtra implements Parcelable {
    public static final Creator<FeedExtra> CREATOR = new C17811();
    @Nullable
    @JSONField(name = "card")
    public Card card;
    @Nullable
    @JSONField(name = "click_urls")
    public List<String> clickUrls;
    @Nullable
    @JSONField(name = "download_whitelist")
    public List<WhiteApk> downloadWhitelist;
    @Nullable
    @JSONField(name = "layout")
    public String mLayout;
    @Nullable
    @JSONField(name = "open_whitelist")
    public List<String> openWhitelist;
    @JSONField(name = "preload_landingpage")
    public int preloadLandingPage;
    @JSONField(name = "report_time")
    public long reportTime;
    @JSONField(name = "sales_type")
    public long salesType;
    @Nullable
    @JSONField(name = "show_urls")
    public List<String> showUrls;
    @JSONField(name = "special_industry")
    public boolean specialIndustry;
    @Nullable
    @JSONField(name = "special_industry_tips")
    public String specialIndustryTips;
    @JSONField(name = "use_ad_web_v2")
    public boolean useAdWebV2;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.feed.model.FeedExtra$1 */
    static class C17811 implements Creator<FeedExtra> {
        C17811() {
        }

        /* renamed from: a */
        public FeedExtra createFromParcel(Parcel parcel) {
            return new FeedExtra(parcel);
        }

        /* renamed from: a */
        public FeedExtra[] newArray(int i) {
            return new FeedExtra[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.useAdWebV2?1:0));
        parcel.writeString(this.mLayout);
        parcel.writeStringList(this.showUrls);
        parcel.writeStringList(this.clickUrls);
        parcel.writeTypedList(this.downloadWhitelist);
        parcel.writeStringList(this.openWhitelist);
        parcel.writeParcelable(this.card, i);
        parcel.writeLong(this.reportTime);
        parcel.writeLong(this.salesType);
        parcel.writeByte((byte) (this.specialIndustry?1:0));
        parcel.writeString(this.specialIndustryTips);
    }

    protected FeedExtra(Parcel parcel) {
        boolean z = false;
        this.useAdWebV2 = parcel.readByte() != (byte) 0;
        this.mLayout = parcel.readString();
        this.showUrls = parcel.createStringArrayList();
        this.clickUrls = parcel.createStringArrayList();
        this.downloadWhitelist = parcel.createTypedArrayList(WhiteApk.CREATOR);
        this.openWhitelist = parcel.createStringArrayList();
        this.card = (Card) parcel.readParcelable(Card.class.getClassLoader());
        this.reportTime = parcel.readLong();
        this.salesType = parcel.readLong();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.specialIndustry = z;
        this.specialIndustryTips = parcel.readString();
    }
}
