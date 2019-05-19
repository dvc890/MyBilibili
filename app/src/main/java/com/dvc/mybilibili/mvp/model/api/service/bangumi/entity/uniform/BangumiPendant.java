package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
@SuppressLint({"ParcelCreator"})
////@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B)\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0017H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\u00a8\u0006\""}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiPendant;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "pid", "", "name", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "getName", "setName", "getPid", "setPid", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BangumiPendant implements Parcelable {
    public static final C4760a CREATOR = new C4760a();
    @Nullable
    private String image;
    @Nullable
    private String name;
    @Nullable
    private String pid;

    ////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiPendant$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bangumi/api/uniform/BangumiPendant;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bangumi/api/uniform/BangumiPendant;", "bangumi_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiPendant$a */
    public static final class C4760a implements Creator<BangumiPendant> {
        private C4760a() {
        }

//        public /* synthetic */ C4760a(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        /* renamed from: a */
        public BangumiPendant createFromParcel(@NotNull Parcel parcel) {
           //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new BangumiPendant(parcel);
        }

        @NotNull
        /* renamed from: a */
        public BangumiPendant[] newArray(int i) {
            return new BangumiPendant[i];
        }
    }

    public BangumiPendant() {
        this(null, null, null, 7);
    }

    @NotNull
    public static /* synthetic */ BangumiPendant copy$default(BangumiPendant bangumiPendant, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bangumiPendant.pid;
        }
        if ((i & 2) != 0) {
            str2 = bangumiPendant.name;
        }
        if ((i & 4) != 0) {
            str3 = bangumiPendant.image;
        }
        return bangumiPendant.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.pid;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.image;
    }

    @NotNull
    public final BangumiPendant copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new BangumiPendant(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.image, r3.image) != false) goto L_0x0029;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.api.uniform.BangumiPendant;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.bilibili.bangumi.api.uniform.BangumiPendant) r3;
        r0 = r2.pid;
        r1 = r3.pid;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.name;
        r1 = r3.name;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.image;
        r3 = r3.image;
        r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.api.uniform.BangumiPendant.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.pid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.image;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiPendant(pid=");
        stringBuilder.append(this.pid);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BangumiPendant(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.pid = str;
        this.name = str2;
        this.image = str3;
    }

    public /* synthetic */ BangumiPendant(String str, String str2, String str3, int i) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getPid() {
        return this.pid;
    }

    public final void setPid(@Nullable String str) {
        this.pid = str;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public BangumiPendant(@NotNull Parcel parcel) {
       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this(parcel.readString(), parcel.readString(), parcel.readString());
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.pid);
        parcel.writeString(this.name);
        parcel.writeString(this.image);
    }
}
