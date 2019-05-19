package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.api.bean.ViewStyleBean */
public class ViewStyleBean {
    @JSONField(name = "align")
    private int[] align;
    @JSONField(name = "background_color")
    String backGroundColor;
    @JSONField(name = "background_color_night")
    String backGroundColorNight;
    @JSONField(name = "bold")
    int bold = 0;
    @JSONField(name = "border")
    Border border;
    @JSONField(name = "content_mode")
    String contentMode;
    @JSONField(name = "corner_radius")
    int[] cornerRadius = new int[]{0, 0, 0, 0};
    @JSONField(name = "font")
    Integer font;
    @JSONField(name = "foreground_color")
    String foreColor;
    @JSONField(name = "foreground_color_night")
    String foreColorNight;
    @JSONField(name = "italic")
    int italic = 0;
    @JSONField(name = "max_lines")
    int maxLines;
    @JSONField(name = "padding")
    private int[] padding;

    public Integer getFont() {
        return this.font;
    }

    public String getForeColor() {
        return this.foreColor;
    }

    public String getBackGroundColor() {
        return this.backGroundColor;
    }

    public int getItalic() {
        return this.italic;
    }

    public int getBold() {
        return this.bold;
    }

    public String getContentMode() {
        return this.contentMode;
    }

    public int[] getCornerRadius() {
        return this.cornerRadius;
    }

    public Border getBorder() {
        return this.border;
    }

    public ViewStyleBean setFont(Integer num) {
        this.font = num;
        return this;
    }

    public ViewStyleBean setForeColor(String str) {
        this.foreColor = str;
        return this;
    }

    public ViewStyleBean setBackGroundColor(String str) {
        this.backGroundColor = str;
        return this;
    }

    public ViewStyleBean setItalic(int i) {
        this.italic = i;
        return this;
    }

    public ViewStyleBean setBold(int i) {
        this.bold = i;
        return this;
    }

    public ViewStyleBean setContentMode(String str) {
        this.contentMode = str;
        return this;
    }

    public ViewStyleBean setCornerRadius(int[] iArr) {
        this.cornerRadius = iArr;
        return this;
    }

    public ViewStyleBean setBorder(Border border) {
        this.border = border;
        return this;
    }

    public int[] getPadding() {
        return this.padding;
    }

    public ViewStyleBean setPadding(int[] iArr) {
        this.padding = iArr;
        return this;
    }

    public int[] getAlign() {
        return this.align;
    }

    public ViewStyleBean setAlign(int[] iArr) {
        this.align = iArr;
        return this;
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public void setMaxLines(int i) {
        this.maxLines = i;
    }

    public String getForeColorNight() {
        return this.foreColorNight;
    }

    public void setForeColorNight(String str) {
        this.foreColorNight = str;
    }

    public String getBackGroundColorNight() {
        return this.backGroundColorNight;
    }

    public void setBackGroundColorNight(String str) {
        this.backGroundColorNight = str;
    }
}
