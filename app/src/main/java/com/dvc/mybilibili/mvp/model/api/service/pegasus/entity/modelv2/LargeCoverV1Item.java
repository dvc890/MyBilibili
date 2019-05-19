package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2263b;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2264c;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2266e;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2268g;

@Keep
/* compiled from: BL */
public class LargeCoverV1Item extends BasePlayerItem implements C2263b, C2264c, C2266e, C2268g {
    @Nullable
    @JSONField(name = "avatar")
    public Avatar avatar;
    @Nullable
    @JSONField(name = "bottom_rcmd_reason_style")
    public Tag bottomRcmdReason;
    @Nullable
    @JSONField(name = "cover_badge")
    public String coverBadge;
    @Nullable
    @JSONField(name = "cover_badge_2")
    public String coverBadge2;
    @Nullable
    @JSONField(name = "cover_badge_color")
    public String coverBadgeColor;
    @Nullable
    @JSONField(name = "cover_gif")
    public String coverGif;
    @Nullable
    @JSONField(name = "cover_left_text_1")
    public String coverLeftText1;
    @Nullable
    @JSONField(name = "cover_left_text_2")
    public String coverLeftText2;
    @Nullable
    @JSONField(name = "cover_left_text_3")
    public String coverLeftText3;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;
    @Nullable
    @JSONField(name = "like_button")
    public LikeButtonItem likeButton;
    @Nullable
    @JSONField(name = "mask")
    public Mask mask;
    @JSONField(name = "official_icon")
    public int officialIcon;
    @Nullable
    @JSONField(name = "top_rcmd_reason_style")
    public Tag topRcmdReason;

    @Nullable
    public LikeButtonItem getLikeButton() {
        return this.likeButton;
    }

    @Nullable
    public DescButton getDescButton() {
        return this.descButton;
    }

    @Nullable
    public Avatar getAvatar() {
        return this.avatar;
    }

    @Nullable
    public Mask getMask() {
        return this.mask;
    }
}
