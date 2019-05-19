package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

import java.util.List;

@Keep
/* compiled from: BL */
public class ThreeItemHV5Item extends BasicIndexItem {

    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;
    @Nullable
    @JSONField(name = "covers")
    public List<String> covers;
    @Nullable
    @JSONField(name = "desc1")
    public String desc1;
    @Nullable
    @JSONField(name = "desc2")
    public String desc2;
    @Nullable
    @JSONField(name = "more_text")
    public String moreText;
    @Nullable
    @JSONField(name = "more_uri")
    public String moreUri;
    @Nullable
    @JSONField(name = "top_rcmd_reason_style")
    public Tag rcmdReason;
    @Nullable
    @JSONField(name = "top_left_title")
    public String topLeftTitle;
}
