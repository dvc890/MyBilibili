package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveHistoryItem {
    public static final int DATE_EARLIER = 2;
    public static final int DATE_TODAY = 0;
    public static final int DATE_YESTERDAY = 1;
    public static final int LIVE_OFFLINE = 0;
    @JSONField(name = "cover")
    public String cover;
    public int dateType = 0;
    @JSONField(name = "goto")
    public String gotoValue;
    @JSONField(name = "live_status")
    public int liveStatus;
    @JSONField(name = "mid")
    public long mid;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "history")
    public HistoryRoomId roomId;
    @JSONField(name = "tag_name")
    public String tagName;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "uri")
    public String uri;
    @JSONField(name = "view_at")
    public long viewAt;

    @Keep
    /* compiled from: BL */
    public static class HistoryRoomId {
        @JSONField(name = "oid")
        public int oid;
    }
}
