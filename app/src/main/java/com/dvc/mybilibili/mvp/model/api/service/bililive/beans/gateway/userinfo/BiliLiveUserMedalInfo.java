package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveUserCard.FansMedal;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;





@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0007H\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "count", "", "curWeared", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo$BiliLiveWear;", "isWeared", "", "upMedal", "describeContents", "getCardMedal", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveUserCard$FansMedal;", "getUpMedal", "writeToParcel", "", "flags", "BiliLiveWear", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveUserMedalInfo implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR();
    @JSONField(name = "cnt")
    //@JvmField
    public int count;
    @JSONField(name = "curr_weared")
    @Nullable
    //@JvmField
    public BiliLiveWear curWeared;
    @JSONField(name = "is_weared")
    //@JvmField
    public boolean isWeared;
    @JSONField(name = "up_medal")
    @Nullable
    //@JvmField
    public BiliLiveWear upMedal;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo$BiliLiveWear;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "level", "", "medalColor", "medalName", "", "targetId", "describeContents", "toString", "writeToParcel", "", "flags", "CREATOR", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class BiliLiveWear implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        @JSONField(name = "level")
        //@JvmField
        public int level;
        @JSONField(name = "medal_color")
        //@JvmField
        public int medalColor;
        @JSONField(name = "medal_name")
        @NotNull
        //@JvmField
        public String medalName;
        @JSONField(name = "target_id")
        //@JvmField
        public int targetId;

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo$BiliLiveWear$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo$BiliLiveWear;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo$BiliLiveWear;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class CREATOR implements Creator<BiliLiveWear> {
            private CREATOR() {
            }

//            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }

            @NotNull
            public BiliLiveWear createFromParcel(@NotNull Parcel parcel) {
    //            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                return new BiliLiveWear(parcel);
            }

            @NotNull
            public BiliLiveWear[] newArray(int i) {
                return new BiliLiveWear[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public BiliLiveWear() {
            this.medalName = "";
        }

        public BiliLiveWear(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            this();
            this.targetId = parcel.readInt();
            String readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.medalName = readString;
            this.level = parcel.readInt();
            this.medalColor = parcel.readInt();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{color=");
            stringBuilder.append(this.medalColor);
            stringBuilder.append(", name='");
            stringBuilder.append(this.medalName);
            stringBuilder.append("'");
            stringBuilder.append(", level=");
            stringBuilder.append(this.level);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeInt(this.targetId);
            parcel.writeString(this.medalName);
            parcel.writeInt(this.level);
            parcel.writeInt(this.medalColor);
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class CREATOR implements Creator<BiliLiveUserMedalInfo> {
        private CREATOR() {
        }

//        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        public BiliLiveUserMedalInfo createFromParcel(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new BiliLiveUserMedalInfo(parcel);
        }

        @NotNull
        public BiliLiveUserMedalInfo[] newArray(int i) {
            return new BiliLiveUserMedalInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BiliLiveUserMedalInfo(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
//        this();
        this.count = parcel.readInt();
        boolean z = false;
        if (parcel.readByte() != ((byte) 0)) {
            z = true;
        }
        this.isWeared = z;
        this.curWeared = (BiliLiveWear) parcel.readParcelable(BiliLiveWear.class.getClassLoader());
        this.upMedal = (BiliLiveWear) parcel.readParcelable(BiliLiveWear.class.getClassLoader());
    }

    @Nullable
    public final FansMedal getCardMedal() {
        BiliLiveWear biliLiveWear = this.curWeared;
        if (biliLiveWear == null) {
            return null;
        }
        FansMedal fansMedal = new FansMedal();
        fansMedal.mMedalId = biliLiveWear.targetId;
        fansMedal.mMedalName = biliLiveWear.medalName;
        fansMedal.mLevel = biliLiveWear.level;
        fansMedal.mMedalColor = biliLiveWear.medalColor;
        return fansMedal;
    }

    @Nullable
    public final FansMedal getUpMedal() {
        BiliLiveWear biliLiveWear = this.upMedal;
        if (biliLiveWear == null) {
            return null;
        }
        FansMedal fansMedal = new FansMedal();
        fansMedal.mMedalName = biliLiveWear.medalName;
        fansMedal.mLevel = biliLiveWear.level;
        fansMedal.mMedalColor = biliLiveWear.medalColor;
        return fansMedal;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.count);
        parcel.writeByte((byte) (this.isWeared?1:0));
        parcel.writeParcelable(this.curWeared, i);
        parcel.writeParcelable(this.upMedal, i);
    }
}
