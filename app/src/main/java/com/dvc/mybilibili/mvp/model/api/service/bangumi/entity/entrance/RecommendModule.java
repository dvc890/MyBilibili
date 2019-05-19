package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001B\u00b7\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0018H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0016\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010@J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\nH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0013\u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\u00c6\u0003J\u0013\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00105J\u00c0\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u00c6\u0001\u00a2\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020\u00182\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010U\u001a\u00020\nH\u00d6\u0001J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010-\"\u0004\b:\u0010/R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010-\"\u0004\b>\u0010/R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u00a8\u0006W"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/RecommendModule;", "", "title", "", "style", "wids", "", "", "icon", "cardDisplayCount", "", "attr", "Lcom/bilibili/bangumi/data/entrance/ModuleAttr;", "headers", "", "Lcom/bilibili/bangumi/data/entrance/ModuleHeader;", "cards", "Lcom/bilibili/bangumi/data/entrance/CommonCard;", "size", "producers", "Lcom/bilibili/bangumi/data/entrance/Producer;", "type", "moduleId", "exchangeLoaded", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Long;Ljava/lang/String;ILcom/bilibili/bangumi/data/entrance/ModuleAttr;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getAttr", "()Lcom/bilibili/bangumi/data/entrance/ModuleAttr;", "setAttr", "(Lcom/bilibili/bangumi/data/entrance/ModuleAttr;)V", "getCardDisplayCount", "()I", "setCardDisplayCount", "(I)V", "getCards", "()Ljava/util/List;", "setCards", "(Ljava/util/List;)V", "getExchangeLoaded", "()Z", "setExchangeLoaded", "(Z)V", "getHeaders", "setHeaders", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "getModuleId", "setModuleId", "getProducers", "setProducers", "getSize", "()Ljava/lang/Integer;", "setSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStyle", "setStyle", "getTitle", "setTitle", "getType", "setType", "getWids", "()[Ljava/lang/Long;", "setWids", "([Ljava/lang/Long;)V", "[Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Long;Ljava/lang/String;ILcom/bilibili/bangumi/data/entrance/ModuleAttr;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Lcom/bilibili/bangumi/data/entrance/RecommendModule;", "equals", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class RecommendModule {
    @Nullable
    private ModuleAttr attr;
    @JSONField(name = "size")
    private int cardDisplayCount;
    @JSONField(name = "items")
    @Nullable
    private List<CommonCard> cards;
    private boolean exchangeLoaded;
    @Nullable
    private List<ModuleHeader> headers;
    @Nullable
    private String icon;
    @JSONField(name = "module_id")
    @Nullable
    private String moduleId;
    @NotNull
    private List<Producer> producers;
    @Nullable
    private Integer size;
    @Nullable
    private String style;
    @Nullable
    private String title;
    @Nullable
    private String type;
    @JSONField(name = "wid")
    @Nullable
    private Long[] wids;

    public RecommendModule() {
        this(null, null, null, null, 0, null, null, null, null, null, null, null, false, 8191);
    }

    @NotNull
    public static /* synthetic */ RecommendModule copy$default(RecommendModule recommendModule, String str, String str2, Long[] lArr, String str3, int i, ModuleAttr moduleAttr, List list, List list2, Integer num, List list3, String str4, String str5, boolean z, int i2, Object obj) {
        RecommendModule recommendModule2 = recommendModule;
        int i3 = i2;
        return recommendModule2.copy((i3 & 1) != 0 ? recommendModule2.title : str, (i3 & 2) != 0 ? recommendModule2.style : str2, (i3 & 4) != 0 ? recommendModule2.wids : lArr, (i3 & 8) != 0 ? recommendModule2.icon : str3, (i3 & 16) != 0 ? recommendModule2.cardDisplayCount : i, (i3 & 32) != 0 ? recommendModule2.attr : moduleAttr, (i3 & 64) != 0 ? recommendModule2.headers : list, (i3 & 128) != 0 ? recommendModule2.cards : list2, (i3 & 256) != 0 ? recommendModule2.size : num, (i3 & 512) != 0 ? recommendModule2.producers : list3, (i3 & 1024) != 0 ? recommendModule2.type : str4, (i3 & 2048) != 0 ? recommendModule2.moduleId : str5, (i3 & 4096) != 0 ? recommendModule2.exchangeLoaded : z);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final List<Producer> component10() {
        return this.producers;
    }

    @Nullable
    public final String component11() {
        return this.type;
    }

    @Nullable
    public final String component12() {
        return this.moduleId;
    }

    public final boolean component13() {
        return this.exchangeLoaded;
    }

    @Nullable
    public final String component2() {
        return this.style;
    }

    @Nullable
    public final Long[] component3() {
        return this.wids;
    }

    @Nullable
    public final String component4() {
        return this.icon;
    }

    public final int component5() {
        return this.cardDisplayCount;
    }

    @Nullable
    public final ModuleAttr component6() {
        return this.attr;
    }

    @Nullable
    public final List<ModuleHeader> component7() {
        return this.headers;
    }

    @Nullable
    public final List<CommonCard> component8() {
        return this.cards;
    }

    @Nullable
    public final Integer component9() {
        return this.size;
    }

    @NotNull
    public final RecommendModule copy(@Nullable String str, @Nullable String str2, @Nullable Long[] lArr, @Nullable String str3, int i, @Nullable ModuleAttr moduleAttr, @Nullable List<ModuleHeader> list, @Nullable List<CommonCard> list2, @Nullable Integer num, @NotNull List<Producer> list3, @Nullable String str4, @Nullable String str5, boolean z) {
        List<Producer> list4 = list3;
       //Intrinsics.checkParameterIsNotNull(list4, "producers");
        return new RecommendModule(str, str2, lArr, str3, i, moduleAttr, list, list2, num, list4, str4, str5, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendModule) {
            RecommendModule recommendModule = (RecommendModule) obj;
            if (Intrinsics.areEqual(this.title, recommendModule.title) &&Intrinsics.areEqual(this.style, recommendModule.style) &&Intrinsics.areEqual(this.wids, recommendModule.wids) &&Intrinsics.areEqual(this.icon, recommendModule.icon)) {
                if ((this.cardDisplayCount == recommendModule.cardDisplayCount ? 1 : null) != null &&Intrinsics.areEqual(this.attr, recommendModule.attr) &&Intrinsics.areEqual(this.headers, recommendModule.headers) &&Intrinsics.areEqual(this.cards, recommendModule.cards) &&Intrinsics.areEqual(this.size, recommendModule.size) &&Intrinsics.areEqual(this.producers, recommendModule.producers) &&Intrinsics.areEqual(this.type, recommendModule.type) &&Intrinsics.areEqual(this.moduleId, recommendModule.moduleId)) {
                    if ((this.exchangeLoaded == recommendModule.exchangeLoaded ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.style;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long[] lArr = this.wids;
        hashCode = (hashCode + (lArr != null ? Arrays.hashCode(lArr) : 0)) * 31;
        str2 = this.icon;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.cardDisplayCount) * 31;
        ModuleAttr moduleAttr = this.attr;
        hashCode = (hashCode + (moduleAttr != null ? moduleAttr.hashCode() : 0)) * 31;
        List list = this.headers;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.cards;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.size;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        list = this.producers;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        str2 = this.type;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.moduleId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.exchangeLoaded?1:0;
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecommendModule(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", style=");
        stringBuilder.append(this.style);
        stringBuilder.append(", wids=");
        stringBuilder.append(Arrays.toString(this.wids));
        stringBuilder.append(", icon=");
        stringBuilder.append(this.icon);
        stringBuilder.append(", cardDisplayCount=");
        stringBuilder.append(this.cardDisplayCount);
        stringBuilder.append(", attr=");
        stringBuilder.append(this.attr);
        stringBuilder.append(", headers=");
        stringBuilder.append(this.headers);
        stringBuilder.append(", cards=");
        stringBuilder.append(this.cards);
        stringBuilder.append(", size=");
        stringBuilder.append(this.size);
        stringBuilder.append(", producers=");
        stringBuilder.append(this.producers);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", moduleId=");
        stringBuilder.append(this.moduleId);
        stringBuilder.append(", exchangeLoaded=");
        stringBuilder.append(this.exchangeLoaded);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RecommendModule(@Nullable String str, @Nullable String str2, @Nullable Long[] lArr, @Nullable String str3, int i, @Nullable ModuleAttr moduleAttr, @Nullable List<ModuleHeader> list, @Nullable List<CommonCard> list2, @Nullable Integer num, @NotNull List<Producer> list3, @Nullable String str4, @Nullable String str5, boolean z) {
       //Intrinsics.checkParameterIsNotNull(list3, "producers");
        this.title = str;
        this.style = str2;
        this.wids = lArr;
        this.icon = str3;
        this.cardDisplayCount = i;
        this.attr = moduleAttr;
        this.headers = list;
        this.cards = list2;
        this.size = num;
        this.producers = list3;
        this.type = str4;
        this.moduleId = str5;
        this.exchangeLoaded = z;
    }

    public /* synthetic */ RecommendModule(String str, String str2, Long[] lArr, String str3, int i, ModuleAttr moduleAttr, List list, List list2, Integer num, List list3, String str4, String str5, boolean z, int i3) {
        this(str, str2, lArr, str3, i, moduleAttr, list, list2, num, list3, (i3 & 1024) != 0 ? (String) null : str4, (i3 & 2048) != 0 ? (String) null : str5, (i3 & 4096) != 0 ? false : z);
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    public final void setStyle(@Nullable String str) {
        this.style = str;
    }

    @Nullable
    public final Long[] getWids() {
        return this.wids;
    }

    public final void setWids(@Nullable Long[] lArr) {
        this.wids = lArr;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final int getCardDisplayCount() {
        return this.cardDisplayCount;
    }

    public final void setCardDisplayCount(int i) {
        this.cardDisplayCount = i;
    }

    @Nullable
    public final ModuleAttr getAttr() {
        return this.attr;
    }

    public final void setAttr(@Nullable ModuleAttr moduleAttr) {
        this.attr = moduleAttr;
    }

    @Nullable
    public final List<ModuleHeader> getHeaders() {
        return this.headers;
    }

    public final void setHeaders(@Nullable List<ModuleHeader> list) {
        this.headers = list;
    }

    @Nullable
    public final List<CommonCard> getCards() {
        return this.cards;
    }

    public final void setCards(@Nullable List<CommonCard> list) {
        this.cards = list;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    public final void setSize(@Nullable Integer num) {
        this.size = num;
    }

    @NotNull
    public final List<Producer> getProducers() {
        return this.producers;
    }

    public final void setProducers(@NotNull List<Producer> list) {
       //Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.producers = list;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @Nullable
    public final String getModuleId() {
        return this.moduleId;
    }

    public final void setModuleId(@Nullable String str) {
        this.moduleId = str;
    }

    public final boolean getExchangeLoaded() {
        return this.exchangeLoaded;
    }

    public final void setExchangeLoaded(boolean z) {
        this.exchangeLoaded = z;
    }
}
