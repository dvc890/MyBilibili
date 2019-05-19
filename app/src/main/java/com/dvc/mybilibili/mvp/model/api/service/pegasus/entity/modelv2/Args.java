package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class Args {
    @JSONField(name = "rid")
    public int rid;
    @Nullable
    @JSONField(name = "rname")
    public String rname;
    @JSONField(name = "tid")
    public int tid;
    @Nullable
    @JSONField(name = "tname")
    public String tname;
    @JSONField(name = "type")
    public int type;
    @JSONField(name = "up_id")
    public long upId;
    @Nullable
    @JSONField(name = "up_name")
    public String upName;
}
