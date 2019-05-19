package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//

@Keep
/* compiled from: BL */
public class BiliLiveAddWish {
    @JSONField(name = "audit_status")
    public int mAuditStatus;
    @JSONField(name = "content")
    public String mContent;
    @JSONField(name = "ctime")
    public String mCtime;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "type")
    public int mType;
    @JSONField(name = "type_id")
    public int mTypeId;
    @JSONField(name = "uid")
    public int mUid;
    @JSONField(name = "wish_limit")
    public int mWishLimit;
    @JSONField(name = "wish_progress")
    public int mWishProgress;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLiveAddWish{mId=");
        stringBuilder.append(this.mId);
        stringBuilder.append(", mUid=");
        stringBuilder.append(this.mUid);
        stringBuilder.append(", mType=");
        stringBuilder.append(this.mType);
        stringBuilder.append(", mTypeId=");
        stringBuilder.append(this.mTypeId);
        stringBuilder.append(", mWishLimit=");
        stringBuilder.append(this.mWishLimit);
        stringBuilder.append(", mWishProgress=");
        stringBuilder.append(this.mWishProgress);
        stringBuilder.append(", mStatus=");
        stringBuilder.append(this.mStatus);
        stringBuilder.append(", mAuditStatus=");
        stringBuilder.append(this.mAuditStatus);
        stringBuilder.append(", mContent='");
        stringBuilder.append(this.mContent);
        stringBuilder.append('\'');
        stringBuilder.append(", mCtime='");
        stringBuilder.append(this.mCtime);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
