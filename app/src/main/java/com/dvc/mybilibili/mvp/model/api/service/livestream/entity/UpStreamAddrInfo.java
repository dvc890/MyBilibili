package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

//

@Keep
/* compiled from: BL */
public class UpStreamAddrInfo {
    @JSONField(name = "up_stream")
    public UpStreamInfo upStreamInfo;

    @Keep
    /* compiled from: BL */
    public static class UpStreamInfo {
        public String addr;
        public String code;
        public String new_link;

        public String getFullUrl() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.addr);
            stringBuilder.append(this.code);
            return stringBuilder.toString();
        }

        public boolean isNeedSeepUp() {
            return !TextUtils.isEmpty(this.new_link);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UpStreamInfo{addr='");
            stringBuilder.append(this.addr);
            stringBuilder.append(10);
            stringBuilder.append(", code='");
            stringBuilder.append(this.code);
            stringBuilder.append(10);
            stringBuilder.append(", new_link='");
            stringBuilder.append(this.new_link);
            stringBuilder.append(10);
    //        //stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UpStreamAddrInfo{upStreamInfo=");
        stringBuilder.append(this.upStreamInfo);
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
