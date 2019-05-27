package com.dvc.mybilibili.mvp.model.api.service.video;

import android.os.Looper;
import android.text.TextUtils;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.utils.ParamValueUtils;
import com.dvc.mybilibili.app.utils.ParamsMap;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.RecommendUpperInfo;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.VideoRecommend;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.VideoTripleLike;

import java.util.ArrayList;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@BaseUrl("https://app.bilibili.com")
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.VideoApiService */
public interface VideoApiService {

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.VideoApiService$VideoParamsMap */
    public static class VideoParamsMap extends ParamsMap {

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.VideoApiService$VideoParamsMap$a */
        public static class create {
            /* renamed from: a */
            static ArrayList<String> f71299a = new ArrayList();
            /* renamed from: b */
            private ArrayList<String> f71300b;

            public create(int avid) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    this.f71300b = new ArrayList();
                } else {
                    this.f71300b = f71299a;
                }
                this.f71300b.clear();
                this.f71300b.add("plat");
                this.f71300b.add("0");
                this.f71300b.add("aid");
                this.f71300b.add(String.valueOf(avid));
                this.f71300b.add("qn");
                this.f71300b.add(String.valueOf(ParamValueUtils.getQN()));
                this.f71300b.add("fnver");
                this.f71300b.add(String.valueOf(ParamValueUtils.getFnver()));
                this.f71300b.add("fnval");
                this.f71300b.add(String.valueOf(ParamValueUtils.getFnval()));
                this.f71300b.add("force_host");
                this.f71300b.add(String.valueOf(ParamValueUtils.getForceHost()));
                this.f71300b.add("fourk");
                this.f71300b.add(ParamValueUtils.getFourk()+"");
            }

            /* renamed from: a */
            public create setFrom(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f71300b.add("from");
                    this.f71300b.add(str);
                }
                return this;
            }

            /* renamed from: b */
            public create setFromSpmid(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f71300b.add("from_spmid");
                    this.f71300b.add(str);
                }
                return this;
            }

            /* renamed from: c */
            public create setSpmid(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f71300b.add("spmid");
                    this.f71300b.add(str);
                }
                return this;
            }

            /* renamed from: d */
            public create setTrackId(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f71300b.add("trackid");
                    this.f71300b.add(str);
                }
                return this;
            }

            /* renamed from: e */
            public create setAutoPlay(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f71300b.add("autoplay");
                    this.f71300b.add(str);
                }
                return this;
            }

            /* renamed from: a */
            public VideoParamsMap build() {
                VideoParamsMap videoParamsMap = new VideoParamsMap((this.f71300b.size() / 2) + 1, null);
                this.f71300b.add("ad_extra");
                this.f71300b.add(videoParamsMap.getAdInfo());
                videoParamsMap.putParams((String[]) this.f71300b.toArray(new String[this.f71300b.size()]));
                return videoParamsMap;
            }
        }

        private VideoParamsMap(int i) {
            super(i);
        }

        public VideoParamsMap(int i, String str) {
            super(4);
            putParams("plat", "0", "aid", String.valueOf(i), "from", str, "ad_extra", getAdInfo());
        }

        /* Access modifiers changed, original: 0000 */
        public String getAdInfo() {
            return "";
        }
    }

    @FormUrlEncoded
    @POST("/x/v2/view/ad/dislike")
    Observable<Void> dislike(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/x/v2/view/dislike")
    Observable<GeneralResponse<VideoRecommend>> dislikeVideo(@FieldMap Map<String, Object> map);

//    @Timeout(conn = 1000)
    @GET("/x/v2/view/upper/recmd")
    Observable<GeneralResponse<RecommendUpperInfo>> getRecommendUppers(@QueryMap Map<String, String> map);

    @GET("/x/v2/view")
    Observable<GeneralResponse<BiliVideoDetail>> getVideoDetails(@QueryMap VideoParamsMap videoParamsMap, @Query("access_key") String access_key);

    @FormUrlEncoded
    @POST("/x/v2/view/like")
    Observable<GeneralResponse<VideoRecommend>> like(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/x/v2/view/like/triple")
    Observable<GeneralResponse<VideoTripleLike>> tripleLikeVideo(@FieldMap Map<String, Object> map);
}
