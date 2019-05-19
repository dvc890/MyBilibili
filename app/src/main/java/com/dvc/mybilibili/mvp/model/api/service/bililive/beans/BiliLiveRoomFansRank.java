package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomFansRank {
    public static final int STATUS_BZZ = 1;
    public static final int STATUS_YY = 0;
    @JSONField(name = "days")
    public int days;
    @JSONField(name = "face")
    public String face;
    @JSONField(name = "fight_status")
    public int fight_status;
    @JSONField(name = "id")
    /* renamed from: id */
    public int f6001id;
    @JSONField(name = "rank")
    public int rank;
    @JSONField(name = "score")
    public int score;
    @JSONField(name = "uid")
    public long uid;
    @JSONField(name = "uname")
    public String uname;
    @JSONField(name = "union_name")
    public String union_name;
}
