package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.os.Parcelable;

/* compiled from: BL */
public interface IAdReportInfo extends Parcelable {
    String getAdCb();

    long getAdIndex();

    long getAvId();

    long getCardIndex();

    String getCardType();

    String getClickUrl();

    long getCmReasonId();

    long getCreativeId();

    long getId();

    String getIp();

    boolean getIsAd();

    boolean getIsAdLoc();

    boolean getIsButtonShow();

    String getRequestId();

    long getResourceId();

    long getServerType();

    long getSrcId();
}
