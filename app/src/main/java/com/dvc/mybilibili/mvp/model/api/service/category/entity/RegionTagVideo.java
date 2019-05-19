package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class RegionTagVideo {
    @JSONField(name = "cbottom")
    public long cBottom;
    @JSONField(name = "ctop")
    public long cTop;
    @JSONField(name = "new")
    public List<BiliVideoV2> newVideo;
    @JSONField(name = "recommend")
    public List<BiliVideoV2> recommend;
    @JSONField(name = "top_tag")
    public List<SimilarTag> topTag;

    public int getTotalCount() {
        int i = 0;
        int size = this.recommend == null ? 0 : this.recommend.size();
        if (this.newVideo != null) {
            i = this.newVideo.size();
        }
        return size + i;
    }
}
