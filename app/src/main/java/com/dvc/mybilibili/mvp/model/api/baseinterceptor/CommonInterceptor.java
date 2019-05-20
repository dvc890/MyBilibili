package com.dvc.mybilibili.mvp.model.api.baseinterceptor;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.Reflect;
import com.dvc.base.utils.ReflectException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.interceptor.C9909b;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

@Singleton
public class CommonInterceptor implements Interceptor {
    private final static String TAG = CommonInterceptor.class.getSimpleName();
    Context context;
    BaseIntercept baseIntercept;
    Map<String, Iintercept> interceptMap;
    Map<String, String> paramsMap;
    @Inject
    public CommonInterceptor(@ApplicationContext Context context) {
        this.context = context;
        this.interceptMap = new HashMap<>();
        this.paramsMap = new HashMap<>();
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request oldRequest = chain.request();
        String header = oldRequest.header("Interceptor");
        paramsMap.clear();
        if(!TextUtils.isEmpty(header)) {
            try {
                Iintercept intercept;
                if(!interceptMap.containsKey(header))
                    intercept = Reflect.on(header).create(context).get();
                else
                    intercept = interceptMap.get(header);
                intercept.putParams(paramsMap);
            }catch (ReflectException e) {}
        }else {
            if(this.baseIntercept == null)
                this.baseIntercept = new BaseIntercept(context);
            baseIntercept.putParams(paramsMap);
        }
        HttpUrl url = oldRequest.url();
        Log.d(TAG, url.toString());
        HttpUrl.Builder authorizedUrlBuilder = url.newBuilder()
                .scheme(oldRequest.url().scheme())
                .host(oldRequest.url().host());
        if(oldRequest.method().equals("POST")){
            String postBodyString = bodyToString(oldRequest.body());
            FormBody.Builder formBodyBuilder = new FormBody.Builder();
            for(Map.Entry<String, String> entry : paramsMap.entrySet())
                formBodyBuilder.add(entry.getKey(), entry.getValue());
            postBodyString += ((postBodyString.length() > 0) ? "&" : "")
                    + bodyToString(formBodyBuilder.build());
            return chain.proceed(
                    oldRequest.newBuilder()
                            .post(RequestBody.create(oldRequest.body().contentType(), postBodyString))
                            .url(authorizedUrlBuilder.build())
                            .build()
            );
        } else if(oldRequest.method().equals("GET")){
            for(Map.Entry<String, String> entry : paramsMap.entrySet())
                authorizedUrlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            return chain.proceed(
                    oldRequest.newBuilder()
                            .url(authorizedUrlBuilder.build())
                            .build()
            );
        }
        return chain.proceed(oldRequest);
    }

    private String bodyToString(RequestBody request){
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if(copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        }
        catch (final IOException e) {
            return "did not work";
        }
    }
}
