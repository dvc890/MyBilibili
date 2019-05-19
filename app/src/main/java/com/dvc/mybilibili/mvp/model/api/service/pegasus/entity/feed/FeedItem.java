package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed.BaseInfoItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.DescButton;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.FeedItem */
public class FeedItem extends BaseInfoItem {
    @Nullable
    @JSONField(name = "card_goto")
    public String cardGoto;
    @Nullable
    @JSONField(name = "card_type")
    public String cardType;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "cover_left_icon_1")
    public int coverLeftIcon1;
    @JSONField(name = "cover_left_icon_2")
    public int coverLeftIcon2;
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
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;
    @Nullable
    @JSONField(name = "from_type")
    public String fromType;
    @Nullable
    @JSONField(name = "goto")
    public String goTo;
    @JSONField(name = "idx")
    public int idx;
    @Nullable
    @JSONField(name = "ad_info")
    public FeedAdInfo mFeedAdInfo;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @Nullable
    @JSONField(name = "rcmd_reason")
    public String rcmdReason;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "uri")
    public String uri;

    public boolean useV1Card() {
        if (TextUtils.equals(this.cardType, "cm_v1")) {
            return true;
        }
        return TextUtils.equals(this.cardType, "cm_v2") ? false : false;
    }

    public String getCardType() {
        return this.cardType;
    }
}
