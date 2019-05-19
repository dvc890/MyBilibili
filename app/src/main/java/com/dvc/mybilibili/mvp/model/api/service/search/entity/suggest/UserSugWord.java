package com.dvc.mybilibili.mvp.model.api.service.search.entity.suggest;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.search.entity.SearchOfficialVerify;

@Keep
/* compiled from: BL */
public class UserSugWord extends C2278a {
    @JSONField(name = "archives")
    public int archives;
    @JSONField(name = "fans")
    public int fans;
    @JSONField(name = "level")
    public int level;
    @Nullable
    @JSONField(name = "official_verify")
    public SearchOfficialVerify mOfficial;
}
