package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;

@Keep
/* compiled from: BL */
public class BiliLiveLotteryBroadcast {
    @JSONField(name = "guard_product_id")
    public String guardProductId;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "link")
    public String mLink;
    @JSONField(name = "lottery")
    public BiliLiveGuardLottery mLottery;
    @JSONField(name = "message")
    public String mMessage;
    @JSONField(name = "privilege_type")
    public int mPrivilege;
    @JSONField(name = "roomid")
    public int mRoomid;
    @JSONField(name = "type")
    public String mType;

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id:");
        stringBuilder.append(this.mId);
        stringBuilder.append(" type:");
        stringBuilder.append(this.mType);
        stringBuilder.append(" mPrivilege");
        stringBuilder.append(this.mPrivilege);
        return stringBuilder.toString();
    }
}
