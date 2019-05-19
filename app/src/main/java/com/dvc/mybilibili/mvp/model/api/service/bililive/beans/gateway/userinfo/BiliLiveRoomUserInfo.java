package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import android.support.annotation.Nullable;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001eR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveRoomUserInfo;", "", "()V", "badge", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserBadge;", "extraConfig", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserExtraConfig;", "info", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserInfo;", "medal", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserMedalInfo;", "myUserCardEntranceBadge", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/MyUserCardEntranceBadge;", "privilege", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserPrivilege;", "property", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserRoomProperty;", "relation", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserRelation;", "title", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserTitle;", "userLevel", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserLevel;", "userReward", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserReward;", "vipInfo", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserVip;", "wallet", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveWallet;", "isCurrentUserAdmin", "", "setCurrentUserAdmin", "", "isAdmin", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomUserInfo {
    @JSONField(name = "badge")
    @Nullable
    //@JvmField
    public BiliLiveUserBadge badge;
    @JSONField(name = "extra_config")
    @Nullable
    //@JvmField
    public BiliLiveUserExtraConfig extraConfig;
    @JSONField(name = "info")
    @Nullable
    //@JvmField
    public BiliLiveUserInfo info;
    @JSONField(name = "medal")
    @Nullable
    //@JvmField
    public BiliLiveUserMedalInfo medal;
    @JSONField(name = "notice")
    @Nullable
    //@JvmField
    public MyUserCardEntranceBadge myUserCardEntranceBadge;
    @JSONField(name = "privilege")
    @Nullable
    //@JvmField
    public BiliLiveUserPrivilege privilege;
    @JSONField(name = "property")
    @Nullable
    //@JvmField
    public BiliLiveUserRoomProperty property;
    @JSONField(name = "relation")
    @Nullable
    //@JvmField
    public BiliLiveUserRelation relation;
    @JSONField(name = "title")
    @Nullable
    //@JvmField
    public BiliLiveUserTitle title;
    @JSONField(name = "user_level")
    @Nullable
    //@JvmField
    public BiliLiveUserLevel userLevel;
    @JSONField(name = "user_reward")
    @Nullable
    //@JvmField
    public BiliLiveUserReward userReward;
    @JSONField(name = "vip")
    @Nullable
    //@JvmField
    public BiliLiveUserVip vipInfo;
    @JSONField(name = "wallet")
    @Nullable
    //@JvmField
    public BiliLiveWallet wallet;

    public final boolean isCurrentUserAdmin() {
        if (this.badge == null) {
            return false;
        }
        BiliLiveUserBadge biliLiveUserBadge = this.badge;
        return biliLiveUserBadge != null && biliLiveUserBadge.isRoomAdmin;
    }

    public final void setCurrentUserAdmin(boolean z) {
        BiliLiveUserBadge biliLiveUserBadge = this.badge;
        if (biliLiveUserBadge != null) {
            biliLiveUserBadge.isRoomAdmin = z;
        }
    }
}
