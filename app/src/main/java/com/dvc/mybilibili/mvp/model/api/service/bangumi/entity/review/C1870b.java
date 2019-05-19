package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.bangumi.api.review.b */
public class C1870b {
    @JSONField(name = "my_review")
    /* renamed from: a */
    public UserReview f5715a;
    @JSONField(name = "folded_count")
    /* renamed from: b */
    public int f5716b;
    @JSONField(name = "list")
    /* renamed from: c */
    public List<UserReview> f5717c;

    /* renamed from: a */
    public String mo7955a() {
        if (this.f5717c == null) {
            return "0";
        }
        return ((UserReview) this.f5717c.get(this.f5717c.size() - 1)).cursor;
    }
}
