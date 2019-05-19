package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveUpMedalInfo {
    @JSONField(name = "charge_num")
    public int chargeNum;
    @JSONField(name = "coin_num")
    public int coinNum;
    @JSONField(name = "live_status")
    public int liveStatus;
    @JSONField(name = "master_status")
    public int masterStatus;
    @JSONField(name = "id")
    public int medalId;
    @JSONField(name = "medal_name")
    public String medalName;
    @JSONField(name = "live_medal_open_condition")
    public String openConditionMsg;
    @JSONField(name = "reason")
    public String reason;
    @JSONField(name = "rename_name")
    public String renameName;
    @JSONField(name = "rename_reason")
    public String renameReason;
    @JSONField(name = "rename_status")
    public int renameStatus;
    @JSONField(name = "status")
    public int status;
    @JSONField(name = "time_able_change")
    public int timeRemain;
    @JSONField(name = "uid")
    public String uid;
}
