package com.dvc.mybilibili.mvp.model.api.service.search.entity;

/* compiled from: BL */
public enum GOTO {
    VIDEO("av", SearchVideoItem.class, "bili_search_video_layout"),
    BANGUMI("bangumi", SearchBangumiItem.class, "bili_search_bangumi_layout"),
    MOVIE("movie", SearchBangumiItem.class, "bili_search_bangumi_layout"),
    SPECIAL("special", SearchSpecialItem.class, "bili_search_special_layout"),
    SPECIAL_S("special_s", SearchSpecialItem.class, "bili_search_special_s_layout"),
    ARTICLE("article", SearchArticleItem.class, "bili_search_article_layout"),
    BANNER("banner", BaseSearchItem.class, "bili_search_banner_layout"),
    AUTHOR("author", SearchUpperItem.class, "bili_search_author_layout"),
    LIVE("live", SearchLiveItem.class, "bili_search_live_layout"),
    GAME("game", SearchGameItem.class, "bili_search_game_layout"),
    CONVERGE("converge", SearchConvergeItem.class, "bili_search_converge_layout"),
    TICKET("ticket", SearchPurchaseItem.class, "bili_search_purchase_ticket_layout"),
    PRODUCT("product", SearchPurchaseItem.class, "bili_search_purchase_product_layout"),
    RECOMMEND_WORD("recommend_word", SearchRecommendWordItem.class, "bili_search_recommend_word_layout"),
    DYNAMIC("twitter", SearchDynamicItem.class, "bili_search_dynamic_layout"),
    NO_RESULT("suggest_keyword", SearchNoResultSuggestWord.class, "bili_search_all_no_result_layout"),
    STAR("star", SearchStarItem.class, "bili_search_star_layout"),
    SPECIAL_GUIDE("special_guide", SearchSpecialGuideItem.class, "bili_search_special_guide_layout"),
    COMIC("comic", SearchComicItem.class, "bili_search_comic_layout"),
    CHANNEL("channel", SearchChannelItem.class, "bili_search_channel_layout");
    
    private final Class<? extends BaseSearchItem> impl;
    private final String layout;
    private final String value;

    private GOTO(String str, Class<? extends BaseSearchItem> cls, String str2) {
        this.value = str;
        this.impl = cls;
        this.layout = str2;
    }

    public String getValue() {
        return this.value;
    }

    public Class<? extends BaseSearchItem> getImpl() {
        return this.impl;
    }

    public String getLayout() {
        return this.layout;
    }
}
