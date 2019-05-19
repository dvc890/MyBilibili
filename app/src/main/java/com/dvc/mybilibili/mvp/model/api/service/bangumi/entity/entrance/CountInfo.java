package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/CountInfo;", "", "view", "", "danmaku", "follow", "(JJJ)V", "getDanmaku", "()J", "setDanmaku", "(J)V", "getFollow", "setFollow", "getView", "setView", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class CountInfo {
    private long danmaku;
    private long follow;
    private long view;

    public CountInfo() {
        this(0, 0, 0, 7);
    }

    @NotNull
    public static /* synthetic */ CountInfo copy$default(CountInfo countInfo, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = countInfo.view;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = countInfo.danmaku;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = countInfo.follow;
        }
        return countInfo.copy(j4, j5, j3);
    }

    public final long component1() {
        return this.view;
    }

    public final long component2() {
        return this.danmaku;
    }

    public final long component3() {
        return this.follow;
    }

    @NotNull
    public final CountInfo copy(long j, long j2, long j3) {
        return new CountInfo(j, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountInfo) {
            CountInfo countInfo = (CountInfo) obj;
            if ((this.view == countInfo.view ? 1 : null) != null) {
                if ((this.danmaku == countInfo.danmaku ? 1 : null) != null) {
                    if ((this.follow == countInfo.follow ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.view;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.danmaku;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.follow;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CountInfo(view=");
        stringBuilder.append(this.view);
        stringBuilder.append(", danmaku=");
        stringBuilder.append(this.danmaku);
        stringBuilder.append(", follow=");
        stringBuilder.append(this.follow);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CountInfo(long j, long j2, long j3) {
        this.view = j;
        this.danmaku = j2;
        this.follow = j3;
    }

    public final long getView() {
        return this.view;
    }

    public final void setView(long j) {
        this.view = j;
    }

    public final long getDanmaku() {
        return this.danmaku;
    }

    public final void setDanmaku(long j) {
        this.danmaku = j;
    }

    public /* synthetic */ CountInfo(long j, long j2, long j3, int i) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? 0 : j2, (i & 4) != 0 ? 0 : j3);
    }

    public final long getFollow() {
        return this.follow;
    }

    public final void setFollow(long j) {
        this.follow = j;
    }
}
