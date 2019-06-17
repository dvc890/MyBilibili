package com.dvc.mybilibili.mvp.presenter.jsinterfaces;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.ui.activity.web.IAccountVerify;
import com.just.agentweb.AgentWeb;
import com.vondear.rxtool.view.RxToast;

import javax.inject.Inject;

public class AccountVerifyJS extends AndroidInterfaceWeb<IAccountVerify>{

    @Inject
    DataManager dataManager;

    public AccountVerifyJS(AgentWeb agent, IAccountVerify mvpView) {
        super(agent, mvpView);
    }

    @JavascriptInterface
    public void validateLogin(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                String callbackId = parseObject.getString("callbackId");
                if (parseObject.containsKey("ticket")) {
                    verifyResult(parseObject.getString("ticket"), parseObject.getString("target_url"), callbackId);
                } else if (!TextUtils.isEmpty(callbackId)) {
                    int code = -2;
                    String message = "No access_token text";
                    parseObject = new JSONObject();
                    parseObject.put("code", code);
                    parseObject.put("message", message);
                    ifViewAttached(view -> view.loginFailed(new BiliApiException(code,message)));
                }
            } catch (Exception unused) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid args: biliapp.validateLogin(");
                stringBuilder.append(str);
                stringBuilder.append(")");
                RxToast.error(stringBuilder.toString());
            }
        }
    }

    private void verifyResult(String ticket, String target_url, String callbackId) {
        this.dataManager.getApiHelper().acquireAccessToken(ticket)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .subscribe(new ObserverCallback<LoginInfo>() {
                    @Override
                    public void onSuccess(LoginInfo loginInfo) {
                        dataManager.getUser().loadToLoginInfo(loginInfo);
                        ifViewAttached(view -> view.loginCompleted(loginInfo, target_url, callbackId));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        ifViewAttached(view -> view.loginFailed(apiException));
                    }
                });
    }
}
