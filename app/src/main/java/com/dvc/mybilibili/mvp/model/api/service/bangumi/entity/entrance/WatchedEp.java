package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/WatchedEp;", "", "id", "", "index", "", "desc", "(JLjava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getIndex", "setIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class WatchedEp {
    @JSONField(name = "last_ep_desc")
    @Nullable
    private String desc;
    @JSONField(name = "last_ep_id")
    /* renamed from: id */
    private long f5764id;
    @JSONField(name = "last_ep_index")
    @Nullable
    private String index;

    public WatchedEp() {
        this(0, null, null, 7);
    }

    @NotNull
    public static /* synthetic */ WatchedEp copy$default(WatchedEp watchedEp, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = watchedEp.f5764id;
        }
        if ((i & 2) != 0) {
            str = watchedEp.index;
        }
        if ((i & 4) != 0) {
            str2 = watchedEp.desc;
        }
        return watchedEp.copy(j, str, str2);
    }

    public final long component1() {
        return this.f5764id;
    }

    @Nullable
    public final String component2() {
        return this.index;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @NotNull
    public final WatchedEp copy(long j, @Nullable String str, @Nullable String str2) {
        return new WatchedEp(j, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WatchedEp) {
            WatchedEp watchedEp = (WatchedEp) obj;
            return ((this.f5764id > watchedEp.f5764id ? 1 : (this.f5764id == watchedEp.f5764id ? 0 : -1)) == 0 ? 1 : null) != null && Intrinsics.areEqual(this.index, watchedEp.index) &&Intrinsics.areEqual(this.desc, watchedEp.desc);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5764id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.index;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.desc;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WatchedEp(id=");
        stringBuilder.append(this.f5764id);
        stringBuilder.append(", index=");
        stringBuilder.append(this.index);
        stringBuilder.append(", desc=");
        stringBuilder.append(this.desc);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public WatchedEp(long j, @Nullable String str, @Nullable String str2) {
        this.f5764id = j;
        this.index = str;
        this.desc = str2;
    }

    public final long getId() {
        return this.f5764id;
    }

    public final void setId(long j) {
        this.f5764id = j;
    }

    @Nullable
    public final String getIndex() {
        return this.index;
    }

    public final void setIndex(@Nullable String str) {
        this.index = str;
    }

    public /* synthetic */ WatchedEp(long j, String str, String str2, int i) {
        this(j, str, str2);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }
}
