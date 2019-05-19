package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livebox;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;





////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxAwards;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "exText", "", "jpId", "jpName", "jpNum", "jpType", "", "describeContents", "writeToParcel", "", "flags", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveBoxAwards implements Parcelable {
    @NotNull
    //@JvmField
    public static Parcelable.Creator<BiliLiveBoxAwards> CREATOR = new BiliLiveBoxAwards$Companion$CREATOR$1();
    public static final Companion Companion = new Companion();
    @JSONField(name = "ex_text")
    @NotNull
    //@JvmField
    public String exText;
    @JSONField(name = "jp_id")
    @NotNull
    //@JvmField
    public String jpId;
    @JSONField(name = "jp_name")
    @NotNull
    //@JvmField
    public String jpName;
    @JSONField(name = "jp_num")
    @NotNull
    //@JvmField
    public String jpNum;
    @JSONField(name = "jp_type")
    //@JvmField
    public int jpType;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxAwards$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxAwards;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
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

    public BiliLiveBoxAwards() {
        this.jpName = "";
        this.jpNum = "";
        this.jpId = "";
        this.exText = "";
    }

    public BiliLiveBoxAwards(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this();
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.jpName = readString;
        readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.jpNum = readString;
        readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.jpId = readString;
        this.jpType = parcel.readInt();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.exText = readString2;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.jpName);
        parcel.writeString(this.jpNum);
        parcel.writeString(this.jpId);
        parcel.writeInt(this.jpType);
        parcel.writeString(this.exText);
    }
}
