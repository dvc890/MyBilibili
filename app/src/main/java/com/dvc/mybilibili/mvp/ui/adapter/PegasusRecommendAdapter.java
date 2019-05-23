package com.dvc.mybilibili.mvp.ui.adapter;

import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

import java.util.List;

public class PegasusRecommendAdapter extends BaseMultiItemQuickAdapter<BasicIndexItem, BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public PegasusRecommendAdapter(List<BasicIndexItem> data) {
        super(data);
        addItemType(0, 0);//av
        addItemType(1, 0);//banner
        addItemType(2, 0);//ad

    }

    @Override
    protected void convert(BaseViewHolder helper, BasicIndexItem item) {

    }

    @Override
    protected BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        return super.onCreateDefViewHolder(parent, viewType);
    }
}
