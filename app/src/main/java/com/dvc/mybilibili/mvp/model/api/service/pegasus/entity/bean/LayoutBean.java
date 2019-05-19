package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.v2.bean.LayoutBean */
public class LayoutBean {
    @Nullable
    private String above;
    @Nullable
    private String align_bottom;
    @Nullable
    private String align_left;
    private boolean align_parent_bottom;
    private boolean align_parent_left;
    private boolean align_parent_right;
    private boolean align_parent_top;
    @Nullable
    private String align_right;
    @Nullable
    private String align_top;
    @Nullable
    private String below;
    private boolean center_horizontal;
    private boolean center_in_parent;
    private boolean center_vertical;
    @Nullable
    private String gravity;
    @Nullable
    private float[] margin;
    private int orientation;
    @Nullable
    private float[] padding;
    @Nullable
    @JSONField(name = "to_left_of")
    private String toLeftOf;
    @Nullable
    @JSONField(name = "to_right_of")
    private String toRightOf;
    private float weight;

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float f) {
        this.weight = f;
    }

    @Nullable
    public String getGravity() {
        return this.gravity;
    }

    public void setGravity(@Nullable String str) {
        this.gravity = str;
    }

    public float[] getMargin() {
        return this.margin;
    }

    public void setMargin(@Nullable float[] fArr) {
        this.margin = fArr;
    }

    public float[] getPadding() {
        return this.padding;
    }

    public void setPadding(@Nullable float[] fArr) {
        this.padding = fArr;
    }

    public boolean isCenter_vertical() {
        return this.center_vertical;
    }

    public void setCenter_vertical(boolean z) {
        this.center_vertical = z;
    }

    public boolean isCenter_in_parent() {
        return this.center_in_parent;
    }

    public void setCenter_in_parent(boolean z) {
        this.center_in_parent = z;
    }

    public boolean isCenter_horizontal() {
        return this.center_horizontal;
    }

    public void setCenter_horizontal(boolean z) {
        this.center_horizontal = z;
    }

    @Nullable
    public String getToRightOf() {
        return this.toRightOf;
    }

    public void setToRightOf(@Nullable String str) {
        this.toRightOf = str;
    }

    @Nullable
    public String getToLeftOf() {
        return this.toLeftOf;
    }

    public void setToLeftOf(@Nullable String str) {
        this.toLeftOf = str;
    }

    @Nullable
    public String getAbove() {
        return this.above;
    }

    public void setAbove(@Nullable String str) {
        this.above = str;
    }

    @Nullable
    public String getBelow() {
        return this.below;
    }

    public void setBelow(@Nullable String str) {
        this.below = str;
    }

    @Nullable
    public String getAlign_left() {
        return this.align_left;
    }

    public void setAlign_left(@Nullable String str) {
        this.align_left = str;
    }

    @Nullable
    public String getAlign_top() {
        return this.align_top;
    }

    public void setAlign_top(@Nullable String str) {
        this.align_top = str;
    }

    @Nullable
    public String getAlign_right() {
        return this.align_right;
    }

    public void setAlign_right(@Nullable String str) {
        this.align_right = str;
    }

    @Nullable
    public String getAlign_bottom() {
        return this.align_bottom;
    }

    public void setAlign_bottom(@Nullable String str) {
        this.align_bottom = str;
    }

    public boolean isAlign_parent_left() {
        return this.align_parent_left;
    }

    public void setAlign_parent_left(boolean z) {
        this.align_parent_left = z;
    }

    public boolean isAlign_parent_top() {
        return this.align_parent_top;
    }

    public void setAlign_parent_top(boolean z) {
        this.align_parent_top = z;
    }

    public boolean isAlign_parent_right() {
        return this.align_parent_right;
    }

    public void setAlign_parent_right(boolean z) {
        this.align_parent_right = z;
    }

    public boolean isAlign_parent_bottom() {
        return this.align_parent_bottom;
    }

    public void setAlign_parent_bottom(boolean z) {
        this.align_parent_bottom = z;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }
}
