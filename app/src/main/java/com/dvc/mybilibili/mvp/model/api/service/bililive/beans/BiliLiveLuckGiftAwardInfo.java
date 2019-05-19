package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;





@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveLuckGiftAwardInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "coin", "", "endTime", "giftIcon", "giftName", "rate", "", "startTime", "type", "uid", "describeContents", "writeToParcel", "", "flags", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveLuckGiftAwardInfo implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR();
    @JSONField(name = "coin")
    @NotNull
    //@JvmField
    public String coin;
    @JSONField(name = "end_time")
    @NotNull
    //@JvmField
    public String endTime;
    @JSONField(name = "gift_icon")
    @NotNull
    //@JvmField
    public String giftIcon;
    @JSONField(name = "gift_name")
    @NotNull
    //@JvmField
    public String giftName;
    @JSONField(name = "rate")
    //@JvmField
    public int rate;
    @JSONField(name = "start_time")
    @NotNull
    //@JvmField
    public String startTime;
    @JSONField(name = "type")
    //@JvmField
    public int type;
    @JSONField(name = "uid")
    //@JvmField
    public int uid;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveLuckGiftAwardInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveLuckGiftAwardInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveLuckGiftAwardInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class CREATOR implements Creator<BiliLiveLuckGiftAwardInfo> {
        private CREATOR() {
        }

//        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        public BiliLiveLuckGiftAwardInfo createFromParcel(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new BiliLiveLuckGiftAwardInfo(parcel);
        }

        @NotNull
        public BiliLiveLuckGiftAwardInfo[] newArray(int i) {
            return new BiliLiveLuckGiftAwardInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BiliLiveLuckGiftAwardInfo() {
        this.giftName = "";
        this.coin = "0";
        this.giftIcon = "";
        this.rate = 1;
        this.startTime = "";
        this.endTime = "";
    }

    public BiliLiveLuckGiftAwardInfo(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this();
        this.type = parcel.readInt();
        this.uid = parcel.readInt();
        String readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.giftName = readString;
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.coin = readString;
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.giftIcon = readString;
        this.rate = parcel.readInt();
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.startTime = readString;
        String readString2 = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString2, "parcel.readString()");
        this.endTime = readString2;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeInt(this.uid);
        parcel.writeString(this.giftName);
        parcel.writeString(this.coin);
        parcel.writeString(this.giftIcon);
        parcel.writeInt(this.rate);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
    }
}
