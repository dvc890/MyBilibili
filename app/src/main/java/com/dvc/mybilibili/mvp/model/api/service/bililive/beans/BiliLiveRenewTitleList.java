package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.List;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010'\u001a\u00020\u0013H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0013H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001e\u0010!\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001d\u00a8\u0006-"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "isShimmerTitle", "", "()Z", "setShimmerTitle", "(Z)V", "renewalCardList", "", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList$RenewalTitleCard;", "getRenewalCardList", "()Ljava/util/List;", "setRenewalCardList", "(Ljava/util/List;)V", "selectedCardRecordId", "", "getSelectedCardRecordId", "()I", "setSelectedCardRecordId", "(I)V", "titleExpireTime", "", "getTitleExpireTime", "()Ljava/lang/String;", "setTitleExpireTime", "(Ljava/lang/String;)V", "titleId", "getTitleId", "setTitleId", "titleName", "getTitleName", "setTitleName", "titleUrl", "getTitleUrl", "setTitleUrl", "describeContents", "writeToParcel", "", "flags", "CREATOR", "RenewalTitleCard", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRenewTitleList implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR();
    private boolean isShimmerTitle;
    @JSONField(name = "list")
    @Nullable
    private List<RenewalTitleCard> renewalCardList;
    private int selectedCardRecordId;
    @JSONField(name = "title_expire")
    @NotNull
    private String titleExpireTime;
    @JSONField(name = "title_id")
    @NotNull
    private String titleId;
    @JSONField(name = "title_name")
    @NotNull
    private String titleName;
    @NotNull
    private String titleUrl;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010!\u001a\u00020\u0007H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0007H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001e\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001e\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017\u00a8\u0006&"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList$RenewalTitleCard;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "cardId", "", "getCardId", "()I", "setCardId", "(I)V", "cardRecordId", "getCardRecordId", "setCardRecordId", "expireDay", "getExpireDay", "setExpireDay", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "num", "getNum", "setNum", "renewDuration", "getRenewDuration", "setRenewDuration", "url", "getUrl", "setUrl", "describeContents", "writeToParcel", "", "flags", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class RenewalTitleCard implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        @JSONField(name = "card_id")
        private int cardId;
        @JSONField(name = "card_record_id")
        private int cardRecordId;
        @JSONField(name = "expire_day")
        private int expireDay;
        @JSONField(name = "name")
        @NotNull
        private String name;
        @JSONField(name = "num")
        private int num;
        @JSONField(name = "duration")
        private int renewDuration;
        @JSONField(name = "img_url")
        @NotNull
        private String url;

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList$RenewalTitleCard$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList$RenewalTitleCard;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList$RenewalTitleCard;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class CREATOR implements Creator<RenewalTitleCard> {
            private CREATOR() {
            }

//            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }

            @NotNull
            public RenewalTitleCard createFromParcel(@NotNull Parcel parcel) {
    //            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                return new RenewalTitleCard(parcel);
            }

            @NotNull
            public RenewalTitleCard[] newArray(int i) {
                return new RenewalTitleCard[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public RenewalTitleCard() {
            this.name = "";
            this.url = "";
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final void setName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.name = str;
        }

        public final int getExpireDay() {
            return this.expireDay;
        }

        public final void setExpireDay(int i) {
            this.expireDay = i;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.url = str;
        }

        public final int getNum() {
            return this.num;
        }

        public final void setNum(int i) {
            this.num = i;
        }

        public final int getCardId() {
            return this.cardId;
        }

        public final void setCardId(int i) {
            this.cardId = i;
        }

        public final int getCardRecordId() {
            return this.cardRecordId;
        }

        public final void setCardRecordId(int i) {
            this.cardRecordId = i;
        }

        public final int getRenewDuration() {
            return this.renewDuration;
        }

        public final void setRenewDuration(int i) {
            this.renewDuration = i;
        }

        public RenewalTitleCard(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            this();
            String readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.name = readString;
            this.expireDay = parcel.readInt();
            readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.url = readString;
            this.num = parcel.readInt();
            this.cardId = parcel.readInt();
            this.cardRecordId = parcel.readInt();
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeString(this.name);
            parcel.writeInt(this.expireDay);
            parcel.writeString(this.url);
            parcel.writeInt(this.num);
            parcel.writeInt(this.cardId);
            parcel.writeInt(this.cardRecordId);
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewTitleList;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class CREATOR implements Creator<BiliLiveRenewTitleList> {
        private CREATOR() {
        }

//        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        public BiliLiveRenewTitleList createFromParcel(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new BiliLiveRenewTitleList(parcel);
        }

        @NotNull
        public BiliLiveRenewTitleList[] newArray(int i) {
            return new BiliLiveRenewTitleList[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BiliLiveRenewTitleList() {
        this.titleId = "";
        this.titleName = "";
        this.titleExpireTime = "";
        this.titleUrl = "";
    }

    @NotNull
    public final String getTitleId() {
        return this.titleId;
    }

    public final void setTitleId(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.titleId = str;
    }

    @NotNull
    public final String getTitleName() {
        return this.titleName;
    }

    public final void setTitleName(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.titleName = str;
    }

    @NotNull
    public final String getTitleExpireTime() {
        return this.titleExpireTime;
    }

    public final void setTitleExpireTime(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.titleExpireTime = str;
    }

    @Nullable
    public final List<RenewalTitleCard> getRenewalCardList() {
        return this.renewalCardList;
    }

    public final void setRenewalCardList(@Nullable List<RenewalTitleCard> list) {
        this.renewalCardList = list;
    }

    @NotNull
    public final String getTitleUrl() {
        return this.titleUrl;
    }

    public final void setTitleUrl(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.titleUrl = str;
    }

    public final boolean isShimmerTitle() {
        return this.isShimmerTitle;
    }

    public final void setShimmerTitle(boolean z) {
        this.isShimmerTitle = z;
    }

    public final int getSelectedCardRecordId() {
        return this.selectedCardRecordId;
    }

    public final void setSelectedCardRecordId(int i) {
        this.selectedCardRecordId = i;
    }

    public BiliLiveRenewTitleList(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this();
        String readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.titleId = readString;
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.titleName = readString;
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.titleExpireTime = readString;
        this.renewalCardList = parcel.createTypedArrayList(RenewalTitleCard.CREATOR);
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.titleUrl = readString;
        boolean z = false;
        if (parcel.readByte() != ((byte) 0)) {
            z = true;
        }
        this.isShimmerTitle = z;
        this.selectedCardRecordId = parcel.readInt();
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.titleId);
        parcel.writeString(this.titleName);
        parcel.writeString(this.titleExpireTime);
        parcel.writeTypedList(this.renewalCardList);
        parcel.writeString(this.titleUrl);
        parcel.writeByte((byte) (this.isShimmerTitle?1:0));
        parcel.writeInt(this.selectedCardRecordId);
    }
}
