package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2266e;

@Keep
/* compiled from: BL */
public class SmallCoverItem extends BasicIndexItem implements C2266e {
    @Nullable
    @JSONField(name = "cover_badge")
    public String coverBadge;
    @Nullable
    @JSONField(name = "cover_left_text_1")
    public String coverLeftText1;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
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
    @JSONField(name = "title_right_pic")
    public int titleRightPic;
    @Nullable
    @JSONField(name = "title_right_text")
    public String titleRightText;

    @Nullable
    public DescButton getDescButton() {
        return this.descButton;
    }
}
