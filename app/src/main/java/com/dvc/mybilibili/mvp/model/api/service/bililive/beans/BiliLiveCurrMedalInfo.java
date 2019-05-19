package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001e\u0010-\u001a\u00020%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)\u00a8\u00060"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveCurrMedalInfo;", "", "()V", "guardLevel", "", "getGuardLevel", "()I", "setGuardLevel", "(I)V", "level", "getLevel", "setLevel", "medalColor", "getMedalColor", "setMedalColor", "medalId", "getMedalId", "setMedalId", "medalName", "", "getMedalName", "()Ljava/lang/String;", "setMedalName", "(Ljava/lang/String;)V", "medalRoomId", "getMedalRoomId", "setMedalRoomId", "pendant", "getPendant", "setPendant", "pendantFrom", "getPendantFrom", "setPendantFrom", "targetFace", "getTargetFace", "setTargetFace", "uid", "", "getUid", "()J", "setUid", "(J)V", "upName", "getUpName", "setUpName", "upUid", "getUpUid", "setUpUid", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveCurrMedalInfo {
    @JSONField(name = "guard_level")
    private int guardLevel;
    @JSONField(name = "level")
    private int level;
    @JSONField(name = "medal_color")
    private int medalColor;
    @JSONField(name = "medal_id")
    private int medalId;
    @JSONField(name = "medal_name")
    @Nullable
    private String medalName;
    @JSONField(name = "room_id")
    private int medalRoomId;
    @JSONField(name = "pendant")
    @NotNull
    private String pendant = "";
    @JSONField(name = "pendant_from")
    private int pendantFrom;
    @JSONField(name = "target_face")
    @NotNull
    private String targetFace = "";
    @JSONField(name = "uid")
    private long uid;
    @JSONField(name = "target_name")
    @NotNull
    private String upName = "";
    @JSONField(name = "up_uid")
    private long upUid;

    public final long getUid() {
        return this.uid;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final long getUpUid() {
        return this.upUid;
    }

    public final void setUpUid(long j) {
        this.upUid = j;
    }

    @NotNull
    public final String getTargetFace() {
        return this.targetFace;
    }

    public final void setTargetFace(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.targetFace = str;
    }

    @NotNull
    public final String getPendant() {
        return this.pendant;
    }

    public final void setPendant(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pendant = str;
    }

    public final int getPendantFrom() {
        return this.pendantFrom;
    }

    public final void setPendantFrom(int i) {
        this.pendantFrom = i;
    }

    public final int getGuardLevel() {
        return this.guardLevel;
    }

    public final void setGuardLevel(int i) {
        this.guardLevel = i;
    }

    public final int getMedalRoomId() {
        return this.medalRoomId;
    }

    public final void setMedalRoomId(int i) {
        this.medalRoomId = i;
    }

    public final int getMedalId() {
        return this.medalId;
    }

    public final void setMedalId(int i) {
        this.medalId = i;
    }

    @Nullable
    public final String getMedalName() {
        return this.medalName;
    }

    public final void setMedalName(@Nullable String str) {
        this.medalName = str;
    }

    public final int getLevel() {
        return this.level;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final int getMedalColor() {
        return this.medalColor;
    }

    public final void setMedalColor(int i) {
        this.medalColor = i;
    }

    @NotNull
    public final String getUpName() {
        return this.upName;
    }

    public final void setUpName(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.upName = str;
    }
}
