package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.guard;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveGuardRankItem;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveGuardTopList {
    @JSONField(name = "info")
    public Info mInfo;
    @JSONField(name = "list")
    public List<BiliLiveGuardRankItem> mList;
    @JSONField(name = "top3")
    public List<BiliLiveGuardRankItem> mTopGuard;

    @Keep
    /* compiled from: BL */
    public static class Info {
        @JSONField(name = "now")
        public int mNow;
        @JSONField(name = "num")
        public int mNum;
        @JSONField(name = "page")
        public int mPage;
    }
}
