package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.OnClick;

public class recommendViewHolder extends DIYViewHolder {

    RecyclerView recyclerView;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.text_refresh)
    TextView textRefresh;
    @BindView(R.id.icon_refresh)
    ImageView iconRefresh;

    TextView more;

    public recommendViewHolder(View view) {
        super(view);
    }

    @Override
    public boolean init() {
        if(!super.init()) return false;
        LayoutInflater.from(getContext()).inflate(R.layout.bili_live_layout_home_view_more_video, getLinearLayout(), true);
        more = getLinearLayout().findViewById(R.id.text);
        addOnClickListener(R.id.refresh_group, more.getId());
        return true;
    }

    @Override
    protected int getHeadLayoutId() {
        return R.layout.bili_live_layout_home_recom_head;
    }

    @OnClick(R.id.refresh_group)
    public void onRefreshClicked() {
    }

    @Override
    public void convert(BiliLiveHomePage.ModuleUnit item) {
        super.convert(item);
        title.setText(item.getModuleInfo().getTitle());
        more.setText(getContext().getString(R.string.live_home_view_more_tips_1,item.getModuleInfo().getCount()));
    }
}
