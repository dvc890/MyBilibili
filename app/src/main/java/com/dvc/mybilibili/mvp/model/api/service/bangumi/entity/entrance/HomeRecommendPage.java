package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;



@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003J=\u0010\u0017\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R(\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/HomeRecommendPage;", "", "homeActions", "", "Lcom/bilibili/bangumi/data/entrance/HomeAction;", "modules", "Lcom/bilibili/bangumi/data/entrance/RecommendModule;", "hot", "Lcom/bilibili/bangumi/data/entrance/RecommendDetail;", "(Ljava/util/List;Ljava/util/List;Lcom/bilibili/bangumi/data/entrance/RecommendDetail;)V", "getHomeActions", "()Ljava/util/List;", "setHomeActions", "(Ljava/util/List;)V", "getHot", "()Lcom/bilibili/bangumi/data/entrance/RecommendDetail;", "setHot", "(Lcom/bilibili/bangumi/data/entrance/RecommendDetail;)V", "getModules", "setModules", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class HomeRecommendPage {
    @JSONField(name = "regions")
    @Nullable
    private List<HomeAction> homeActions;
    @Nullable
    private RecommendDetail hot;
    @Nullable
    private List<RecommendModule> modules;

    public HomeRecommendPage() {
        this(null, null, null, 7);
    }

    @NotNull
    public static /* synthetic */ HomeRecommendPage copy$default(HomeRecommendPage homeRecommendPage, List list, List list2, RecommendDetail recommendDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            list = homeRecommendPage.homeActions;
        }
        if ((i & 2) != 0) {
            list2 = homeRecommendPage.modules;
        }
        if ((i & 4) != 0) {
            recommendDetail = homeRecommendPage.hot;
        }
        return homeRecommendPage.copy(list, list2, recommendDetail);
    }

    @Nullable
    public final List<HomeAction> component1() {
        return this.homeActions;
    }

    @Nullable
    public final List<RecommendModule> component2() {
        return this.modules;
    }

    @Nullable
    public final RecommendDetail component3() {
        return this.hot;
    }

    @NotNull
    public final HomeRecommendPage copy(@Nullable List<HomeAction> list, @Nullable List<RecommendModule> list2, @Nullable RecommendDetail recommendDetail) {
        return new HomeRecommendPage(list, list2, recommendDetail);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.hot, r3.hot) != false) goto L_0x0029;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.data.entrance.HomeRecommendPage;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.bilibili.bangumi.data.entrance.HomeRecommendPage) r3;
        r0 = r2.homeActions;
        r1 = r3.homeActions;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.modules;
        r1 = r3.modules;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.hot;
        r3 = r3.hot;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.data.entrance.HomeRecommendPage.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.homeActions;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.modules;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        RecommendDetail recommendDetail = this.hot;
        if (recommendDetail != null) {
            i = recommendDetail.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HomeRecommendPage(homeActions=");
        stringBuilder.append(this.homeActions);
        stringBuilder.append(", modules=");
        stringBuilder.append(this.modules);
        stringBuilder.append(", hot=");
        stringBuilder.append(this.hot);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public HomeRecommendPage(@Nullable List<HomeAction> list, @Nullable List<RecommendModule> list2, @Nullable RecommendDetail recommendDetail) {
        this.homeActions = list;
        this.modules = list2;
        this.hot = recommendDetail;
    }

    public /* synthetic */ HomeRecommendPage(List list, List list2, RecommendDetail recommendDetail, int i) {
        this(list, list2, recommendDetail);
    }

    @Nullable
    public final List<HomeAction> getHomeActions() {
        return this.homeActions;
    }

    public final void setHomeActions(@Nullable List<HomeAction> list) {
        this.homeActions = list;
    }

    @Nullable
    public final List<RecommendModule> getModules() {
        return this.modules;
    }

    public final void setModules(@Nullable List<RecommendModule> list) {
        this.modules = list;
    }

    @Nullable
    public final RecommendDetail getHot() {
        return this.hot;
    }

    public final void setHot(@Nullable RecommendDetail recommendDetail) {
        this.hot = recommendDetail;
    }
}
