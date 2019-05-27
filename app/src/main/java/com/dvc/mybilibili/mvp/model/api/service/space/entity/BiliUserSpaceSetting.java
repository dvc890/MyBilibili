package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;


@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliUserSpaceSetting */
public class BiliUserSpaceSetting implements Cloneable {
    @JSONField(name = "bangumi")
    public boolean allowBangumi;
    @JSONField(name = "coins_video")
    public boolean allowCoinsVideo;
    @JSONField(name = "fav_video")
    public boolean allowFavorite;
    @JSONField(name = "groups")
    public boolean allowGroups;
    @JSONField(name = "played_game")
    public boolean allowPlayedGame;
    @JSONField(name = "likes_video")
    public boolean allowRecommendVideo;
    @JSONField(name = "submited_video")
    public boolean allowSubmitVideo;
    @JSONField(name = "tags")
    public boolean allowTags;

    public BiliUserSpaceSetting() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliAuthorSpaceSetting{, allowFavorite=");
        stringBuilder.append(this.allowFavorite);
        stringBuilder.append(", allowBangumi=");
        stringBuilder.append(this.allowBangumi);
        stringBuilder.append(", allowPlayedGame=");
        stringBuilder.append(this.allowPlayedGame);
        stringBuilder.append(", allowGroups=");
        stringBuilder.append(this.allowGroups);
        stringBuilder.append(", allowSubmitVideo=");
        stringBuilder.append(this.allowSubmitVideo);
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public BiliUserSpaceSetting clone() {
        try {
            return (BiliUserSpaceSetting) super.clone();
        } catch (CloneNotSupportedException unused) {
            BiliUserSpaceSetting biliUserSpaceSetting = new BiliUserSpaceSetting();
            biliUserSpaceSetting.allowBangumi = this.allowBangumi;
            biliUserSpaceSetting.allowCoinsVideo = this.allowCoinsVideo;
            biliUserSpaceSetting.allowFavorite = this.allowFavorite;
            biliUserSpaceSetting.allowGroups = this.allowGroups;
            biliUserSpaceSetting.allowPlayedGame = this.allowPlayedGame;
            biliUserSpaceSetting.allowTags = this.allowTags;
            biliUserSpaceSetting.allowSubmitVideo = this.allowSubmitVideo;
            biliUserSpaceSetting.allowRecommendVideo = this.allowRecommendVideo;
            return biliUserSpaceSetting;
        }
    }
}
