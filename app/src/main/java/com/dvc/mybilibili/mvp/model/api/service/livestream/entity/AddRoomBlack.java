package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//

@Keep
/* compiled from: BL */
public class AddRoomBlack {
    @JSONField(name = "id")
    /* renamed from: id */
    public String f5795id;
    @JSONField(name = "block_end_time")
    public String mBlockEndTime;
    @JSONField(name = "uname")
    public String mUname;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AddRoomBlack{id='");
        stringBuilder.append(this.f5795id);
        stringBuilder.append('\'');
        stringBuilder.append(", mUname='");
        stringBuilder.append(this.mUname);
        stringBuilder.append('\'');
        stringBuilder.append(", mBlockEndTime='");
        stringBuilder.append(this.mBlockEndTime);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
