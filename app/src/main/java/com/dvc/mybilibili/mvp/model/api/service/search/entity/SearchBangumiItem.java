package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.content.Context;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.search.api.f */
public class SearchBangumiItem extends BaseSearchItem {
    @JSONField(name = "media_type")
    /* renamed from: a */
    public int f9841a;
    @JSONField(name = "play_state")
    /* renamed from: b */
    public int f9842b;
    @Nullable
    @JSONField(name = "area")
    /* renamed from: c */
    public String f9843c;
    @JSONField(name = "rating")
    /* renamed from: d */
    public float f9844d;
    @JSONField(name = "vote")
    /* renamed from: e */
    public int f9845e;
    @Nullable
    @JSONField(name = "prompt")
    /* renamed from: f */
    public String f9846f;
    @JSONField(name = "ptime")
    /* renamed from: g */
    public long f9847g;
    @Nullable
    @JSONField(name = "season_type_name")
    /* renamed from: h */
    public String f9848h;
    @Nullable
    @JSONField(name = "episodes")
    /* renamed from: i */
    public List<Episode> f9849i;
    @JSONField(name = "is_selection")
    /* renamed from: j */
    public int f9850j;
    @JSONField(name = "is_atten")
    /* renamed from: k */
    public int f9851k;
    @Nullable
    @JSONField(name = "label")
    /* renamed from: l */
    public String f9852l;
    @Nullable
    @JSONField(name = "season_id")
    /* renamed from: m */
    public String f9853m;
    @Nullable
    @JSONField(name = "out_name")
    /* renamed from: n */
    public String f9854n;
    @Nullable
    @JSONField(name = "out_icon")
    /* renamed from: o */
    public String f9855o;
    @Nullable
    @JSONField(name = "out_url")
    /* renamed from: p */
    public String f9856p;
    @Nullable
    @JSONField(name = "badges")
    /* renamed from: q */
    public List<Tag> f9857q;

    /* renamed from: a */
    public static boolean m14702a(int i) {
        return i == 1 || i == 4;
    }

    /* renamed from: b */
    public static boolean m14703b(int i) {
        return i == 2 || i == 5 || i == 3;
    }

    /* renamed from: a */
//    public static String m14701a(Context context, int i) {
//        switch (i) {
//            case 1:
//                i = 2131763104;
//                break;
//            case 2:
//                i = 2131763113;
//                break;
//            case 3:
//                i = 2131763106;
//                break;
//            case 4:
//                i = 2131763107;
//                break;
//            case 5:
//                i = 2131763114;
//                break;
//            default:
//                switch (i) {
//                    case ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED /*123*/:
//                        i = 2131763111;
//                        break;
//                    case ErrorCode.DOWNLOAD_REDIRECT_EMPTY /*124*/:
//                        i = 2131763112;
//                        break;
//                    case ErrorCode.DOWNLOAD_THROWABLE /*125*/:
//                        i = 2131763109;
//                        break;
//                    case ErrorCode.PV_UPLOAD_ERROR /*126*/:
//                        i = 2131763110;
//                        break;
//                    case 127:
//                        i = 2131763108;
//                        break;
//                    default:
//                        return "";
//                }
//        }
//        return context.getResources().getString(i);
//    }
}
