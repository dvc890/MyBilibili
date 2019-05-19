package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;

@Keep
/* compiled from: BL */
public class SmallCoverV3Item extends BasicIndexItem implements C2263b, C2266e {
    @Nullable
    @JSONField(name = "avatar")
    public Avatar avatar;
    @Nullable
    @JSONField(name = "cover_left_text")
    public String coverLeftText;
    @Nullable
    @JSONField(name = "cover_right_button")
    public DescButton coverRightButton;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;
    @JSONField(name = "official_icon")
    public int officialIcon;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReason;

    @Nullable
    public DescButton getDescButton() {
        return this.descButton;
    }

    @Nullable
    public Avatar getAvatar() {
        return this.avatar;
    }
}
