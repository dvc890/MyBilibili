package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveNewArea.SubArea;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveFavTag {
    @JSONField(name = "tags")
    public List<SubArea> mTags;
    @JSONField(name = "uid")
    public long mUid;
}
