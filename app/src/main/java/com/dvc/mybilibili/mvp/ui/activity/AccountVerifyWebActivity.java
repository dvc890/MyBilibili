package com.dvc.mybilibili.mvp.ui.activity;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.presenter.jsinterfaces.AccountVerifyJS;
import com.just.agentweb.AgentWeb;
import com.vondear.rxtool.view.RxToast;

public class AccountVerifyWebActivity extends BaseWebViewActivity implements IAccountVerify{

    @Override
    public void AddJsInterface(AgentWeb webView) {
        //webView.getJsInterfaceHolder().addJavaObject("_biliapp", new AccountVerifyJS(webView, this));
        webView.getJsInterfaceHolder().addJavaObject("biliapp", new AccountVerifyJS(webView, this));
    }

    @Override
    public void loginFailed(BiliApiException exception) {
        RxToast.error(exception.getMessage());
    }

    @Override
    public void loginCompleted(LoginInfo loginInfo, String target_url, String callbackId) {
        setResult(BiliApiException.S_OK);
        finish();
    }
}
