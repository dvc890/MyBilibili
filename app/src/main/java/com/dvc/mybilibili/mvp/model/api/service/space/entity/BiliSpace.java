package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.charge.entity.ChargeRankResult;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpace */
public class BiliSpace {
    @JSONField(name = "archive")
    public BiliSpaceArchiveVideo archiveVideo;
    @JSONField(name = "article")
    public BiliSpaceArticleList article;
    @JSONField(name = "audios")
    public BiliSpaceAudioList audio;
    @JSONField(name = "card")
    public BiliMemberCard card;
    @JSONField(name = "elec")
    public ChargeRankResult chargeResult;
    @JSONField(name = "clip")
    public BiliSpaceClipList clipVideo;
    @JSONField(name = "coin_archive")
    public BiliSpaceArchiveVideo coinVideo;
    @JSONField(name = "favourite2")
    public BiliSpaceFavoriteBox favoriteBox;
    @JSONField(name = "images")
    public BiliSpaceHeader header;
    @JSONField(name = "live")
    public BiliUserLiveEntry liveEntry;
    @JSONField(name = "album")
    public BiliSpaceAlbumList mAlbums;
    @JSONField(name = "mall")
    public Mall mall;
    @JSONField(name = "medal")
    public int medal;
    @JSONField(name = "like_archive")
    public BiliSpaceArchiveVideo recommendVideo;
    @JSONField(name = "relation")
    public int relation;
    @JSONField(name = "season")
    public BiliSpaceSeason season;
    @JSONField(name = "game")
    public BiliSpaceUserGame spaceGame;
    @JSONField(name = "setting")
    public BiliUserSpaceSetting spaceSetting;
    @JSONField(name = "tab")
    public Tab tab;
    @JSONField(name = "tag")
    public BiliSpaceTag tags;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpace$Mall */
    public static class Mall {
        @JSONField(name = "icon")
        public String icon;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "uri")
        public String uri;
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpace$Tab */
    public static class Tab {
        @JSONField(name = "album")
        public boolean hasAlbum;
        @JSONField(name = "archive")
        public boolean hasArchive;
        @JSONField(name = "article")
        public boolean hasArticle;
        @JSONField(name = "audios")
        public boolean hasAudio;
        @JSONField(name = "bangumi")
        public boolean hasBangumi;
        @JSONField(name = "clip")
        public boolean hasClips;
        @JSONField(name = "coin")
        public boolean hasCoin;
        @JSONField(name = "community")
        public boolean hasCommunity;
        @JSONField(name = "dynamic")
        public boolean hasDynamic;
        @JSONField(name = "favorite")
        public boolean hasFavorite;
        @JSONField(name = "game")
        public boolean hasGame;
        @JSONField(name = "mall")
        public boolean hasMall;
        @JSONField(name = "like")
        public boolean hasRecommend;
    }

    public boolean hasGroup() {
        return false;
    }

    public boolean hasCoinVideos() {
        return this.coinVideo != null && hasItems(this.coinVideo.videos);
    }

    public boolean hasRecommendVideos() {
        return this.recommendVideo != null && hasItems(this.recommendVideo.videos);
    }

    public boolean hasFavoriteBox() {
        return this.favoriteBox != null && hasItems(this.favoriteBox.boxes);
    }

    public boolean hasBangumiSeason() {
        return this.season != null && hasItems(this.season.seasons);
    }

    public boolean hasGame() {
        return this.spaceGame != null && hasItems(this.spaceGame.games);
    }

    public boolean hasArchiveVideo() {
        return this.archiveVideo != null && hasItems(this.archiveVideo.videos);
    }

    public boolean hasColumns() {
        return this.article != null && hasItems(this.article.articles);
    }

    public boolean hasAudio() {
        return this.audio != null && hasItems(this.audio.audios);
    }

    public boolean hasClipVideo() {
        return this.clipVideo != null && hasItems(this.clipVideo.videos);
    }

    public boolean hasAlbum() {
        return this.mAlbums != null && hasItems(this.mAlbums.items);
    }

    public boolean hasTag() {
        return (this.tags == null || this.tags.isEmpty()) ? false : true;
    }

    public String getBgHeader() {
        return this.header == null ? "" : this.header.imageUrl;
    }

    private boolean hasItems(List list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean hasMedal() {
        return this.medal == 1;
    }
}
