package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliCommentDialogue {
    @JSONField(name = "config")
    public BiliCommentConfig config;
    @JSONField(name = "cursor")
    public Cursor cursor;
    @JSONField(name = "dialog")
    public Dialog dialog;
    @JSONField(name = "replies")
    public List<BiliComment> replies;

    @Keep
    /* compiled from: BL */
    public static class Cursor {
        @JSONField(name = "max_floor")
        public int maxFloor;
        @JSONField(name = "min_floor")
        public int minFloor;
        @JSONField(name = "size")
        public int size;
    }

    @Keep
    /* compiled from: BL */
    public static class Dialog {
        @JSONField(name = "max_floor")
        public int maxFloor;
        @JSONField(name = "min_floor")
        public int minFloor;
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
