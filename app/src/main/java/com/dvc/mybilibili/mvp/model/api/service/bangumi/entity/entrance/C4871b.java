package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import com.alibaba.fastjson.JSONObject;

import org.jetbrains.annotations.NotNull;

import java.util.List;


import io.reactivex.Observable;

//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H&J\b\u0010\u0010\u001a\u00020\u0005H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J,\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00130\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eH&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H&J7\u0010\u001a\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00130\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001dH&\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\tH&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0005H&J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\tH&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000eH&\u00a8\u0006)"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/HomeDataSource;", "", "changeDialog", "", "type", "", "getBangumiFavorActionObservable", "Lrx/Observable;", "Lkotlin/Pair;", "", "", "getBangumiFirstScreen", "Lcom/bilibili/bangumi/data/entrance/HomePage;", "getBangumiReviewActionObservable", "", "getCinemaFirstScreen", "getClosedNoticeHash", "getDialogChangeObservable", "getExchangeData", "", "Lcom/bilibili/bangumi/data/entrance/CommonCard;", "oid", "getHomeClickRecord", "getMineBangumiModule", "Lcom/bilibili/bangumi/data/entrance/HomeMinePage;", "getMineCinemaModule", "getRecommendFall", "cursor", "wids", "", "(Ljava/lang/String;[Ljava/lang/Long;)Lrx/Observable;", "saveClickRecord", "id", "saveCloseNotice", "noticesHash", "toggleFavor", "Lcom/alibaba/fastjson/JSONObject;", "hasFavor", "seasonId", "toggleReview", "mediaId", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
/* renamed from: com.bilibili.bangumi.data.entrance.b */
public interface C4871b {
    @NotNull
    /* renamed from: a */
    List<Long> mo26431a();

    @NotNull
    /* renamed from: a */
    Observable<JSONObject> mo26432a(boolean z, long j);

    /* renamed from: a */
    void mo26433a(long j);
}
