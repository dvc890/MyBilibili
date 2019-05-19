package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livebox;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;





////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R&\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxRoundInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "awardsList", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxAwards;", "Lkotlin/collections/ArrayList;", "imgUrl", "", "joinEndTime", "", "joinStartTime", "startTime", "status", "", "describeContents", "writeToParcel", "", "flags", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveBoxRoundInfo implements Parcelable {
    @NotNull
    //@JvmField
    public static Parcelable.Creator<BiliLiveBoxRoundInfo> CREATOR = new BiliLiveBoxRoundInfo$Companion$CREATOR$1();
    public static final Companion Companion = new Companion();
    @JSONField(name = "list")
    @Nullable
    //@JvmField
    public ArrayList<BiliLiveBoxAwards> awardsList;
    @JSONField(name = "imgUrl")
    @NotNull
    //@JvmField
    public String imgUrl;
    @JSONField(name = "join_end_time")
    //@JvmField
    public long joinEndTime;
    @JSONField(name = "join_start_time")
    //@JvmField
    public long joinStartTime;
    @JSONField(name = "startTime")
    @NotNull
    //@JvmField
    public String startTime;
    @JSONField(name = "status")
    //@JvmField
    public int status;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxRoundInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxRoundInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
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

    public BiliLiveBoxRoundInfo() {
        this.startTime = "";
        this.imgUrl = "";
    }

    public BiliLiveBoxRoundInfo(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this();
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.startTime = readString;
        readString = parcel.readString();
        if (readString == null) {
            readString = "'";
        }
        this.imgUrl = readString;
        this.joinStartTime = parcel.readLong();
        this.joinEndTime = parcel.readLong();
        this.status = parcel.readInt();
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.startTime);
        parcel.writeString(this.imgUrl);
        parcel.writeLong(this.joinStartTime);
        parcel.writeLong(this.joinEndTime);
        parcel.writeInt(this.status);
    }
}
