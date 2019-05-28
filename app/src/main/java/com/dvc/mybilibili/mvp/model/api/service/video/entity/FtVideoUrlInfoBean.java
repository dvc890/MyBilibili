package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.List;

@Keep
/* compiled from: BL */
public class FtVideoUrlInfoBean {
    @JSONField(name = "abtid")
    public int abtid;
    @JSONField(name = "accept_description")
    public List<String> acceptDescription;
    @JSONField(name = "accept_format")
    public String acceptFormat;
    @JSONField(name = "accept_quality")
    public List<Integer> acceptQuality;
    @JSONField(name = "durl")
    public List<HashMap> dUrl;
    @JSONField(name = "fnval")
    public int fnval;
    @JSONField(name = "fnver")
    public int fnver;
    @JSONField(name = "format")
    public String format;
    @JSONField(name = "from")
    public String from;
    @JSONField(name = "quality")
    public String quality;
    @JSONField(name = "result")
    public String result;
    @JSONField(name = "seek_param")
    public String seekParam;
    @JSONField(name = "seek_type")
    public String seekType;
    @JSONField(name = "timelength")
    public String timeLength;
    @JSONField(name = "video_codecid")
    public int videoCodecid;
    @JSONField(name = "video_project")
    public boolean videoProject;
}
