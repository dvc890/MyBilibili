package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class LikeButtonItem {
    @Nullable
    @JSONField(name = "aid")
    public String aid;
    @JSONField(name = "count")
    public int count;
    @Nullable
    @JSONField(name = "event")
    public String event;
    @Nullable
    @JSONField(name = "event_v2")
    public String eventV2;
    @JSONField(name = "selected")
    public int selected;
    @JSONField(name = "show_count")
    public boolean showCount = false;
    @JSONField(name = "type")
    public int type;

    public boolean isLiked() {
        return this.selected == 1;
    }

    public boolean toggleLike() {
        this.selected = 1 - this.selected;
        if (this.showCount) {
            if (isLiked()) {
                this.count++;
            } else {
                this.count--;
            }
        }
        return isLiked();
    }
}
