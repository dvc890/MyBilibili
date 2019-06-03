package com.dvc.mybilibili.mvp.model.api;

import com.dvc.mybilibili.danmaku.video.entity.VideoDanmaku;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.socketconfig.BiliLiveSocketConfig;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.CategoryIndex;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentCursorList;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentDetail;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentDialogue;
import com.dvc.mybilibili.mvp.model.api.service.passport.entity.AuthKey;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.AppIndex;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.PegasusFeedResponse;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SplashData;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.FtVideoUrlInfoBean;

import java.util.List;

import io.reactivex.Observable;

public interface ApiHelper {
    Observable<SampleSplash> getSplashV2();

    Observable<SplashData> getSplashListV2(boolean cleanCache, String access_key, String birth);

    Observable<AccountInfo> getAccountInfo(String access_key);

    Observable<List<AppIndex>> getPegasusFeedIndexList(int idx, boolean pull, int login_event);

    Observable<PegasusFeedResponse> getPegasusFeedIndexListV2(String access_key, int idx, boolean pull, int login_event, String interest, int flush, int autoplay_card, String banner_hash, int device_type);

    Observable<List<CategoryIndex>> getCategoryIndex(String access_key);

    Observable<AuthKey> getKey(boolean cleanCache);

    Observable<LoginInfo> signInWithVerify(String username, String password, String captcha);

    Observable<LoginInfo> loginV3(String username, String password/*, Map<String, String> map*/);

    Observable<LoginInfo> acquireAccessToken(String code);

    Observable<BiliVideoDetail> getVideoDetails(int avid, String accessKey);

    Observable<FtVideoUrlInfoBean> getFTVideoUrl(String access_key, int avid, long cid, int qn);

//    Observable<JSONObject> getFTVideoUrlV2(String access_key, int avid, long cid, int qn);

    Observable<FtVideoUrlInfoBean> getFTVideoMaterialUrl(String access_key, int aid, long cid, int fnval);

    //ps=20&oid=53911062&mode=0&plat=2&type=1
    //ps=20&oid=53911062&mode=3&next=2&plat=2&type=1
    Observable<BiliCommentCursorList> getCommentListByCursorV2(long aid, int ps, int mode, int next);

    Observable<BiliCommentDetail> getCommentDetail(long aid, long root, int size, long min_id);

    //oid=54028582&plat=2&root=1642592226&size=20&type=1
    Observable<BiliCommentDialogue> getCommentDialogue(long aid, long root, int size, long min_id);

    Observable<BiliLiveSocketConfig> getRoomSocketConfigV3(long roomId);

    Observable<VideoDanmaku> getDanmakuListV2(long aid, long cid);
}
