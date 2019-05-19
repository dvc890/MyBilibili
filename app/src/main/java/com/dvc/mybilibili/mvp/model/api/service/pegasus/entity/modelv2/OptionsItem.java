package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class OptionsItem extends BasicIndexItem {
    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public List<C3291a> optionList;
    @Nullable
    @JSONField(name = "option")
    public List<String> options;
    @JSONField(deserialize = false, serialize = false)
    public ArrayList<Integer> selectecdInterestList = new ArrayList();

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.modelv2.OptionsItem$a */
    public static class C3291a {
        /* renamed from: a */
        public String f9765a;
        /* renamed from: b */
        public boolean f9766b;

        public C3291a(String str) {
            this.f9765a = str;
        }
    }
}
