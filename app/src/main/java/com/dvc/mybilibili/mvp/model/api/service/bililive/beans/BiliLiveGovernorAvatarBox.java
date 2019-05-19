package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveGovernorAvatarBox {
    @JSONField(name = "cnt")
    public int mCnt;
    @JSONField(name = "list")
    public List<Governor> mList;

    @Keep
    /* compiled from: BL */
    public static class Governor {
        @JSONField(name = "end_time")
        public long mEndTime;
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "is_open")
        public int mIsOpen;
        @JSONField(name = "uid")
        public long mUid;
    }

    public static Governor copyFrom(BiliLiveGuardLottery biliLiveGuardLottery) {
        Governor governor = new Governor();
        governor.mUid = biliLiveGuardLottery.mSender.mUid;
        governor.mFace = biliLiveGuardLottery.mSender.mFace;
        governor.mIsOpen = 1;
        governor.mEndTime = (long) ((((float) System.currentTimeMillis()) / 1000.0f) + ((float) biliLiveGuardLottery.mTime));
        return governor;
    }
}
