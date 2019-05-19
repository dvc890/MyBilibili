package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;


@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u00c6\u0003J\u0013\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R(\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/bilibili/bangumi/data/entrance/HomeMinePage;", "", "updateCount", "", "favorCount", "delayNotices", "", "Lcom/bilibili/bangumi/data/entrance/DelayNotice;", "cards", "Lcom/bilibili/bangumi/data/entrance/FavorCard;", "(IILjava/util/List;Ljava/util/List;)V", "getCards", "()Ljava/util/List;", "setCards", "(Ljava/util/List;)V", "getDelayNotices", "setDelayNotices", "getFavorCount", "()I", "setFavorCount", "(I)V", "getUpdateCount", "setUpdateCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class HomeMinePage {
    @JSONField(name = "follows")
    @Nullable
    private List<FavorCard> cards;
    @JSONField(name = "delay")
    @Nullable
    private List<DelayNotice> delayNotices;
    @JSONField(name = "follow")
    private int favorCount;
    @JSONField(name = "update")
    private int updateCount;

    public HomeMinePage() {
        this(0, 0, null, null, 15);
    }

    @NotNull
    public static /* synthetic */ HomeMinePage copy$default(HomeMinePage homeMinePage, int i, int i2, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = homeMinePage.updateCount;
        }
        if ((i3 & 2) != 0) {
            i2 = homeMinePage.favorCount;
        }
        if ((i3 & 4) != 0) {
            list = homeMinePage.delayNotices;
        }
        if ((i3 & 8) != 0) {
            list2 = homeMinePage.cards;
        }
        return homeMinePage.copy(i, i2, list, list2);
    }

    public final int component1() {
        return this.updateCount;
    }

    public final int component2() {
        return this.favorCount;
    }

    @Nullable
    public final List<DelayNotice> component3() {
        return this.delayNotices;
    }

    @Nullable
    public final List<FavorCard> component4() {
        return this.cards;
    }

    @NotNull
    public final HomeMinePage copy(int i, int i2, @Nullable List<DelayNotice> list, @Nullable List<FavorCard> list2) {
        return new HomeMinePage(i, i2, list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeMinePage) {
            HomeMinePage homeMinePage = (HomeMinePage) obj;
            if ((this.updateCount == homeMinePage.updateCount ? 1 : null) != null) {
                return (this.favorCount == homeMinePage.favorCount ? 1 : null) != null && Intrinsics.areEqual(this.delayNotices, homeMinePage.delayNotices) &&Intrinsics.areEqual(this.cards, homeMinePage.cards);
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.updateCount * 31) + this.favorCount) * 31;
        List list = this.delayNotices;
        int i2 = 0;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.cards;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HomeMinePage(updateCount=");
        stringBuilder.append(this.updateCount);
        stringBuilder.append(", favorCount=");
        stringBuilder.append(this.favorCount);
        stringBuilder.append(", delayNotices=");
        stringBuilder.append(this.delayNotices);
        stringBuilder.append(", cards=");
        stringBuilder.append(this.cards);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public HomeMinePage(int i, int i2, @Nullable List<DelayNotice> list, @Nullable List<FavorCard> list2) {
        this.updateCount = i;
        this.favorCount = i2;
        this.delayNotices = list;
        this.cards = list2;
    }

    public final int getUpdateCount() {
        return this.updateCount;
    }

    public final void setUpdateCount(int i) {
        this.updateCount = i;
    }

    public final int getFavorCount() {
        return this.favorCount;
    }

    public final void setFavorCount(int i) {
        this.favorCount = i;
    }

    public /* synthetic */ HomeMinePage(int i, int i2, List list, List list2, int i3) {
        this(i, i2, list, list2);
    }

    @Nullable
    public final List<DelayNotice> getDelayNotices() {
        return this.delayNotices;
    }

    public final void setDelayNotices(@Nullable List<DelayNotice> list) {
        this.delayNotices = list;
    }

    @Nullable
    public final List<FavorCard> getCards() {
        return this.cards;
    }

    public final void setCards(@Nullable List<FavorCard> list) {
        this.cards = list;
    }
}
