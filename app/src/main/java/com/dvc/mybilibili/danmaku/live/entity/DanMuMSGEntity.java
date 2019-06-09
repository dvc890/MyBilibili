package com.dvc.mybilibili.danmaku.live.entity;

import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveRoomHistoryMsg;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveUserCard;

import org.json.JSONArray;
import org.json.JSONException;

public class DanMuMSGEntity extends BaseMsgEntity{
    public int type;//1
    public int textsize;//25
    public int color;//16777215
    public long timestamp;
    public int pooltype;//0
    public long userid;
    /**
     * 要判断颜色字符串是否为空
     */
    public String usercolor = "";
    public String username;
    public boolean userguard;
    public int userguardlevel;
    public boolean userisadmin;
    public int userismvip;
    public int userisyvip;
    public int userlevel;
    public int userlevelcolor;
    public String userrank;
    public String userhash;
    public String text;
    public BiliLiveUserCard.FansMedal fansMedal;
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
        userid = info.getJSONArray(2).getLong(0);
        username = info.getJSONArray(2).getString(1);
        userguard = info.getJSONArray(2).getInt(2) == 1;
        userisyvip = info.getJSONArray(2).getInt(3);
        if(!info.isNull(3) && info.getJSONArray(3).length() > 0) {
            fansMedal = new BiliLiveUserCard.FansMedal();
            fansMedal.mLevel = info.getJSONArray(3).getInt(0);
            fansMedal.mMedalName = info.getJSONArray(3).getString(1);
            fansMedal.mMedalId = info.getJSONArray(3).getInt(3);
            fansMedal.mMedalColor = info.getJSONArray(3).getInt(4);
        }
        userlevel = info.getJSONArray(4).getInt(0);
        userlevelcolor = info.getJSONArray(4).getInt(2);
        userrank = info.getJSONArray(4).getString(3);

    }

    public DanMuMSGEntity(BiliLiveRoomHistoryMsg.Msg msg) {
        userguardlevel = msg.mGuardLevel;
        userisadmin = msg.mIsadmin == 1;
        userlevel = (int) msg.mLevel[0];
        userlevelcolor = (int) msg.mLevel[2];
        userrank = (String) msg.mLevel[3];
        userismvip = msg.mMonthVip;
        userisyvip = msg.mYearVip;
        username = msg.mNickName;
        text = msg.mText;
        userid = msg.mUid;
        usercolor= msg.mUnameColor;
        if(msg.mMedal.length > 0) {
            fansMedal = new BiliLiveUserCard.FansMedal();
            fansMedal.mLevel = (int) msg.mMedal[0];
            fansMedal.mMedalName = (String) msg.mMedal[1];
            fansMedal.mMedalId = (int) msg.mMedal[3];
            fansMedal.mMedalColor = (int) msg.mMedal[4];
        }
    }
}
