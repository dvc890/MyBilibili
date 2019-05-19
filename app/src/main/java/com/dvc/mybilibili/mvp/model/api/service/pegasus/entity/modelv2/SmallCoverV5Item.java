package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;

@Keep
/* compiled from: BL */
public class SmallCoverV5Item extends BasicIndexItem implements C2263b, C2266e {
    @JSONField(name = "can_play")
    public int canPlay;
    @Nullable
    @JSONField(name = "cover_right_text_1")
    public String coverRightText1;
    @Nullable
    @JSONField(name = "right_desc_1")
    public String rightDesc1;
    @Nullable
    @JSONField(name = "right_desc_2")
    public String rightDesc2;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag tag;
    @Nullable
    @JSONField(name = "up")
    /* renamed from: up */
    public C2270Up f9767up;

    @Keep
    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.modelv2.SmallCoverV5Item$Up */
    public static class C2270Up {
        @Nullable
        @JSONField(name = "avatar")
        public Avatar avatar;
        @Nullable
        @JSONField(name = "cooperation")
        public String cooperation;
        @Nullable
        @JSONField(name = "desc")
        public String desc;
        @Nullable
        @JSONField(name = "desc_button")
        public DescButton descButton;
        @JSONField(name = "id")
        public long idX;
        @Nullable
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "official_icon")
        public int officialIcon;
    }

    @Nullable
    public Avatar getAvatar() {
        if (this.f9767up == null) {
            return null;
        }
        return this.f9767up.avatar;
    }

    @Nullable
    public DescButton getDescButton() {
        if (this.f9767up == null) {
            return null;
        }
        return this.f9767up.descButton;
    }
}
