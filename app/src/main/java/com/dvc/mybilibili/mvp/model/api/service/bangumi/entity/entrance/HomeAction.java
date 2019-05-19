package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/HomeAction;", "", "icon", "", "url", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class HomeAction {
    @Nullable
    private String icon;
    @Nullable
    private String title;
    @Nullable
    private String url;

    public HomeAction() {
        this(null, null, null, 7);
    }

    @NotNull
    public static /* synthetic */ HomeAction copy$default(HomeAction homeAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeAction.icon;
        }
        if ((i & 2) != 0) {
            str2 = homeAction.url;
        }
        if ((i & 4) != 0) {
            str3 = homeAction.title;
        }
        return homeAction.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.icon;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @Nullable
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final HomeAction copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new HomeAction(str, str2, str3);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.title, r3.title) != false) goto L_0x0029;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.data.entrance.HomeAction;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.bilibili.bangumi.data.entrance.HomeAction) r3;
        r0 = r2.icon;
        r1 = r3.icon;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.url;
        r1 = r3.url;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.title;
        r3 = r3.title;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.data.entrance.HomeAction.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.icon;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HomeAction(icon=");
        stringBuilder.append(this.icon);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public HomeAction(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.icon = str;
        this.url = str2;
        this.title = str3;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public /* synthetic */ HomeAction(String str, String str2, String str3, int i) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
