package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public final class BiliCommentConfig {
    @JSONField(name = "show_up_flag")
    public boolean mIsShowUpFlag;
    @JSONField(name = "read_only")
    public boolean mReadOnly;
    @JSONField(name = "showadmin")
    public int mShowAdmin;
    @JSONField(name = "show_del_log")
    public boolean mShowDelLog;
    @JSONField(name = "showentry")
    public int mShowEntry;
    @JSONField(name = "showfloor")
    public int mShowFloor = 1;
    @JSONField(name = "showtopic")
    public int mShowTopic;

    public boolean isShowEntry() {
        return this.mShowEntry == 1;
    }

    public boolean isShowAdmin() {
        return this.mShowAdmin == 1;
    }

    public boolean isShowFloor() {
        return this.mShowFloor != 0;
    }

    public boolean isShowTopic() {
        return this.mShowTopic == 1;
    }
}
