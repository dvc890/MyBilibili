package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/BangumiUgcVideoV2;", "", "cbottom", "", "ctop", "ugcItem", "", "Lcom/bilibili/bangumi/data/entrance/BangumiUgcVideoItemV2;", "(JJLjava/util/List;)V", "getCbottom", "()J", "setCbottom", "(J)V", "getCtop", "setCtop", "getUgcItem", "()Ljava/util/List;", "setUgcItem", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BangumiUgcVideoV2 {
    private long cbottom;
    private long ctop;
    @JSONField(name = "new")
    @Nullable
    private List<BangumiUgcVideoItemV2> ugcItem;

    public BangumiUgcVideoV2() {
        this(0, 0, null, 7);
    }

    @NotNull
    public static /* synthetic */ BangumiUgcVideoV2 copy$default(BangumiUgcVideoV2 bangumiUgcVideoV2, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bangumiUgcVideoV2.cbottom;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = bangumiUgcVideoV2.ctop;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = bangumiUgcVideoV2.ugcItem;
        }
        return bangumiUgcVideoV2.copy(j3, j4, list);
    }

    public final long component1() {
        return this.cbottom;
    }

    public final long component2() {
        return this.ctop;
    }

    @Nullable
    public final List<BangumiUgcVideoItemV2> component3() {
        return this.ugcItem;
    }

    @NotNull
    public final BangumiUgcVideoV2 copy(long j, long j2, @Nullable List<BangumiUgcVideoItemV2> list) {
        return new BangumiUgcVideoV2(j, j2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BangumiUgcVideoV2) {
            BangumiUgcVideoV2 bangumiUgcVideoV2 = (BangumiUgcVideoV2) obj;
            if ((this.cbottom == bangumiUgcVideoV2.cbottom ? 1 : null) != null) {
                return ((this.ctop > bangumiUgcVideoV2.ctop ? 1 : (this.ctop == bangumiUgcVideoV2.ctop ? 0 : -1)) == 0 ? 1 : null) != null && Intrinsics.areEqual(this.ugcItem, bangumiUgcVideoV2.ugcItem);
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.cbottom;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.ctop;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List list = this.ugcItem;
        return i + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiUgcVideoV2(cbottom=");
        stringBuilder.append(this.cbottom);
        stringBuilder.append(", ctop=");
        stringBuilder.append(this.ctop);
        stringBuilder.append(", ugcItem=");
        stringBuilder.append(this.ugcItem);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BangumiUgcVideoV2(long j, long j2, @Nullable List<BangumiUgcVideoItemV2> list) {
        this.cbottom = j;
        this.ctop = j2;
        this.ugcItem = list;
    }

    public final long getCbottom() {
        return this.cbottom;
    }

    public final void setCbottom(long j) {
        this.cbottom = j;
    }

    public final long getCtop() {
        return this.ctop;
    }

    public final void setCtop(long j) {
        this.ctop = j;
    }

    public /* synthetic */ BangumiUgcVideoV2(long j, long j2, List list, int i) {
        this((i & 1) != 0 ? 0 : j, (i & 2) == 0?j2:0, list);
    }

    @Nullable
    public final List<BangumiUgcVideoItemV2> getUgcItem() {
        return this.ugcItem;
    }

    public final void setUgcItem(@Nullable List<BangumiUgcVideoItemV2> list) {
        this.ugcItem = list;
    }
}
