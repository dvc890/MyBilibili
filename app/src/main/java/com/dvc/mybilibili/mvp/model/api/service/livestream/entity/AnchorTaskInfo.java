package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//

@Keep
/* compiled from: BL */
public class AnchorTaskInfo {
    @JSONField(name = "is_blacked")
    public int isBlacked;
    @JSONField(name = "reward_should_notice")
    public int rewardShouldNotice;
    @JSONField(name = "show_reward_entry")
    public int showRewardEntry;
    @JSONField(name = "task_status")
    public int taskStatus;
    @JSONField(name = "url")
    public String url;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnchorTaskInfo{taskShouldNotice=");
        stringBuilder.append(this.rewardShouldNotice);
        stringBuilder.append(", showRewardEntry=");
        stringBuilder.append(this.showRewardEntry);
        stringBuilder.append(", taskStatus=");
        stringBuilder.append(this.taskStatus);
        stringBuilder.append(", isBlacked=");
        stringBuilder.append(this.isBlacked);
        stringBuilder.append(", url='");
        stringBuilder.append(this.url);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
