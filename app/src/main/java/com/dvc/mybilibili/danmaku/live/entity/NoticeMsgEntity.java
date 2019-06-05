package com.dvc.mybilibili.danmaku.live.entity;

public class NoticeMsgEntity {
    public int roomid;
    public int real_roomid;
    public String msg_common;
    public String msg_self;
    public String link_url;
    public int msg_type;
    public int shield_uid;
    public String child_msg_type;
    public Full full;
    public Half half;
    public Side side;

    public class Full {
        public String head_icon;
        public String tail_icon;
        public String head_icon_fa;
        public String tail_icon_fa;
        public int head_icon_fan;
        public int tail_icon_fan;
        public String background;
        public String color;
        public String highlight;
        public int time;
    }

    public class Half {

        public String head_icon;
        public String tail_icon;
        public String background;
        public String color;
        public String highlight;
        public int time;
    }

    public class Side {
        public String head_icon;
        public String background;
        public String color;
        public String highlight;
        public String border;
    }
}
