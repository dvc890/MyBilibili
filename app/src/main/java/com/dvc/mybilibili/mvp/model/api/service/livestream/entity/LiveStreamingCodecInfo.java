package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//

@Keep
/* compiled from: BL */
public class LiveStreamingCodecInfo {
    @JSONField(name = "codetimeout")
    public String codecTimeout;
    @JSONField(name = "highprofile")
    public String highProfile;
    @JSONField(name = "sps")
    public String sps;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LiveStreamingCodecInfo{highProfile='");
        stringBuilder.append(this.highProfile);
        stringBuilder.append('\'');
        stringBuilder.append(", codecTimeout='");
        stringBuilder.append(this.codecTimeout);
        stringBuilder.append('\'');
        stringBuilder.append(", sps='");
        stringBuilder.append(this.sps);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
