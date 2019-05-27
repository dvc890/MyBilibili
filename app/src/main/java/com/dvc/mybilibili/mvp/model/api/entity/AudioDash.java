package com.dvc.mybilibili.mvp.model.api.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
public class AudioDash {
    @JSONField(name = "id")
    public int id;
    @JSONField(name = "base_url")
    public String base_url;
    @JSONField(name = "bandwidth")
    public long bandwidth;
    @JSONField(name = "codecid")
    public int codecid;

    public AudioDash() {}
}
