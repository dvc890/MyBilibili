package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class LiveRoomBanner implements Parcelable {
    public static final Creator<LiveRoomBanner> CREATOR = new C20571();
    @JSONField(name = "bottom")
    public ArrayList<BannerItem> bottom;
    @JSONField(name = "gift_banner")
    public GiftShow gift;
    @JSONField(name = "inputBanner")
    public List<BannerItem> inputBannerList;
    @JSONField(name = "lol_activity")
    public LolActivity mLolActivity;
    @JSONField(name = "superBanner")
    public LiveSuperBanner superBanner;
    @JSONField(name = "top")
    public ArrayList<BannerItem> top;

    @Keep
    /* compiled from: BL */
    public static class BannerItem implements Parcelable {
        public static final Creator<BannerItem> CREATOR = new C20531();
        @JSONField(name = "activity_title")
        public String activityTitle;
        @JSONField(name = "color")
        public String color;
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "expire_hour")
        public int expireHour;
        @Nullable
        @JSONField(name = "week_gift_color")
        public String giftColor;
        @JSONField(name = "gift_img")
        public String giftImg;
        @JSONField(name = "is_close")
        public int hasCloseIcon;
        @JSONField(name = "id")
        /* renamed from: id */
        public int f6008id;
        @JSONField(name = "jump_url")
        public String jumpUrl;
        public int position;
        @JSONField(name = "rank")
        public String rank;
        @Nullable
        @JSONField(name = "week_rank_color")
        public String rankColor;
        @JSONField(name = "rank_name")
        public String rankName;
        @Nullable
        @JSONField(name = "week_text_color")
        public String textColor;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "type")
        public int type;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.LiveRoomBanner$BannerItem$1 */
        static class C20531 implements Creator<BannerItem> {
            C20531() {
            }

            public BannerItem createFromParcel(Parcel parcel) {
                return new BannerItem(parcel);
            }

            public BannerItem[] newArray(int i) {
                return new BannerItem[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected BannerItem(Parcel parcel) {
            this.f6008id = parcel.readInt();
            this.title = parcel.readString();
            this.activityTitle = parcel.readString();
            this.rank = parcel.readString();
            this.cover = parcel.readString();
            this.jumpUrl = parcel.readString();
            this.color = parcel.readString();
            this.expireHour = parcel.readInt();
            this.hasCloseIcon = parcel.readInt();
            this.type = parcel.readInt();
            this.rankName = parcel.readString();
            this.giftImg = parcel.readString();
            this.giftColor = parcel.readString();
            this.textColor = parcel.readString();
            this.rankColor = parcel.readString();
            this.position = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6008id);
            parcel.writeString(this.title);
            parcel.writeString(this.activityTitle);
            parcel.writeString(this.rank);
            parcel.writeString(this.cover);
            parcel.writeString(this.jumpUrl);
            parcel.writeString(this.color);
            parcel.writeInt(this.expireHour);
            parcel.writeInt(this.hasCloseIcon);
            parcel.writeInt(this.type);
            parcel.writeString(this.rankName);
            parcel.writeString(this.giftImg);
            parcel.writeString(this.giftColor);
            parcel.writeString(this.textColor);
            parcel.writeString(this.rankColor);
            parcel.writeInt(this.position);
        }
    }

    /* compiled from: BL */
    public static class GiftShow implements Parcelable {
        public static final Creator<GiftShow> CREATOR = new C20541();
        @JSONField(name = "img")
        public List<String> imgs;
        @JSONField(name = "interval")
        public int interval;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.LiveRoomBanner$GiftShow$1 */
        static class C20541 implements Creator<GiftShow> {
            C20541() {
            }

            public GiftShow createFromParcel(Parcel parcel) {
                return new GiftShow(parcel);
            }

            public GiftShow[] newArray(int i) {
                return new GiftShow[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected GiftShow(Parcel parcel) {
            this.imgs = parcel.createStringArrayList();
            this.interval = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.imgs);
            parcel.writeInt(this.interval);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class LiveSuperBanner implements Parcelable {
        public static final Creator<LiveSuperBanner> CREATOR = new C20551();
        @Nullable
        @JSONField(name = "button_jump_url")
        public String buttonJumpUrl;
        @Nullable
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "id")
        /* renamed from: id */
        public long f6009id;
        @Nullable
        @JSONField(name = "jump_url")
        public String jumpUrl;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.LiveRoomBanner$LiveSuperBanner$1 */
        static class C20551 implements Creator<LiveSuperBanner> {
            C20551() {
            }

            public LiveSuperBanner createFromParcel(Parcel parcel) {
                return new LiveSuperBanner(parcel);
            }

            public LiveSuperBanner[] newArray(int i) {
                return new LiveSuperBanner[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f6009id);
            parcel.writeString(this.cover);
            parcel.writeString(this.jumpUrl);
            parcel.writeString(this.buttonJumpUrl);
        }

        protected LiveSuperBanner(Parcel parcel) {
            this.f6009id = parcel.readLong();
            this.cover = parcel.readString();
            this.jumpUrl = parcel.readString();
            this.buttonJumpUrl = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class LolActivity implements Parcelable {
        public static final Creator<LolActivity> CREATOR = new C20561();
        @JSONField(name = "guess_cover")
        public String mGuessCoverUrl;
        @JSONField(name = "status")
        public int mStatus;
        @JSONField(name = "vote_cover")
        public String mVoteCoverUrl;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.LiveRoomBanner$LolActivity$1 */
        static class C20561 implements Creator<LolActivity> {
            C20561() {
            }

            public LolActivity createFromParcel(Parcel parcel) {
                return new LolActivity(parcel);
            }

            public LolActivity[] newArray(int i) {
                return new LolActivity[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mStatus);
            parcel.writeString(this.mVoteCoverUrl);
            parcel.writeString(this.mGuessCoverUrl);
        }

        protected LolActivity(Parcel parcel) {
            this.mStatus = parcel.readInt();
            this.mVoteCoverUrl = parcel.readString();
            this.mGuessCoverUrl = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.LiveRoomBanner$1 */
    static class C20571 implements Creator<LiveRoomBanner> {
        C20571() {
        }

        public LiveRoomBanner createFromParcel(Parcel parcel) {
            return new LiveRoomBanner(parcel);
        }

        public LiveRoomBanner[] newArray(int i) {
            return new LiveRoomBanner[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isLolActivityRoom() {
        return this.mLolActivity != null && this.mLolActivity.mStatus == 1;
    }

    protected LiveRoomBanner(Parcel parcel) {
        this.top = parcel.createTypedArrayList(BannerItem.CREATOR);
        this.bottom = parcel.createTypedArrayList(BannerItem.CREATOR);
        this.mLolActivity = (LolActivity) parcel.readParcelable(LolActivity.class.getClassLoader());
        this.inputBannerList = parcel.createTypedArrayList(BannerItem.CREATOR);
        this.superBanner = (LiveSuperBanner) parcel.readParcelable(LiveSuperBanner.class.getClassLoader());
        this.gift = (GiftShow) parcel.readParcelable(GiftShow.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.top);
        parcel.writeTypedList(this.bottom);
        parcel.writeParcelable(this.mLolActivity, i);
        parcel.writeTypedList(this.inputBannerList);
        parcel.writeParcelable(this.superBanner, i);
        parcel.writeParcelable(this.gift, i);
    }
}
