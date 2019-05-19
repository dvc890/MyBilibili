package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.List;





@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\tH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomTabInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "defaultSubTabType", "", "defaultTab", "", "desc", "order", "status", "subTabs", "", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomTabInfo$LiveSubTabInfo;", "type", "url", "describeContents", "writeToParcel", "", "flags", "Companion", "LiveSubTabInfo", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomTabInfo implements Parcelable {
    @NotNull
    //@JvmField
    public static Parcelable.Creator<BiliLiveRoomTabInfo> CREATOR = new BiliLiveRoomTabInfo$Companion$CREATOR$1();
    public static final Companion Companion = new Companion();
    @NotNull
    private static final String TAB_COMMENT = "comment";
    @NotNull
    private static final String TAB_GIFT_RANK = "gift-rank";
    @NotNull
    private static final String TAB_GOLD_RANK = "gold-rank";
    @NotNull
    private static final String TAB_GUARD = "guard";
    @NotNull
    private static final String TAB_HISTORY = "view-history";
    @NotNull
    private static final String TAB_INTERACTION = "interaction";
    @NotNull
    private static final String TAB_LOVE_CLUB = "love-club";
    @NotNull
    private static final String TAB_MORE_HISTORY = "view-history-sub";
    @NotNull
    private static final String TAB_MORE_RECOMMEND = "more-live";
    @NotNull
    private static final String TAB_MORE_RELATIVE_RECOMMEND = "relative-recommend";
    @NotNull
    private static final String TAB_RANK = "contribution-rank";
    @NotNull
    private static final String TAB_RANK_ACTIVITY = "event-rank";
    @NotNull
    private static final String TAB_RANK_FANS = "fans-rank";
    @NotNull
    private static final String TAB_RANK_SEVEN = "seven-rank";
    @NotNull
    private static final String TAB_RANK_TODAY = "today-rank";
    private static final int TAB_STATUS_DISPLAY = 1;
    private static final int TAB_STATUS_UNDISPLAY = 0;
    @NotNull
    private static final String TAB_UP = "up-tab";
    @NotNull
    private static final String TAB_UP_DYNAMIC = "dynamic";
    @JSONField(name = "default_sub_tab")
    @NotNull
    //@JvmField
    public String defaultSubTabType;
    @JSONField(name = "default")
    //@JvmField
    public int defaultTab;
    @JSONField(name = "desc")
    @NotNull
    //@JvmField
    public String desc;
    @JSONField(name = "order")
    //@JvmField
    public int order;
    @JSONField(name = "status")
    //@JvmField
    public int status;
    @JSONField(name = "sub_tab")
    @Nullable
    //@JvmField
    public List<LiveSubTabInfo> subTabs;
    @JSONField(name = "type")
    @NotNull
    //@JvmField
    public String type;
    @JSONField(name = "url")
    @NotNull
    //@JvmField
    public String url;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000bH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomTabInfo$LiveSubTabInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "defaultSubTabType", "", "desc", "document", "order", "", "rankName", "status", "subTabs", "", "type", "url", "describeContents", "writeToParcel", "", "flags", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class LiveSubTabInfo implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        @JSONField(name = "default_sub_tab")
        @NotNull
        //@JvmField
        public String defaultSubTabType;
        @JSONField(name = "desc")
        @NotNull
        //@JvmField
        public String desc;
        @JSONField(name = "documents")
        @NotNull
        //@JvmField
        public String document;
        @JSONField(name = "order")
        //@JvmField
        public int order;
        @JSONField(name = "rank_name")
        @NotNull
        //@JvmField
        public String rankName;
        @JSONField(name = "status")
        //@JvmField
        public int status;
        @JSONField(name = "grand_tab")
        @Nullable
        //@JvmField
        public List<LiveSubTabInfo> subTabs;
        @JSONField(name = "type")
        @NotNull
        //@JvmField
        public String type;
        @JSONField(name = "url")
        @NotNull
        //@JvmField
        public String url;

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomTabInfo$LiveSubTabInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomTabInfo$LiveSubTabInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomTabInfo$LiveSubTabInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class CREATOR implements Creator<LiveSubTabInfo> {
            private CREATOR() {
            }

//            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }

            @NotNull
            public LiveSubTabInfo createFromParcel(@NotNull Parcel parcel) {
    //            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                return new LiveSubTabInfo(parcel);
            }

            @NotNull
            public LiveSubTabInfo[] newArray(int i) {
                return new LiveSubTabInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public LiveSubTabInfo() {
            this.type = "";
            this.desc = "";
            this.url = "";
            this.document = "";
            this.rankName = "";
            this.defaultSubTabType = "";
        }

        public LiveSubTabInfo(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            this();
            String readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.type = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.desc = readString;
            this.status = parcel.readInt();
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.url = readString;
            this.order = parcel.readInt();
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.document = readString;
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.rankName = readString;
            this.subTabs = parcel.createTypedArrayList(CREATOR);
            String readString2 = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString2, "parcel.readString()");
            this.defaultSubTabType = readString2;
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeString(this.type);
            parcel.writeString(this.desc);
            parcel.writeInt(this.status);
            parcel.writeString(this.url);
            parcel.writeInt(this.order);
            parcel.writeString(this.document);
            parcel.writeString(this.rankName);
            parcel.writeTypedList(this.subTabs);
            parcel.writeString(this.defaultSubTabType);
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0014\u0010\u001c\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u0014\u0010\u001e\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\tR\u0014\u0010\"\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\tR\u0014\u0010$\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\tR\u0014\u0010&\u001a\u00020'X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\tR\u0014\u0010.\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\t\u00a8\u00060"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomTabInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomTabInfo;", "TAB_COMMENT", "", "getTAB_COMMENT", "()Ljava/lang/String;", "TAB_GIFT_RANK", "getTAB_GIFT_RANK", "TAB_GOLD_RANK", "getTAB_GOLD_RANK", "TAB_GUARD", "getTAB_GUARD", "TAB_HISTORY", "getTAB_HISTORY", "TAB_INTERACTION", "getTAB_INTERACTION", "TAB_LOVE_CLUB", "getTAB_LOVE_CLUB", "TAB_MORE_HISTORY", "getTAB_MORE_HISTORY", "TAB_MORE_RECOMMEND", "getTAB_MORE_RECOMMEND", "TAB_MORE_RELATIVE_RECOMMEND", "getTAB_MORE_RELATIVE_RECOMMEND", "TAB_RANK", "getTAB_RANK", "TAB_RANK_ACTIVITY", "getTAB_RANK_ACTIVITY", "TAB_RANK_FANS", "getTAB_RANK_FANS", "TAB_RANK_SEVEN", "getTAB_RANK_SEVEN", "TAB_RANK_TODAY", "getTAB_RANK_TODAY", "TAB_STATUS_DISPLAY", "", "getTAB_STATUS_DISPLAY", "()I", "TAB_STATUS_UNDISPLAY", "getTAB_STATUS_UNDISPLAY", "TAB_UP", "getTAB_UP", "TAB_UP_DYNAMIC", "getTAB_UP_DYNAMIC", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
        private Companion() {
        }

//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        public final String getTAB_INTERACTION() {
            return BiliLiveRoomTabInfo.TAB_INTERACTION;
        }

        @NotNull
        public final String getTAB_UP() {
            return BiliLiveRoomTabInfo.TAB_UP;
        }

        @NotNull
        public final String getTAB_RANK() {
            return BiliLiveRoomTabInfo.TAB_RANK;
        }

        @NotNull
        public final String getTAB_GUARD() {
            return BiliLiveRoomTabInfo.TAB_GUARD;
        }

        @NotNull
        public final String getTAB_HISTORY() {
            return BiliLiveRoomTabInfo.TAB_HISTORY;
        }

        @NotNull
        public final String getTAB_MORE_RECOMMEND() {
            return BiliLiveRoomTabInfo.TAB_MORE_RECOMMEND;
        }

        @NotNull
        public final String getTAB_LOVE_CLUB() {
            return BiliLiveRoomTabInfo.TAB_LOVE_CLUB;
        }

        @NotNull
        public final String getTAB_COMMENT() {
            return BiliLiveRoomTabInfo.TAB_COMMENT;
        }

        @NotNull
        public final String getTAB_RANK_TODAY() {
            return BiliLiveRoomTabInfo.TAB_RANK_TODAY;
        }

        @NotNull
        public final String getTAB_RANK_SEVEN() {
            return BiliLiveRoomTabInfo.TAB_RANK_SEVEN;
        }

        @NotNull
        public final String getTAB_RANK_FANS() {
            return BiliLiveRoomTabInfo.TAB_RANK_FANS;
        }

        @NotNull
        public final String getTAB_RANK_ACTIVITY() {
            return BiliLiveRoomTabInfo.TAB_RANK_ACTIVITY;
        }

        @NotNull
        public final String getTAB_MORE_RELATIVE_RECOMMEND() {
            return BiliLiveRoomTabInfo.TAB_MORE_RELATIVE_RECOMMEND;
        }

        @NotNull
        public final String getTAB_MORE_HISTORY() {
            return BiliLiveRoomTabInfo.TAB_MORE_HISTORY;
        }

        @NotNull
        public final String getTAB_GIFT_RANK() {
            return BiliLiveRoomTabInfo.TAB_GIFT_RANK;
        }

        @NotNull
        public final String getTAB_GOLD_RANK() {
            return BiliLiveRoomTabInfo.TAB_GOLD_RANK;
        }

        @NotNull
        public final String getTAB_UP_DYNAMIC() {
            return BiliLiveRoomTabInfo.TAB_UP_DYNAMIC;
        }

        public final int getTAB_STATUS_DISPLAY() {
            return BiliLiveRoomTabInfo.TAB_STATUS_DISPLAY;
        }

        public final int getTAB_STATUS_UNDISPLAY() {
            return BiliLiveRoomTabInfo.TAB_STATUS_UNDISPLAY;
        }
    }

    public int describeContents() {
        return 0;
    }

    public BiliLiveRoomTabInfo() {
        this.type = "";
        this.desc = "";
        this.url = "";
        this.defaultSubTabType = "";
    }

    public BiliLiveRoomTabInfo(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this();
        String readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.type = readString;
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.desc = readString;
        this.status = parcel.readInt();
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.url = readString;
        this.order = parcel.readInt();
        this.defaultTab = parcel.readInt();
        this.subTabs = parcel.createTypedArrayList(LiveSubTabInfo.CREATOR);
        String readString2 = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString2, "parcel.readString()");
        this.defaultSubTabType = readString2;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.type);
        parcel.writeString(this.desc);
        parcel.writeInt(this.status);
        parcel.writeString(this.url);
        parcel.writeInt(this.order);
        parcel.writeInt(this.defaultTab);
        parcel.writeTypedList(this.subTabs);
        parcel.writeString(this.defaultSubTabType);
    }
}
