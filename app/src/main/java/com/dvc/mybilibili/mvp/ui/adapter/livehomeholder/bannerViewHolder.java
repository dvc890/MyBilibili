package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.dvc.mybilibili.app.utils.CommandActionUtils;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerItem;
import com.dvc.mybilibili.mvp.ui.adapter.PegasusRecommendAdapter;

public class bannerViewHolder extends BaseViewHolder {
    private final ConvenientBanner banner;

    public bannerViewHolder(View view) {
        super(view);
        this.banner = (ConvenientBanner) view;
        if(!banner.isTurning()) banner.startTurning(3000);
    }

    public void convert(BiliLiveHomePage.ModuleBanner item) {
        this.banner.setPages(new CBViewHolderCreator() {
            @Override
            public Holder createHolder(View itemView) {
                return new BannerImageHolderView(itemView);
            }

            @Override
            public int getLayoutId() {
                return R.layout.bili_item_localimage;
            }
        }, item.getCardList())
                .setPageIndicator(new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT);
        this.banner.setOnItemClickListener(position -> {
            if(TextUtils.isEmpty(item.getCardList().get(position).getLink())) return;
            CommandActionUtils.toWeb(banner.getContext(), item.getCardList().get(position).getTitle(), item.getCardList().get(position).getLink());
        });
        this.banner.setVisibility(View.VISIBLE);
    }

    public class BannerImageHolderView extends Holder<BiliLiveHomePage.Card> {
        private ImageView imageView;

        public BannerImageHolderView(View itemView) {
            super(itemView);
        }

        @Override
        protected void initView(View itemView) {
            imageView =itemView.findViewById(R.id.ivPost);
        }

        @Override
        public void updateUI(BiliLiveHomePage.Card data) {
            GlideUtils.RoundedCorners2ImageView(imageView, data.getPic(), 16);
        }
    }
}
