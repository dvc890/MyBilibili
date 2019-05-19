package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.Map;

@Keep
/* compiled from: BL */
public class BaseSearchItem extends dyf {
    public static final Map<String, GOTO> sMap = new HashMap(16);
    public int attribute;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @Nullable
    @JSONField(name = "goto")
    public String goTo;
    @Nullable
    public JSONObject jsonObj;
    @Nullable
    public String keyword;
    @Nullable
    @JSONField(name = "linktype")
    public String linkType;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "position")
    public int position;
    @Nullable
    @JSONField(name = "rcmd_reason")
    public RecommendReason recommendReason;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "trackid")
    public String trackId;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
    @Nullable
    @JSONField(name = "view_type")
    public String viewTypeStr;

    @Keep
    /* compiled from: BL */
    public static class RecommendReason {
        @Nullable
        @JSONField(name = "content")
        public String content;
    }

    static {
        for (GOTO gotoR : GOTO.values()) {
            sMap.put(gotoR.getValue(), gotoR);
        }
    }
}
