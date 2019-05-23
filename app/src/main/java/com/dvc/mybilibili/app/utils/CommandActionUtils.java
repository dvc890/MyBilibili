package com.dvc.mybilibili.app.utils;

import android.content.Context;
import android.os.Bundle;

import com.dvc.mybilibili.mvp.ui.activity.AccountVerifyWebActivity;
import com.dvc.mybilibili.mvp.ui.activity.HomeActivity;

import java.util.HashMap;
import java.util.Map;

public class CommandActionUtils {

    private static Map<String, Class> moduleCommandMap;

    static {
        moduleCommandMap = new HashMap<>();
//        moduleCommandMap.put("feedback/user-feedback/" ,UserFeedbackWebActivity.class);
//        moduleCommandMap.put("main/authorspace/", AuthorSpaceProxyActivity.class);
//        moduleCommandMap.put("main/download-list", VideoDownloadListActivity.class);
//        moduleCommandMap.put("main/go-to-answer", AnswerActivity.class);
        moduleCommandMap.put("main/login/verify", AccountVerifyWebActivity.class);
//        moduleCommandMap.put("main/login-dialog/", PlayerLoginActivity.class);
//        moduleCommandMap.put("main/register/fast", RegisterFastWebActivity.class);
//        moduleCommandMap.put("main/searchable-single/", SearchableSingleFragmentActivity.class);
//        moduleCommandMap.put("main/vip-web/", VipWebActivity.class);
//        moduleCommandMap.put("main/web", MWebActivity.class);
//        moduleCommandMap.put("main/web/ap", MWebAPActivity.class);
//        moduleCommandMap.put("playset/watch-later", WatchLaterActivity.class);

//        moduleCommandMap.put("author/:mid/", AuthorSpaceProxyActivity.class);
//        moduleCommandMap.put("browser", MWebActivity.class;
//        moduleCommandMap.put("feedback/user-feedback/", C26603e.class);
        moduleCommandMap.put("home", HomeActivity.class);
//        moduleCommandMap.put("main/danmaku-block", DanmakuBlockActivity.class);
//        moduleCommandMap.put("main/favorite", FavoriteBoxActivity.class);
//        moduleCommandMap.put("main/favorite/topic", C26470a.class);
        moduleCommandMap.put("root", HomeActivity.class);
//        moduleCommandMap.put("space/:mid/", AuthorSpaceProxyActivity.class);
        moduleCommandMap.put("user_center", HomeActivity.class);
//        moduleCommandMap.put("video/:avid/", VideoDetailsActivity.class);
    }
    /**
     *
     * @param context
     * @param command Em: bilibili://main/login/verify
     */
    public static void start(Context context, String command) {

    }

    public static BiliBiliUrl createBiliUrl(String url) {
        return new BiliBiliUrl(url);
    }
    public static BiliBiliUrl createBiliUrl(String main, Map<String,String> queryParameter) {
        String url = "bilibili://"+main;
        for(Map.Entry<String, String> entry : queryParameter.entrySet()){
            url += entry.getKey() +"&"+ entry.getValue();
        }
        return new BiliBiliUrl(url);
    }

    public static class BiliBiliUrl {

        private String scheme = "bilibili";
        private String host;
        private String main;
        private String query;
        private Bundle bundle;
        private Map<String,String> queryParameter;

        private BiliBiliUrl(String url) {
            this.scheme = url.substring(0, url.indexOf("://"));
            this.host = url.split("://")[1].split("/")[0];
            this.main = url.contains("?")? url.substring(url.indexOf(this.host)+this.host.length()+1, url.indexOf("?")): url.split("://")[1].split("/")[1];
            this.query = url.contains("?")? url.substring(url.indexOf("?")+1) : "";
            this.bundle = new Bundle();
            this.queryParameter = new HashMap<>();
            if(query.length() > 0) {
                if(this.query.contains("&")) {
                    for(String q : this.query.split("&"))
                        queryParameter.put(q.split("=")[0], q.split("=")[1]);
                }else {
                    queryParameter.put(query.split("=")[0], query.split("=")[1]);
                }
                for(Map.Entry<String, String> entry : queryParameter.entrySet())
                    bundle.putString(entry.getKey(), entry.getValue());
            }
        }

        public String scheme() {
            return scheme;
        }

        public String host() {
            return host;
        }

        public String main() {
            return main;
        }

        public String query() {
            return query;
        }

        public Map<String, String> queryParameters() {
            return queryParameter;
        }

        public Bundle getBundle() {
            return bundle;
        }

        public String url() {
            return scheme+"://"+main+query;
        }
    }
}
