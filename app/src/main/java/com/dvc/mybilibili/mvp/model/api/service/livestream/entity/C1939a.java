package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.bilibililive.api.entity.a */
public class C1939a {
    @JSONField(name = "id")
    /* renamed from: a */
    public int id;
    @JSONField(name = "name")
    /* renamed from: b */
    public String name;
    @JSONField(name = "list")
    /* renamed from: c */
    public List<BaseLiveArea> list;

    /* renamed from: a */
    public void mo9006a() {
        for (BaseLiveArea baseLiveArea : this.list) {
            baseLiveArea.f5798c = this.name;
        }
    }

    /* renamed from: b */
    public boolean mo9007b() {
        return "\u6e38\u620f".equals(this.name);
    }
}
