package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveMasterSearchResult {
    @JSONField(name = "live_master")
    public LiveSearchMaster liveMaster;
    @JSONField(name = "live_room")
    public LiveSearchRoom liveRoom;
    @JSONField(name = "pages")
    public int page;
    @JSONField(name = "trackid")
    public String trackId;

    @Keep
    /* compiled from: BL */
    public static class GloryInfo {
        @JSONField(name = "items")
        public List<GloryItem> items;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "total")
        public int total;
    }

    @Keep
    /* compiled from: BL */
    public static class GloryItem {
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "title")
        public String title;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveMasterItem {
        @JSONField(name = "cate_name")
        public String areaName;
        @JSONField(name = "attentions")
        public int attentions;
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "glory_info")
        public GloryInfo gloryInfo;
        @JSONField(name = "is_atten")
        public int isAtten;
        @JSONField(name = "level")
        public int level;
        @JSONField(name = "level_color")
        public int levelColor;
        @JSONField(name = "live_status")
        public int liveStatus;
        @JSONField(name = "mid")
        public int mid;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "online")
        public int onLine;
        @JSONField(name = "cate_parent_name")
        public String parentAreaName;
        @JSONField(name = "roomid")
        public int roomId;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "ucover")
        public String ucover;
        @JSONField(name = "uri")
        public String uri;
        @JSONField(name = "verify_desc")
        public String verifyDesc;
        @JSONField(name = "verify_type")
        public int verifyType;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveRoomItem {
        @JSONField(name = "area_v2_name")
        public String areaName;
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "live_status")
        public int liveStatus;
        @JSONField(name = "mid")
        public long mid;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "online")
        public int online;
        @JSONField(name = "param")
        public String param;
        @JSONField(name = "roomid")
        public int roomId;
        @JSONField(name = "short_id")
        public int shortId;
        @JSONField(name = "goto")
        public String str_goto;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "uri")
        public String uri;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveSearchMaster {
        @JSONField(name = "items")
        public List<LiveMasterItem> items;
        @JSONField(name = "pages")
        public int pages;
        @JSONField(name = "total")
        public int total;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveSearchRoom {
        @JSONField(name = "items")
        public List<LiveRoomItem> items;
        @JSONField(name = "pages")
        public int pages;
        @JSONField(name = "total")
        public int total;
    }
}
