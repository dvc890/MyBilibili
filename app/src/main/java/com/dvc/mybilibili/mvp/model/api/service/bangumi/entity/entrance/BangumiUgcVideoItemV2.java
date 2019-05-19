package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001B\u00b5\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\nH\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\nH\u00c6\u0003J\t\u0010D\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0015H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\nH\u00c6\u0003J\t\u0010M\u001a\u00020\nH\u00c6\u0003J\t\u0010N\u001a\u00020\nH\u00c6\u0003J\u00b9\u0001\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\u0013\u0010P\u001a\u00020\u00122\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010R\u001a\u00020\nH\u00d6\u0001J\t\u0010S\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001e\u00a8\u0006T"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/BangumiUgcVideoItemV2;", "", "title", "", "cover", "uri", "param", "jumpTo", "name", "play", "", "danmaku", "reply", "favourite", "rid", "rname", "ugc_pay", "badgepay", "", "pageName", "duration", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;IZLjava/lang/String;J)V", "getBadgepay", "()Z", "setBadgepay", "(Z)V", "getCover", "()Ljava/lang/String;", "setCover", "(Ljava/lang/String;)V", "getDanmaku", "()I", "setDanmaku", "(I)V", "getDuration", "()J", "setDuration", "(J)V", "getFavourite", "setFavourite", "getJumpTo", "setJumpTo", "getName", "setName", "getPageName", "setPageName", "getParam", "setParam", "getPlay", "setPlay", "getReply", "setReply", "getRid", "setRid", "getRname", "setRname", "getTitle", "setTitle", "getUgc_pay", "setUgc_pay", "getUri", "setUri", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BangumiUgcVideoItemV2 {
    private boolean badgepay;
    @Nullable
    private String cover;
    private int danmaku;
    private long duration;
    private int favourite;
    @JSONField(name = "goto")
    @Nullable
    private String jumpTo;
    @Nullable
    private String name;
    @Nullable
    private String pageName;
    @Nullable
    private String param;
    private int play;
    private int reply;
    private int rid;
    @Nullable
    private String rname;
    @Nullable
    private String title;
    private int ugc_pay;
    @Nullable
    private String uri;

    public BangumiUgcVideoItemV2() {
        this(null, null, null, null, null, null, 0, 0, 0, 0, 0, null, 0, false, null, 0, 65535);
    }

    @NotNull
    public static /* synthetic */ BangumiUgcVideoItemV2 copy$default(BangumiUgcVideoItemV2 bangumiUgcVideoItemV2, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, int i5, String str7, int i6, boolean z, String str8, long j, int i7, Object obj) {
        int i8;
        String str9;
        long j2;
        BangumiUgcVideoItemV2 bangumiUgcVideoItemV22 = bangumiUgcVideoItemV2;
        int i9 = i7;
        String str10 = (i9 & 1) != 0 ? bangumiUgcVideoItemV22.title : str;
        String str11 = (i9 & 2) != 0 ? bangumiUgcVideoItemV22.cover : str2;
        String str12 = (i9 & 4) != 0 ? bangumiUgcVideoItemV22.uri : str3;
        String str13 = (i9 & 8) != 0 ? bangumiUgcVideoItemV22.param : str4;
        String str14 = (i9 & 16) != 0 ? bangumiUgcVideoItemV22.jumpTo : str5;
        String str15 = (i9 & 32) != 0 ? bangumiUgcVideoItemV22.name : str6;
        int i10 = (i9 & 64) != 0 ? bangumiUgcVideoItemV22.play : i;
        int i11 = (i9 & 128) != 0 ? bangumiUgcVideoItemV22.danmaku : i2;
        int i12 = (i9 & 256) != 0 ? bangumiUgcVideoItemV22.reply : i3;
        int i13 = (i9 & 512) != 0 ? bangumiUgcVideoItemV22.favourite : i4;
        int i14 = (i9 & 1024) != 0 ? bangumiUgcVideoItemV22.rid : i5;
        String str16 = (i9 & 2048) != 0 ? bangumiUgcVideoItemV22.rname : str7;
        int i15 = (i9 & 4096) != 0 ? bangumiUgcVideoItemV22.ugc_pay : i6;
        boolean z2 = (i9 & 8192) != 0 ? bangumiUgcVideoItemV22.badgepay : z;
        String str17 = (i9 & 16384) != 0 ? bangumiUgcVideoItemV22.pageName : str8;
        if ((i9 & 32768) != 0) {
            i8 = i15;
            str9 = str17;
            j2 = bangumiUgcVideoItemV22.duration;
        } else {
            i8 = i15;
            str9 = str17;
            j2 = j;
        }
        return bangumiUgcVideoItemV22.copy(str10, str11, str12, str13, str14, str15, i10, i11, i12, i13, i14, str16, i8, z2, str9, j2);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    public final int component10() {
        return this.favourite;
    }

    public final int component11() {
        return this.rid;
    }

    @Nullable
    public final String component12() {
        return this.rname;
    }

    public final int component13() {
        return this.ugc_pay;
    }

    public final boolean component14() {
        return this.badgepay;
    }

    @Nullable
    public final String component15() {
        return this.pageName;
    }

    public final long component16() {
        return this.duration;
    }

    @Nullable
    public final String component2() {
        return this.cover;
    }

    @Nullable
    public final String component3() {
        return this.uri;
    }

    @Nullable
    public final String component4() {
        return this.param;
    }

    @Nullable
    public final String component5() {
        return this.jumpTo;
    }

    @Nullable
    public final String component6() {
        return this.name;
    }

    public final int component7() {
        return this.play;
    }

    public final int component8() {
        return this.danmaku;
    }

    public final int component9() {
        return this.reply;
    }

    @NotNull
    public final BangumiUgcVideoItemV2 copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, int i2, int i3, int i4, int i5, @Nullable String str7, int i6, boolean z, @Nullable String str8, long j) {
        return new BangumiUgcVideoItemV2(str, str2, str3, str4, str5, str6, i, i2, i3, i4, i5, str7, i6, z, str8, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BangumiUgcVideoItemV2) {
            BangumiUgcVideoItemV2 bangumiUgcVideoItemV2 = (BangumiUgcVideoItemV2) obj;
            if (Intrinsics.areEqual(this.title, bangumiUgcVideoItemV2.title) &&Intrinsics.areEqual(this.cover, bangumiUgcVideoItemV2.cover) &&Intrinsics.areEqual(this.uri, bangumiUgcVideoItemV2.uri) &&Intrinsics.areEqual(this.param, bangumiUgcVideoItemV2.param) &&Intrinsics.areEqual(this.jumpTo, bangumiUgcVideoItemV2.jumpTo) &&Intrinsics.areEqual(this.name, bangumiUgcVideoItemV2.name)) {
                if ((this.play == bangumiUgcVideoItemV2.play ? 1 : null) != null) {
                    if ((this.danmaku == bangumiUgcVideoItemV2.danmaku ? 1 : null) != null) {
                        if ((this.reply == bangumiUgcVideoItemV2.reply ? 1 : null) != null) {
                            if ((this.favourite == bangumiUgcVideoItemV2.favourite ? 1 : null) != null) {
                                if ((this.rid == bangumiUgcVideoItemV2.rid ? 1 : null) != null &&Intrinsics.areEqual(this.rname, bangumiUgcVideoItemV2.rname)) {
                                    if ((this.ugc_pay == bangumiUgcVideoItemV2.ugc_pay ? 1 : null) != null) {
                                        if ((this.badgepay == bangumiUgcVideoItemV2.badgepay ? 1 : null) != null &&Intrinsics.areEqual(this.pageName, bangumiUgcVideoItemV2.pageName)) {
                                            if ((this.duration == bangumiUgcVideoItemV2.duration ? 1 : null) != null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
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
        String str2 = this.cover;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.uri;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.param;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.jumpTo;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.name;
        hashCode = (((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.play) * 31) + this.danmaku) * 31) + this.reply) * 31) + this.favourite) * 31) + this.rid) * 31;
        str2 = this.rname;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.ugc_pay) * 31;
        int i2 = this.badgepay?1:0;
        hashCode = (hashCode + i2) * 31;
        str2 = this.pageName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.duration;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiUgcVideoItemV2(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", cover=");
        stringBuilder.append(this.cover);
        stringBuilder.append(", uri=");
        stringBuilder.append(this.uri);
        stringBuilder.append(", param=");
        stringBuilder.append(this.param);
        stringBuilder.append(", jumpTo=");
        stringBuilder.append(this.jumpTo);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", play=");
        stringBuilder.append(this.play);
        stringBuilder.append(", danmaku=");
        stringBuilder.append(this.danmaku);
        stringBuilder.append(", reply=");
        stringBuilder.append(this.reply);
        stringBuilder.append(", favourite=");
        stringBuilder.append(this.favourite);
        stringBuilder.append(", rid=");
        stringBuilder.append(this.rid);
        stringBuilder.append(", rname=");
        stringBuilder.append(this.rname);
        stringBuilder.append(", ugc_pay=");
        stringBuilder.append(this.ugc_pay);
        stringBuilder.append(", badgepay=");
        stringBuilder.append(this.badgepay);
        stringBuilder.append(", pageName=");
        stringBuilder.append(this.pageName);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BangumiUgcVideoItemV2(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, int i2, int i3, int i4, int i5, @Nullable String str7, int i6, boolean z, @Nullable String str8, long j) {
        this.title = str;
        this.cover = str2;
        this.uri = str3;
        this.param = str4;
        this.jumpTo = str5;
        this.name = str6;
        this.play = i;
        this.danmaku = i2;
        this.reply = i3;
        this.favourite = i4;
        this.rid = i5;
        this.rname = str7;
        this.ugc_pay = i6;
        this.badgepay = z;
        this.pageName = str8;
        this.duration = j;
    }

    public /* synthetic */ BangumiUgcVideoItemV2(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, int i5, String str7, int i6, boolean z, String str8, long j, int i8) {
        this((i8 & 1) != 0 ? (String) null : str, (i8 & 2) != 0 ? (String) null : str2, (i8 & 4) != 0 ? (String) null : str3, (i8 & 8) != 0 ? (String) null : str4, (i8 & 16) != 0 ? (String) null : str5, (i8 & 32) != 0 ? (String) null : str6, (i8 & 64) != 0 ? 0 : i, (i8 & 128) != 0 ? 0 : i2, (i8 & 256) != 0 ? 0 : i3, (i8 & 512) != 0 ? 0 : i4, (i8 & 1024) != 0 ? 0 : i5, (i8 & 2048) != 0 ? (String) null : str7, (i8 & 4096) != 0 ? 0 : i6, (i8 & 8192) != 0 ? false : z, (i8 & 16384) != 0 ? (String) null : str8, (i8 & 32768) != 0 ? 0 : j);
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    @Nullable
    public final String getJumpTo() {
        return this.jumpTo;
    }

    public final void setJumpTo(@Nullable String str) {
        this.jumpTo = str;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final int getPlay() {
        return this.play;
    }

    public final void setPlay(int i) {
        this.play = i;
    }

    public final int getDanmaku() {
        return this.danmaku;
    }

    public final void setDanmaku(int i) {
        this.danmaku = i;
    }

    public final int getReply() {
        return this.reply;
    }

    public final void setReply(int i) {
        this.reply = i;
    }

    public final int getFavourite() {
        return this.favourite;
    }

    public final void setFavourite(int i) {
        this.favourite = i;
    }

    public final int getRid() {
        return this.rid;
    }

    public final void setRid(int i) {
        this.rid = i;
    }

    @Nullable
    public final String getRname() {
        return this.rname;
    }

    public final void setRname(@Nullable String str) {
        this.rname = str;
    }

    public final int getUgc_pay() {
        return this.ugc_pay;
    }

    public final void setUgc_pay(int i) {
        this.ugc_pay = i;
    }

    public final boolean getBadgepay() {
        return this.badgepay;
    }

    public final void setBadgepay(boolean z) {
        this.badgepay = z;
    }

    @Nullable
    public final String getPageName() {
        return this.pageName;
    }

    public final void setPageName(@Nullable String str) {
        this.pageName = str;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }
}
