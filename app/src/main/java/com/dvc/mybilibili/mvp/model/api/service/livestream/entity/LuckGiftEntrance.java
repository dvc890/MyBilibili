package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//

@Keep
/* compiled from: BL */
public class LuckGiftEntrance {
    @JSONField(name = "status")
    public int entranceStatus;
    @JSONField(name = "cover")
    public String iconUrl;
    @JSONField(name = "url")
    public String url;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LuckGiftEntrance{entranceStatus=");
        stringBuilder.append(this.entranceStatus);
        stringBuilder.append(", url='");
        stringBuilder.append(this.url);
        stringBuilder.append('\'');
        stringBuilder.append(", iconUrl='");
        stringBuilder.append(this.iconUrl);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
