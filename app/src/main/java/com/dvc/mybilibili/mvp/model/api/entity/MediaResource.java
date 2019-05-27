package com.dvc.mybilibili.mvp.model.api.entity;


import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
public class MediaResource {

    @JSONField(name = "expire_time")
    public long expire_time;
    @JSONField(name = "cid")
    public long cid;
    @JSONField(name = "support_quality")
    public ArrayList<Integer> support_quality;
    @JSONField(name = "support_formats")
    public ArrayList<String> support_formats;
    @JSONField(name = "support_description")
    public ArrayList<String> support_description;
    @JSONField(name = "quality")
    public int quality;
    @JSONField(name = "file_info")
    public MediaFileInfos file_info;
    @JSONField(name = "video_codecid")
    public int video_codecid;
    @JSONField(name = "video_project")
    public boolean video_project;
    @JSONField(name = "fnver")
    public int fnver;
    @JSONField(name = "fnval")
    public int fnval;
    @JSONField(name = "dash")
    public VideoDashs dash;

    public MediaResource() {}

    @Keep
    public static class MediaFileInfos {

        @JSONField(name = "16")
        public Infos _16;
        @JSONField(name = "32")
        public Infos _32;
        @JSONField(name = "64")
        public Infos _64;
        @JSONField(name = "80")
        public Infos _80;
        @JSONField(name = "112")
        public Infos _112;

        public MediaFileInfos() {}

        public static class Infos {
            @JSONField(name = "filesize")
            public long filesize;
            @JSONField(name = "timelength")
            public long timelength;

            public Infos() {}
        }
    }

    @Keep
    public static class VideoDashs {
        @JSONField(name = "video")
        public ArrayList<VideoDash> videos;
        @JSONField(name = "audio")
        public ArrayList<AudioDash> audios;

        public VideoDashs() {}
    }
}
