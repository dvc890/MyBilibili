package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.view.View;
import android.widget.GridLayout;

import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;

public class tagViewHolder extends BaseViewHolder {

    private final GridLayout gridLayout;

    public tagViewHolder(View view) {
        super(view);
        this.gridLayout = (GridLayout) view;
    }

    public void convert(BiliLiveHomePage.ModuleEntrancesV2 item) {

    }
}
