package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiPlayerCheck;", "", "allowPlay", "", "errorMsg", "", "(ZLjava/lang/String;)V", "getAllowPlay", "()Z", "setAllowPlay", "(Z)V", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BangumiPlayerCheck {
    @JSONField(name = "allow_play")
    private boolean allowPlay;
    @JSONField(name = "errmsg")
    @NotNull
    private String errorMsg;

    public BangumiPlayerCheck() {
        this(false, null, 3);
    }

    @NotNull
    public static /* synthetic */ BangumiPlayerCheck copy$default(BangumiPlayerCheck bangumiPlayerCheck, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bangumiPlayerCheck.allowPlay;
        }
        if ((i & 2) != 0) {
            str = bangumiPlayerCheck.errorMsg;
        }
        return bangumiPlayerCheck.copy(z, str);
    }

    public final boolean component1() {
        return this.allowPlay;
    }

    @NotNull
    public final String component2() {
        return this.errorMsg;
    }

    @NotNull
    public final BangumiPlayerCheck copy(boolean z, @NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "errorMsg");
        return new BangumiPlayerCheck(z, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BangumiPlayerCheck) {
            BangumiPlayerCheck bangumiPlayerCheck = (BangumiPlayerCheck) obj;
            return (this.allowPlay == bangumiPlayerCheck.allowPlay ? 1 : null) != null && Intrinsics.areEqual(this.errorMsg, bangumiPlayerCheck.errorMsg);
        }
        return false;
    }

    public int hashCode() {
        int i = this.allowPlay?1:0;
        i *= 31;
        String str = this.errorMsg;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiPlayerCheck(allowPlay=");
        stringBuilder.append(this.allowPlay);
        stringBuilder.append(", errorMsg=");
        stringBuilder.append(this.errorMsg);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BangumiPlayerCheck(boolean z, @NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "errorMsg");
        this.allowPlay = z;
        this.errorMsg = str;
    }

    public final boolean getAllowPlay() {
        return this.allowPlay;
    }

    public final void setAllowPlay(boolean z) {
        this.allowPlay = z;
    }

    public /* synthetic */ BangumiPlayerCheck(boolean z, String str, int i) {
        this((i & 1) != 0?false:z,
                (i & 2) != 0?"\u62b1\u6b49\uff0c\u8fde\u63a5\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5":str);
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final void setErrorMsg(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.errorMsg = str;
    }
}
