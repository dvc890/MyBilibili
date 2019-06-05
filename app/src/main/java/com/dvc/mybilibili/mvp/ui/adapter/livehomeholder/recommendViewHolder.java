package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dvc.mybilibili.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2019/6/5.
 */

public class recommendViewHolder extends DIYViewHolder {

    RecyclerView recyclerView;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.text_refresh)
    TextView textRefresh;
    @BindView(R.id.icon_refresh)
    ImageView iconRefresh;

    public recommendViewHolder(View view) {
        super(view);
    }

    @Override
    protected int getHeadLayoutId() {
        return R.layout.bili_live_layout_home_recom_head;
    }

    @OnClick(R.id.refresh_group)
    public void onRefreshClicked() {
    }
}
