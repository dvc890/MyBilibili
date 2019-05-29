package com.dvc.mybilibili.mvp.model.api.entity;


import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
public class MediaResource extends IMediaResource{

    @JSONField(name = "dash")
    public DashResource dash;

    public MediaResource() {}

    @Override
    public String getVideoUrl() {
        return getVideoUrl(quality);
    }

    public String getVideoUrl(int quality) {
        for(DashMediaIndex dash : dash.videos) {
            if(dash.id == quality) return dash.base_url;
        }
        return dash.videos.get(0).base_url;
    }

    @Keep
    public static class DashResource {
        @JSONField(name = "video")
        public ArrayList<DashMediaIndex> videos;
        @JSONField(name = "audio")
        public ArrayList<DashMediaIndex> audios;

        public DashResource() {}
    }
}
