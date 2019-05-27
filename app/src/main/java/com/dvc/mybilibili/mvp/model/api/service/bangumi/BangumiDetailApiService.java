package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.utils.ParamsMap;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiApiResponse;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform.BangumiUniformSeason;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Set;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;

//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'\u00a8\u0006\u000b"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiDetailApiService;", "", "getViewSeason", "Lcom/bilibili/okretro/call/BiliCall;", "Lcom/bilibili/bangumi/api/BangumiApiResponse;", "Lcom/bilibili/bangumi/api/uniform/BangumiUniformSeason;", "referer", "", "paramsMap", "Lcom/bilibili/bangumi/api/uniform/BangumiDetailApiService$UniformSeasonParamsMap;", "UniformSeasonParamsMap", "bangumi_release"}, k = 1, mv = {1, 1, 11})
@BaseUrl("https://api.bilibili.com")
/* compiled from: BL */
public interface BangumiDetailApiService {

//    ////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiDetailApiService$UniformSeasonParamsMap;", "Lcom/bilibili/api/base/util/ParamsMap;", "id", "", "idType", "", "from", "fromSpmid", "fromAv", "spmid", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "bangumi_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class UniformSeasonParamsMap extends ParamsMap {
        public static final C4758a Companion = new C4758a();
        public static final int TYPE_EPISODE_ID = 2;
        public static final int TYPE_MEDIA_ID = 1;
        public static final int TYPE_SEASON_ID = 0;

//        ////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiDetailApiService$UniformSeasonParamsMap$Companion;", "", "()V", "TYPE_EPISODE_ID", "", "TYPE_MEDIA_ID", "TYPE_SEASON_ID", "bangumi_release"}, k = 1, mv = {1, 1, 11})
        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiDetailApiService$UniformSeasonParamsMap$a */
        public static final class C4758a {
            private C4758a() {
            }

//            public /* synthetic */ C4758a(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }
        }

        public UniformSeasonParamsMap(String access_key, @NotNull String type_id, int type, int track_path, @NotNull String from_spmid, @Nullable String from_av, @NotNull String spmid) {
           //Intrinsics.checkParameterIsNotNull(type_id, "id");
           //Intrinsics.checkParameterIsNotNull(from_spmid, "fromSpmid");
           //Intrinsics.checkParameterIsNotNull(spmid, "spmid");
            super(7);
            putParams("access_key", access_key);
            if (type == 0) {
                putParams("season_id", type_id);
            } else if (type == 1) {
                putParams("media_id", type_id);
            } else if (type == 2) {
                putParams("ep_id", type_id);
            }
            putParams("track_path", String.valueOf(track_path));
            putParams("from_spmid", from_spmid);
            putParams("spmid", spmid);
            putParams("from_av", from_av);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            return obj != null ? obj instanceof String : true ? containsKey((String) obj) : false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey(str);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            return obj != null ? obj instanceof String : true ? containsValue((String) obj) : false;
        }

        public /* bridge */ boolean containsValue(String str) {
            return super.containsValue(str);
        }

        public final Set<Entry<String, String>> entrySet() {
            return getEntries();
        }

//        public final /* bridge */ Object get(Object obj) {
//            return obj != null ? obj instanceof String : true ? get((String) obj) : null;
//        }

        public /* bridge */ String get(String str) {
            return (String) super.get(str);
        }

        public Set getEntries() {
            return super.entrySet();
        }

        public Set getKeys() {
            return super.keySet();
        }

//        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
//            return obj != null ? obj instanceof String : true ? getOrDefault((String) obj, (String) obj2) : obj2;
//        }
//
//        public /* bridge */ String getOrDefault(String str, String str2) {
//            return (String) super.getOrDefault(str, str2);
//        }

        public int getSize() {
            return super.size();
        }

        public Collection getValues() {
            return super.values();
        }

        public final Set<String> keySet() {
            return getKeys();
        }

//        public final /* bridge */ Object remove(Object obj) {
//            return obj != null ? obj instanceof String : true ? remove((String) obj) : null;
//        }

        public /* bridge */ String remove(String str) {
            return (String) super.remove(str);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            boolean z = true;
            if (obj != null ? obj instanceof String : true) {
                if (obj2 != null) {
                    z = obj2 instanceof String;
                }
                if (z) {
                    return remove((String) obj, (String) obj2);
                }
            }
            return false;
        }

//        public /* bridge */ boolean remove(String str, String str2) {
//            return super.remove(str, str2);
//        }

        public final int size() {
            return getSize();
        }

        public final Collection<String> values() {
            return getValues();
        }
    }

    //bili_referer:
    @NotNull
    @GET("/pgc/view/app/season")
    Observable<BangumiApiResponse<BangumiUniformSeason>> getViewSeason(@NotNull @Header("bili-referer") String bili_referer, @NotNull @QueryMap UniformSeasonParamsMap uniformSeasonParamsMap);
}
