package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/NewestEp;", "", "cover", "", "id", "", "updateText", "(Ljava/lang/String;JLjava/lang/String;)V", "getCover", "()Ljava/lang/String;", "setCover", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getUpdateText", "setUpdateText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class NewestEp {
    @Nullable
    private String cover;
    /* renamed from: id */
    private long f5763id;
    @JSONField(name = "index_show")
    @Nullable
    private String updateText;

    public NewestEp() {
        this(null, 0, null, 7);
    }

    @NotNull
    public static /* synthetic */ NewestEp copy$default(NewestEp newestEp, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newestEp.cover;
        }
        if ((i & 2) != 0) {
            j = newestEp.f5763id;
        }
        if ((i & 4) != 0) {
            str2 = newestEp.updateText;
        }
        return newestEp.copy(str, j, str2);
    }

    @Nullable
    public final String component1() {
        return this.cover;
    }

    public final long component2() {
        return this.f5763id;
    }

    @Nullable
    public final String component3() {
        return this.updateText;
    }

    @NotNull
    public final NewestEp copy(@Nullable String str, long j, @Nullable String str2) {
        return new NewestEp(str, j, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NewestEp) {
            NewestEp newestEp = (NewestEp) obj;
            if (Intrinsics.areEqual(this.cover, newestEp.cover)) {
                return ((this.f5763id > newestEp.f5763id ? 1 : (this.f5763id == newestEp.f5763id ? 0 : -1)) == 0 ? 1 : null) != null &&Intrinsics.areEqual(this.updateText, newestEp.updateText);
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.cover;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f5763id;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.updateText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NewestEp(cover=");
        stringBuilder.append(this.cover);
        stringBuilder.append(", id=");
        stringBuilder.append(this.f5763id);
        stringBuilder.append(", updateText=");
        stringBuilder.append(this.updateText);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public NewestEp(@Nullable String str, long j, @Nullable String str2) {
        this.cover = str;
        this.f5763id = j;
        this.updateText = str2;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final long getId() {
        return this.f5763id;
    }

    public final void setId(long j) {
        this.f5763id = j;
    }

    public /* synthetic */ NewestEp(String str, long j, String str2, int i) {
        this(str, j, str2);
    }

    @Nullable
    public final String getUpdateText() {
        return this.updateText;
    }

    public final void setUpdateText(@Nullable String str) {
        this.updateText = str;
    }
}
