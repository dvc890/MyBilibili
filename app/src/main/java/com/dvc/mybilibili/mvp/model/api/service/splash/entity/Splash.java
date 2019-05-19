package com.dvc.mybilibili.mvp.model.api.service.splash.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.splash.Splash */
public class Splash {
    public static final int CARD_TYPE_FULL_IMAGE = 14;
    public static final int CARD_TYPE_HALF_IMAGE = 15;
    public static final int CARD_TYPE_VIDEO_LAND = 17;
    public static final int CARD_TYPE_VIDEO_PORT = 16;
    public static final int SPLASH_TYPE_BD = 1;
    public static final int SPLASH_TYPE_BIRTHDAY = 2;
    @JSONField(name = "ad_cb")
    public String adCb;
    @JSONField(name = "schema")
    public String appLink;
    @JSONField(name = "schema_package_name")
    public String appPkg;
    @JSONField(name = "schema_title")
    public String appTip;
    @JSONField(name = "begin_time")
    public long beginTime;
    @JSONField(name = "card_index")
    public long cardIndex = -1;
    @JSONField(name = "card_type")
    public int cardType;
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(name = "cm_mark")
    public int cmMark;
    @JSONField(name = "duration")
    public int duration;
    @JSONField(name = "end_time")
    public long endTime;
    @JSONField(name = "extra")
    public JSONObject extra;
    @JSONField(name = "id")
    /* renamed from: id */
    public int f6632id;
    @JSONField(name = "hash")
    public String imageHash;
    @JSONField(name = "thumb")
    public String imageUrl;
    @JSONField(name = "index")
    public long index;
    @JSONField(name = "client_ip")
    /* renamed from: ip */
    public String f6633ip;
    @JSONField(name = "is_ad")
    public boolean isAd;
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    @JSONField(name = "uri_title")
    public String jumpTip;
    @JSONField(name = "uri")
    public String jumpUrl;
    @JSONField(name = "logo_hash")
    public String logoHash;
    @JSONField(name = "logo_url")
    public String logoUrl;
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "resource_id")
    public long resourceId;
    @JSONField(name = "server_type")
    public long serverType = -1;
    @JSONField(name = "show_url")
    public String showUrl;
    @JSONField(name = "skip")
    public int skip;
    @JSONField(name = "source")
    public int source;
    @JSONField(name = "type")
    public int type;
    @JSONField(name = "video_hash")
    public String videoHash;
    @JSONField(name = "video_height")
    public int videoHeight;
    @JSONField(name = "video_url")
    public String videoUrl;
    @JSONField(name = "video_width")
    public int videoWidth;

    @JSONField(deserialize = false, serialize = false)
    public boolean isSplashTypeSupport() {
        return this.type == 2 || this.type == 1;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isCardTypeSupport() {
        return this.cardType == 14 || this.cardType == 15 || this.cardType == 17 || this.cardType == 16;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isVideo() {
        return this.cardType == 17 || this.cardType == 16;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isValid() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        return currentTimeMillis >= this.beginTime && currentTimeMillis <= this.endTime;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isBirthSplash() {
        return this.type == 2;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isBDSplash() {
        return this.type == 1;
    }

    @JSONField(deserialize = false, serialize = false)
    public String buildImageFileName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("image_");
        stringBuilder.append(this.imageHash);
        return stringBuilder.toString();
    }

    @JSONField(deserialize = false, serialize = false)
    public String buildVideoFileName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("video_");
        stringBuilder.append(this.videoHash);
        return stringBuilder.toString();
    }

    @JSONField(deserialize = false, serialize = false)
    public String buildDirName() {
        return String.valueOf(this.f6632id);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Splash splash = (Splash) obj;
        if (this.f6632id != splash.f6632id) {
            return false;
        }
        if (!(this.imageHash == null) ? this.imageHash.equals(splash.imageHash) : splash.imageHash == null) {
            return false;
        }
        if (this.videoHash != null) {
            z = this.videoHash.equals(splash.videoHash);
        } else if (splash.videoHash != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f6632id * 31) + (this.imageHash != null ? this.imageHash.hashCode() : 0)) * 31;
        if (this.videoHash != null) {
            i = this.videoHash.hashCode();
        }
        return hashCode + i;
    }
}
