package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ShieldKeyWord {
    @JSONField(name = "items")
    public List<String> shieldKeyWordList;
}
