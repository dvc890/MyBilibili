package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class SearchRanks {
    @Nullable
    @JSONField(name = "list")
    public List<SearchRank> mList;
    @Nullable
    @JSONField(name = "trackid")
    public String trackId;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.mList != null) {
            for (SearchRank searchRank : this.mList) {
                stringBuilder.append(searchRank.mKeyword);
                stringBuilder.append("|");
            }
        }
        return stringBuilder.toString();
    }

    public boolean shouldIgnore() {
        return this.mList != null && this.mList.isEmpty();
    }
}
