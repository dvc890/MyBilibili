package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.v2.bean.ViewBean */
public class ViewBean {
    @Nullable
    private ActionBean action;
    @Nullable
    private ButtonViewBean button;
    @Nullable
    private List<ViewBean> child;
    private int height;
    @Nullable
    private ImgBean img;
    private boolean isRoot = false;
    @Nullable
    private LayoutBean layout;
    @Nullable
    private String scale;
    @Nullable
    private StyleBean style;
    @Nullable
    private String tag;
    @Nullable
    private TextBean text;
    @Nullable
    private String type;
    @Nullable
    private String visibility;
    private int width;

    public boolean isRoot() {
        return this.isRoot;
    }

    public void setRoot(boolean z) {
        this.isRoot = z;
    }

    public boolean needClickListener() {
        if (this.action == null || this.action.getJumpUrl() == null) {
            return false;
        }
        if (TextUtils.isEmpty(this.action.getJumpUrl()) && TextUtils.isEmpty(this.action.getCallUpUrl())) {
            return false;
        }
        return true;
    }

    @Nullable
    public String getScale() {
        return this.scale;
    }

    public void setScale(@Nullable String str) {
        this.scale = str;
    }

    @Nullable
    public ImgBean getImg() {
        return this.img;
    }

    public void setImg(@Nullable ImgBean imgBean) {
        this.img = imgBean;
    }

    @Nullable
    public ButtonViewBean getButton() {
        return this.button;
    }

    public void setButton(@Nullable ButtonViewBean buttonViewBean) {
        this.button = buttonViewBean;
    }

    @Nullable
    public LayoutBean getLayout() {
        return this.layout;
    }

    public void setLayout(@Nullable LayoutBean layoutBean) {
        this.layout = layoutBean;
    }

    @Nullable
    public String getVisibility() {
        return this.visibility;
    }

    public void setVisibility(@Nullable String str) {
        this.visibility = str;
    }

    public TextBean getTextBean() {
        return this.text;
    }

    public void setTextBean(TextBean textBean) {
        this.text = textBean;
    }

    @Nullable
    public List<ViewBean> getChild() {
        return this.child;
    }

    public void setChild(@Nullable List<ViewBean> list) {
        this.child = list;
    }

    @Nullable
    public String getType() {
        return this.type;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    @Nullable
    public String getTag() {
        return this.tag;
    }

    public void setTag(@Nullable String str) {
        this.tag = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Nullable
    public ActionBean getAction() {
        return this.action;
    }

    public void setAction(@Nullable ActionBean actionBean) {
        this.action = actionBean;
    }

    @Nullable
    public TextBean getText() {
        return this.text;
    }

    public void setText(@Nullable TextBean textBean) {
        this.text = textBean;
    }

    @Nullable
    public StyleBean getStyle() {
        return this.style;
    }

    public void setStyle(@Nullable StyleBean styleBean) {
        this.style = styleBean;
    }
}
