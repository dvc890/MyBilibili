package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.dvc.mybilibili.R;

import butterknife.BindView;
import butterknife.OnClick;

public class followedViewHolder extends DIYViewHolder {
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.sub_title)
    TextView subTitle;
    @BindView(R.id.anim_icon)
    LottieAnimationView animIcon;
    @BindView(R.id.text_more)
    TextView textMore;

    public followedViewHolder(View view) {
        super(view);
    }

    @Override
    protected int getHeadLayoutId() {
        return R.layout.bili_live_layout_home_followed_head;
    }

    @OnClick(R.id.text_more)
    public void onMoreClicked() {
    }
}
