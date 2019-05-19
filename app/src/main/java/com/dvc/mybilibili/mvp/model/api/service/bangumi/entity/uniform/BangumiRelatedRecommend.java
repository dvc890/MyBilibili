package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




@Keep
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J9\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aJ\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiRelatedRecommend;", "", "relates", "", "Lcom/bilibili/bangumi/api/uniform/Relation;", "card", "Lcom/bilibili/bangumi/api/uniform/Card;", "season", "Lcom/bilibili/bangumi/api/uniform/BangumiRecommendSeason;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCard", "()Ljava/util/List;", "setCard", "(Ljava/util/List;)V", "getRelates", "setRelates", "getSeason", "setSeason", "component1", "component2", "component3", "copy", "equals", "", "other", "getValueCard", "Ljava/util/ArrayList;", "hashCode", "", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BangumiRelatedRecommend {
    @NotNull
    private List<Card> card;
    @NotNull
    private List<Relation> relates;
    @NotNull
    private List<BangumiRecommendSeason> season;

    public BangumiRelatedRecommend() {
        this(null, null, null, 7);
    }

    @NotNull
    public static /* synthetic */ BangumiRelatedRecommend copy$default(BangumiRelatedRecommend bangumiRelatedRecommend, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bangumiRelatedRecommend.relates;
        }
        if ((i & 2) != 0) {
            list2 = bangumiRelatedRecommend.card;
        }
        if ((i & 4) != 0) {
            list3 = bangumiRelatedRecommend.season;
        }
        return bangumiRelatedRecommend.copy(list, list2, list3);
    }

    @NotNull
    public final List<Relation> component1() {
        return this.relates;
    }

    @NotNull
    public final List<Card> component2() {
        return this.card;
    }

    @NotNull
    public final List<BangumiRecommendSeason> component3() {
        return this.season;
    }

    @NotNull
    public final BangumiRelatedRecommend copy(@NotNull List<Relation> list, @NotNull List<Card> list2, @NotNull List<BangumiRecommendSeason> list3) {
       //Intrinsics.checkParameterIsNotNull(list, "relates");
       //Intrinsics.checkParameterIsNotNull(list2, cxw.f83939a);
       //Intrinsics.checkParameterIsNotNull(list3, "season");
        return new BangumiRelatedRecommend(list, list2, list3);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2.season, r3.season) != false) goto L_0x0029;
     */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.bilibili.bangumi.api.uniform.BangumiRelatedRecommend;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.bilibili.bangumi.api.uniform.BangumiRelatedRecommend) r3;
        r0 = r2.relates;
        r1 = r3.relates;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.card;
        r1 = r3.card;
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.season;
        r3 = r3.season;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bangumi.api.uniform.BangumiRelatedRecommend.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.relates;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.card;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        list2 = this.season;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiRelatedRecommend(relates=");
        stringBuilder.append(this.relates);
        stringBuilder.append(", card=");
        stringBuilder.append(this.card);
        stringBuilder.append(", season=");
        stringBuilder.append(this.season);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BangumiRelatedRecommend(@NotNull List<Relation> list, @NotNull List<Card> list2, @NotNull List<BangumiRecommendSeason> list3) {
       //Intrinsics.checkParameterIsNotNull(list, "relates");
       //Intrinsics.checkParameterIsNotNull(list2, cxw.f83939a);
       //Intrinsics.checkParameterIsNotNull(list3, "season");
        this.relates = list;
        this.card = list2;
        this.season = list3;
    }

    public /* synthetic */ BangumiRelatedRecommend(List list, List list2, List list3, int i) {
        this(list, list2, list3);
    }

    @NotNull
    public final List<Relation> getRelates() {
        return this.relates;
    }

    public final void setRelates(@NotNull List<Relation> list) {
       //Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.relates = list;
    }

    @NotNull
    public final List<Card> getCard() {
        return this.card;
    }

    public final void setCard(@NotNull List<Card> list) {
       //Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.card = list;
    }

    @NotNull
    public final List<BangumiRecommendSeason> getSeason() {
        return this.season;
    }

    public final void setSeason(@NotNull List<BangumiRecommendSeason> list) {
       //Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.season = list;
    }

    @NotNull
    public final ArrayList<Card> getValueCard() {
        Collection arrayList = new ArrayList();
        for (Object next : this.card) {
            if ((((Card) next).getRe_type() == 0 ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        return (ArrayList) ((List) arrayList);
    }
}
