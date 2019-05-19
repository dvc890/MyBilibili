package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveTitle {
    @JSONField(name = "is_lihui")
    public int hasPaint;
    @JSONField(name = "id")
    public String mId;
    @JSONField(name = "height")
    public int mImgHeight;
    @JSONField(name = "width")
    public int mImgWidth;
    @JSONField(name = "lihui_height")
    public int mPaintHeight;
    @JSONField(name = "lihui_img")
    public String mPaintImg;
    @JSONField(name = "lihui_width")
    public int mPaintWidth;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "img")
    public String mTitleImg;
    @JSONField(name = "colorful")
    public int shimmer;

    public boolean hasPaint() {
        return this.hasPaint == 1;
    }

    public boolean isShimmer() {
        return this.shimmer > 0;
    }
}
