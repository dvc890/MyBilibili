package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiCategoryIndexFilter {
    public List<Category> category;
    public List<String> years;

    @Keep
    /* compiled from: BL */
    public static class Category {
        @JSONField(name = "tag_id")
        public String tagId;
        @JSONField(name = "tag_name")
        public String tagName;
    }
}
