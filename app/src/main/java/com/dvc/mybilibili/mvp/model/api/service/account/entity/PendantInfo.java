package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//import kotlinx.serialization.json.JsonParserKt;

@Keep
/* compiled from: BL */
public class PendantInfo {
    private String image;

    @JSONField(name = "image")
    public String getImage() {
        return this.image;
    }

    @JSONField(name = "image")
    public void setImage(String str) {
        this.image = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PendantInfo{image='");
        stringBuilder.append(this.image);
        stringBuilder.append('\'');
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
