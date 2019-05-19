package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.DrawableRes;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.R;

@Keep
/* compiled from: BL */
public class SearchRank implements C2277a {
    @Nullable
    @JSONField(name = "keyword")
    public String mKeyword;
    @Nullable
    @JSONField(name = "status")
    public String mStatus;
    @Nullable
    @JSONField(name = "name_type")
    public String nameType;
    @Nullable
    @JSONField(name = "trackid")
    public String trackId;

    @Nullable
    public String getTagName() {
        return this.mKeyword;
    }

    @DrawableRes
    public int getStatusIcon() {
        return /*FollowingCard.CARD_RECOMMEND*/"hot".equalsIgnoreCase(this.mStatus) ? R.drawable.ic_search_hot_keyword : 0;
    }

    public String getNameType() {
        if (TextUtils.isEmpty(this.nameType)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.nameType);
        stringBuilder.append(" : ");
        return stringBuilder.toString();
    }
}
