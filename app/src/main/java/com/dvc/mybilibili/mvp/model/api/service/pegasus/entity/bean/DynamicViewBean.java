package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.StaticLayout;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Locale;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.api.bean.DynamicViewBean */
public class DynamicViewBean implements Comparable<DynamicViewBean> {
    @JSONField(name = "action")
    ViewActionBean action;
    @JSONField(deserialize = false, serialize = false)
    Drawable backDrawable;
    @JSONField(name = "content")
    String content;
    @JSONField(name = "id")
    /* renamed from: id */
    long f5586id;
    @JSONField(name = "layer_level")
    int layerLevel;
    @JSONField(name = "layout")
    ViewLayoutBean layout;
    @JSONField(deserialize = false, serialize = false)
    Rect layoutRect;
    @JSONField(deserialize = false, serialize = false)
    StaticLayout staticLayout;
    @JSONField(name = "style")
    ViewStyleBean style;
    @JSONField(name = "type")
    String type;

    @Keep
    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.dynamiclayout.api.bean.DynamicViewBean$TYPE */
    public enum TYPE {
        UNSUPPORT,
        TEXT,
        IMAGE,
        GIF,
        VIDEO,
        DOWNLOAD_TEXT,
        DOWNLOAD_PROGRESS
    }

    public TYPE getType() {
        TYPE type = TYPE.UNSUPPORT;
        if (TextUtils.isEmpty(this.type)) {
            return type;
        }
        try {
            return TYPE.valueOf(this.type.toUpperCase(Locale.getDefault()).trim());
        } catch (IllegalArgumentException unused) {
            return type;
        }
    }

    public long getId() {
        return this.f5586id;
    }

    public void setId(long j) {
        this.f5586id = j;
    }

    public String getContent() {
        return this.content;
    }

    public int getLayerLevel() {
        return this.layerLevel;
    }

    public ViewLayoutBean getLayout() {
        return this.layout;
    }

    public ViewStyleBean getStyle() {
        return this.style;
    }

    public ViewActionBean getAction() {
        return this.action;
    }

    public DynamicViewBean setType(String str) {
        this.type = str;
        return this;
    }

    public DynamicViewBean setContent(String str) {
        this.content = str;
        return this;
    }

    public DynamicViewBean setLayerLevel(int i) {
        this.layerLevel = i;
        return this;
    }

    public DynamicViewBean setLayout(ViewLayoutBean viewLayoutBean) {
        this.layout = viewLayoutBean;
        return this;
    }

    public DynamicViewBean setStyle(ViewStyleBean viewStyleBean) {
        this.style = viewStyleBean;
        return this;
    }

    public DynamicViewBean setAction(ViewActionBean viewActionBean) {
        this.action = viewActionBean;
        return this;
    }

    public StaticLayout getStaticLayout() {
        return this.staticLayout;
    }

    public DynamicViewBean setStaticLayout(StaticLayout staticLayout) {
        this.staticLayout = staticLayout;
        return this;
    }

    public Rect getLayoutRect() {
        return this.layoutRect;
    }

    public DynamicViewBean setLayoutRect(Rect rect) {
        this.layoutRect = rect;
        return this;
    }

    public Drawable getBackDrawable() {
        return this.backDrawable;
    }

    public DynamicViewBean setBackDrawable(Drawable drawable) {
        this.backDrawable = drawable;
        return this;
    }

    public boolean needClickListener() {
        if (this.action == null || this.action.getClick() == null) {
            return false;
        }
        if (TextUtils.isEmpty(this.action.getClick().getUri()) && TextUtils.isEmpty(this.action.getClick().callUpUrl)) {
            return false;
        }
        return true;
    }

    public int compareTo(@NonNull DynamicViewBean dynamicViewBean) {
        if (this.layerLevel > dynamicViewBean.layerLevel) {
            return 1;
        }
        return this.layerLevel < dynamicViewBean.layerLevel ? -1 : 0;
    }
}
