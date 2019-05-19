package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveRoomFansFight {
    @JSONField(name = "list")
    public List<MemberInfo> list;
    @JSONField(name = "master")
    public MemberInfo master;
    @JSONField(name = "other")
    public Other other;

    @Keep
    /* compiled from: BL */
    public static class MemberInfo {
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "rank")
        public int rank;
        @JSONField(name = "score")
        public String score;
        @JSONField(name = "uname")
        public String uname;
        @JSONField(name = "union_name")
        public String union_name;
    }

    @Keep
    /* compiled from: BL */
    public static class Other {
        @JSONField(name = "list")
        public List<MemberInfo> list;
        @JSONField(name = "score")
        public int score;
    }
}
