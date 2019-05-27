package com.dvc.mybilibili.mvp.model.api.service.comment;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.*;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@BaseUrl("http://api.bilibili.com")
/* compiled from: BL */
public interface BiliCommentApiService {
    @FormUrlEncoded
    @POST("/x/v2/reply/del")
    Observable<GeneralResponse<Void>> delete(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2);

    @FormUrlEncoded
    @POST("/x/v2/reply/del/combo")
    Observable<GeneralResponse<JSONObject>> deleteAndBlacken(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2);

    @FormUrlEncoded
    @POST("/x/v2/reply/hate")
    Observable<GeneralResponse<Void>> dislike(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2, @Field("action") int i2);

    //评论：更多回复内容
    @GET("/x/v2/reply/reply/cursor")
    Observable<GeneralResponse<BiliCommentDetail>> getCommentDetail(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply/dialog/cursor")
    Observable<GeneralResponse<BiliCommentDialogue>> getCommentDialogue(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply/folded")
    Observable<GeneralResponse<BiliCommentCursorList>> getCommentFoldedList(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply")
    Observable<GeneralResponse<BiliCommentList>> getCommentList(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply/cursor")
    Observable<GeneralResponse<BiliCommentCursorList>> getCommentListByCursor(@QueryMap Map<String, String> map);

    //评论列表
    @GET("/x/v2/reply/main")
    Observable<GeneralResponse<BiliCommentCursorList>> getCommentListByCursorV2(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply/log")
    Observable<GeneralResponse<BiliCommentDeleteHistory>> getDeleteLog(@Query("oid") long j, @Query("type") int i, @Query("pn") int i2, @Query("ps") int i3);

    @GET("/x/v2/reply/reply/folded")
    Observable<GeneralResponse<BiliCommentCursorList>> getReplyFoldedList(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply/topics")
    Observable<GeneralResponse<BiliCommentTopic>> getTopic(@Query("oid") long j, @Query("type") int i, @Query("mid") long j2, @Query("message") String str);

    @FormUrlEncoded
    @POST("/x/v2/reply/action")
    Observable<GeneralResponse<Void>> like(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2, @Field("action") int i2);

    @FormUrlEncoded
    @POST("/x/v2/reply/add")
    Observable<GeneralResponse<BiliCommentAddResult>> postComment(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/x/v2/reply/report")
    Observable<GeneralResponse<Void>> report(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2, @Field("reason") int i2, @Field("content") String str2);

    @FormUrlEncoded
    @POST("/x/v2/reply/top")
    Observable<GeneralResponse<Void>> stick(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2, @Field("action") int i2);
}
