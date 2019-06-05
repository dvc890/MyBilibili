package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;

public class tagViewHolder extends BaseViewHolder {

    private final RecyclerView recyclerView;
    private final BaseQuickAdapter adapter;

    public tagViewHolder(View view) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        this.recyclerView = new RecyclerView(view.getContext());
        this.recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 5));
        viewGroup.addView(recyclerView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        this.adapter = new BaseQuickAdapter<BiliLiveHomePage.Card, BaseViewHolder>(R.layout.bili_live_home_tag_item) {
            @Override
            protected void convert(BaseViewHolder helper, BiliLiveHomePage.Card item) {
                GlideUtils.Default2ImageView(helper.getView(R.id.icon), item.getPic(), 0);
                helper.setText(R.id.icon_name, item.getTitle());
//                if(helper.itemView.getTag() == null) {
//                    addOnClickListener(helper.itemView.getId());
//                }
            }
        };
        this.adapter.bindToRecyclerView(recyclerView);
        this.adapter.setOnItemClickListener((adapter, view1, position) -> {

        });
    }

    public void convert(BiliLiveHomePage.ModuleEntrancesV2 item) {
        adapter.setNewData(item.getCardList());
    }
}
