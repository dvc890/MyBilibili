package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveDanmakuConfig {
    @JSONField(name = "color")
    public List<BiliLiveDanmakuColor> mColor;
    @JSONField(name = "mode")
    public List<BiliLiveDanmakuMode> mMode;
}
