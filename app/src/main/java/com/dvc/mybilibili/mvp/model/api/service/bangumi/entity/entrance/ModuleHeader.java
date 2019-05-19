package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\bH\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011\u00a8\u0006."}, d2 = {"Lcom/bilibili/bangumi/data/entrance/ModuleHeader;", "", "icon", "", "title", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "fragmentType", "", "getFragmentType", "()Ljava/lang/Integer;", "setFragmentType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "moduleId", "getModuleId", "setModuleId", "moduleType", "getModuleType", "setModuleType", "newPageName", "getNewPageName", "setNewPageName", "pageName", "getPageName", "setPageName", "parentTitle", "getParentTitle", "setParentTitle", "getTitle", "setTitle", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class ModuleHeader {
    @Nullable
    private Integer fragmentType;
    @Nullable
    private String icon;
    @NotNull
    private String moduleId;
    @NotNull
    private String moduleType;
    @Nullable
    private String newPageName;
    @Nullable
    private String pageName;
    @Nullable
    private String parentTitle;
    @Nullable
    private String title;
    @Nullable
    private String url;

    public ModuleHeader() {
        this(null, null, null, 7);
    }

    @NotNull
    public static /* synthetic */ ModuleHeader copy$default(ModuleHeader moduleHeader, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleHeader.icon;
        }
        if ((i & 2) != 0) {
            str2 = moduleHeader.title;
        }
        if ((i & 4) != 0) {
            str3 = moduleHeader.url;
        }
        return moduleHeader.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.icon;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @NotNull
    public final ModuleHeader copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new ModuleHeader(str, str2, str3);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.url, r3.url) != false) goto L_0x0029;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.data.entrance.ModuleHeader;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.bilibili.bangumi.data.entrance.ModuleHeader) r3;
        r0 = r2.icon;
        r1 = r3.icon;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.title;
        r1 = r3.title;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.url;
        r3 = r3.url;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.data.entrance.ModuleHeader.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.icon;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ModuleHeader(icon=");
        stringBuilder.append(this.icon);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ModuleHeader(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.icon = str;
        this.title = str2;
        this.url = str3;
        this.parentTitle = "";
        this.moduleType = "";
        this.moduleId = "";
        this.fragmentType = Integer.valueOf(-1);
        this.pageName = "";
        this.newPageName = "";
    }

    public /* synthetic */ ModuleHeader(String str, String str2, String str3, int i) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
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

    @Nullable
    public final String getParentTitle() {
        return this.parentTitle;
    }

    public final void setParentTitle(@Nullable String str) {
        this.parentTitle = str;
    }

    @NotNull
    public final String getModuleType() {
        return this.moduleType;
    }

    public final void setModuleType(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.moduleType = str;
    }

    @NotNull
    public final String getModuleId() {
        return this.moduleId;
    }

    public final void setModuleId(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.moduleId = str;
    }

    @Nullable
    public final Integer getFragmentType() {
        return this.fragmentType;
    }

    public final void setFragmentType(@Nullable Integer num) {
        this.fragmentType = num;
    }

    @Nullable
    public final String getPageName() {
        return this.pageName;
    }

    public final void setPageName(@Nullable String str) {
        this.pageName = str;
    }

    @Nullable
    public final String getNewPageName() {
        return this.newPageName;
    }

    public final void setNewPageName(@Nullable String str) {
        this.newPageName = str;
    }
}
