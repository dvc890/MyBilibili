package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//////

@Keep
/* compiled from: BL */
public class BiliLiveSendDaily {
    @JSONField(name = "result")
    public int mResult;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLiveSendDaily{mResult=");
        stringBuilder.append(this.mResult);
//        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
