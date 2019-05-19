package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;

@Keep
/* compiled from: BL */
public class LargeCoverV2Item extends BasePlayerItem implements C2263b, C2266e, C2268g {
    @Nullable
    @JSONField(name = "avatar")
    public Avatar avatar;
    @Nullable
    @JSONField(name = "badge")
    public String badge;
    @JSONField(name = "cover_left_icon_1")
    public int coverLeftIcon1;
    @JSONField(name = "cover_left_icon_2")
    public int coverLeftIcon2;
    @Nullable
    @JSONField(name = "cover_left_text_1")
    public String coverLeftText1;
    @Nullable
    @JSONField(name = "cover_left_text_2")
    public String coverLeftText2;
    @Nullable
    @JSONField(name = "cover_right_button")
    public DescButton coverRightButton;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;
    @Nullable
    @JSONField(name = "mask")
    public Mask mask;
    @JSONField(name = "official_icon")
    public int officialIcon;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReason;

    @Nullable
    public Avatar getAvatar() {
        return this.avatar;
    }

    @Nullable
    public DescButton getDescButton() {
        return this.descButton;
    }

    @Nullable
    public Mask getMask() {
        return this.mask;
    }
}
