package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BangumiCinemaIndexFilter {
    public ArrayList<Item> order;
    public ArrayList<Item> producer;
    public ArrayList<Item> style;
    public ArrayList<Item> year;

    @Keep
    /* compiled from: BL */
    public static class Item {
        /* renamed from: id */
        public String f5638id;
        @JSONField(deserialize = false, serialize = false)
        public boolean isSelect;
        public String name;
    }
}
