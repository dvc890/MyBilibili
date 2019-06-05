package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2019/6/5.
 */

public abstract class DIYViewHolder extends BaseViewHolder {

    private ViewGroup body;
    private LinearLayout linearLayout;

    private RecyclerView recyclerView;
    private BaseQuickAdapter<BiliLiveHomePage.Card, BaseViewHolder> adapter;

    public DIYViewHolder(View view) {
        super(view);
        if(view instanceof ViewGroup) {
            this.body = (ViewGroup) view;
        }
        init();
    }

    public Context getContext() {
        return body.getContext();
    }

    public boolean init() {
        if(body == null) return false;
        body.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout = new LinearLayout(body.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(getContext()).inflate(getHeadLayoutId(), getLinearLayout(), true);
        LayoutInflater.from(getContext()).inflate(R.layout.bili_live_layout_recyclerview, getLinearLayout(), true);
        recyclerView = getLinearLayout().findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        body.addView(linearLayout);
        ButterKnife.bind(this, body);
        this.adapter = new BaseQuickAdapter<BiliLiveHomePage.Card, BaseViewHolder>(R.layout.bili_live_layout_video_card_stand) {
            @Override
            protected void convert(BaseViewHolder helper, BiliLiveHomePage.Card item) {
                GlideUtils.RoundedCorners2ImageView(helper.getView(R.id.cover), item.getCover(), 16);
                helper.setText(R.id.text_right, item.getOnlineNumber()+"");
                helper.setText(R.id.text_left, item.getAnchorName());
                helper.setText(R.id.title, item.getTitle());
                helper.setText(R.id.area_name, item.getAreaName());
                if(item.getPendentPic().length() > 0) {
                    helper.setText(R.id.active_msg, item.getPendentRightTop());
//                    helper.setTextColor(R.id.active_msg, Color.parseColor(item.getPendentRightTopColor()));
                    helper.setVisible(R.id.active_bg, true);
                    helper.setVisible(R.id.active_msg, true);
                    GlideUtils.Default2ImageView(helper.getView(R.id.active_bg), item.getPendentPic(), 0);
                } else {
                    helper.setVisible(R.id.active_bg, false);
                    helper.setVisible(R.id.active_msg, false);
                }
            }
        };
        this.adapter.bindToRecyclerView(recyclerView);
        return true;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    protected abstract int getHeadLayoutId();

    public void convert(BiliLiveHomePage.ModuleRooms item) {
        adapter.setNewData(item.getCardList());
    }
}
