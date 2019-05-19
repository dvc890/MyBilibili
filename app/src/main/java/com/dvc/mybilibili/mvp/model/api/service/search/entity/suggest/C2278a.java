package com.dvc.mybilibili.mvp.model.api.service.search.entity.suggest;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.search.entity.Tag;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.search.api.suggest.a */
public class C2278a {
    @Nullable
    @JSONField(name = "badges")
    public List<Tag> badges;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "cover_size")
    public float coverSize;
    @Nullable
    @JSONField(name = "from")
    public String from;
    @Nullable
    @JSONField(name = "goto")
    public String goTo;
    @Nullable
    @JSONField(name = "keyword")
    public String keyword;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "position")
    public int position;
    @Nullable
    @JSONField(name = "sug_type")
    public String sugType;
    @JSONField(name = "term_type")
    public int termType;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    public String trackId;
    @Nullable
    @JSONField(name = "uri")
    public String uri;

    @Nullable
    public Tag getShowBadge() {
        return (this.badges == null || this.badges.size() <= 0) ? null : (Tag) this.badges.get(0);
    }
}
