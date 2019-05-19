package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BiliLiveActivityLOLMatchInfo {
    @JSONField(name = "guess_info")
    public ArrayList<GuessInfo> guessInfo;
    @JSONField(name = "match_id")
    public int matchId;
    @JSONField(name = "round")
    public int round;
    @JSONField(name = "status")
    public int status;
    @JSONField(name = "team_info")
    public ArrayList<TeamInfo> teamInfo;
    @JSONField(name = "timestamp")
    public long timestamp;
    @JSONField(name = "vote_config")
    public VoteConfig voteConfig;

    @Keep
    /* compiled from: BL */
    public static class GuessInfo {
        @JSONField(name = "begin_time")
        public long beginTime;
        @JSONField(name = "end_time")
        public long endTime;
        @JSONField(name = "guess_id")
        public int guessId;
        @JSONField(name = "guess_img")
        public String guessImg;
        @JSONField(name = "guess_name")
        public String guessName;
        @JSONField(name = "price")
        public int price;
        @JSONField(name = "status")
        public int status;
    }

    @Keep
    /* compiled from: BL */
    public static class TeamInfo {
        @JSONField(name = "players_info")
        public ArrayList<PlayersInfo> playersInfo;
        @JSONField(name = "team_id")
        public int teamId;
        @JSONField(name = "team_logo")
        public String teamLogo;
        @JSONField(name = "team_name")
        public String teamName;

        @Keep
        /* compiled from: BL */
        public static class PlayersInfo {
            @JSONField(name = "PlayerAvatar")
            public String playerAvatar;
            @JSONField(name = "PlayerDes")
            public String playerDes;
            @JSONField(name = "PlayerID")
            public int playerID;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class VoteConfig {
        @JSONField(name = "price")
        public long price;
        @JSONField(name = "status")
        public int status;
        @JSONField(name = "vote_nums")
        public ArrayList<Integer> voteNums;
    }
}
