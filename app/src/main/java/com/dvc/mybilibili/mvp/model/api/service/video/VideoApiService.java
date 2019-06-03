package com.dvc.mybilibili.mvp.model.api.service.video;

import android.os.Looper;
import android.text.TextUtils;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.utils.ParamValueUtils;
import com.dvc.mybilibili.app.utils.ParamsMap;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.FtVideoUrlInfoBean;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.RecommendUpperInfo;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.VideoDanmakuInfo;
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
                this.f71300b.add("ts");
                this.f71300b.add(String.valueOf((System.currentTimeMillis() / 1000) * 1000));
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
            return null;//"921AF000E69CE651B4BA00520A18874438913C7F34944FDE6CC8058129A9E93436E02B09A5E33A05CA50E45353A3B761CA97954966B15121DA59B722928EFC744F9E0452B66E2D73C3397A5B72916CA637E8CE97D8ABE31406E6912F7CA7CB3EBA81D1C1AEF8E17218DF08A4411240D571A343831ADD1CA2502783ED843D9C7864B3CD68A6A5AF46A60C8CD774428B0CD45454145C4419AB7896DCB44B8D26555768C90B3E7C3AD3BB5107D73D3D13C2BB7DCC866ACE02F060B4253F76422EF67445B045C9545D614F2E8F22930167AE4DE5197C9AD661B43E7CD1F892E378EEB1487DB23C89894FDC642560DEF6C96C988945CE1F05AF84DABAFDA9F1379B77636253AF037EDAC0EC92DB017962EE9E3475642505CF1D82739483BECFB38B391821D67C86D089A5D54ACB449A33D5873BB38CD57D58E1B96B76DFB71C03C84348B89CDD07DA59DB8B565AB928B73A5D42CAE9A3E8B328748BAD28628CA4C890B4A5A80E8D3E1DCD7BB95625D4994A4CD080802A9D8C73F64F87B5AAB31AB08DF7CDFA249A49A75D7A397911F2C1AC070686DFB6CF588AAC43E057103A4B0D4B35AA58AFFEA86768061A20CFDC478FA3BC86C82B8C96D652EAA2179FF9A1DA663BF27BFD7CF686ECA640125A4913B58919BAFEC39C2380EECAAC6549BBB17F43FD739520D5219526516C44171D5158EA732D41A0739AADD945BD837ADC1DB4A409D60EA584AB3E5F9B90AEE6259C86FB713F14519FA078CC8AA46D1DBE8F7855C9A802FDC1C69802FAB79C9BAE4D96DA39518A233025F7CB10B3240ADAE5580FFCFDBDE685DDA6396DAF1216AC79AE92069FB5ED36E161F88A7F639A72959E974D90EFC9634CE3B9CFD6B05B1911CCE2134AAFD0FF48E3C9A448609ADD904A4C";
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

    //Map: "aid","cid","fnval=1"
    @GET("/x/playurl")
    Observable<GeneralResponse<FtVideoUrlInfoBean>> getFTVideoMaterialUrl(@Query("access_key") String access_key, @QueryMap Map<String, String> map);

    @GET("https://api.bilibili.com/x/player/playurl")
    Observable<GeneralResponse<FtVideoUrlInfoBean>> getFTVideoUrl(@Query("access_key") String access_key, @QueryMap Map<String, String> map);

    @GET("http://api.bilibili.com/x/v2/dm/list.so?&ps=0&type=1&plat=2")
    Observable<byte[]> getDanmakuListV2(@Query("aid") long aid, @Query("oid") long cid) ;

    @GET("http://api.bilibili.com/x/v2/dm/view?type=1&plat=2&ps=0")
    Observable<GeneralResponse<VideoDanmakuInfo>> getDanmakuInfo(@Query("aid") long aid, @Query("oid") long cid) ;

    @GET("http://api.bilibili.com/x/v1/dm/list.so?")
    Observable<String> getDanmakuList(@Query("oid") long cid) ;

//    @GET("https://comment.bilibili.com/{cid}.xml")
//    Observable<String> getDanmakus(@Path("cid") long cid);

//    @Headers("Referer:https://api.bilibili.com/x/web-interface/view?aid={0}/?p=")
//    @GET("https://interface.bilibili.com/v2/playurl?otype=json")
//    Observable<GeneralResponse<JSONObject>> getFTVideoUrlV2(@Query("access_key") String access_key, @Query("aid")  int avid, @Query("cid") long cid, @Query("qn") int qn);
}
