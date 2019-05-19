package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livecenter;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livecenter/RedAlarm;", "", "()V", "alarmCount", "", "moduleName", "", "toString", "Companion", "ModuleName", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class RedAlarm {
    public static final Companion Companion = new Companion();
    @NotNull
    public static final String MODULE_GUARD_RENEW = "live_guard";
    @NotNull
    public static final String MODULE_LOTTERY_AWARD = "live_lottery_award";
    @NotNull
    public static final String MODULE_TITLE = "live_title";
    @JSONField(name = "alarm_num")
    //@JvmField
    public int alarmCount;
    @JSONField(name = "module")
    @NotNull
    //@JvmField
    public String moduleName = "";

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livecenter/RedAlarm$ModuleName;", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: BL */
    public @interface ModuleName {
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/livecenter/RedAlarm$Companion;", "", "()V", "MODULE_GUARD_RENEW", "", "MODULE_LOTTERY_AWARD", "MODULE_TITLE", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
        private Companion() {
        }

//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("module:");
        stringBuilder.append(this.moduleName);
        stringBuilder.append(", alarmCount:");
        stringBuilder.append(this.alarmCount);
        return stringBuilder.toString();
    }
}
