package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



@Keep
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/UserCoinNumberBean;", "", "contributionCount", "", "(I)V", "getContributionCount", "()I", "setContributionCount", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class UserCoinNumberBean {
    @JSONField(name = "number")
    private int contributionCount;

    public UserCoinNumberBean() {
        this(0, 1);
    }

    @NotNull
    public static /* synthetic */ UserCoinNumberBean copy$default(UserCoinNumberBean userCoinNumberBean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userCoinNumberBean.contributionCount;
        }
        return userCoinNumberBean.copy(i);
    }

    public final int component1() {
        return this.contributionCount;
    }

    @NotNull
    public final UserCoinNumberBean copy(int i) {
        return new UserCoinNumberBean(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserCoinNumberBean) {
            if ((this.contributionCount == ((UserCoinNumberBean) obj).contributionCount ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.contributionCount;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserCoinNumberBean(contributionCount=");
        stringBuilder.append(this.contributionCount);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public UserCoinNumberBean(int i) {
        this.contributionCount = i;
    }

    public /* synthetic */ UserCoinNumberBean(int i, int i2) {
        this(i);
    }

    public final int getContributionCount() {
        return this.contributionCount;
    }

    public final void setContributionCount(int i) {
        this.contributionCount = i;
    }
}
