package com.shuyu.gsyvideoplayer.model;

import android.os.Bundle;

import java.io.File;
import java.util.Map;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/**
 * 视频内部接受数据model
 * Created by shuyu on 2016/11/11.
 */

public class GSYModel {

    String url = null;

    Bundle dashRes = null;

    File mCachePath;

    Map<String, String> mapHeadData;

    float speed = 1;

    boolean looping;

    boolean isCache;

    String overrideExtension;

    public GSYModel(String url, Map<String, String> mapHeadData, boolean loop, float speed, boolean isCache, File cachePath, String overrideExtension) {
        this.url = url;
        this.mapHeadData = mapHeadData;
        this.looping = loop;
        this.speed = speed;
        this.isCache = isCache;
        this.mCachePath = cachePath;
        this.overrideExtension = overrideExtension;
    }

    public GSYModel(Bundle dashRes, Map<String, String> mapHeadData, boolean loop, float speed, boolean cache, File cachePath, String overrideExtension) {
        this.dashRes = dashRes;
        this.mapHeadData = mapHeadData;
        this.looping = loop;
        this.speed = speed;
        this.isCache = isCache;
        this.mCachePath = cachePath;
        this.overrideExtension = overrideExtension;
    }

    public boolean isDashRes() {
        return this.dashRes != null;
    }

    public Bundle getDashRes() {
        return dashRes;
    }

    public String getUrl() {
        if(!isDashRes())
            return url;
        else {
            return dashRes.getBundle(IjkMediaMeta.IJKM_DASH_KEY_VIDEO_264)
                    .getBundle(IjkMediaMeta.IJKM_DASH_KEY_BASE_URL)
                    .getString(getDashVideoCurId()+"").replaceFirst("quic", "http");
        }
    }

    public int getDashVideoCurId() {
        if(isDashRes()) return dashRes.getInt(IjkMediaMeta.IJKM_DASH_KEY_CUR_VIDEO_ID);
        return 0;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getMapHeadData() {
        return mapHeadData;
    }

    public void setMapHeadData(Map<String, String> mapHeadData) {
        this.mapHeadData = mapHeadData;
    }

    public boolean isLooping() {
        return looping;
    }

    public void setLooping(boolean looping) {
        this.looping = looping;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public boolean isCache() {
        return isCache;
    }

    public void setCache(boolean cache) {
        isCache = cache;
    }

    public File getCachePath() {
        return mCachePath;
    }

    public void setCachePath(File cachePath) {
        this.mCachePath = cachePath;
    }

    public String getOverrideExtension() {
        return overrideExtension;
    }

    public void setOverrideExtension(String overrideExtension) {
        this.overrideExtension = overrideExtension;
    }
}
