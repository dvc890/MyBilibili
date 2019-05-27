package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliCommentTopic {
    @JSONField(name = "topics")
    public List<String> topics;

    public boolean isEmpty() {
        return this.topics == null || this.topics.isEmpty();
    }

    public String getTopicsDesc() {
        if (isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : this.topics) {
            stringBuilder.append(append);
            stringBuilder.append(",");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
