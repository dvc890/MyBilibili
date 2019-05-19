package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;





@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomRankInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "color", "", "h5Url", "rankDesc", "timeStamp", "webUrl", "describeContents", "", "getH5UrlWithRankContainerField", "writeToParcel", "", "flags", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomRankInfo implements Parcelable {
    @NotNull
    //@JvmField
    public static final Parcelable.Creator<BiliLiveRoomRankInfo> CREATOR = new BiliLiveRoomRankInfo$Companion$CREATOR$1();
    public static final Companion Companion = new Companion();
    private static final String FIELD_IS_NEW_RANK_CONTAINER = "is_new_rank_container";
    @JSONField(name = "color")
    @NotNull
    //@JvmField
    public String color;
    @JSONField(name = "h5_url")
    @NotNull
    //@JvmField
    public String h5Url;
    @JSONField(name = "rank_desc")
    @NotNull
    //@JvmField
    public String rankDesc;
    @JSONField(name = "timestamp")
    @NotNull
    //@JvmField
    public String timeStamp;
    @JSONField(name = "web_url")
    @NotNull
    //@JvmField
    public String webUrl;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomRankInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomRankInfo;", "FIELD_IS_NEW_RANK_CONTAINER", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
        private Companion() {
        }

//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }
    }

    public int describeContents() {
        return 0;
    }

    public BiliLiveRoomRankInfo() {
        this.rankDesc = "";
        this.color = "";
        this.h5Url = "";
        this.webUrl = "";
        this.timeStamp = "";
    }

    public BiliLiveRoomRankInfo(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this();
        String readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.rankDesc = readString;
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.color = readString;
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.h5Url = readString;
        readString = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
        this.webUrl = readString;
        String readString2 = parcel.readString();
        //Intrinsics.checkExpressionValueIsNotNull(readString2, "parcel.readString()");
        this.timeStamp = readString2;
    }

    @NotNull
    public final String getH5UrlWithRankContainerField() {
        if (TextUtils.isEmpty(this.h5Url)) {
            return this.h5Url;
        }
        String builder = Uri.parse(this.h5Url).buildUpon().appendQueryParameter(FIELD_IS_NEW_RANK_CONTAINER, "1").toString();
        //Intrinsics.checkExpressionValueIsNotNull(builder, "Uri.parse(h5Url).buildUp\u2026ONTAINER, \"1\").toString()");
        return builder;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.rankDesc);
        parcel.writeString(this.color);
        parcel.writeString(this.h5Url);
        parcel.writeString(this.webUrl);
        parcel.writeString(this.timeStamp);
    }
}
