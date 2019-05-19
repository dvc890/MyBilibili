package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.giftv2;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveLuckGiftText {
    @JSONField(name = "horizontal_text")
    public String horizontalText;
    @JSONField(name = "url")
    public String url;
    @JSONField(name = "vertical_text")
    public String verticalText;
    @JSONField(name = "web_text")
    public String webText;

    public String getText(boolean z) {
        return z ? this.verticalText : this.horizontalText;
    }

    public boolean isAvaliable() {
        return (TextUtils.isEmpty(this.horizontalText) || TextUtils.isEmpty(this.verticalText)) ? false : true;
    }
}
