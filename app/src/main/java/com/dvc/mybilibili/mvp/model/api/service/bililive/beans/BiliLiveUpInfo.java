package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveUpInfo {
    public static final int GENDER_MAN = 1;
    public static final int GENDER_UNKONW = 0;
    public static final int GENDER_WOMAN = 2;
    @JSONField(name = "exp")
    public LiveMasterExp exp;
    @JSONField(name = "follower_num")
    public int followerNum;
    @JSONField(name = "glory_count")
    public int gloryCount;
    @JSONField(name = "info")
    public LiveMasterInfo info;
    @JSONField(name = "link_group_num")
    public int linkGroupNum;
    @JSONField(name = "medal_name")
    public String medalName;
    @JSONField(name = "pendant")
    public String pendant;
    @JSONField(name = "room_id")
    public int roomId;
    @JSONField(name = "room_news")
    public RoomNewsEntity roomNews;

    @Keep
    /* compiled from: BL */
    public static class LiveMasterExp {
        @JSONField(name = "master_level")
        public MasterLevel masterLevel;
    }

    @Keep
    /* compiled from: BL */
    public static class LiveMasterInfo {
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "gender")
        public int gender;
        @JSONField(name = "official_verify")
        public OfficialVerify officialVerify;
        @JSONField(name = "uname")
        public String uName;
        @JSONField(name = "uid")
        public int uid;
    }

    @Keep
    /* compiled from: BL */
    public static class MasterLevel {
        @JSONField(name = "color")
        public int color;
        @JSONField(name = "current")
        public List<Integer> current;
        @JSONField(name = "level")
        public int level;
        @JSONField(name = "next")
        public List<Integer> next;
    }

    @Keep
    /* compiled from: BL */
    public static class OfficialVerify {
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "type")
        public int type;
    }

    @Keep
    /* compiled from: BL */
    public static class RoomNewsEntity {
        @JSONField(name = "content")
        public String content;
        @JSONField(name = "ctime")
        public String ctime;
        @JSONField(name = "ctime_text")
        public String ctimeText;
    }
}
