package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

@Keep
/* compiled from: BL */
public class ColumnHotspot {
    public boolean icon;
    public long id;
    public Stats stats;
    public String tag;
    public String title;

    @Keep
    /* compiled from: BL */
    public static class Stats {
        public long count;
        public long read;
        public long reply;
    }
}
