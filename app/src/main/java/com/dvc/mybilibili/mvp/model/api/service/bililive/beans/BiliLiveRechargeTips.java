package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.math.BigDecimal;





////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0016R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRechargeTips;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "bp", "Ljava/math/BigDecimal;", "bpCoupon", "needGold", "", "getNeedGold", "()I", "setNeedGold", "(I)V", "rechargeGold", "Ljava/lang/Integer;", "show", "describeContents", "writeToParcel", "", "flags", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRechargeTips implements Parcelable {
    public static final int ACTION_STOP = 1;
    @NotNull
    //@JvmField
    public static final Parcelable.Creator<BiliLiveRechargeTips> CREATOR = new BiliLiveRechargeTips$Companion$CREATOR$1();
    public static final Companion Companion = new Companion();
    public static final int FROM_GOLD = 1;
    public static final int FROM_SILVER = 2;
    @JSONField(name = "bp")
    @Nullable
    //@JvmField
    /* renamed from: bp */
    public BigDecimal f6000bp;
    @JSONField(name = "bpCoupon")
    @Nullable
    //@JvmField
    public BigDecimal bpCoupon;
    private int needGold;
    @JSONField(name = "rechargeGold")
    @Nullable
    //@JvmField
    public Integer rechargeGold;
    @JSONField(name = "show")
    @Nullable
    //@JvmField
    public Integer show;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRechargeTips$Companion;", "", "()V", "ACTION_STOP", "", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRechargeTips;", "FROM_GOLD", "FROM_SILVER", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
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

    public final int getNeedGold() {
        return this.needGold;
    }

    public final void setNeedGold(int i) {
        this.needGold = i;
    }

    public BiliLiveRechargeTips(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
//        this();
        this.show = Integer.valueOf(parcel.readInt());
        this.rechargeGold = Integer.valueOf(parcel.readInt());
        this.needGold = parcel.readInt();
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeValue(this.show);
        parcel.writeValue(this.rechargeGold);
        parcel.writeInt(this.needGold);
    }
}
