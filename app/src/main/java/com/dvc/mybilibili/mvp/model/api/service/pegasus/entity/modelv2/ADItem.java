package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ADItem extends BasePlayerItem {
    @JSONField(name = "ad_dislike")
    public boolean adDislike = false;
    @Nullable
    @JSONField(name = "ad_dislike_reason")
    public DislikeReason adDislikeReason;
    @JSONField(name = "ad_dislike_time")
    public long adDislikeTimestamp;
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
    @JSONField(name = "cover_left_text_3")
    public String coverLeftText3;
    @JSONField(name = "cover_right_icon")
    public int coverRightIcon;
    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;
}
