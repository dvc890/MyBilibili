package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
@SuppressLint({"ParcelCreator"})
////@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiUserRating;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "lastEpId", "", "(I)V", "getLastEpId", "()I", "setLastEpId", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BangumiUserRating implements Parcelable {
    public static final C1896a CREATOR = new C1896a();
    private int lastEpId;

    ////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiUserRating$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bangumi/api/uniform/BangumiUserRating;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bangumi/api/uniform/BangumiUserRating;", "bangumi_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUserRating$a */
    public static final class C1896a implements Creator<BangumiUserRating> {
        private C1896a() {
        }

//        public /* synthetic */ C1896a(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        /* renamed from: a */
        public BangumiUserRating createFromParcel(@NotNull Parcel parcel) {
           //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new BangumiUserRating(parcel);
        }

        @NotNull
        /* renamed from: a */
        public BangumiUserRating[] newArray(int i) {
            return new BangumiUserRating[i];
        }
    }

    public BangumiUserRating() {
        this(0, 1);
    }

    @NotNull
    public static /* synthetic */ BangumiUserRating copy$default(BangumiUserRating bangumiUserRating, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bangumiUserRating.lastEpId;
        }
        return bangumiUserRating.copy(i);
    }

    public final int component1() {
        return this.lastEpId;
    }

    @NotNull
    public final BangumiUserRating copy(@JSONField(name = "short_review") int i) {
        return new BangumiUserRating(i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BangumiUserRating) {
            if ((this.lastEpId == ((BangumiUserRating) obj).lastEpId ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.lastEpId;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiUserRating(lastEpId=");
        stringBuilder.append(this.lastEpId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BangumiUserRating(@JSONField(name = "short_review") int i) {
        this.lastEpId = i;
    }

    public /* synthetic */ BangumiUserRating(int i, int i2) {

        this((i2 & 1) != 0?0:i);
    }

    public final int getLastEpId() {
        return this.lastEpId;
    }

    public final void setLastEpId(int i) {
        this.lastEpId = i;
    }

    public BangumiUserRating(@NotNull Parcel parcel) {
       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this(parcel.readInt());
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.lastEpId);
    }
}
