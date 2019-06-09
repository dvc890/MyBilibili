package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;





@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0005\u0019\u001a\u001b\u001c\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0013H\u0016R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "bottom", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$BannerItem;", "gift", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$GiftShow;", "inputBannerList", "", "lolActivity", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LolActivity;", "superBanner", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LiveSuperBanner;", "top", "describeContents", "", "isLolActivityRoom", "", "writeToParcel", "", "flags", "BannerItem", "CREATOR", "GiftShow", "LiveSuperBanner", "LolActivity", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomBanner implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR();
    @JSONField(name = "bottom")
    @Nullable
    //@JvmField
    public ArrayList<BannerItem> bottom;
    @JSONField(name = "gift_banner")
    @Nullable
    //@JvmField
    public GiftShow gift;
    @JSONField(name = "inputBanner")
    @Nullable
    //@JvmField
    public List<BannerItem> inputBannerList;
    @JSONField(name = "lol_activity")
    @Nullable
    //@JvmField
    public LolActivity lolActivity;
    @JSONField(name = "superBanner")
    @Nullable
    //@JvmField
    public LiveSuperBanner superBanner;
    @JSONField(name = "top")
    @Nullable
    //@JvmField
    public ArrayList<BannerItem> top;

    public BiliLiveRoomBanner() {
    }

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u000bH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$BannerItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "activityTitle", "", "color", "cover", "expireHour", "", "giftColor", "giftImg", "hasCloseIcon", "id", "jumpUrl", "position", "getPosition", "()I", "setPosition", "(I)V", "rank", "rankColor", "rankName", "textColor", "title", "type", "describeContents", "writeToParcel", "", "flags", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class BannerItem implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        @JSONField(name = "activity_title")
        @NotNull
        //@JvmField
        public String activityTitle;
        @JSONField(name = "color")
        @NotNull
        //@JvmField
        public String color;
        @JSONField(name = "cover")
        @NotNull
        //@JvmField
        public String cover;
        @JSONField(name = "expire_hour")
        //@JvmField
        public int expireHour;
        @JSONField(name = "week_gift_color")
        @NotNull
        //@JvmField
        public String giftColor;
        @JSONField(name = "gift_img")
        @NotNull
        //@JvmField
        public String giftImg;
        @JSONField(name = "is_close")
        //@JvmField
        public int hasCloseIcon;
        @JSONField(name = "id")
        //@JvmField
        /* renamed from: id */
        public int f6011id;
        @JSONField(name = "jump_url")
        @NotNull
        //@JvmField
        public String jumpUrl;
        private int position;
        @JSONField(name = "rank")
        @NotNull
        //@JvmField
        public String rank;
        @JSONField(name = "week_rank_color")
        @NotNull
        //@JvmField
        public String rankColor;
        @JSONField(name = "rank_name")
        @NotNull
        //@JvmField
        public String rankName;
        @JSONField(name = "week_text_color")
        @NotNull
        //@JvmField
        public String textColor;
        @JSONField(name = "title")
        @NotNull
        //@JvmField
        public String title;
        @JSONField(name = "type")
        //@JvmField
        public int type;

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$BannerItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$BannerItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$BannerItem;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class CREATOR implements Creator<BannerItem> {
            private CREATOR() {
            }

//            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }

            @NotNull
            public BannerItem createFromParcel(@NotNull Parcel parcel) {
    //            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                return new BannerItem(parcel);
            }

            @NotNull
            public BannerItem[] newArray(int i) {
                return new BannerItem[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public BannerItem() {
            this.title = "";
            this.activityTitle = "";
            this.rank = "";
            this.cover = "";
            this.jumpUrl = "";
            this.color = "";
            this.rankName = "";
            this.giftImg = "";
            this.giftColor = "";
            this.textColor = "";
            this.rankColor = "";
        }

        public final int getPosition() {
            return this.position;
        }

        public final void setPosition(int i) {
            this.position = i;
        }

        public BannerItem(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            this();
            this.f6011id = parcel.readInt();
            String readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.title = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.activityTitle = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.rank = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.cover = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.jumpUrl = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.color = readString;
            this.expireHour = parcel.readInt();
            this.hasCloseIcon = parcel.readInt();
            this.type = parcel.readInt();
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.rankName = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.giftImg = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.giftColor = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.textColor = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.rankColor = readString;
            this.position = parcel.readInt();
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeInt(this.f6011id);
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

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$GiftShow;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "imgs", "", "", "interval", "", "describeContents", "writeToParcel", "", "flags", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class GiftShow implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        @JSONField(name = "img")
        @Nullable
        //@JvmField
        public List<String> imgs;
        @JSONField(name = "interval")
        //@JvmField
        public int interval;

        public GiftShow() {
        }

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$GiftShow$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$GiftShow;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$GiftShow;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class CREATOR implements Creator<GiftShow> {
            private CREATOR() {
            }

//            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }

            @NotNull
            public GiftShow createFromParcel(@NotNull Parcel parcel) {
    //            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                return new GiftShow(parcel);
            }

            @NotNull
            public GiftShow[] newArray(int i) {
                return new GiftShow[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public GiftShow(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
//            this();
            this.imgs = parcel.createStringArrayList();
            this.interval = parcel.readInt();
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeStringList(this.imgs);
            parcel.writeInt(this.interval);
        }
    }

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LiveSuperBanner;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "buttonJumpUrl", "", "cover", "id", "", "jumpUrl", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class LiveSuperBanner implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        @JSONField(name = "button_jump_url")
        @Nullable
        //@JvmField
        public String buttonJumpUrl;
        @JSONField(name = "cover")
        @Nullable
        //@JvmField
        public String cover;
        @JSONField(name = "id")
        //@JvmField
        /* renamed from: id */
        public long f6012id;
        @JSONField(name = "jump_url")
        @Nullable
        //@JvmField
        public String jumpUrl;

        public LiveSuperBanner() {
        }

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LiveSuperBanner$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LiveSuperBanner;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LiveSuperBanner;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class CREATOR implements Creator<LiveSuperBanner> {
            private CREATOR() {
            }

//            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }

            @NotNull
            public LiveSuperBanner createFromParcel(@NotNull Parcel parcel) {
    //            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                return new LiveSuperBanner(parcel);
            }

            @NotNull
            public LiveSuperBanner[] newArray(int i) {
                return new LiveSuperBanner[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public LiveSuperBanner(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
//            this();
            this.f6012id = parcel.readLong();
            this.cover = parcel.readString();
            this.jumpUrl = parcel.readString();
            this.buttonJumpUrl = parcel.readString();
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeLong(this.f6012id);
            parcel.writeString(this.cover);
            parcel.writeString(this.jumpUrl);
            parcel.writeString(this.buttonJumpUrl);
        }
    }

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LolActivity;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "guessCoverUrl", "", "status", "", "voteCoverUrl", "describeContents", "writeToParcel", "", "flags", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class LolActivity implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        @JSONField(name = "guess_cover")
        @NotNull
        //@JvmField
        public String guessCoverUrl;
        @JSONField(name = "status")
        //@JvmField
        public int status;
        @JSONField(name = "vote_cover")
        @NotNull
        //@JvmField
        public String voteCoverUrl;

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LolActivity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LolActivity;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$LolActivity;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class CREATOR implements Creator<LolActivity> {
            private CREATOR() {
            }

//            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }

            @NotNull
            public LolActivity createFromParcel(@NotNull Parcel parcel) {
    //            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                return new LolActivity(parcel);
            }

            @NotNull
            public LolActivity[] newArray(int i) {
                return new LolActivity[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public LolActivity() {
            this.voteCoverUrl = "";
            this.guessCoverUrl = "";
        }

        public LolActivity(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            this();
            this.status = parcel.readInt();
            String readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.voteCoverUrl = readString;
            String readString2 = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString2, "parcel.readString()");
            this.guessCoverUrl = readString2;
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeInt(this.status);
            parcel.writeString(this.voteCoverUrl);
            parcel.writeString(this.guessCoverUrl);
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomBanner;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class CREATOR implements Creator<BiliLiveRoomBanner> {
        private CREATOR() {
        }

//        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        public BiliLiveRoomBanner createFromParcel(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new BiliLiveRoomBanner(parcel);
        }

        @NotNull
        public BiliLiveRoomBanner[] newArray(int i) {
            return new BiliLiveRoomBanner[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BiliLiveRoomBanner(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
//        this();
        this.lolActivity = (LolActivity) parcel.readParcelable(LolActivity.class.getClassLoader());
        this.inputBannerList = parcel.createTypedArrayList(BannerItem.CREATOR);
        this.superBanner = (LiveSuperBanner) parcel.readParcelable(LiveSuperBanner.class.getClassLoader());
        this.gift = (GiftShow) parcel.readParcelable(GiftShow.class.getClassLoader());
    }

    public final boolean isLolActivityRoom() {
        LolActivity lolActivity = this.lolActivity;
        return lolActivity != null && lolActivity.status == 1;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeParcelable(this.lolActivity, i);
        parcel.writeTypedList(this.inputBannerList);
        parcel.writeParcelable(this.superBanner, i);
        parcel.writeParcelable(this.gift, i);
    }
}
