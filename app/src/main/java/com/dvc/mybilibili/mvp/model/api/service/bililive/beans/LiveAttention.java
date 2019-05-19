package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class LiveAttention {
    public static final int ENTERPRISE_VERIFY = 1;
    public static final int PERSONAL_VERIFY = 0;
    @JSONField(name = "accept_quality")
    public List<String> acceptuality;
    @JSONField(name = "area_v2_id")
    public int areaId;
    @Nullable
    @JSONField(name = "area_v2_name")
    public String areaName;
    @JSONField(name = "broadcast_type")
    public int broadcasetType;
    @Nullable
    @JSONField(name = "pendent_ru_color")
    public String conerBgColor;
    @Nullable
    @JSONField(name = "pendent_ru_pic")
    public String cornerBgUrl;
    @Nullable
    @JSONField(name = "pendent_ru")
    public String cornerText;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "current_quality")
    public int currentQuality;
    @Nullable
    @JSONField(name = "face")
    public String face;
    @Nullable
    @JSONField(name = "keyframe")
    public String keyFrame;
    @Nullable
    @JSONField(name = "uname")
    public String name;
    @JSONField(name = "official_verify")
    public int officalVerify = -1;
    @JSONField(name = "online")
    public int online;
    @JSONField(name = "area_v2_parent_id")
    public int parentAreaId;
    @Nullable
    @JSONField(name = "area_v2_parent_name")
    public String parentAreaName;
    @JSONField(name = "pk_id")
    public long pkId;
    @Nullable
    @JSONField(name = "playurl")
    public String playUrl;
    @Nullable
    @JSONField(name = "play_url_h265")
    public String playUrlH265;
    @JSONField(name = "roomid")
    public int roomId;
    @JSONField(name = "special_attention")
    public int specialAttention;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "uid")
    public long uid;
}
