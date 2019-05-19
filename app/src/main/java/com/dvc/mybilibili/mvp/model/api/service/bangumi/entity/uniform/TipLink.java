package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
@SuppressLint({"ParcelCreator"})
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B'\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J+\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u001aH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/TipLink;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "title", "", "url", "type", "Lcom/bilibili/bangumi/api/uniform/LinkNavType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bilibili/bangumi/api/uniform/LinkNavType;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getType", "()Lcom/bilibili/bangumi/api/uniform/LinkNavType;", "setType", "(Lcom/bilibili/bangumi/api/uniform/LinkNavType;)V", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class TipLink implements Parcelable {
    public static final C4762a CREATOR = new C4762a();
    @Nullable
    private String title;
    @NotNull
    private LinkNavType type;
    @Nullable
    private String url;

    ////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/TipLink$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bangumi/api/uniform/TipLink;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bangumi/api/uniform/TipLink;", "bangumi_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.TipLink$a */
    public static final class C4762a implements Creator<TipLink> {
        private C4762a() {
        }

//        public /* synthetic */ C4762a(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        /* renamed from: a */
        public TipLink createFromParcel(@NotNull Parcel parcel) {
           //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new TipLink(parcel);
        }

        @NotNull
        /* renamed from: a */
        public TipLink[] newArray(int i) {
            return new TipLink[i];
        }
    }

    public TipLink() {
        this(null, null, null, 7);
    }

    @NotNull
    public static /* synthetic */ TipLink copy$default(TipLink tipLink, String str, String str2, LinkNavType linkNavType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tipLink.title;
        }
        if ((i & 2) != 0) {
            str2 = tipLink.url;
        }
        if ((i & 4) != 0) {
            linkNavType = tipLink.type;
        }
        return tipLink.copy(str, str2, linkNavType);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final LinkNavType component3() {
        return this.type;
    }

    @NotNull
    public final TipLink copy(@Nullable String str, @Nullable String str2, @NotNull LinkNavType linkNavType) {
       //Intrinsics.checkParameterIsNotNull(linkNavType, "type");
        return new TipLink(str, str2, linkNavType);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.type, r3.type) != false) goto L_0x0029;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.api.uniform.TipLink;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.bilibili.bangumi.api.uniform.TipLink) r3;
        r0 = r2.title;
        r1 = r3.title;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.url;
        r1 = r3.url;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.type;
        r3 = r3.type;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.api.uniform.TipLink.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        LinkNavType linkNavType = this.type;
        if (linkNavType != null) {
            i = linkNavType.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TipLink(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TipLink(@Nullable String str, @Nullable String str2, @NotNull LinkNavType linkNavType) {
       //Intrinsics.checkParameterIsNotNull(linkNavType, "type");
        this.title = str;
        this.url = str2;
        this.type = linkNavType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public /* synthetic */ TipLink(String str, String str2, LinkNavType linkNavType, int i) {
        this(str, str2, linkNavType);
    }

    @NotNull
    public final LinkNavType getType() {
        return this.type;
    }

    public final void setType(@NotNull LinkNavType linkNavType) {
       //Intrinsics.checkParameterIsNotNull(linkNavType, "<set-?>");
        this.type = linkNavType;
    }

    public TipLink(@NotNull Parcel parcel) {
       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this(parcel.readString(), parcel.readString(), LinkNavType.valueOf(parcel.readString()));
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
       //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.type.toString());
    }
}
