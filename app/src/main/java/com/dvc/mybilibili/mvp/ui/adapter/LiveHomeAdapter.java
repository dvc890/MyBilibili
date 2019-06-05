package com.dvc.mybilibili.mvp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.base.utils.Reflect;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;
import com.dvc.mybilibili.mvp.ui.adapter.livehomeholder.bannerViewHolder;
import com.dvc.mybilibili.mvp.ui.adapter.livehomeholder.followedViewHolder;
import com.dvc.mybilibili.mvp.ui.adapter.livehomeholder.hourRankViewHolder;
import com.dvc.mybilibili.mvp.ui.adapter.livehomeholder.partitonViewHolder;
import com.dvc.mybilibili.mvp.ui.adapter.livehomeholder.recommendViewHolder;
import com.dvc.mybilibili.mvp.ui.adapter.livehomeholder.tagViewHolder;
import com.vondear.rxtool.RxLogTool;

import java.util.ArrayList;
import java.util.List;

public class LiveHomeAdapter extends BaseMultiItemQuickAdapter<BiliLiveHomePage.ModuleUnit, BaseViewHolder> {

    //        1 :banner位
    private final int BANNER_TYPE = 1;
    //        3/9 :普通分类推荐
    private final int PARTITON_TYPE1 = 3;
    private final int PARTITON_TYPE2 = 9;
    //        5 :小时榜
    private final int HOURRANK_TYPE = 5;
    //        6 :推荐直播
    private final int RECOMM_TYPE = 6;
    //        8 :我的关注
    private final int FOLLOWED_TYPE = 8;
    //        15 :分区入口（二合一）
    private final int TAG_TYPE = 15;
    //        16 :活动预约卡V2
    private final int ACTIVITYS_TYPE = 16;

    public LiveHomeAdapter(List<BiliLiveHomePage.ModuleUnit> data) {
        super(data);
        addItemType(BANNER_TYPE, R.layout.bili_item_banner);
        addItemType(PARTITON_TYPE1, R.layout.content_main);
        addItemType(PARTITON_TYPE2, R.layout.content_main);
        addItemType(HOURRANK_TYPE, R.layout.bili_live_hour_rank_layout);
        addItemType(RECOMM_TYPE, R.layout.content_main);
        addItemType(FOLLOWED_TYPE, R.layout.content_main);
        addItemType(TAG_TYPE, R.layout.content_main);
        addItemType(0, R.layout.content_main);
    }

    @Override
    protected void convert(BaseViewHolder helper, BiliLiveHomePage.ModuleUnit item) {
        switch (item.getItemType()) {
            case BANNER_TYPE:
                ((bannerViewHolder)helper).convert((BiliLiveHomePage.ModuleBanner) item);
                break;
            case PARTITON_TYPE1:
            case PARTITON_TYPE2:
                ((partitonViewHolder)helper).convert((BiliLiveHomePage.ModuleRooms) item);
                break;
            case HOURRANK_TYPE:
                ((hourRankViewHolder)helper).convert((BiliLiveHomePage.ModuleHourRank) item);
                break;
            case RECOMM_TYPE:
                ((recommendViewHolder)helper).convert((BiliLiveHomePage.ModuleRooms) item);
                break;
            case FOLLOWED_TYPE:
                ((followedViewHolder)helper).convert((BiliLiveHomePage.ModuleRooms) item);
                break;
            case TAG_TYPE:
                ((tagViewHolder)helper).convert((BiliLiveHomePage.ModuleEntrancesV2) item);
                break;
            default:
                break;
        }
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        try {
            View view = getItemView(Reflect.on(this).call("getLayoutId", viewType).get(), parent);
            switch (viewType) {
                case BANNER_TYPE:
                    return new bannerViewHolder(view);
                case PARTITON_TYPE1:
                case PARTITON_TYPE2:
                    return new partitonViewHolder(view);
                case HOURRANK_TYPE:
                    return new hourRankViewHolder(view);
                case RECOMM_TYPE:
                    return new recommendViewHolder(view);
                case FOLLOWED_TYPE:
                    return new followedViewHolder(view);
                case TAG_TYPE:
                    return new tagViewHolder(view);
                default:
                    RxLogTool.e("not find viewtype:"+viewType);
                    return super.onCreateViewHolder(parent, 0);
            }
        } catch (Exception e) {
            RxLogTool.e("not find viewtype:"+viewType);
            return super.onCreateViewHolder(parent, 0);
        }
    }

    public void refreshData(BiliLiveHomePage biliLiveHomePage) {
        //我的关注:head->bili_live_layout_home_followed_head
        BiliLiveHomePage.ModuleAttentions attentions = biliLiveHomePage.getAttentions().get(0);
        //banner
        BiliLiveHomePage.ModuleBanner banner = biliLiveHomePage.getBanner().get(0);
        //分类:bili_live_home_tag_v2
        BiliLiveHomePage.ModuleEntrancesV2 entrance = biliLiveHomePage.getEntrancesV2().get(0);
        //小时榜:bili_live_hour_rank_layout (has head)
        BiliLiveHomePage.ModuleHourRank hourrank = biliLiveHomePage.getHourRank().get(0);
        //所有分类推荐
        // head->bili_live_layout_home_recom_head
        // head->bili_live_layout_home_partition_head
        List<BiliLiveHomePage.ModuleRooms> rooms = biliLiveHomePage.getRooms();

        getData().clear();
        List<BiliLiveHomePage.ModuleUnit> tmp = new ArrayList();
        if(banner.getCardList().size() > 0)
            tmp.add(banner);
        if(entrance.getCardList().size() > 0)
            tmp.add(entrance);
        if(attentions.getCardList().size() > 0)
            tmp.add(attentions);
        if(rooms.size() > 0)
            tmp.add(rooms.get(0));
        if(hourrank.getCardList().size() > 0)
            tmp.add(hourrank);
        if(rooms.size() > 1)
            tmp.addAll(rooms.subList(1, rooms.size()));
        addData(tmp);
        //footerview : bili_live_layout_home_load_all
//        removeAllFooterView();
//        addFooterView(LayoutInflater.from(mContext).inflate(R.layout.bili_live_layout_home_load_all, null));
    }
}
