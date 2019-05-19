package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean.DynamicViewBean;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean.RootBean;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean.ViewBean;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.FeedExtraLayout */
public class FeedExtraLayout {
    @JSONField(name = "callup_url")
    public String callUpUrl;
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(name = "dynamics")
    public List<List<DynamicViewBean>> dynamics;
    @JSONField(name = "dynamicsv2")
    public List<RootBean> dynamicsv2;
    @JSONField(name = "jump_type")
    public String jumpType;
    @JSONField(name = "jump_url")
    public String jumpUrl;
    @JSONField(name = "show_url")
    public String showUrl;
    @JSONField(name = "version_max")
    public float versionMax;
    @JSONField(name = "version_min")
    public float versionMin;

    @Nullable
    public ViewBean getSingleViewBean() {
        if (this.dynamicsv2 != null && this.dynamicsv2.size() > 0) {
            RootBean rootBean = (RootBean) this.dynamicsv2.get(0);
            if (rootBean != null) {
                return rootBean.getRoot();
            }
        }
        return null;
    }

    @Nullable
    public ViewBean getDualViewBean() {
        if (this.dynamicsv2 != null && this.dynamicsv2.size() > 1) {
            RootBean rootBean = (RootBean) this.dynamicsv2.get(1);
            if (rootBean != null) {
                return rootBean.getRoot();
            }
        }
        return null;
    }
}
