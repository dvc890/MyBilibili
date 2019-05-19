package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo.BiliLiveEntryEffect;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo.LiveNotice;

@Keep
/* compiled from: BL */
public class BiliLiveUserInfoInRoom {
    @JSONField(name = "entry_effect")
    public BiliLiveEntryEffect entryEffect;
    @JSONField(name = "gift")
    public Gift gift;
    @JSONField(name = "info")
    public BiliLiveRoomUserInfo info;
    @JSONField(name = "level")
    public BiliLiveRoomUserLevel level;
    @JSONField(name = "privilege")
    public Privilege privilege;
    @JSONField(name = "room_admin")
    public RoomAdmin roomAdmin;
    @JSONField(name = "wallet")
    public Wallet wallet;

    @Keep
    /* compiled from: BL */
    public static class Gift {
        @JSONField(name = "is_show")
        public int isShow;
        @JSONField(name = "uid")
        public int uId;
    }

    @Keep
    /* compiled from: BL */
    public static class Privilege {
        @JSONField(name = "expired_time")
        public String expiredTime;
        @JSONField(name = "guard_notice")
        public int guardNotice;
        @JSONField(name = "heart_time")
        public int heartTime;
        @JSONField(name = "id")
        /* renamed from: id */
        public String f6006id;
        @JSONField(name = "heart_status")
        public boolean isHeartStatus;
        @JSONField(name = "broadcast")
        public LiveNotice notice;
        @JSONField(name = "notice_status")
        public int noticeStatus;
        @JSONField(name = "privilege_type")
        public String privilegeType;
        @JSONField(name = "target_id")
        public String targetId;
        @JSONField(name = "uid")
        public String uId;
    }

    @Keep
    /* compiled from: BL */
    public static class RoomAdmin {
        @JSONField(name = "is_admin")
        public int isAdmin;
    }

    @Keep
    /* compiled from: BL */
    public static class Wallet {
        @JSONField(name = "gold")
        public String gold;
        @JSONField(name = "silver")
        public String silver;
    }

    public boolean isCurrentUserAdmin() {
        return this.roomAdmin != null && this.roomAdmin.isAdmin == 1;
    }
}
