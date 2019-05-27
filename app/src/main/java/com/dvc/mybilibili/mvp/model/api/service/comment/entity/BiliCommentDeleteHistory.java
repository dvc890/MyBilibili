package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public final class BiliCommentDeleteHistory {
    @JSONField(name = "logs")
    public List<DeleteLog> logs;
    @JSONField(name = "page")
    public Page page;
    @JSONField(name = "reply_count")
    public int replyCount;
    @JSONField(name = "report_count")
    public int reportCount;

    @Keep
    /* compiled from: BL */
    public static class DeleteLog {
        @JSONField(name = "reply_face_pic")
        public String commentUserAvatar;
        @JSONField(name = "reply_user")
        public String commentUserName;
        @JSONField(name = "operator")
        public String operatorName;
        @JSONField(name = "operator_type")
        public int operatorType;
        @JSONField(name = "operation_time")
        public String timeDesc;

        public String getUserNickName() {
            return !TextUtils.isEmpty(this.commentUserName) ? this.commentUserName : "-";
        }

        public boolean isUploader() {
            return this.operatorType == 16;
        }

        public boolean isAssistant() {
            return this.operatorType == 18;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Page {
        @JSONField(name = "num")
        public int num;
        @JSONField(name = "pages")
        public int pages;
        @JSONField(name = "size")
        public int size;
        @JSONField(name = "total")
        public int total;
    }
}
