package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveBarrageSetting {
    @JSONField(name = "color")
    public int mMsgColor;
    @JSONField(name = "length")
    public int mMsgLength;
    @JSONField(name = "mode")
    public int mMsgMode;
    @JSONField(name = "roomid")
    public int mRoomId;
}
