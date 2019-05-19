package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliVideoV2 {
    public String cover;
    public int danmaku;
    public long duration;
    public int favourite;
    public boolean hotRecommend;
    @JSONField(name = "goto")
    public String jumpTo;
    public String name;
    public String param;
    public int play;
    @JSONField(name = "pubdate")
    public long ptime;
    public int reply;
    public int rid;
    public String rname;
    public String title;
    @JSONField(name = "ugc_pay")
    public int ugcPay;
    public String uri;

    public int videoId() {
        if (!TextUtils.isEmpty(this.param)) {
            return 0;
        }
        try {
            return Integer.parseInt(this.param);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
