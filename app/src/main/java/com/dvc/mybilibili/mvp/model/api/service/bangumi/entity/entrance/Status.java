package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004\u00a8\u0006\u000f"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/Status;", "", "isFavor", "", "(Z)V", "()Z", "setFavor", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class Status {
    @JSONField(name = "follow")
    private boolean isFavor;

    public Status() {
        this(false, 1);
    }

    @NotNull
    public static /* synthetic */ Status copy$default(Status status, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = status.isFavor;
        }
        return status.copy(z);
    }

    public final boolean component1() {
        return this.isFavor;
    }

    @NotNull
    public final Status copy(boolean z) {
        return new Status(z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Status) {
            if ((this.isFavor == ((Status) obj).isFavor ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.isFavor ? 1 : 0;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Status(isFavor=");
        stringBuilder.append(this.isFavor);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Status(boolean z) {
        this.isFavor = z;
    }

    public /* synthetic */ Status(boolean z, int i) {
        this(z);
    }

    public final boolean isFavor() {
        return this.isFavor;
    }

    public final void setFavor(boolean z) {
        this.isFavor = z;
    }
}
