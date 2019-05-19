package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import org.jetbrains.annotations.Nullable;

@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/PublishTime;", "", "()V", "color", "", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "ts", "", "getTs", "()J", "setTs", "(J)V", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class PublishTime {
    @Nullable
    private String color;
    /* renamed from: ts */
    private long f15482ts;

    public final long getTs() {
        return this.f15482ts;
    }

    public final void setTs(long j) {
        this.f15482ts = j;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }
}
