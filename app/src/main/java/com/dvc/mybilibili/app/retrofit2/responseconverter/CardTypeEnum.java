package com.dvc.mybilibili.app.retrofit2.responseconverter;


import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.*;

import org.jetbrains.annotations.NotNull;

/* compiled from: BL */
public enum CardTypeEnum {
    LARGE_COVER_V1(SearchCardTypeEnum.f47823a.mo56915a(), LargeCoverV1Item.class),
    LARGE_COVER_V2(SearchCardTypeEnum.f47823a.mo56922h(), LargeCoverV2Item.class),
    LARGE_COVER_V3(SearchCardTypeEnum.f47823a.mo56914X(), LargeCoverV3Item.class),
    SMALL_COVER_V1(SearchCardTypeEnum.f47823a.mo56916b(), SmallCoverItem.class),
    SMALL_COVER_V2(SearchCardTypeEnum.f47823a.mo56917c(), SmallCoverV2Item.class),
    MIDDLE_COVER_V1(SearchCardTypeEnum.f47823a.mo56918d(), MiddleCoverItem.class),
    MIDDLE_COVER_V2(SearchCardTypeEnum.f47823a.mo56919e(), MiddleCoverItem.class),
    MIDDLE_COVER_V3(SearchCardTypeEnum.f47823a.mo56920f(), C3293a.class),
    SMALL_COVER_V3(SearchCardTypeEnum.f47823a.mo56921g(), SmallCoverV3Item.class),
    THREE_COVER_H_V3(SearchCardTypeEnum.f47823a.mo56934t(), C3296d.class),
    THREE_ITEM_H_V1(SearchCardTypeEnum.f47823a.mo56932r(), C3298e.class),
    THREE_ITEM_H_V2(SearchCardTypeEnum.f47823a.mo56933s(), C3298e.class),
    SMALL_COVER_V4(SearchCardTypeEnum.f47823a.mo56935u(), SmallCoverItem.class),
    FOOTER_EMPTY(SearchCardTypeEnum.f47823a.mo56897G(), BasicIndexItem.class),
    HOT_FOOTER_EMPTY(SearchCardTypeEnum.f47823a.mo56913W(), BasicIndexItem.class),
    PULL_TIP_V1(SearchCardTypeEnum.f47823a.mo56898H(), BasicIndexItem.class),
    PULL_TIP_V2(SearchCardTypeEnum.f47823a.mo56899I(), BasicIndexItem.class),
    HOT_TOPIC(SearchCardTypeEnum.f47823a.mo56931q(), HotTopicItem.class),
    TOP_STICK(SearchCardTypeEnum.f47823a.mo56930p(), TopStickItem.class),
    PARAGRAPH(SearchCardTypeEnum.f47823a.mo56929o(), ParagraphItem.class),
    TITLE_BAR(SearchCardTypeEnum.f47823a.mo56928n(), TitleBarItem.class),
    BANNER_V1(SearchCardTypeEnum.f47823a.mo56926l(), BannerListItem.class),
    BANNER_V2(SearchCardTypeEnum.f47823a.mo56927m(), BannerListItem.class),
    COVER_ONLY_V1(SearchCardTypeEnum.f47823a.mo56923i(), CoverOnlyItem.class),
    COVER_ONLY_V2(SearchCardTypeEnum.f47823a.mo56924j(), CoverOnlyItem.class),
    THREE_ITEM_V1(SearchCardTypeEnum.f47823a.mo56900J(), ThreeItemCardItem.class),
    THREE_ITEM_V2(SearchCardTypeEnum.f47823a.mo56901K(), ThreeItemCardItem.class),
    COVER_ONLY_V3(SearchCardTypeEnum.f47823a.mo56925k(), CoverOnlyItem.class),
    ADV1(SearchCardTypeEnum.f47823a.mo56902L(), ADItem.class),
    ADV2(SearchCardTypeEnum.f47823a.mo56903M(), ADItem.class),
    MULTI_ITEM(SearchCardTypeEnum.f47823a.mo56940z(), RcmdMultiItem.class),
    MULTI_ITEM_H(SearchCardTypeEnum.f47823a.mo56891A(), EntranceItem.class),
    TWO_ITEM_V1(SearchCardTypeEnum.f47823a.mo56938x(), C3302h.class),
    TWO_ITEM_V2(SearchCardTypeEnum.f47823a.mo56939y(), C3302h.class),
    THREE_ITEM_H_V4(SearchCardTypeEnum.f47823a.mo56892B(), ThreeItemHV4Item.class),
    UP_RCMD_COVER(SearchCardTypeEnum.f47823a.mo56893C(), UpRcmdCoverItem.class),
    TWO_ITEM_H_V1(SearchCardTypeEnum.f47823a.mo56894D(), TwoItemHV1Item.class),
    SMALL_COVER_V5(SearchCardTypeEnum.f47823a.mo56895E(), SmallCoverV5Item.class),
    ONE_PIC_V1(SearchCardTypeEnum.f47823a.mo56904N(), C3294b.class),
    ONE_PIC_V3(SearchCardTypeEnum.f47823a.mo56905O(), C3295c.class),
    THREE_PIC_V1(SearchCardTypeEnum.f47823a.mo56906P(), C3299f.class),
    THREE_PIC_V3(SearchCardTypeEnum.f47823a.mo56907Q(), C3300g.class),
    OPTIONS_V1(SearchCardTypeEnum.f47823a.mo56908R(), OptionsItem.class),
    OPTIONS_V2(SearchCardTypeEnum.f47823a.mo56909S(), OptionsItem.class),
    THREE_ITEM_H_V5(SearchCardTypeEnum.f47823a.mo56911U(), ThreeItemHV5Item.class),
    THREE_ITEM_ALL_V2(SearchCardTypeEnum.f47823a.mo56910T(), ThreeItemAllV2Item.class),
    SELECT(SearchCardTypeEnum.f47823a.mo56896F(), SelectItem.class),
    VIP(SearchCardTypeEnum.f47823a.mo56912V(), VipCardItem.class);
    
    @NotNull
    private Class<? extends BasicIndexItem> impl;
    private int value;

    CardTypeEnum(int i, Class<? extends BasicIndexItem> cls) {
        this.value = i;
        this.impl = cls;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue$pegasus_release(int i) {
        this.value = i;
    }

    @NotNull
    public final Class<? extends BasicIndexItem> getImpl() {
        return this.impl;
    }

    public final void setImpl$pegasus_release(@NotNull Class<? extends BasicIndexItem> cls) {
        this.impl = cls;
    }
}
