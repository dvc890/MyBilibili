package com.dvc.mybilibili.mvp.model.api.baseinterceptor;

import android.content.Context;
import android.text.TextUtils;

import com.bilibili.nativelibrary.LibBili;
import com.bilibili.nativelibrary.SignedQuery;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.Reflect;
import com.dvc.base.utils.ReflectException;
import com.vondear.rxtool.RxLogTool;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
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
        RxLogTool.d(TAG, url.toString());
        HttpUrl.Builder authorizedUrlBuilder = url.newBuilder()
                .scheme(oldRequest.url().scheme())
                .host(oldRequest.url().host());
        if(oldRequest.method().equals("POST")){
//            String postBodyString = bodyToString(oldRequest.body());
//            FormBody.Builder formBodyBuilder = new FormBody.Builder();
//            for(Map.Entry<String, String> entry : paramsMap.entrySet())
//                formBodyBuilder.add(entry.getKey(), entry.getValue());
//            postBodyString += ((postBodyString.length() > 0) ? "&" : "")
//                    + bodyToString(formBodyBuilder.build());
//            postBodyString += getSignParam(postBodyString);
            Map<String,String> tempMap = bodyToMap(oldRequest.body());
            tempMap.putAll(paramsMap);
            String postBodyString = LibBili.m8854a(tempMap).toString();
//            authorizedUrlBuilder.addQueryParameter("sign", LibBili.m8854a(tempMap).b);
            tempMap.clear();
            MediaType mediaType = oldRequest.body().contentType();
            if(mediaType == null )mediaType = MediaType.parse("application/x-www-form-urlencoded");
            return chain.proceed(
                    oldRequest.newBuilder()
                            .post(RequestBody.create(mediaType, postBodyString))
                            .url(authorizedUrlBuilder.build())
                            .build()
            );
        } else if(oldRequest.method().equals("GET")){
            for(Map.Entry<String, String> entry : paramsMap.entrySet())
                authorizedUrlBuilder.addQueryParameter(entry.getKey(), entry.getValue());

//            authorizedUrlBuilder.addQueryParameter("sign", getSign(/*SignedQuery.a*/(oldRequest.url().url().getQuery()+"&"+SignedQuery.r(paramsMap))));
            Map<String,String> tempMap = urlQueryParameterToMap(oldRequest.url());
            tempMap.putAll(paramsMap);
//            String signString = LibBili.m8854a(paramsMap).b;
//            authorizedUrlBuilder.addQueryParameter("sign", signString);
//            tempMap.clear();
            return chain.proceed(
                    oldRequest.newBuilder()
                            .url(url.newBuilder().encodedQuery(LibBili.m8854a(tempMap).toString()).build())
//                            .url(authorizedUrlBuilder.build())
                            .build()
            );
        }
        return chain.proceed(oldRequest);
    }

    private Map<String ,String> bodyToMap(RequestBody request) throws IOException {
        Map<String, String> map = new HashMap<>();
        if(request.contentLength() == 0) return map;
        for(int i = 0; i < ((FormBody) request).size(); i++){
            map.put(((FormBody) request).name(i), ((FormBody) request).value(i));
        }
        return map;
    }
    private Map<String ,String> urlQueryParameterToMap(HttpUrl url) {
        Map<String, String> map = new HashMap<>();
        if(TextUtils.isEmpty(url.query())) return map;
        for(int i = 0; i < url.querySize(); i++){
            map.put(url.queryParameterName(i), url.queryParameterValue(i));
        }

        return map;
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


    public String getSign(String params) {
        return enSha256(params.getBytes(Charset.forName(SignedQuery.HttpUtils.ENCODING_UTF_8)), key).toLowerCase(Locale.US);
    }

    public String getSignParam(String params) {
//        StringBuilder stringBuilder = new StringBuilder(params);
//        for (Map.Entry entry : treeMap.entrySet()) {
//            String str = (String) entry.getKey();
//            String str2 = (String) entry.getValue();
//            stringBuilder.append(str);
//            stringBuilder.append('=');
//            if (str2 == null) {
//                str2 = "";
//            }
//            stringBuilder.append(str2);
//            stringBuilder.append(Typography.amp);
//        }
//        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        String stringBuilder2 = "&sign="+getSign(params);
//        stringBuilder.append("&sign=");
//        stringBuilder.append(stringBuilder2);
        return stringBuilder2.toString();
    }

    private static final byte[] key = new byte[]{(byte) 57, (byte) 99, (byte) 97, (byte) 102, (byte) 97, (byte) 54, (byte) 52, (byte) 54, (byte) 54, (byte) 97, (byte) 48, (byte) 50, (byte) 56, (byte) 98, (byte) 102, (byte) 98};
    private String enSha256(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.reset();
            instance.update(bArr);
            if (bArr2 != null) {
                instance.update(bArr2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : instance.digest()) {
                int i = b & 255;
                if (i < 16) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(Integer.toHexString(i));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
