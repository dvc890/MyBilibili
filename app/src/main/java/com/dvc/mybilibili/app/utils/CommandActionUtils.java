package com.dvc.mybilibili.app.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.ui.activity.AccountVerifyWebActivity;
import com.dvc.mybilibili.mvp.ui.activity.BaseWebViewActivity;
import com.dvc.mybilibili.mvp.ui.activity.HomeActivity;
import com.dvc.mybilibili.mvp.ui.activity.LiveRoomActivity;
import com.dvc.mybilibili.mvp.ui.activity.LoginActivity;
import com.dvc.mybilibili.mvp.ui.activity.VideoDetailsActivity;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CommandActionUtils {

    private static Map<String, Class> moduleCommandMap;
    private static Map<String, Class> moduleWebCommandMap;

    static {
        moduleCommandMap = new HashMap<>();
//        moduleCommandMap.put("feedback/user-feedback/" ,UserFeedbackWebActivity.class);
//        moduleCommandMap.put("main/authorspace/", AuthorSpaceProxyActivity.class);
//        moduleCommandMap.put("main/download-list", VideoDownloadListActivity.class);
//        moduleCommandMap.put("main/go-to-answer", AnswerActivity.class);
        moduleCommandMap.put("main/login", LoginActivity.class);
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
//        moduleCommandMap.put("space/:mid/", AuthorSpaceProxyActivity.class);
        moduleCommandMap.put("user_center", HomeActivity.class);
        moduleCommandMap.put("video", VideoDetailsActivity.class);
        moduleCommandMap.put("live", LiveRoomActivity.class);

        moduleWebCommandMap = new HashMap<>();
        moduleWebCommandMap.put("live.bilibili.com", LiveRoomActivity.class);
//        moduleWebCommandMap.put("live.bilibili.com/app/area", LiveAreaActivity.class);
//        moduleWebCommandMap.put("live.bilibili.com/app/mytag/", LiveMyTagActivity.class);
//        moduleWebCommandMap.put("live.bilibili.com/p/html/live-app-rank/index.html", LiveRankActivity.class);
//        moduleWebCommandMap.put("www.bilibili.com/read/:cv", *.class);
//        moduleWebCommandMap.put("www.bilibili.com/bangumi/play/:ep", *.class);
    }
    /**
     *
     * @param context
     * @param command Ep: bilibili://main/login/verify
     */
    public static void start(Context context, String command) {
        if(TextUtils.isEmpty(command)) return;
        BiliBiliUrl url = createBiliUrl(command);
        Intent intent = new Intent();
        Class targetClass = null;
        if(isSupportActionUrl(url.url())) {
            if(isInteger(url.getLastPathSegment())) {
                targetClass = moduleWebCommandMap.get(url.host());
            } else {
                targetClass = moduleWebCommandMap.get(url.main());
            }
        }else {
            if (isMain(url)) {
                targetClass = moduleCommandMap.get(url.main());
            } else {
                targetClass = moduleCommandMap.get(url.host());
            }
        }
        if(targetClass != null) {
            intent.setClass(context, targetClass);
            if (url.getBundle() != null)
                intent.putExtras(url.getBundle());
            if (isVideoAction(url))
                intent.putExtra(Keys.KEY_AVID, Integer.valueOf(url.getLastPathSegment()));
            if (isHome(url))
                putExtra2HomeIntent(url, intent);
            if(isLive(url))
                intent.putExtra(Keys.KEY_ROOMID, Long.valueOf(url.getLastPathSegment()));
            intent.setData(url.toUri());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }

    private static void putExtra2HomeIntent(BiliBiliUrl url, Intent intent) {
        switch (url.getLastPathSegment()) {
            case "shownavi":
                intent.putExtra(Keys.KEY_MAIN_SHOW_NAVI, true);
                break;
            case "refreshnavi":
                intent.putExtra(Keys.KEY_MAIN_REFRESH_NAVI, true);
                break;
        }
    }

    public static boolean isHome(BiliBiliUrl url) {
        return ("home".contains(url.host()));
    }

    public static boolean isMain(BiliBiliUrl url) {
        return ("main".contains(url.host()));
    }

    public static boolean isLive(BiliBiliUrl url) {
        return url.host().contains("live");
    }

    public static boolean isVideoAction(BiliBiliUrl url) {
        return ("video".contains(url.host()) || "bangumi".contains(url.host()));
    }

    public static void toMainLogin(Context context) {
        start(context, createBiliUrl("main/login", null).url());
    }

    public static void toWeb(Context context, String title, String url) {
        if(CommandActionUtils.isSupportActionUrl(url)) {
            Map<String, String> map = new HashMap<>();
            map.put(Keys.KEY_TITLE, title);
            CommandActionUtils.start(context, CommandActionUtils.createBiliUrl(url, map).url());
            return;
        }
        BaseWebViewActivity.start(context, title, url);
    }

    public static boolean isSupportActionUrl(String netUrl) {
        BiliBiliUrl url = new BiliBiliUrl(netUrl);
        if(moduleWebCommandMap.containsKey(url.host())) return true;
        if(moduleWebCommandMap.containsKey(url.main())) return true;
        return false;
    }

    private static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    public static BiliBiliUrl createBiliUrl(String url) {
        return new BiliBiliUrl(url);
    }
    public static BiliBiliUrl createBiliUrl(String main, Map<String,String> queryParameter) {
        String url = main.contains("://")?main:"bilibili://"+main;
        if(queryParameter != null) {
            url +="?";
            for (Map.Entry<String, String> entry : queryParameter.entrySet()) {
                url += entry.getKey() + "=" + entry.getValue()+"&";
            }
            url = url.substring(0,url.length()-1);
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
            this.main = url.contains("?")? url.substring(url.indexOf(this.host)/*+this.host.length()*/+1, url.indexOf("?")): url.split("://")[1]/*.split("/")[1]*/;
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
