package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveMyMedals;", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "list", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveMyMedals$BiliLiveMedalBean;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "max", "getMax", "setMax", "BiliLiveMedalBean", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveMyMedals {
    @JSONField(name = "cnt")
    private int count;
    @JSONField(name = "list")
    @NotNull
    private ArrayList<BiliLiveMedalBean> list = new ArrayList();
    @JSONField(name = "max")
    private int max;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001e\u0010 \u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001e\u0010#\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001e\u0010&\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\u001e\u0010)\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR \u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001e\u0010/\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR\u001e\u00102\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR \u00105\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR \u00108\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001e\u0010;\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR\u001e\u0010>\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000eR\u001e\u0010A\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR\u001e\u0010D\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000e\u00a8\u0006G"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveMyMedals$BiliLiveMedalBean;", "", "()V", "buffMsg", "", "getBuffMsg", "()Ljava/lang/String;", "setBuffMsg", "(Ljava/lang/String;)V", "dayLimit", "", "getDayLimit", "()I", "setDayLimit", "(I)V", "iconCode", "getIconCode", "setIconCode", "iconText", "getIconText", "setIconText", "intimacy", "getIntimacy", "setIntimacy", "isChecked", "", "()Z", "setChecked", "(Z)V", "lastWearTime", "getLastWearTime", "setLastWearTime", "liveStatus", "getLiveStatus", "setLiveStatus", "medalColor", "getMedalColor", "setMedalColor", "medalId", "getMedalId", "setMedalId", "medalLevel", "getMedalLevel", "setMedalLevel", "medalName", "getMedalName", "setMedalName", "nextIntimacy", "getNextIntimacy", "setNextIntimacy", "score", "getScore", "setScore", "targetId", "getTargetId", "setTargetId", "targetName", "getTargetName", "setTargetName", "targetRoomId", "getTargetRoomId", "setTargetRoomId", "todayFeed", "getTodayFeed", "setTodayFeed", "uid", "getUid", "setUid", "wearStatus", "getWearStatus", "setWearStatus", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class BiliLiveMedalBean {
        @JSONField(name = "buff_msg")
        @Nullable
        private String buffMsg;
        @JSONField(name = "day_limit")
        private int dayLimit;
        @JSONField(name = "icon_code")
        private int iconCode;
        @JSONField(name = "icon_text")
        @Nullable
        private String iconText;
        @JSONField(name = "intimacy")
        private int intimacy;
        private boolean isChecked;
        @JSONField(name = "last_wear_time")
        private int lastWearTime;
        @JSONField(name = "live_stream_status")
        private int liveStatus;
        @JSONField(name = "medal_color")
        private int medalColor;
        @JSONField(name = "medal_id")
        private int medalId;
        @JSONField(name = "medal_level")
        private int medalLevel;
        @JSONField(name = "medal_name")
        @Nullable
        private String medalName;
        @JSONField(name = "next_intimacy")
        private int nextIntimacy;
        @JSONField(name = "score")
        private int score;
        @JSONField(name = "target_id")
        @Nullable
        private String targetId;
        @JSONField(name = "target_name")
        @Nullable
        private String targetName;
        @JSONField(name = "room_id")
        private int targetRoomId;
        @JSONField(name = "today_feed")
        private int todayFeed;
        @JSONField(name = "uid")
        private int uid;
        @JSONField(name = "status")
        private int wearStatus;

        public final int getUid() {
            return this.uid;
        }

        public final void setUid(int i) {
            this.uid = i;
        }

        @Nullable
        public final String getTargetId() {
            return this.targetId;
        }

        public final void setTargetId(@Nullable String str) {
            this.targetId = str;
        }

        @Nullable
        public final String getTargetName() {
            return this.targetName;
        }

        public final void setTargetName(@Nullable String str) {
            this.targetName = str;
        }

        public final int getTargetRoomId() {
            return this.targetRoomId;
        }

        public final void setTargetRoomId(int i) {
            this.targetRoomId = i;
        }

        public final int getLiveStatus() {
            return this.liveStatus;
        }

        public final void setLiveStatus(int i) {
            this.liveStatus = i;
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

        public final int getMedalColor() {
            return this.medalColor;
        }

        public final void setMedalColor(int i) {
            this.medalColor = i;
        }

        public final int getMedalLevel() {
            return this.medalLevel;
        }

        public final void setMedalLevel(int i) {
            this.medalLevel = i;
        }

        public final int getIntimacy() {
            return this.intimacy;
        }

        public final void setIntimacy(int i) {
            this.intimacy = i;
        }

        public final int getNextIntimacy() {
            return this.nextIntimacy;
        }

        public final void setNextIntimacy(int i) {
            this.nextIntimacy = i;
        }

        public final int getWearStatus() {
            return this.wearStatus;
        }

        public final void setWearStatus(int i) {
            this.wearStatus = i;
        }

        public final int getIconCode() {
            return this.iconCode;
        }

        public final void setIconCode(int i) {
            this.iconCode = i;
        }

        @Nullable
        public final String getIconText() {
            return this.iconText;
        }

        public final void setIconText(@Nullable String str) {
            this.iconText = str;
        }

        public final int getTodayFeed() {
            return this.todayFeed;
        }

        public final void setTodayFeed(int i) {
            this.todayFeed = i;
        }

        public final int getDayLimit() {
            return this.dayLimit;
        }

        public final void setDayLimit(int i) {
            this.dayLimit = i;
        }

        public final int getScore() {
            return this.score;
        }

        public final void setScore(int i) {
            this.score = i;
        }

        public final int getLastWearTime() {
            return this.lastWearTime;
        }

        public final void setLastWearTime(int i) {
            this.lastWearTime = i;
        }

        @Nullable
        public final String getBuffMsg() {
            return this.buffMsg;
        }

        public final void setBuffMsg(@Nullable String str) {
            this.buffMsg = str;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final void setChecked(boolean z) {
            this.isChecked = z;
        }
    }

    public final int getMax() {
        return this.max;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    @NotNull
    public final ArrayList<BiliLiveMedalBean> getList() {
        return this.list;
    }

    public final void setList(@NotNull ArrayList<BiliLiveMedalBean> arrayList) {
        //Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.list = arrayList;
    }
}
