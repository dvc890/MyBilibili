package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

@Keep
/* compiled from: BL */
public class BangumiApiPageResponse<T> extends BangumiApiResponse<T> {
    public int count;
    public int pages;
    public int total;
}
