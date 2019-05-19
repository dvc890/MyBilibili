package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveAward {
    public static final int TYPE_ACTIVE_CODE = 6;
    public static final int TYPE_RAEL_STAFF = 2;
    public static final int TYPE_SEA_PATROL = 3;
    public static final int TYPE_SEA_PATROL_ROOM_ID = 30;
    public static final int TYPE_SEA_PATROL_UID = 31;
    @JSONField(name = "create_time")
    public String mCreateTime;
    @JSONField(name = "custom_fields")
    public String mCustomFields;
    @JSONField(name = "expire_status")
    public int mExpireStatus;
    @JSONField(name = "expire_time")
    public String mExpireTime;
    @JSONField(name = "gift_name")
    public String mGiftName;
    @JSONField(name = "gift_num")
    public int mGiftNum;
    @JSONField(name = "gift_type")
    public int mGiftType;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "receive_comment")
    public String mReceiveComment;
    @JSONField(name = "receive_time")
    public String mReceiveTime;
    @JSONField(name = "source")
    public String mSource;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "type_name")
    public String mTypeName;
    @JSONField(name = "update_time")
    public String mUpdateTime;

    /* compiled from: BL */
    public static class CustomFiled {
        @JSONField(name = "hint")
        public String mHint;
        @JSONField(name = "id")
        public String mId;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "value")
        public String mValue;
    }
}
