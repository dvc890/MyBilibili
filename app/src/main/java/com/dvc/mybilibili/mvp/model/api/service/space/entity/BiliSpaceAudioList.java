package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceAudioList */
public class BiliSpaceAudioList extends BiliSpaceItemCount {
    @JSONField(name = "item")
    public List<BiliSpaceAudio> audios;

    public boolean isEmpty() {
        return this.audios == null || this.audios.isEmpty();
    }
}
