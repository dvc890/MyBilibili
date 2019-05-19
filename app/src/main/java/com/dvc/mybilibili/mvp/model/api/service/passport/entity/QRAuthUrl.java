package com.dvc.mybilibili.mvp.model.api.service.passport.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//import kotlinx.serialization.json.JsonParserKt;

@Keep
/* compiled from: BL */
public class QRAuthUrl {
    @JSONField(name = "oauthKey")
    public String oauthKey;
    @JSONField(name = "url")
    public String url;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("QRLoginUrl{url='");
        stringBuilder.append(this.url);
        stringBuilder.append('\'');
        stringBuilder.append(", oauthKey='");
        stringBuilder.append(this.oauthKey);
        stringBuilder.append('\'');
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
