package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import java.util.List;

public class VideoDanmakuInfo {
    public boolean closed;
    public DmSeg dm_seg;
    public Flag flag;
    public DmSubtitle subtitle;
    public DmMask mask;

    public class DmSeg {
        public long page_size;
        public int total;
    }

    public class Flag {
        public int rec_flag;
        public String rec_text;
        public int rec_switch;
    }

    public class DmSubtitle {
        public String lan;
        public String lan_doc;
//        public List<String> subtitles;
    }

    public class DmMask {
        public long cid;
        public int plat;
        public int fps;
        public String mask_url;
    }
}
