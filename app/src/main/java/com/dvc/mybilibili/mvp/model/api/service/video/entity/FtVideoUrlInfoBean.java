package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.entity.DashMediaIndex;
import com.dvc.mybilibili.mvp.model.api.entity.MediaResource;

import org.jetbrains.annotations.Nullable;

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
    public List<VUrl> dUrl;
    @JSONField(name = "fnval")
    public int fnval;
    @JSONField(name = "fnver")
    public int fnver;
    @JSONField(name = "format")
    public String format;
    @JSONField(name = "from")
    public String from;
    @JSONField(name = "quality")
    public int quality;
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
    @JSONField(name = "dash")
    public MediaResource.DashResource dash;


    @Keep
    public static class VUrl {
        @JSONField(name = "order")
        public int order;
        @JSONField(name = "length")
        public long length;
        @JSONField(name = "size")
        public long size;
        @JSONField(name = "ahead")
        public String ahead;
        @JSONField(name = "vhead")
        public String vhead;
        @JSONField(name = "url")
        public String url;
        @Nullable
        @JSONField(name = "backup_url")
        public List<String> backup_url;
    }

    public boolean isV2Bean() {
        return dash != null;
    }

    public List<Integer> getSupportQuality() {
        return acceptQuality;
    }

    public int findQuality(int index) {
        if(getSupportQuality().size() > index) {
            return getSupportQuality().get(index);
        }
        return quality;
    }

    public List<String> getSupportDescription() {
        return acceptDescription;
    }

    public String getVideoUrl() {
        if(isV2Bean())
            return getDashVideoUrl(quality);
        else
            return dUrl.get(0).url;
    }

    public String getDashVideoUrl(int quality) {
        for(DashMediaIndex dash : dash.videos) {
            if(dash.id == quality) return dash.base_url;
        }
        return dash.videos.get(0).base_url;
    }
}
