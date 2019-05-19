package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveAreaPage.Hero;

import java.util.List;

@Keep
/* compiled from: BL */
public class HeroTag {
    @JSONField(name = "hero_list")
    public List<HeroGroup> heroList;

    @Keep
    /* compiled from: BL */
    public static class HeroGroup {
        @JSONField(name = "icon")
        public String icon;
        @JSONField(name = "id")
        /* renamed from: id */
        public int f6007id;
        @Nullable
        @JSONField(name = "list")
        public List<Hero> list;
        @JSONField(name = "name")
        public String name;
    }
}
