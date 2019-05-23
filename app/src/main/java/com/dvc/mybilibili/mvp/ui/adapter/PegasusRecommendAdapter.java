package com.dvc.mybilibili.mvp.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.retrofit2.responseconverter.CardTypeEnum;
import com.dvc.mybilibili.app.utils.CommandActionUtils;
import com.dvc.mybilibili.app.utils.GlideUtils;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.CardType;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed.Card;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerListItem;
import com.jakewharton.rxbinding2.view.RxView;

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
        addItemType(CardTypeEnum.BANNER_V2.getValue(), R.layout.bili_pegasus_list_item_small_cover_v2);//av
        addItemType(CardTypeEnum.SMALL_COVER_V2.getValue(), R.layout.bili_item_banner);//banner
        addItemType(CardTypeEnum.ADV2.getValue(), R.layout.content_main);//ad
    }

    @Override
    protected void convert(BaseViewHolder helper, BasicIndexItem item) {
        if(item.getViewType() == CardTypeEnum.BANNER_V2.getValue()) {
            loadBanner(helper, (BannerListItem) item);
        } else if(item.getViewType() == CardTypeEnum.SMALL_COVER_V2.getValue()) {

        } else if(item.getViewType() == CardTypeEnum.ADV2.getValue()) {
            helper.itemView.setVisibility(View.GONE);
        }
    }

    private void loadBanner(BaseViewHolder helper, BannerListItem item) {
        ConvenientBanner convenientBanner = helper.getView(R.id.convenientBanner);
        convenientBanner.startTurning(3000);
//        convenientBanner.stopTurning(); 出屏幕外调用
        convenientBanner.setPages(new CBViewHolderCreator() {
            @Override
            public BannerImageHolderView createHolder(View itemView) {
                return new BannerImageHolderView(itemView);
            }
            @Override
            public int getLayoutId() {
                return R.layout.bili_item_localimage;
            }
        }, item.bannerItem)
                .setPageIndicator(new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL);
        if(item.bannerItem.isEmpty()){
            convenientBanner.setVisibility(View.GONE);
        }else {
            convenientBanner.setVisibility(View.VISIBLE);
        }
        convenientBanner.setOnItemClickListener(position -> {
            if (item.bannerItem.size() <= 0)
                return;
            if (position > item.bannerItem.size() - 1)
                return;
            CommandActionUtils.start(helper.itemView.getContext(), item.bannerItem.get(position).clickUrl);
        });
    }
    public class BannerImageHolderView extends Holder<BannerItem> {
        private ImageView imageView;

        public BannerImageHolderView(View itemView) {
            super(itemView);
        }

        @Override
        protected void initView(View itemView) {
            imageView =itemView.findViewById(R.id.ivPost);
        }

        @Override
        public void updateUI(BannerItem data) {
            GlideUtils.Default2ImageView(imageView, data.image, 0);
        }
    }
}
