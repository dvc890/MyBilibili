package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean.ButtonBean;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean.ImageBean;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean.VideoBean;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.Card */
public class Card implements Parcelable {
    public static final Creator<Card> CREATOR = new C17791();
    @JSONField(name = "ad_tag")
    public String adTag;
    @JSONField(name = "adver_logo")
    public String adverLogo;
    @JSONField(name = "adver_name")
    public String adverName;
    @JSONField(name = "adver_page_url")
    public String adverpageUrl;
    @JSONField(name = "button")
    public ButtonBean button;
    @JSONField(name = "callup_url")
    public String callUpUrl;
    @JSONField(name = "card_type")
    public int cardType;
    @JSONField(name = "covers")
    public List<ImageBean> covers;
    @JSONField(name = "cur_price")
    public String curPrice;
    @JSONField(name = "danmu_begin")
    public long danmuBegin;
    @JSONField(name = "danmu_color")
    public String danmuColor;
    @JSONField(name = "danmu_height")
    public float danmuHeight;
    @JSONField(name = "danmu_life")
    public long danmuLife;
    @JSONField(name = "danmu_h5url")
    public String danmuPanelUrl;
    @JSONField(name = "danmu_title")
    public String danmuTitle;
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "extra_desc")
    public String extraDesc;
    @JSONField(name = "good")
    public Good good;
    @JSONField(name = "hot_score")
    public String hotScore;
    @JSONField(name = "jump_url")
    public String jumpUrl;
    @JSONField(name = "long_desc")
    public String longDesc;
    @JSONField(name = "ad_tag_style")
    public MarkInfo marker;
    @JSONField(name = "ori_price")
    public String oriPrice;
    @JSONField(name = "rank")
    public String rank;
    @JSONField(name = "short_title")
    public String shortTitle;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "video")
    public VideoBean video;
    @JSONField(name = "video_barrage")
    public List<String> videoBarrage;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.feed.model.Card$1 */
    static class C17791 implements Creator<Card> {
        C17791() {
        }

        /* renamed from: a */
        public Card createFromParcel(Parcel parcel) {
            return new Card(parcel);
        }

        /* renamed from: a */
        public Card[] newArray(int i) {
            return new Card[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean useLitterCard() {
        return TextUtils.isEmpty(this.adverLogo) || TextUtils.isEmpty(this.adverName) || TextUtils.isEmpty(this.adverpageUrl);
    }

    public Double getCurPrice() {
        try {
            return Double.valueOf(Double.parseDouble(this.curPrice));
        } catch (Exception unused) {
            return Double.valueOf(-1.0d);
        }
    }

    public Double getRank() {
        Double valueOf = Double.valueOf(-1.0d);
        try {
            valueOf = Double.valueOf(Double.parseDouble(this.rank));
        } catch (Exception unused) {
        }
        return valueOf.doubleValue() > 100.0d ? Double.valueOf(100.0d) : valueOf;
    }

    public Double getHotScore() {
        try {
            return Double.valueOf(Double.parseDouble(this.hotScore));
        } catch (Exception unused) {
            return Double.valueOf(-1.0d);
        }
    }

    public String getFirstCoverUrl() {
        if (this.covers != null && this.covers.size() > 0) {
            ImageBean imageBean = (ImageBean) this.covers.get(0);
            if (imageBean != null) {
                return imageBean.url;
            }
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cardType);
        parcel.writeString(this.title);
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.callUpUrl);
        parcel.writeString(this.desc);
        parcel.writeString(this.oriPrice);
        parcel.writeString(this.curPrice);
        parcel.writeString(this.extraDesc);
        parcel.writeString(this.rank);
        parcel.writeString(this.hotScore);
        parcel.writeTypedList(this.covers);
        parcel.writeParcelable(this.button, i);
        parcel.writeString(this.longDesc);
        parcel.writeString(this.adverLogo);
        parcel.writeString(this.adverName);
        parcel.writeString(this.adverpageUrl);
        parcel.writeStringList(this.videoBarrage);
        parcel.writeString(this.adTag);
        parcel.writeParcelable(this.marker, i);
        parcel.writeParcelable(this.video, i);
    }

    protected Card(Parcel parcel) {
        this.cardType = parcel.readInt();
        this.title = parcel.readString();
        this.jumpUrl = parcel.readString();
        this.callUpUrl = parcel.readString();
        this.desc = parcel.readString();
        this.oriPrice = parcel.readString();
        this.curPrice = parcel.readString();
        this.extraDesc = parcel.readString();
        this.rank = parcel.readString();
        this.hotScore = parcel.readString();
        this.covers = parcel.createTypedArrayList(ImageBean.CREATOR);
        this.button = (ButtonBean) parcel.readParcelable(ButtonBean.class.getClassLoader());
        this.longDesc = parcel.readString();
        this.adverLogo = parcel.readString();
        this.adverName = parcel.readString();
        this.adverpageUrl = parcel.readString();
        this.videoBarrage = parcel.createStringArrayList();
        this.adTag = parcel.readString();
        this.marker = (MarkInfo) parcel.readParcelable(MarkInfo.class.getClassLoader());
        this.video = (VideoBean) parcel.readParcelable(VideoBean.class.getClassLoader());
    }
}
