package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;

@Keep
/* compiled from: BL */
public class SmallCoverV2Item extends BasicIndexItem implements C2263b, C2264c, C2266e {
    @Nullable
    @JSONField(name = "avatar")
    public Avatar avatar;
    @JSONField(name = "badge")
    public String badge;
    @JSONField(name = "cover_blur")
    public int coverBlur;
    @Nullable
    @JSONField(name = "cover_gif")
    public String coverGif;
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
    @JSONField(name = "cover_right_background_color")
    public String coverRightBackgroundColor;
    @JSONField(name = "cover_right_icon")
    public int coverRightIcon;
    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;
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
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReason;

    @Nullable
    public LikeButtonItem getLikeButton() {
        return this.likeButton;
    }

    @Nullable
    public Avatar getAvatar() {
        return this.avatar;
    }

    @Nullable
    public DescButton getDescButton() {
        return this.descButton;
    }
}
