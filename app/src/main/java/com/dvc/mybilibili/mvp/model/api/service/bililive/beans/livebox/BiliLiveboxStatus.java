package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livebox;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;





////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveboxStatus;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "activityId", "", "activityPic", "", "currentRound", "roundList", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxRoundInfo;", "Lkotlin/collections/ArrayList;", "rule", "title", "describeContents", "writeToParcel", "", "flags", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveboxStatus implements Parcelable {
    @NotNull
    //@JvmField
    public static Parcelable.Creator<BiliLiveboxStatus> CREATOR = new BiliLiveboxStatus$Companion$CREATOR$1();
    public static final Companion Companion = new Companion();
    @JSONField(name = "activity_id")
    //@JvmField
    public int activityId;
    @JSONField(name = "activity_pic")
    @NotNull
    //@JvmField
    public String activityPic;
    @JSONField(name = "current_round")
    //@JvmField
    public int currentRound;
    @JSONField(name = "typeB")
    @Nullable
    //@JvmField
    public ArrayList<BiliLiveBoxRoundInfo> roundList;
    @JSONField(name = "rule")
    @NotNull
    //@JvmField
    public String rule;
    @JSONField(name = "title")
    @NotNull
    //@JvmField
    public String title;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveboxStatus$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveboxStatus;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
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

    public BiliLiveboxStatus() {
        this.title = "";
        this.rule = "";
        this.activityPic = "";
    }

    public BiliLiveboxStatus(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this();
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.title = readString;
        readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.rule = readString;
        readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.activityPic = readString;
        this.currentRound = parcel.readInt();
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.rule);
        parcel.writeString(this.activityPic);
        parcel.writeInt(this.currentRound);
    }
}
