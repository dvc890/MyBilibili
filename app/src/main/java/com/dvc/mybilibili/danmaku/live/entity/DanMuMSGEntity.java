package com.dvc.mybilibili.danmaku.live.entity;

import org.json.JSONArray;
import org.json.JSONException;

public class DanMuMSGEntity {
    public int type;//1
    public int textsize;//25
    public int color;//16777215
    public long timestamp;
    public int pooltype;//0
    public int userid;
    public String username;
    public boolean userguard;
    public boolean userisvip;
    public int userlevel;
    public String userrank;
    public String userhash;
    public String text;
    public JSONArray info;  //info中有许多内容含义不明

    public DanMuMSGEntity() {}

    public DanMuMSGEntity(JSONArray info) throws JSONException {
        this.info = info;
        pooltype = info.getJSONArray(0).getInt(0);
        type = info.getJSONArray(0).getInt(1);
        textsize = info.getJSONArray(0).getInt(2);
        color = info.getJSONArray(0).getInt(3);
        timestamp = info.getJSONArray(0).getLong(4);
        userhash = info.getJSONArray(0).getString(7);
        text = info.getString(1);
        userid = info.getJSONArray(2).getInt(0);
        username = info.getJSONArray(2).getString(1);
        userguard = info.getJSONArray(2).getInt(2) == 1;
        userisvip = info.getJSONArray(2).getInt(3) == 1;
        userlevel = info.getJSONArray(4).getInt(0);
        userrank = info.getJSONArray(4).getString(3);
    }
}
