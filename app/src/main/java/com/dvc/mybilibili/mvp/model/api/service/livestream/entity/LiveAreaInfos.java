package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.bilibililive.api.entity.a */
public class LiveAreaInfos {
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
            baseLiveArea.parent_name = this.name;
        }
    }

    /* renamed from: b */
    public boolean isGameArea() {
        return "游戏".equals(this.name);
    }
}
