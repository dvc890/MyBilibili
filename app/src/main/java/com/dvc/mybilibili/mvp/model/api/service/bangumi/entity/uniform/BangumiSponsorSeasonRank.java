package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiSponsorSeasonRank;", "", "uid", "", "message", "uname", "face", "vipState", "Lcom/bilibili/bangumi/api/uniform/BangumiSponsorSeasonRankVipState;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bilibili/bangumi/api/uniform/BangumiSponsorSeasonRankVipState;)V", "getFace", "()Ljava/lang/String;", "setFace", "(Ljava/lang/String;)V", "getMessage", "setMessage", "getUid", "setUid", "getUname", "setUname", "getVipState", "()Lcom/bilibili/bangumi/api/uniform/BangumiSponsorSeasonRankVipState;", "setVipState", "(Lcom/bilibili/bangumi/api/uniform/BangumiSponsorSeasonRankVipState;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BangumiSponsorSeasonRank {
    @NotNull
    private String face;
    @NotNull
    private String message;
    @NotNull
    private String uid;
    @NotNull
    private String uname;
    @Nullable
    private C1901c vipState;

    public BangumiSponsorSeasonRank() {
        this(null, null, null, null, null, 31);
    }

    @NotNull
    public static /* synthetic */ BangumiSponsorSeasonRank copy$default(BangumiSponsorSeasonRank bangumiSponsorSeasonRank, String str, String str2, String str3, String str4, C1901c c1901c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bangumiSponsorSeasonRank.uid;
        }
        if ((i & 2) != 0) {
            str2 = bangumiSponsorSeasonRank.message;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bangumiSponsorSeasonRank.uname;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bangumiSponsorSeasonRank.face;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            c1901c = bangumiSponsorSeasonRank.vipState;
        }
        return bangumiSponsorSeasonRank.copy(str, str5, str6, str7, c1901c);
    }

    @NotNull
    public final String component1() {
        return this.uid;
    }

    @NotNull
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final String component3() {
        return this.uname;
    }

    @NotNull
    public final String component4() {
        return this.face;
    }

    @Nullable
    public final C1901c component5() {
        return this.vipState;
    }

    @NotNull
    public final BangumiSponsorSeasonRank copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable C1901c c1901c) {
       //Intrinsics.checkParameterIsNotNull(str, "uid");
       //Intrinsics.checkParameterIsNotNull(str2, "message");
       //Intrinsics.checkParameterIsNotNull(str3, "uname");
       //Intrinsics.checkParameterIsNotNull(str4, "face");
        return new BangumiSponsorSeasonRank(str, str2, str3, str4, c1901c);
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.vipState, r3.vipState) != false) goto L_0x003d;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.api.uniform.BangumiSponsorSeasonRank;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.bilibili.bangumi.api.uniform.BangumiSponsorSeasonRank) r3;
        r0 = r2.uid;
        r1 = r3.uid;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.message;
        r1 = r3.message;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.uname;
        r1 = r3.uname;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.face;
        r1 = r3.face;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.vipState;
        r3 = r3.vipState;
        r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.api.uniform.BangumiSponsorSeasonRank.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.message;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.uname;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.face;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C1901c c1901c = this.vipState;
        if (c1901c != null) {
            i = c1901c.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiSponsorSeasonRank(uid=");
        stringBuilder.append(this.uid);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", uname=");
        stringBuilder.append(this.uname);
        stringBuilder.append(", face=");
        stringBuilder.append(this.face);
        stringBuilder.append(", vipState=");
        stringBuilder.append(this.vipState);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BangumiSponsorSeasonRank(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable C1901c c1901c) {
       //Intrinsics.checkParameterIsNotNull(str, "uid");
       //Intrinsics.checkParameterIsNotNull(str2, "message");
       //Intrinsics.checkParameterIsNotNull(str3, "uname");
       //Intrinsics.checkParameterIsNotNull(str4, "face");
        this.uid = str;
        this.message = str2;
        this.uname = str3;
        this.face = str4;
        this.vipState = c1901c;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final void setUid(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uid = str;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.message = str;
    }

    @NotNull
    public final String getUname() {
        return this.uname;
    }

    public final void setUname(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uname = str;
    }

    @NotNull
    public final String getFace() {
        return this.face;
    }

    public final void setFace(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.face = str;
    }

    public /* synthetic */ BangumiSponsorSeasonRank(String str, String str2, String str3, String str4, C1901c c1901c, int i) {
        this(str, str2, str3, str4, c1901c);
    }

    @Nullable
    public final C1901c getVipState() {
        return this.vipState;
    }

    public final void setVipState(@Nullable C1901c c1901c) {
        this.vipState = c1901c;
    }
}
