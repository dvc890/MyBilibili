package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class PromoOperationTab {
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "items")
    public List<BasicIndexItem> item;
    @JSONField(name = "tab")
    public ArrayList<Object> tabInfoList;

    public static PromoOperationTab newInstance() {
        PromoOperationTab promoOperationTab = new PromoOperationTab();
        promoOperationTab.item = new ArrayList();
        promoOperationTab.tabInfoList = new ArrayList();
        return promoOperationTab;
    }
}
