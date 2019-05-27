package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.BiliLevelInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.OfficialVerify;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.VipExtraUserInfo;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliMemberCard */
public class BiliMemberCard {
    @JSONField(name = "achieve")
    public Achieve achieve;
    @JSONField(name = "silence_url")
    public String examUrl;
    @JSONField(name = "fans_group")
    public int fansGroup;
    @JSONField(name = "article")
    public int mArticles;
    @JSONField(name = "audio")
    public int mAudio;
    @JSONField(name = "face")
    public String mAvatar;
    @JSONField(name = "birthday")
    public String mBirthDay;
    @JSONField(name = "description")
    public String mDescription;
    @JSONField(name = "fans")
    public int mFollowers;
    @JSONField(name = "attention")
    public int mFollowings;
    @JSONField(name = "sex")
    public String mGender;
    @JSONField(name = "level_info")
    public BiliLevelInfo mLevelInfo;
    @JSONField(name = "mid")
    public long mMid;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "official_verify")
    public OfficialVerify mOfficialVerify;
    @JSONField(name = "place")
    public String mPlace;
    @JSONField(name = "regtime")
    public long mRegTime;
    @JSONField(name = "sign")
    public String mSignature;
    @JSONField(name = "pendant")
    public Pendant pendant;
    @JSONField(name = "silence")
    public int silence;
    @JSONField(name = "end_time")
    public long silenceEndTime;
    @JSONField(name = "user_like")
    public UserLike userLike;
    @JSONField(name = "approve")
    public boolean verified;
    @JSONField(name = "vip")
    public VipExtraUserInfo vipInfo;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliMemberCard$Achieve */
    public static class Achieve {
        @JSONField(name = "achieve_url")
        public String achieveUrl;
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "is_default")
        public boolean isDefault;
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliMemberCard$Pendant */
    public static class Pendant {
        @JSONField(name = "expire")
        public long expire;
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "pid")
        public int pid;
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliMemberCard$UserLike */
    public static class UserLike {
        @JSONField(name = "like_num")
        public long likeNum;
        @JSONField(name = "rule")
        public String rule;
        @JSONField(name = "rule_url")
        public String ruleUrl;
        @JSONField(name = "skr_tip")
        public String tips;
    }

    public boolean isYearVIP() {
        return this.vipInfo != null && this.vipInfo.isEffectiveYearVip();
    }

    public boolean isMonthVip() {
        return this.vipInfo != null && this.vipInfo.isEffectiveMonthVip();
    }

    public boolean isFrozenVip() {
        return this.vipInfo != null && this.vipInfo.isFrozenVip();
    }

    public boolean isEffectiveVip() {
        return this.vipInfo != null && this.vipInfo.isEffectiveVip();
    }

    public boolean isLittleVip() {
        return this.vipInfo != null && this.vipInfo.isLittleVip();
    }

    public boolean hasAudioPrivilege() {
        return this.mAudio == 1;
    }

    public boolean isSilence() {
        return this.silence == 1;
    }
}
