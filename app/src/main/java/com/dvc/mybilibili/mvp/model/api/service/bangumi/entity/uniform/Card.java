package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u000bH\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u000bH\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u000bH\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019\u00a8\u0006B"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/Card;", "", "type", "", "id", "", "title", "desc", "cover", "scover", "re_type", "", "re_value", "corner", "card", "size", "position", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getCard", "()I", "setCard", "(I)V", "getCorner", "()Ljava/lang/String;", "setCorner", "(Ljava/lang/String;)V", "getCover", "setCover", "getDesc", "setDesc", "getId", "()J", "setId", "(J)V", "getPosition", "setPosition", "getRe_type", "setRe_type", "getRe_value", "setRe_value", "getScover", "setScover", "getSize", "setSize", "getTitle", "setTitle", "getType", "setType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class Card {
    private int card;
    @NotNull
    private String corner;
    @NotNull
    private String cover;
    @NotNull
    private String desc;
    /* renamed from: id */
    private long f15278id;
    private int position;
    private int re_type;
    @NotNull
    private String re_value;
    @NotNull
    private String scover;
    @NotNull
    private String size;
    @NotNull
    private String title;
    @NotNull
    private String type;

    public Card() {
//        this(null, 0, null, null, null, null, 0, null, null, 0, null, 0, 4095, null);
    }


    @NotNull
    public static /* synthetic */ Card copy$default(Card card, String str, long j, String str2, String str3, String str4, String str5, int i, String str6, String str7, int i2, String str8, int i3, int i4, Object obj) {
        Card card2 = card;
        int i5 = i4;
        return card2.copy((i5 & 1) != 0 ? card2.type : str, (i5 & 2) != 0 ? card2.f15278id : j, (i5 & 4) != 0 ? card2.title : str2, (i5 & 8) != 0 ? card2.desc : str3, (i5 & 16) != 0 ? card2.cover : str4, (i5 & 32) != 0 ? card2.scover : str5, (i5 & 64) != 0 ? card2.re_type : i, (i5 & 128) != 0 ? card2.re_value : str6, (i5 & 256) != 0 ? card2.corner : str7, (i5 & 512) != 0 ? card2.card : i2, (i5 & 1024) != 0 ? card2.size : str8, (i5 & 2048) != 0 ? card2.position : i3);
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    public final int component10() {
        return this.card;
    }

    @NotNull
    public final String component11() {
        return this.size;
    }

    public final int component12() {
        return this.position;
    }

    public final long component2() {
        return this.f15278id;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final String component4() {
        return this.desc;
    }

    @NotNull
    public final String component5() {
        return this.cover;
    }

    @NotNull
    public final String component6() {
        return this.scover;
    }

    public final int component7() {
        return this.re_type;
    }

    @NotNull
    public final String component8() {
        return this.re_value;
    }

    @NotNull
    public final String component9() {
        return this.corner;
    }

    @NotNull
    public final Card copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, int i3) {
        String str9 = str;
       //Intrinsics.checkParameterIsNotNull(str9, "type");
        String str10 = str2;
       //Intrinsics.checkParameterIsNotNull(str10, "title");
        String str11 = str3;
       //Intrinsics.checkParameterIsNotNull(str11, SocialConstants.PARAM_APP_DESC);
        String str12 = str4;
       //Intrinsics.checkParameterIsNotNull(str12, "cover");
        String str13 = str5;
       //Intrinsics.checkParameterIsNotNull(str13, "scover");
        String str14 = str6;
       //Intrinsics.checkParameterIsNotNull(str14, "re_value");
        String str15 = str7;
       //Intrinsics.checkParameterIsNotNull(str15, "corner");
        String str16 = str8;
       //Intrinsics.checkParameterIsNotNull(str16, "size");
        return new Card(str9, j, str10, str11, str12, str13, i, str14, str15, i2, str16, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Card) {
            Card card = (Card) obj;
            if (this.type.equals(card.type)) {
                if ((this.f15278id == card.f15278id ? 1 : null) != null && Intrinsics.areEqual(this.title, card.title) &&Intrinsics.areEqual(this.desc, card.desc) &&Intrinsics.areEqual(this.cover, card.cover) &&Intrinsics.areEqual(this.scover, card.scover)) {
                    if ((this.re_type == card.re_type ? 1 : null) != null &&Intrinsics.areEqual(this.re_value, card.re_value) &&Intrinsics.areEqual(this.corner, card.corner)) {
                        if ((this.card == card.card ? 1 : null) != null &&Intrinsics.areEqual(this.size, card.size)) {
                            if ((this.position == card.position ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f15278id;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.title;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.desc;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.cover;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.scover;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.re_type) * 31;
        str2 = this.re_value;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.corner;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.card) * 31;
        str2 = this.size;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.position;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Card(type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", id=");
        stringBuilder.append(this.f15278id);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", desc=");
        stringBuilder.append(this.desc);
        stringBuilder.append(", cover=");
        stringBuilder.append(this.cover);
        stringBuilder.append(", scover=");
        stringBuilder.append(this.scover);
        stringBuilder.append(", re_type=");
        stringBuilder.append(this.re_type);
        stringBuilder.append(", re_value=");
        stringBuilder.append(this.re_value);
        stringBuilder.append(", corner=");
        stringBuilder.append(this.corner);
        stringBuilder.append(", card=");
        stringBuilder.append(this.card);
        stringBuilder.append(", size=");
        stringBuilder.append(this.size);
        stringBuilder.append(", position=");
        stringBuilder.append(this.position);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Card(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, int i3) {
       Intrinsics.checkParameterIsNotNull(str, "type");
       Intrinsics.checkParameterIsNotNull(str2, "title");
//       Intrinsics.checkParameterIsNotNull(str3, SocialConstants.PARAM_APP_DESC);
       Intrinsics.checkParameterIsNotNull(str4, "cover");
       Intrinsics.checkParameterIsNotNull(str5, "scover");
       Intrinsics.checkParameterIsNotNull(str6, "re_value");
       Intrinsics.checkParameterIsNotNull(str7, "corner");
       Intrinsics.checkParameterIsNotNull(str8, "size");
        this.type = str;
        this.f15278id = j;
        this.title = str2;
        this.desc = str3;
        this.cover = str4;
        this.scover = str5;
        this.re_type = i;
        this.re_value = str6;
        this.corner = str7;
        this.card = i2;
        this.size = str8;
        this.position = i3;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setType(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.type = str;
    }

    public final long getId() {
        return this.f15278id;
    }

    public final void setId(long j) {
        this.f15278id = j;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final void setDesc(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.desc = str;
    }

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    public final void setCover(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.cover = str;
    }

    @NotNull
    public final String getScover() {
        return this.scover;
    }

    public final void setScover(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.scover = str;
    }

    public final int getRe_type() {
        return this.re_type;
    }

    public final void setRe_type(int i) {
        this.re_type = i;
    }

    @NotNull
    public final String getRe_value() {
        return this.re_value;
    }

    public final void setRe_value(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.re_value = str;
    }

    @NotNull
    public final String getCorner() {
        return this.corner;
    }

    public final void setCorner(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.corner = str;
    }

    public final int getCard() {
        return this.card;
    }

    public final void setCard(int i) {
        this.card = i;
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    public final void setSize(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.size = str;
    }

//    public /* synthetic */ Card(String str, long j, String str2, String str3, String str4, String str5, int i, String str6, String str7, int i2, String str8, int i3, int i4) {
//        int i5 = i4;
//        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : j, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? "" : str3, (i5 & 16) != 0 ? "" : str4, (i5 & 32) != 0 ? "" : str5, (i5 & 64) != 0 ? 0 : i, (i5 & 128) != 0 ? "" : str6, (i5 & 256) != 0 ? "" : str7, (i5 & 512) != 0 ? 0 : i2, (i5 & 1024) != 0 ? "" : str8, (i5 & 2048) != 0 ? 0 : i3);
//    }

    public final int getPosition() {
        return this.position;
    }

    public final void setPosition(int i) {
        this.position = i;
    }
}
