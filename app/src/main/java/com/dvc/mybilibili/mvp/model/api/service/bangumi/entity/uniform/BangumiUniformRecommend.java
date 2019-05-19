package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiUniformRecommend {
    @JSONField(name = "from")
    public int from;
    public List<BangumiUniformSimpleSeason> list;
    @JSONField(name = "season_id")
    public String seasonId;
    public String title;
}
