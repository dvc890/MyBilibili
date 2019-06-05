package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.view.View;
import android.widget.TextView;

import com.dvc.mybilibili.R;

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

    @OnClick(R.id.refresh_group)
    public void onRefreshClicked() {
    }
}
