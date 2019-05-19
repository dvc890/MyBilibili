package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomMedal {
    @JSONField(name = "buff_msg")
    public String buffMsg;
    @JSONField(name = "day_limit")
    public int dayLimit;
    @JSONField(name = "icon_code")
    public int iconCode;
    @JSONField(name = "icon_text")
    public String iconText;
    @JSONField(name = "id")
    /* renamed from: id */
    public int f6002id;
    @JSONField(name = "intimacy")
    public int intimacy;
    public boolean isChecked = false;
    @JSONField(name = "status")
    public int isWeared;
    @JSONField(name = "last_wear_time")
    public int lastWearTime;
    @JSONField(name = "live_stream_status")
    public int liveStatus;
    @JSONField(name = "medal_color")
    public int medalColor;
    @JSONField(name = "medal_id")
    public int medalId;
    @JSONField(name = "medal_level")
    public int medalLevel;
    @JSONField(name = "medal_name")
    public String medalName;
    @JSONField(name = "next_intimacy")
    public int nextIntimacy;
    @JSONField(name = "score")
    public int score;
    @JSONField(name = "sup_code")
    public int supCode;
    @JSONField(name = "sup_text")
    public String supText;
    @JSONField(name = "target_id")
    public String targetId;
    @JSONField(name = "target_name")
    public String targetName;
    @JSONField(name = "room_id")
    public int targetRoomId;
    @JSONField(name = "today_feed")
    public int todayFeed;
    @JSONField(name = "uid")
    public int uid;
}
