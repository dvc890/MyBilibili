package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.giftv2;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLivePackage;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLivePackageData {
    @JSONField(name = "list")
    public List<BiliLivePackage> mPackageList;
}
