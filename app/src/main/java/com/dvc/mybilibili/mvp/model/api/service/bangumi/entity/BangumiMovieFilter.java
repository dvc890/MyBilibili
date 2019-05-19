package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BangumiMovieFilter {
    public ArrayList<Item> areas;
    public ArrayList<Item> categories;
    public ArrayList<Item> indexType;
    public ArrayList<Item> periods;
    public ArrayList<Item> specials;
    public ArrayList<Item> status;

    @Keep
    /* compiled from: BL */
    public static class Item {
        /* renamed from: id */
        public int f15273id;
        public String name;
        public int type;
    }
}
