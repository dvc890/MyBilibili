package com.dvc.mybilibili.mvp.ui.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.fastjson.JSONObject;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.retrofit2.responseconverter.CardTypeEnum;
import com.dvc.mybilibili.app.retrofit2.responseconverter.SearchCardTypeEnum;
import com.dvc.mybilibili.app.utils.CommandActionUtils;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed.FeedExtra;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.ADItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerListItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.SmallCoverV2Item;

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
        addItemType(SearchCardTypeEnum.get().smallCoverV2type(), R.layout.bili_pegasus_list_item_small_cover_v2);//av
        addItemType(SearchCardTypeEnum.get().bannerV2type(), R.layout.bili_item_banner);//banner
        addItemType(SearchCardTypeEnum.get().adV2type(), R.layout.bili_pegasus_list_item_small_cover_v2);//ad
        setSpanSizeLookup((gridLayoutManager, position) -> {
            //表示需要占据几个位置的span
            //因为在声明gridlayoutManager的时候进行了设置，so每一行2个span
            int viewType = getItemViewType(position);
            if(viewType == CardTypeEnum.BANNER_V2.getValue())
                return 2;//占据两个位置的span
            if(viewType == CardTypeEnum.ADV2.getValue()) {
                FeedExtra feedExtra = JSONObject.parseObject(getItem(position).adInfo.extra.toJSONString(), FeedExtra.class);
                if(feedExtra.card.cardType == 2)
                    return 2;//
                else if(feedExtra.card.cardType == 3)
                    return 1;//
            }
            return 1;//占据一个位置
        });
    }

    @Override
    protected void convert(BaseViewHolder helper, BasicIndexItem item) {
        CardTypeEnum typeEnum = SearchCardTypeEnum.search(item.getViewType());
        switch (typeEnum) {
            case BANNER_V2:
                loadBanner(helper, (BannerListItem) item);
                break;
            case SMALL_COVER_V2:
                loadSmallCoverV2(helper, (SmallCoverV2Item) item);
                break;
            case ADV2:
                loadAdV2(helper, (ADItem) item);
                break;
        }
    }

    private void loadAdV2(BaseViewHolder helper, ADItem item) {
        FeedExtra feedExtra = JSONObject.parseObject(item.adInfo.extra.toJSONString(), FeedExtra.class);
        if(feedExtra.card.cardType == 2) {
            GlideUtils.TopRoundedCorners2ImageView(helper.getView(R.id.cover), feedExtra.card.covers.get(0).url, 16);
            helper.setText(R.id.title, feedExtra.card.title);
            helper.setText(R.id.desc, feedExtra.card.desc); //立即测试的按钮
        }
        else if(feedExtra.card.cardType == 3) {
            GlideUtils.TopRoundedCorners2ImageView(helper.getView(R.id.cover), feedExtra.card.covers.get(0).url, 16);
            helper.setText(R.id.title, feedExtra.card.title);
            helper.setText(R.id.desc, feedExtra.card.desc); //立即测试的按钮
        }
        helper.setVisible(R.id.cover_text_shadow, false);
        helper.setVisible(R.id.index_card_text_layout, false);
    }

    private void loadSmallCoverV2(BaseViewHolder helper, SmallCoverV2Item item) {
        helper.setText(R.id.cover_left_text1, item.coverLeftText1);
        helper.setText(R.id.cover_left_text2, item.coverLeftText2);
        helper.setText(R.id.cover_right_text, item.coverRightText);
        if(item.descButton != null && !TextUtils.isEmpty(item.descButton.text))
            helper.setText(R.id.desc, item.descButton.text);
        helper.setText(R.id.title, item.title);
        GlideUtils.TopRoundedCorners2ImageView(helper.getView(R.id.cover), item.cover, 16);
    }

    private void loadBanner(BaseViewHolder helper, BannerListItem item) {
        ConvenientBanner convenientBanner = (ConvenientBanner) helper.itemView;//helper.getView(R.id.convenientBanner);
        if(!convenientBanner.isTurning())
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
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT);
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
            GlideUtils.RoundedCorners2ImageView(imageView, data.image, 16);
        }
    }
}
