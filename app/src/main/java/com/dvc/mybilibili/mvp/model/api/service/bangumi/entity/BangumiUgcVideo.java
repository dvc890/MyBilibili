package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiUgcVideo {
    public boolean badgepay;
    public String cover;
    public int danmaku;
    public long duration;
    public int favourite;
    @JSONField(name = "goto")
    public String jumpTo;
    public String name;
    public String pageName;
    public String param;
    public int play;
    public int reply;
    public int rid;
    public String rname;
    public String title;
    public int ugc_pay;
    public String uri;

    public int videoId() {
        if (TextUtils.isEmpty(this.param)) {
            return 0;
        }
        try {
            return Integer.parseInt(this.param);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
