package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livebox;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;





////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016R&\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "groups", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Group;", "Lkotlin/collections/ArrayList;", "winnerList", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Winner;", "describeContents", "", "writeToParcel", "", "flags", "Companion", "Group", "Winner", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveBoxWinnerInfo implements Parcelable {
    @NotNull
    //@JvmField
    public static Parcelable.Creator<BiliLiveBoxWinnerInfo> CREATOR = new BiliLiveBoxWinnerInfo$Companion$CREATOR$1();
    public static final Companion Companion = new Companion();
    @JSONField(name = "groups")
    @Nullable
    //@JvmField
    public ArrayList<Group> groups;
    @JSONField(name = "winnerList")
    @Nullable
    //@JvmField
    public ArrayList<Winner> winnerList;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Group;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "giftTitle", "", "uNameList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "describeContents", "", "writeToParcel", "", "flags", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Group implements Parcelable {
        @NotNull
        //@JvmField
//        public static Parcelable.Creator<Group> CREATOR = new BiliLiveBoxWinnerInfo$Group$Companion$CREATOR$1();
        public static final Companion Companion = new Companion();
        @JSONField(name = "giftTitle")
        @NotNull
        //@JvmField
        public String giftTitle;
        @JSONField(name = "list")
        @Nullable
        //@JvmField
        public ArrayList<String> uNameList;

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Group$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Group;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class Companion {
            private Companion() {
            }

//            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }
        }

        public static final Creator<Group> CREATOR = new Creator<Group>() {
            @Override
            public Group createFromParcel(Parcel in) {
                return new Group(in);
            }

            @Override
            public Group[] newArray(int size) {
                return new Group[size];
            }
        };

        public int describeContents() {
            return 0;
        }

        public Group() {
            this.giftTitle = "";
        }

        public Group(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            this();
            String readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.giftTitle = readString;
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeString(this.giftTitle);
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Winner;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "giftTitle", "", "uName", "uid", "", "describeContents", "", "writeToParcel", "", "flags", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Winner implements Parcelable {
        @NotNull
        //@JvmField
        public static Parcelable.Creator<Winner> CREATOR = new BiliLiveBoxWinnerInfo$Winner$Companion$CREATOR$1();
        public static final Companion Companion = new Companion();
        @JSONField(name = "giftTitle")
        @NotNull
        //@JvmField
        public String giftTitle;
        @JSONField(name = "uname")
        @NotNull
        //@JvmField
        public String uName;
        @JSONField(name = "uid")
        //@JvmField
        public long uid;

        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Winner$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Winner;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        public static final class Companion {
            private Companion() {
            }

//            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }
        }

        public int describeContents() {
            return 0;
        }

        public Winner() {
            this.uName = "";
            this.giftTitle = "";
        }

        public Winner(@NotNull Parcel parcel) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            this();
            this.uid = parcel.readLong();
            String readString = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString, "parcel.readString()");
            this.uName = readString;
            String readString2 = parcel.readString();
//            //Intrinsics.checkExpressionValueIsNotNull(readString2, "parcel.readString()");
            this.giftTitle = readString2;
        }

        public void writeToParcel(@NotNull Parcel parcel, int i) {
//            //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeLong(this.uid);
            parcel.writeString(this.uName);
            parcel.writeString(this.giftTitle);
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
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

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public BiliLiveBoxWinnerInfo(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
//        this();
    }
}
