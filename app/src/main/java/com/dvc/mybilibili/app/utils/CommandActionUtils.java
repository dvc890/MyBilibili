package com.dvc.mybilibili.app.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.ui.activity.AccountVerifyWebActivity;
import com.dvc.mybilibili.mvp.ui.activity.HomeActivity;
import com.dvc.mybilibili.mvp.ui.activity.VideoDetailsActivity;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
        moduleCommandMap.put("video", VideoDetailsActivity.class);
    }
    /**
     *
     * @param context
     * @param command Em: bilibili://main/login/verify
     */
    public static void start(Context context, String command) {
        BiliBiliUrl url = createBiliUrl(command);
        if(moduleCommandMap.containsKey(url.host())) {
            Intent intent = new Intent(context, moduleCommandMap.get(url.host()));
            if(url.getBundle() != null)
            intent.putExtras(url.getBundle());
            if(isVideoAction(url))
                intent.putExtra(Keys.KEY_AVID, Integer.valueOf(url.getLastPathSegment()));
            intent.setData(url.toUri());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }

    public static boolean isVideoAction(BiliBiliUrl url) {
        return ("video".contains(url.host()) || "bangumi".contains(url.host()));
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

        private final Uri uri;
        private String scheme = "bilibili";
        private String host;
        private String main;
        private String query;
        private Bundle bundle;
        private Map<String,String> queryParameter;


        private BiliBiliUrl(String url) {
            this.uri = Uri.parse(url);
            this.scheme = url.substring(0, url.indexOf("://"));
            this.host = url.split("://")[1].split("/")[0];
            this.main = url.contains("?")? url.substring(url.indexOf(this.host)+this.host.length()+1, url.indexOf("?")): url.split("://")[1].split("/")[1];
            this.query = url.contains("?")? url.substring(url.indexOf("?")+1) : "";
            this.bundle = new Bundle();
            this.queryParameter = new HashMap<>();
            if(query.length() > 0) {
                if(this.query.contains("&")) {
                    for(String q : this.query.split("&"))
                        queryParameter.put(q.split("=")[0], URLDecoder.decode(q.split("=")[1]).replace("\\u0026", "&"));
                }else {
                    queryParameter.put(query.split("=")[0], URLDecoder.decode(query.split("=")[1]).replace("\\u0026", "&"));
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

        public List<String> getPathSegments() {
            return new ArrayList<>(Arrays.asList(main.split("/")));
        }

        public String getLastPathSegment() {
            return getPathSegments().get(getPathSegments().size()-1);
        }

        public Map<String, String> queryParameters() {
            return queryParameter;
        }

        public Bundle getBundle() {
            return bundle;
        }

        public String url() {
            return uri.toString();//scheme+"://"+main+query;
        }

        public Uri toUri() {
            return uri;
        }
    }
}
