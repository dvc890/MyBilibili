package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform.BangumiUniformSimpleSeason;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BangumiCinemaIndex {
    @JSONField(name = "data")
    public ArrayList<BangumiUniformSimpleSeason> list;
}
