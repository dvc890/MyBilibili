package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.net.Uri;
import android.support.annotation.Keep;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.vondear.rxtool.RxLogTool;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;


@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomAttention;", "", "()V", "value", "", "getRoomAttention", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomAttention$AttentionConfig;", "AttentionConfig", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomAttention {
    @JSONField(name = "value")
    @NotNull
    //@JvmField
    public String value = "";

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomAttention$AttentionConfig;", "", "()V", "attentionAlertWaitTime", "", "attentionBubbleWaitTime", "displayMyAvatar", "isShowAttentionAlert", "isShowAttentionBubble", "isShowAttentionBubbleWithMedal", "shouldShowMyAvatar", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class AttentionConfig {
        @JSONField(name = "attentionAlertWaitTime")
        //@JvmField
        public int attentionAlertWaitTime;
        @JSONField(name = "attentionBubbleWaitTime")
        //@JvmField
        public int attentionBubbleWaitTime;
        @JSONField(name = "displayMyAvatar")
        //@JvmField
        public int displayMyAvatar;
        @JSONField(name = "isShowAttentionAlert")
        //@JvmField
        public int isShowAttentionAlert;
        @JSONField(name = "isShowAttentionBubble")
        //@JvmField
        public int isShowAttentionBubble;
        @JSONField(name = "isShowAttentionBubbleWithMedal")
        //@JvmField
        public int isShowAttentionBubbleWithMedal;

        public final boolean shouldShowMyAvatar() {
            return this.displayMyAvatar == 1;
        }
    }

    @Nullable
    public final AttentionConfig getRoomAttention() {
        String str = null;
        AttentionConfig attentionConfig = (AttentionConfig) null;
        try {
            return (AttentionConfig) JSON.parseObject(Uri.decode(this.value), AttentionConfig.class);
        } catch (Exception e) {
            String str2 = "BiliLiveRoomAttention";
            Throwable th = (Throwable) null;
//            if (!hdh.f90203a.mo97787b(1)) {
//                return attentionConfig;
//            }
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("get room attention config error, ");
                stringBuilder.append(e.getMessage());
                str = stringBuilder.toString();
            } catch (Exception e2) {
                RxLogTool.e("LiveLog", "getLogMessage", e2);
            }
            if (str == null) {
                str = "";
            }
            RxLogTool.d(str2, str);
            return attentionConfig;
        }
    }
}
