//package com.dvc.mybilibili.mvp.model.api.service.net.beans;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//import android.support.annotation.Keep;
//
//import com.alibaba.fastjson.annotation.JSONField;
//
//import org.jetbrains.annotations.NotNull;
//
//
//
//
//
//@Keep
//////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0013H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveSilentPeriodInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "value", "", "getValue", "()F", "setValue", "(F)V", "describeContents", "", "writeToParcel", "", "flags", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
///* compiled from: BL */
//public final class BiliLiveSilentPeriodInfo implements Parcelable {
//    @NotNull
//    //@JvmField
//    public static final Parcelable.Creator<BiliLiveSilentPeriodInfo> CREATOR = new BiliLiveSilentPeriodInfo$Companion$CREATOR$1();
//    public static final Companion Companion = new Companion();
//    @JSONField(name = "title")
//    @NotNull
//    private String title;
//    @JSONField(name = "value")
//    private float value;
//
//    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveSilentPeriodInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveSilentPeriodInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
//    /* compiled from: BL */
//    public static final class Companion {
//        private Companion() {
//        }
//
//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }
//    }
//
//    public int describeContents() {
//        return 0;
//    }
//
//    public BiliLiveSilentPeriodInfo() {
//        this.title = "";
//    }
//
//    @NotNull
//    public final String getTitle() {
//        return this.title;
//    }
//
//    public final void setTitle(@NotNull String str) {
//        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//        this.title = str;
//    }
//
//    public final float getValue() {
//        return this.value;
//    }
//
//    public final void setValue(float f) {
//        this.value = f;
//    }
//
//    public BiliLiveSilentPeriodInfo(@NotNull Parcel parcel) {
//        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
//        this();
//        String readString = parcel.readString();
//        //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
//        this.title = readString;
//        this.value = parcel.readFloat();
//    }
//
//    public void writeToParcel(@NotNull Parcel parcel, int i) {
//        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
//        parcel.writeString(this.title);
//        parcel.writeFloat(this.value);
//    }
//}
