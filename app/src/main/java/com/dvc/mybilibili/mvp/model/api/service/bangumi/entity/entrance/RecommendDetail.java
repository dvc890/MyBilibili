package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003JG\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017\u00a8\u0006'"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/RecommendDetail;", "", "wid", "", "size", "desc", "", "title", "items", "", "Lcom/bilibili/bangumi/data/entrance/RecommendDetailItem;", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getSize", "()I", "setSize", "(I)V", "getTitle", "setTitle", "getWid", "setWid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class RecommendDetail {
    @Nullable
    private String desc;
    @Nullable
    private List<RecommendDetailItem> items;
    private int size;
    @Nullable
    private String title;
    private int wid;

    public RecommendDetail() {
        this(0, 0, null, null, null, 31);
    }

    @NotNull
    public static /* synthetic */ RecommendDetail copy$default(RecommendDetail recommendDetail, int i, int i2, String str, String str2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = recommendDetail.wid;
        }
        if ((i3 & 2) != 0) {
            i2 = recommendDetail.size;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = recommendDetail.desc;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            str2 = recommendDetail.title;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            list = recommendDetail.items;
        }
        return recommendDetail.copy(i, i4, str3, str4, list);
    }

    public final int component1() {
        return this.wid;
    }

    public final int component2() {
        return this.size;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @Nullable
    public final String component4() {
        return this.title;
    }

    @Nullable
    public final List<RecommendDetailItem> component5() {
        return this.items;
    }

    @NotNull
    public final RecommendDetail copy(int i, int i2, @Nullable String str, @Nullable String str2, @Nullable List<RecommendDetailItem> list) {
        return new RecommendDetail(i, i2, str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendDetail) {
            RecommendDetail recommendDetail = (RecommendDetail) obj;
            if ((this.wid == recommendDetail.wid ? 1 : null) != null) {
                return (this.size == recommendDetail.size ? 1 : null) != null && Intrinsics.areEqual(this.desc, recommendDetail.desc) &&Intrinsics.areEqual(this.title, recommendDetail.title) &&Intrinsics.areEqual(this.items, recommendDetail.items);
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.wid * 31) + this.size) * 31;
        String str = this.desc;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.title;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.items;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecommendDetail(wid=");
        stringBuilder.append(this.wid);
        stringBuilder.append(", size=");
        stringBuilder.append(this.size);
        stringBuilder.append(", desc=");
        stringBuilder.append(this.desc);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", items=");
        stringBuilder.append(this.items);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RecommendDetail(int i, int i2, @Nullable String str, @Nullable String str2, @Nullable List<RecommendDetailItem> list) {
        this.wid = i;
        this.size = i2;
        this.desc = str;
        this.title = str2;
        this.items = list;
    }

    public final int getWid() {
        return this.wid;
    }

    public final void setWid(int i) {
        this.wid = i;
    }

    public final int getSize() {
        return this.size;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public /* synthetic */ RecommendDetail(int i, int i2, String str, String str2, List list, int i3) {
        this((i3 & 1) != 0 ? 0 : i, i2, str, str2, list);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final List<RecommendDetailItem> getItems() {
        return this.items;
    }

    public final void setItems(@Nullable List<RecommendDetailItem> list) {
        this.items = list;
    }
}
