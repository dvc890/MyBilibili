package com.dvc.mybilibili.app.utils;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.dvc.mybilibili.R;

public class LoadStateViewUtils {

    public static void showEmptyLayout(BaseQuickAdapter adapter, String tips) {
        adapter.setEmptyView(R.layout.bili_layout_empty_tips);
        if(!TextUtils.isEmpty(tips))
            ((TextView)adapter.getEmptyView().findViewById(R.id.empty_text)).setText(tips);
    }

    public static void showLoadingLayout(BaseQuickAdapter adapter) {
        adapter.setEmptyView(R.layout.bili_layout_loading_tips);
    }

    public static void showNetErrorLayout(BaseQuickAdapter adapter, View.OnClickListener onClickListener) {
        adapter.setEmptyView(R.layout.bili_layout_net_error_tips);
    }

    public static void showLoadErrorLayout(BaseQuickAdapter adapter, View.OnClickListener onClickListener) {
        adapter.setEmptyView(R.layout.bili_layout_load_error_tips);
        if(onClickListener != null) {
            adapter.getEmptyView().findViewById(R.id.error_action).setOnClickListener(onClickListener);
        }
    }
}
