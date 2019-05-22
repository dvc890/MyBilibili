package com.dvc.mybilibili.mvp.model.account;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bilibili.nativelibrary.LibBili;
import com.bilibili.nativelibrary.SignedQuery;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.di.AccountPreferenceFileName;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.CookieInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.model.api.service.passport.entity.AccessToken;
import com.vondear.rxtool.RxLogTool;

import java.security.InvalidKeyException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AccountHelper implements IAccountHelper {
    public static final String KEY_ACCOUNT_TOKEN_CONTENT_STR = "account_content_token_str";
    public static final String KEY_ACCOUNT_INFO_CONTENT_STR = "account_content_info_str";
    public static final String KEY_ACCOUNT_COOKIE_CONTENT_STR = "account_content_cookie_str";
    private static final SimpleDateFormat BIRTHDAY_FORMAT = new SimpleDateFormat(
            "MMdd", Locale.getDefault());
    private final SharedPreferences appPreferences;
    private final SharedPreferences.Editor appEditor;
    private final Context context;
    private final ParserConfig parserConfig;
    private AccessToken token = null;
    private AccountInfo accountInfo = null;
    private CookieInfo cookieInfo = null;

    @Inject
    public AccountHelper(@ApplicationContext Context context, @AccountPreferenceFileName String accountname) {
        this.context = context;
        this.appPreferences = context.getSharedPreferences(accountname, Context.MODE_PRIVATE);
        this.appEditor = this.appPreferences.edit();
        this.parserConfig = new ParserConfig();
        this.token = getToken();
        this.accountInfo = getAccountInfo();
    }

    @Override
    public boolean isLogin() {
        return this.token != null;
    }

    @Override
    public void loadToLoginInfo(LoginInfo loginInfo) {
        this.token = loginInfo.token_info;
        this.cookieInfo = loginInfo.cookie_info;
        loadAccountInfo();
    }

    @Override
    public void setToken(AccessToken accessToken) {
        this.token = accessToken;
        loadAccountInfo();
    }

    @Override
    public AccessToken getToken() {
        if(this.token == null) {
            this.token = toClass(AccessToken.class, this.appPreferences.getString(KEY_ACCOUNT_TOKEN_CONTENT_STR, null));
        }
        return this.token;
    }

    @Override
    public AccountInfo getAccountInfo() {
        if(this.accountInfo == null) {
            this.accountInfo = toClass(AccountInfo.class, this.appPreferences.getString(KEY_ACCOUNT_INFO_CONTENT_STR, null));
        }
        return accountInfo;
    }

    @Override
    public CookieInfo getCookieInfo() {
        if(this.cookieInfo == null) {
            this.cookieInfo = toClass(CookieInfo.class, this.appPreferences.getString(KEY_ACCOUNT_COOKIE_CONTENT_STR, null));
        }
        return cookieInfo;
    }

    @Override
    public String getBrithday() {
        if(getAccountInfo() == null) return "";
        return BIRTHDAY_FORMAT.format(getAccountInfo().getBirthday());
    }

    @Override
    public void save() {
        if(this.token != null) ;
            this.appEditor.putString(KEY_ACCOUNT_TOKEN_CONTENT_STR, formatClass(this.token));
        if(this.accountInfo != null) ;
            this.appEditor.putString(KEY_ACCOUNT_INFO_CONTENT_STR, formatClass(this.accountInfo));
        if(this.cookieInfo != null) ;
        this.appEditor.putString(KEY_ACCOUNT_COOKIE_CONTENT_STR, formatClass(this.cookieInfo));
    }

    private void loadAccountInfo() {
        if(this.token == null || (this.token == null && this.token.isExpires())) {
            this.accountInfo = null;
            return;
        }
        BiliApplication.getDataManager().getApiHelper().getAccountInfo(this.token.access_token)
                .compose(RxSchedulersHelper.AllioThread())
                .subscribe(accountInfo1 -> {
                    this.accountInfo = accountInfo1;
                    save();
                });
    }

    private <T> T toClass(Class<T> mClass, String str) {
        if (str != null) {
            try {
                byte[] b = LibBili.b(LibBili.getAndroidAppKey(), Base64.decode(str, 2));
                if (b != null) {
                    return formatType(new String(b, SignedQuery.HttpUtils.ENCODING_UTF_8), mClass, true);
                }
            } catch (Exception e) {
                RxLogTool.e("PassportStorage", "error occurred on decrypt token", e);
            }
        }
        return null;
    }

    private <T> String formatClass(T access) {
        if (access != null) {
            SerializeConfig globalInstance = SerializeConfig.getGlobalInstance();
            globalInstance.registerIfNotExists(access.getClass(), 1, true, false, true, false);
            try {
                return Base64.encodeToString(LibBili.a(LibBili.getAndroidAppKey(), JSON.toJSONBytes(access, globalInstance, new SerializerFeature[0])), 2);
            } catch (InvalidKeyException unused) {
            }
        }
        return null;
    }

    private final <T> T formatType(String str, Class<T> cls, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            parserConfig.registerIfNotExists(cls, 13, true, false, true, true);
        }
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, z ? parserConfig : ParserConfig.global);
        Object parseObject = defaultJSONParser.parseObject((Class) cls);
        defaultJSONParser.handleResovleTask(parseObject);
        defaultJSONParser.close();
        return (T) parseObject;
    }

}
