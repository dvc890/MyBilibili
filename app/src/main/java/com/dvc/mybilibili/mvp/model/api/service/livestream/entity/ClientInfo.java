package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ClientInfo {
    @JSONField(name = "city")
    public String city;
    @JSONField(name = "country")
    public String country;
    @JSONField(name = "district")
    public String district;
    @JSONField(name = "dns")
    public String dns;
    @JSONField(name = "dns_isp")
    public String dns_isp;
    @JSONField(name = "headers")
    public ClientInfoHeader headers;
    @JSONField(name = "ip")
    /* renamed from: ip */
    public String f5799ip;
    @JSONField(name = "isp")
    public String isp;
    @JSONField(name = "province")
    public String province;

    @Keep
    /* compiled from: BL */
    public static class ClientInfoHeader {
        @JSONField(name = "HTTP_ACCEPT")
        public String HTTP_ACCEPT;
        @JSONField(name = "HTTP_ACCEPT_ENCODING")
        public String HTTP_ACCEPT_ENCODING;
        @JSONField(name = "HTTP_ACCEPT_LANGUAGE")
        public String HTTP_ACCEPT_LANGUAGE;
        @JSONField(name = "HTTP_COOKIE")
        public String HTTP_COOKIE;
        @JSONField(name = "HTTP_DNT")
        public String HTTP_DNT;
        @JSONField(name = "HTTP_HOST")
        public String HTTP_HOST;
        @JSONField(name = "HTTP_UPGRADE_INSECURE_REQUESTS")
        public String HTTP_UPGRADE_INSECURE_REQUESTS;
        @JSONField(name = "HTTP_USER_AGENT")
        public String HTTP_USER_AGENT;
        @JSONField(name = "HTTP_X_BACKEND_BILI_REAL_IP")
        public String HTTP_X_BACKEND_BILI_REAL_IP;
        @JSONField(name = "HTTP_X_CACHE_SERVER")
        public String HTTP_X_CACHE_SERVER;
        @JSONField(name = "HTTP_X_CACHE_SERVER_ADDR")
        public String HTTP_X_CACHE_SERVER_ADDR;
    }
}
