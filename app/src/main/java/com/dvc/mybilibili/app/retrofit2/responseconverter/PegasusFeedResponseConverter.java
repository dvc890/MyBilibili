package com.dvc.mybilibili.app.retrofit2.responseconverter;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.Config;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.PegasusFeedResponse;
import com.vondear.rxtool.RxLogTool;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;

public class PegasusFeedResponseConverter {

    @NotNull
    public static GeneralResponse<PegasusFeedResponse> convert(@NotNull GeneralResponse<JSONObject> jsonObjectGeneralResponse) throws IOException {
        JSONObject parseObject = jsonObjectGeneralResponse.data;
        GeneralResponse<PegasusFeedResponse> generalResponse = new GeneralResponse();
        generalResponse.code = parseObject.getIntValue("code");
        generalResponse.message = parseObject.getString("message");
        generalResponse.ttl = parseObject.getIntValue("ttl");
        PegasusFeedResponse pegasusFeedResponse = new PegasusFeedResponse();
        pegasusFeedResponse.feedVer = parseObject.getString("ver");
        pegasusFeedResponse.config = JSON.parseObject(parseObject.getString("config"), Config.class);
        if (parseObject.containsKey("items")) {
            pegasusFeedResponse.items = analysisList(parseObject.getJSONArray("items"));
        }
        generalResponse.data = pegasusFeedResponse;
        return generalResponse;
    }

    private static ArrayList<BasicIndexItem> analysisList(JSONArray jSONArray) {
        int size = jSONArray != null ? jSONArray.size() : 0;
        if (jSONArray == null || size == 0) {
            return new ArrayList();
        }
        ArrayList<BasicIndexItem> arrayList = new ArrayList();
        for(int i = 0 ; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if(TextUtils.isEmpty(jSONObject != null ? jSONObject.getString("card_type") : null)) continue;
            BasicIndexItem indexItem = analysisItem(jSONObject, jSONObject.getString("card_type").hashCode());
            if(indexItem != null) arrayList.add(indexItem);
        }
        return arrayList;
    }

    private static BasicIndexItem analysisItem(JSONObject jSONObject, int card_type) {
        CardTypeEnum typeEnum = SearchCardTypeEnum.search(card_type);
        if (typeEnum == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't find type of ");
            stringBuilder.append(jSONObject.getString("card_type"));
            RxLogTool.e("TMFeed", stringBuilder.toString());
            return null;
        }

        ParserConfig.getGlobalInstance().registerIfNotExists(typeEnum.getImpl(), typeEnum.getImpl().getModifiers(), true, false, true, true);
        BasicIndexItem basicIndexItem = TypeUtils.cast((Object) jSONObject, typeEnum.getImpl(), ParserConfig.getGlobalInstance());
        if (basicIndexItem != null) {
            basicIndexItem.setViewType(card_type);
            basicIndexItem.cardGotoType = basicIndexItem.cardGoto != null ? basicIndexItem.cardGoto.hashCode() : 0;
            if (basicIndexItem.goTo != null) {
                basicIndexItem.gotoType = basicIndexItem.goTo.hashCode();
            }
        }
        return basicIndexItem;
    }
}
