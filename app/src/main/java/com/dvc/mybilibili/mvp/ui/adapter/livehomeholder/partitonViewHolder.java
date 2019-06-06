package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.view.View;
import android.widget.TextView;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;

import butterknife.BindView;
import butterknife.OnClick;

public class partitonViewHolder extends DIYViewHolder {

    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.text_more)
    TextView textMore;

    public partitonViewHolder(View view) {
        super(view);
    }

    @Override
    protected int getHeadLayoutId() {
        return R.layout.bili_live_layout_home_partition_head;
    }

    @OnClick(R.id.more_group)
    public void onMoreClicked() {

    }

    @Override
    public void convert(BiliLiveHomePage.ModuleUnit item) {
        super.convert(item);
        title.setText(item.getModuleInfo().getTitle());
    }
}
