package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

//

@Keep
/* compiled from: BL */
public class LiveStreamingSpeedUpInfo {
    public boolean isChangeStream;
    public boolean isFromError;
    public String originUrl;
    public String url;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LiveStreamingSpeedUpInfo{url='");
        stringBuilder.append(this.url);
        stringBuilder.append('\'');
        stringBuilder.append(", originUrl='");
        stringBuilder.append(this.originUrl);
        stringBuilder.append('\'');
        stringBuilder.append(", isChangeStream=");
        stringBuilder.append(this.isChangeStream);
        stringBuilder.append(", isFromError=");
        stringBuilder.append(this.isFromError);
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
