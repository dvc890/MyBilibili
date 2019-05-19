package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2263b;

import org.jetbrains.annotations.Nullable;

@Keep
/* compiled from: BL */
public class LargeCoverV3Item extends BasePlayerItem implements C2263b {
    @JSONField(name = "avatar")
    @Nullable
    public Avatar avatar;
    @JSONField(name = "bottom_rcmd_reason_style")
    @Nullable
    public Tag bottomRcmdReason;
    @JSONField(name = "cover_gif")
    @Nullable
    public String coverGif;
    @JSONField(name = "cover_left_icon_1")
    public int coverLeftIcon1;
    @JSONField(name = "cover_left_icon_2")
    public int coverLeftIcon2;
    @JSONField(name = "cover_left_text_1")
    @Nullable
    public String coverLeftText1;
    @JSONField(name = "cover_left_text_2")
    @Nullable
    public String coverLeftText2;
    @JSONField(name = "cover_right_text")
    public String coverRightTime;
    @JSONField(name = "desc")
    @Nullable
    public String desc;
    @JSONField(name = "official_icon")
    public int officialIcon;
    @JSONField(name = "top_rcmd_reason_style")
    @Nullable
    public Tag topRcmdReason;

    @Nullable
    public Avatar getAvatar() {
        return this.avatar;
    }
}
