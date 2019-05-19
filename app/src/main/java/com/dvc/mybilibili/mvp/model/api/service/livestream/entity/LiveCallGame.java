package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

//

@Keep
/* compiled from: BL */
public class LiveCallGame {
    @JSONField(name = "list")
    public ArrayList<CallGameInfo> listCallGame;

    @Keep
    /* compiled from: BL */
    public static class CallGameInfo {
        @JSONField(name = "area_id")
        public int areaId;
        @JSONField(name = "package_name")
        public String packageName;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LiveCallGame{areaId=");
            stringBuilder.append(this.areaId);
            stringBuilder.append(", packageName='");
            stringBuilder.append(this.packageName);
            stringBuilder.append('\'');
    //        //stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LiveCallGame{listCallGame=");
        stringBuilder.append(this.listCallGame);
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
