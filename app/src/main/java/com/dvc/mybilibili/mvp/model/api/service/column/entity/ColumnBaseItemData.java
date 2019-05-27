package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.ColumnManagerData.Stats;

import java.io.Serializable;
import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnBaseItemData implements Serializable {
    @JSONField(name = "banner_url")
    public String bannerUrl;
    @JSONField(name = "content")
    public String content;
    @JSONField(name = "ctime")
    public long ctime;
    @JSONField(name = "dynamic_intro")
    public String dynamicIntro;
    @JSONField(name = "edit_times")
    public long editTimes;
    @JSONField(name = "edit_url")
    public String editUrl;
    @JSONField(name = "id")
    /* renamed from: id */
    public int f6135id;
    @JSONField(name = "image_urls")
    public List<String> imageUrlList;
    @JSONField(name = "is_preview")
    public int isPreview;
    @JSONField(name = "mtime")
    public long mtime;
    @JSONField(name = "origin_image_urls")
    public List<String> orgImageUrlList;
    @JSONField(name = "pre_view_url")
    public String previewUrl;
    @JSONField(name = "publish_time")
    public int publishTime;
    @JSONField(name = "reason")
    public String reason;
    @JSONField(name = "reprint")
    public int reprint;
    @JSONField(name = "state")
    public int state;
    @JSONField(name = "stats")
    public Stats stats;
    @JSONField(name = "summary")
    public String summary;
    @JSONField(name = "tags")
    public List<String> tags;
    @JSONField(name = "template_id")
    public int templateId;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "view_url")
    public String viewUrl;
}
