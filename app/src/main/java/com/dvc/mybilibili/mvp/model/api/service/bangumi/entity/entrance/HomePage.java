package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/HomePage;", "", "minePage", "Lcom/bilibili/bangumi/data/entrance/HomeMinePage;", "recommendPage", "Lcom/bilibili/bangumi/data/entrance/HomeRecommendPage;", "(Lcom/bilibili/bangumi/data/entrance/HomeMinePage;Lcom/bilibili/bangumi/data/entrance/HomeRecommendPage;)V", "getMinePage", "()Lcom/bilibili/bangumi/data/entrance/HomeMinePage;", "setMinePage", "(Lcom/bilibili/bangumi/data/entrance/HomeMinePage;)V", "getRecommendPage", "()Lcom/bilibili/bangumi/data/entrance/HomeRecommendPage;", "setRecommendPage", "(Lcom/bilibili/bangumi/data/entrance/HomeRecommendPage;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class HomePage {
    @Nullable
    private HomeMinePage minePage;
    @Nullable
    private HomeRecommendPage recommendPage;

    public HomePage() {
        this(null, null, 3);
    }

    @NotNull
    public static /* synthetic */ HomePage copy$default(HomePage homePage, HomeMinePage homeMinePage, HomeRecommendPage homeRecommendPage, int i, Object obj) {
        if ((i & 1) != 0) {
            homeMinePage = homePage.minePage;
        }
        if ((i & 2) != 0) {
            homeRecommendPage = homePage.recommendPage;
        }
        return homePage.copy(homeMinePage, homeRecommendPage);
    }

    @Nullable
    public final HomeMinePage component1() {
        return this.minePage;
    }

    @Nullable
    public final HomeRecommendPage component2() {
        return this.recommendPage;
    }

    @NotNull
    public final HomePage copy(@Nullable HomeMinePage homeMinePage, @Nullable HomeRecommendPage homeRecommendPage) {
        return new HomePage(homeMinePage, homeRecommendPage);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.recommendPage, r3.recommendPage) != false) goto L_0x001f;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.data.entrance.HomePage;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.bilibili.bangumi.data.entrance.HomePage) r3;
        r0 = r2.minePage;
        r1 = r3.minePage;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.recommendPage;
        r3 = r3.recommendPage;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.data.entrance.HomePage.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        HomeMinePage homeMinePage = this.minePage;
        int i = 0;
        int hashCode = (homeMinePage != null ? homeMinePage.hashCode() : 0) * 31;
        HomeRecommendPage homeRecommendPage = this.recommendPage;
        if (homeRecommendPage != null) {
            i = homeRecommendPage.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HomePage(minePage=");
        stringBuilder.append(this.minePage);
        stringBuilder.append(", recommendPage=");
        stringBuilder.append(this.recommendPage);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public HomePage(@Nullable HomeMinePage homeMinePage, @Nullable HomeRecommendPage homeRecommendPage) {
        this.minePage = homeMinePage;
        this.recommendPage = homeRecommendPage;
    }

    public /* synthetic */ HomePage(HomeMinePage homeMinePage, HomeRecommendPage homeRecommendPage, int i) {
        this(homeMinePage, homeRecommendPage);
    }

    @Nullable
    public final HomeMinePage getMinePage() {
        return this.minePage;
    }

    public final void setMinePage(@Nullable HomeMinePage homeMinePage) {
        this.minePage = homeMinePage;
    }

    @Nullable
    public final HomeRecommendPage getRecommendPage() {
        return this.recommendPage;
    }

    public final void setRecommendPage(@Nullable HomeRecommendPage homeRecommendPage) {
        this.recommendPage = homeRecommendPage;
    }
}
