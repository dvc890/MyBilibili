package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

@Keep
/* compiled from: BL */
public class UpRcmdCoverItem extends BasicIndexItem {
    @JSONField(name = "cover_type")
    public int coverType;
    @Nullable
    @JSONField(name = "desc_1")
    public String desc1;
    @Nullable
    @JSONField(name = "desc_2")
    public String desc2;
    @Nullable
    @JSONField(name = "desc_3")
    public String desc3;
    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;
    @JSONField(name = "level")
    public int level;
    @JSONField(name = "official_icon")
    public int officialIcon;
}
