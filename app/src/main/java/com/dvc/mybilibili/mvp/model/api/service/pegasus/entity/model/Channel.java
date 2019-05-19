package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class Channel {
    @JSONField(name = "atten")
    public long attenNumber;
    @JSONField(name = "is_atten")
    public int attention;
    @JSONField(name = "content")
    public String content = "";
    @JSONField(name = "cover")
    public String cover = "";
    @JSONField(name = "head_cover")
    public String headCover = "";
    @JSONField(name = "id")
    /* renamed from: id */
    public int f6322id;
    @JSONField(name = "activity")
    public int isActivity;
    @JSONField(name = "name")
    public String name = "";
    @Nullable
    @JSONField(name = "similar_tag")
    public ArrayList<Channel> relatedChannels;
    @Nullable
    @JSONField(name = "tab")
    public List<C2262a> tabs;
    @JSONField(name = "uri")
    public String uri = "";

    public Channel(int i, String str) {
        this.f6322id = i;
        this.name = str;
    }

    public Channel() {

    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        if (((Channel) obj).f6322id != this.f6322id) {
            z = false;
        }
        return z;
    }

    public boolean isActivityChannel() {
        return this.isActivity == 1;
    }

    public boolean isValidChannel() {
        return (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.uri)) ? false : true;
    }
}
