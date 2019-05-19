package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

@Keep
/* compiled from: BL */
public class SearchEasterEggItem implements Serializable {
    private static final long serialVersionUID = 9849461564894L;
    @Nullable
    @JSONField(name = "hash")
    public String hash;
    @JSONField(name = "sid")
    /* renamed from: id */
    public int f6356id;
    @Nullable
    @JSONField(name = "name")
    public String name;
    @Nullable
    public transient String path;
    @JSONField(name = "size")
    public long size;
    @Nullable
    @JSONField(name = "type")
    public String type;
    @Nullable
    @JSONField(name = "url")
    public String url;

    public boolean equals(Object obj) {
        if (obj instanceof SearchEasterEggItem) {
            SearchEasterEggItem searchEasterEggItem = (SearchEasterEggItem) obj;
            if (this.f6356id == searchEasterEggItem.f6356id && this.name.equals(searchEasterEggItem.name) && this.type.equals(searchEasterEggItem.type) && this.url.equals(searchEasterEggItem.url) && this.hash.equals(searchEasterEggItem.hash) && this.size == searchEasterEggItem.size) {
                return true;
            }
        }
        return false;
    }
}
