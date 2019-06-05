package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;

public class bannerViewHolder extends BaseViewHolder {
    private final ConvenientBanner banner;

    public bannerViewHolder(View view) {
        super(view);
        this.banner = (ConvenientBanner) view;
    }

    public void convert(BiliLiveHomePage.ModuleBanner item) {

    }
}
