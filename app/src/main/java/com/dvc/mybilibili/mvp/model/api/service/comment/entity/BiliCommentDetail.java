package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public final class BiliCommentDetail {
    @JSONField(name = "assist")
    public int assistant;
    @JSONField(name = "blacklist")
    public int blackList;
    @JSONField(name = "config")
    public BiliCommentConfig config;
    @JSONField(name = "cursor")
    public BiliCommentCursor cursor;
    @JSONField(name = "folder")
    public BiliCommentFolder folder;
    @JSONField(name = "root")
    public BiliComment root;
    @JSONField(name = "upper")
    public BiliCommentUpper upper;

    public boolean isInBlackList() {
        return this.blackList == 1;
    }

    public boolean isAssistant() {
        return this.assistant == 1;
    }

    public boolean isShowFloor() {
        if (this.config == null) {
            return true;
        }
        return this.config.isShowFloor();
    }

    public boolean isShowUpFlag() {
        return this.config != null && this.config.mIsShowUpFlag;
    }

    public boolean isShowTopic() {
        if (this.config == null) {
            return false;
        }
        return this.config.isShowTopic();
    }

    public boolean isReadOnly() {
        if (this.config == null) {
            return false;
        }
        return this.config.mReadOnly;
    }
}
