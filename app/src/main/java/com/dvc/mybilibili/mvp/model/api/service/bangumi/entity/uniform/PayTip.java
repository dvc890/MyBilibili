package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
@SuppressLint({"ParcelCreator"})
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0016H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/bilibili/bangumi/api/uniform/PayTip;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "primary", "Lcom/bilibili/bangumi/api/uniform/PrimaryTip;", "link", "Lcom/bilibili/bangumi/api/uniform/TipLink;", "(Lcom/bilibili/bangumi/api/uniform/PrimaryTip;Lcom/bilibili/bangumi/api/uniform/TipLink;)V", "getLink", "()Lcom/bilibili/bangumi/api/uniform/TipLink;", "setLink", "(Lcom/bilibili/bangumi/api/uniform/TipLink;)V", "getPrimary", "()Lcom/bilibili/bangumi/api/uniform/PrimaryTip;", "setPrimary", "(Lcom/bilibili/bangumi/api/uniform/PrimaryTip;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class PayTip implements Parcelable {
    public static final C4761a CREATOR = new C4761a();
    @Nullable
    private TipLink link;
    @Nullable
    private PrimaryTip primary;

    ////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/PayTip$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bangumi/api/uniform/PayTip;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bangumi/api/uniform/PayTip;", "bangumi_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.PayTip$a */
    public static final class C4761a implements Creator<PayTip> {
        private C4761a() {
        }

//        public /* synthetic */ C4761a(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        /* renamed from: a */
        public PayTip createFromParcel(@NotNull Parcel parcel) {
//           //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new PayTip(parcel);
        }

        @NotNull
        /* renamed from: a */
        public PayTip[] newArray(int i) {
            return new PayTip[i];
        }
    }

    public PayTip() {
        this(null, null, 3);
    }

    @NotNull
    public static /* synthetic */ PayTip copy$default(PayTip payTip, PrimaryTip primaryTip, TipLink tipLink, int i, Object obj) {
        if ((i & 1) != 0) {
            primaryTip = payTip.primary;
        }
        if ((i & 2) != 0) {
            tipLink = payTip.link;
        }
        return payTip.copy(primaryTip, tipLink);
    }

    @Nullable
    public final PrimaryTip component1() {
        return this.primary;
    }

    @Nullable
    public final TipLink component2() {
        return this.link;
    }

    @NotNull
    public final PayTip copy(@Nullable PrimaryTip primaryTip, @Nullable TipLink tipLink) {
        return new PayTip(primaryTip, tipLink);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.link, r3.link) != false) goto L_0x001f;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.api.uniform.PayTip;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.bilibili.bangumi.api.uniform.PayTip) r3;
        r0 = r2.primary;
        r1 = r3.primary;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.link;
        r3 = r3.link;
        r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.api.uniform.PayTip.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        PrimaryTip primaryTip = this.primary;
        int i = 0;
        int hashCode = (primaryTip != null ? primaryTip.hashCode() : 0) * 31;
        TipLink tipLink = this.link;
        if (tipLink != null) {
            i = tipLink.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PayTip(primary=");
        stringBuilder.append(this.primary);
        stringBuilder.append(", link=");
        stringBuilder.append(this.link);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PayTip(@Nullable PrimaryTip primaryTip, @Nullable TipLink tipLink) {
        this.primary = primaryTip;
        this.link = tipLink;
    }

    public /* synthetic */ PayTip(PrimaryTip primaryTip, TipLink tipLink, int i) {
        this((i & 1) != 0?new PrimaryTip(null, null, null, null, 15):primaryTip,
                (i & 2) != 0?new TipLink(null, null, null, 7):tipLink);
    }

    @Nullable
    public final PrimaryTip getPrimary() {
        return this.primary;
    }

    public final void setPrimary(@Nullable PrimaryTip primaryTip) {
        this.primary = primaryTip;
    }

    @Nullable
    public final TipLink getLink() {
        return this.link;
    }

    public final void setLink(@Nullable TipLink tipLink) {
        this.link = tipLink;
    }

    public PayTip(@NotNull Parcel parcel) {
//       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this((PrimaryTip) parcel.readParcelable(PrimaryTip.class.getClassLoader()), (TipLink) parcel.readParcelable(TipLink.class.getClassLoader()));
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
//       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeParcelable(this.primary, i);
        parcel.writeParcelable(this.link, i);
    }
}
