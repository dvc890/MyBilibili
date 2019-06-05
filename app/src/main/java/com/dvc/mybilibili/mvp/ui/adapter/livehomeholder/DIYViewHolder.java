package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2019/6/5.
 */

public abstract class DIYViewHolder extends BaseViewHolder {

    private ViewGroup body;
    private LinearLayout linearLayout;

    private RecyclerView recyclerView;

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
        this.linearLayout = new LinearLayout(body.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(getContext()).inflate(getHeadLayoutId(), getLinearLayout(), true);
        LayoutInflater.from(getContext()).inflate(R.layout.bili_live_layout_recyclerview, getLinearLayout(), true)
        recyclerView = (RecyclerView) getLinearLayout().findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        body.addView(linearLayout);
        ButterKnife.bind(this, body);
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

    }
}
