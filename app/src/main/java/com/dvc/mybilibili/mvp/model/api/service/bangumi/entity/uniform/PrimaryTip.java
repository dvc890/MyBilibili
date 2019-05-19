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
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B3\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J7\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u001eH\u00d6\u0001J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001eH\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/PrimaryTip;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "title", "", "subtitle", "url", "type", "Lcom/bilibili/bangumi/api/uniform/PrimaryNavType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bilibili/bangumi/api/uniform/PrimaryNavType;)V", "getSubtitle", "()Ljava/lang/String;", "setSubtitle", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getType", "()Lcom/bilibili/bangumi/api/uniform/PrimaryNavType;", "setType", "(Lcom/bilibili/bangumi/api/uniform/PrimaryNavType;)V", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class PrimaryTip implements Parcelable {
    public static final C1900a CREATOR = new C1900a();
    @JSONField(name = "sub_title")
    @Nullable
    private String subtitle;
    @Nullable
    private String title;
    @NotNull
    private PrimaryNavType type;
    @Nullable
    private String url;

    ////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/PrimaryTip$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bangumi/api/uniform/PrimaryTip;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bangumi/api/uniform/PrimaryTip;", "bangumi_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.PrimaryTip$a */
    public static final class C1900a implements Creator<PrimaryTip> {
        private C1900a() {
        }

//        public /* synthetic */ C1900a(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        /* renamed from: a */
        public PrimaryTip createFromParcel(@NotNull Parcel parcel) {
           //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new PrimaryTip(parcel);
        }

        @NotNull
        /* renamed from: a */
        public PrimaryTip[] newArray(int i) {
            return new PrimaryTip[i];
        }
    }

    public PrimaryTip() {
        this(null, null, null, null, 15);
    }

    @NotNull
    public static /* synthetic */ PrimaryTip copy$default(PrimaryTip primaryTip, String str, String str2, String str3, PrimaryNavType primaryNavType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primaryTip.title;
        }
        if ((i & 2) != 0) {
            str2 = primaryTip.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = primaryTip.url;
        }
        if ((i & 8) != 0) {
            primaryNavType = primaryTip.type;
        }
        return primaryTip.copy(str, str2, str3, primaryNavType);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.subtitle;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @NotNull
    public final PrimaryNavType component4() {
        return this.type;
    }

    @NotNull
    public final PrimaryTip copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull PrimaryNavType primaryNavType) {
       //Intrinsics.checkParameterIsNotNull(primaryNavType, "type");
        return new PrimaryTip(str, str2, str3, primaryNavType);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.type, r3.type) != false) goto L_0x0033;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.api.uniform.PrimaryTip;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.bilibili.bangumi.api.uniform.PrimaryTip) r3;
        r0 = r2.title;
        r1 = r3.title;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.subtitle;
        r1 = r3.subtitle;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.url;
        r1 = r3.url;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.type;
        r3 = r3.type;
        r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.api.uniform.PrimaryTip.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subtitle;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        PrimaryNavType primaryNavType = this.type;
        if (primaryNavType != null) {
            i = primaryNavType.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PrimaryTip(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", subtitle=");
        stringBuilder.append(this.subtitle);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PrimaryTip(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull PrimaryNavType primaryNavType) {
       //Intrinsics.checkParameterIsNotNull(primaryNavType, "type");
        this.title = str;
        this.subtitle = str2;
        this.url = str3;
        this.type = primaryNavType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final void setSubtitle(@Nullable String str) {
        this.subtitle = str;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public /* synthetic */ PrimaryTip(String str, String str2, String str3, PrimaryNavType primaryNavType, int i) {

        this(str, str2, str3, primaryNavType);
    }

    @NotNull
    public final PrimaryNavType getType() {
        return this.type;
    }

    public final void setType(@NotNull PrimaryNavType primaryNavType) {
       //Intrinsics.checkParameterIsNotNull(primaryNavType, "<set-?>");
        this.type = primaryNavType;
    }

    public PrimaryTip(@NotNull Parcel parcel) {
       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this(parcel.readString(), parcel.readString(), parcel.readString(), PrimaryNavType.valueOf(parcel.readString()));
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.url);
        parcel.writeString(this.type.toString());
    }
}
