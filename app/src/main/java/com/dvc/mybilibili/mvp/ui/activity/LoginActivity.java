package com.dvc.mybilibili.mvp.ui.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.presenter.activity.LoginPresenter;
import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.vondear.rxtool.view.RxToast;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends MvpBaseActivity<LoginView, LoginPresenter> implements LoginView {

    @Inject
    LoginPresenter loginPresenter;

    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.iv_icon_left)
    ImageView mIvIconLeft;
    @BindView(R.id.iv_icon_center)
    ImageView mIvIconCenter;
    @BindView(R.id.iv_icon_right)
    ImageView mIvIconRight;
    @BindView(R.id.rl_logo)
    RelativeLayout mRlLogo;
    @BindView(R.id.et_username)
    EditText mEtUsername;
    @BindView(R.id.delete_username)
    ImageButton mDeleteUsername;
    @BindView(R.id.et_password)
    EditText mEtPassword;
    @BindView(R.id.btn_register)
    Button mBtnRegister;
    @BindView(R.id.btn_login)
    Button mBtnLogin;

    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return loginPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_activity_login;
    }

    @Override
    protected void initViews() {
        mTitle.setText(R.string.br_login);
        //名称监听
        RxView.focusChanges(mEtUsername)
                .compose(presenter.getProvider().bindToLifecycle())
                .subscribe(aBoolean -> {
                    if (aBoolean) {
                        if (mEtUsername.getText().length() > 0) {
                            visible(mDeleteUsername);
                        } else {
                            gone(mDeleteUsername);
                        }
                    } else {
                        gone(mDeleteUsername);
                    }
                    mIvIconLeft.setImageResource(R.drawable.ic_22);
                    mIvIconRight.setImageResource(R.drawable.ic_33);
                });
        //密码监听
        RxView.focusChanges(mEtPassword)
                .compose(presenter.getProvider().bindToLifecycle())
                .subscribe(aBoolean -> {
                    if (aBoolean) {
                        mIvIconLeft.setImageResource(R.drawable.ic_22_hide);
                        mIvIconRight.setImageResource(R.drawable.ic_33_hide);
                    }
                });
        //监听名称变化
        RxTextView.textChangeEvents(mEtUsername)
                .compose(presenter.getProvider().bindToLifecycle())
                .subscribe(textViewTextChangeEvent -> {
                    if (textViewTextChangeEvent.start() > 0) {
                        visible(mDeleteUsername);
                    } else {
                        gone(mDeleteUsername);
                        mEtPassword.setText("");
                    }
                    loginBtnEnable(textViewTextChangeEvent.start() > 0);
                });
        //点击注册监听
        RxView.clicks(mBtnRegister)
                .throttleFirst(5, TimeUnit.SECONDS)//5秒内取第一个事件 防止重复点击发送事件
                .compose(presenter.getProvider().bindToLifecycle())
                .subscribe(o -> {
                    boolean isAvailable = BiliApplication.getNetWorkStatusManager().isConnected();
                    if (!isAvailable) {
                        RxToast.error(getString(R.string.column_page_loading_no_network));
                    } else {
                        //注册
                        register();
                    }
                });
        //点击登录监听
        RxView.clicks(mBtnLogin)
                .throttleFirst(5, TimeUnit.SECONDS)//5秒内取第一个事件 防止重复点击发送事件
                .compose(presenter.getProvider().bindToLifecycle())
                .subscribe(o -> {
                    boolean isAvailable = BiliApplication.getNetWorkStatusManager().isConnected();
                    if (!isAvailable) {
                        RxToast.error("当前网络不可用");
                    } else {
                        //登录
                        login();
                    }
                });
        //点击删除监听
        RxView.clicks(mDeleteUsername)
                .throttleFirst(5, TimeUnit.SECONDS)//5秒内取第一个事件 防止重复
                .compose(presenter.getProvider().bindToLifecycle())
                .subscribe(o -> {
                    // 清空用户名以及密码
                    mEtUsername.setText("");
                    mEtPassword.setText("");
                    mDeleteUsername.setVisibility(View.GONE);
                    mEtUsername.setFocusable(true);
                    mEtUsername.setFocusableInTouchMode(true);
                    mEtUsername.requestFocus();
                });
    }

    @Override
    protected void loadDatas() {
    }

    @Override
    public void loginFailed(BiliApiException apiException) {
        switch (apiException.mCode) {
            case BiliApiException.E_CAPTCHA_IS_NOT_MATCH: {
                startActivityForResult(new Intent(this, AccountVerifyWebActivity.class), apiException.mCode);
                break;
            }
            default:
                RxToast.error(apiException.getMessage());
                break;
        }

    }

    @Override
    public void loginCompleted(LoginInfo loginInfo) {
        RxToast.info(getString(R.string.login_success));
        EventBus.getDefault().postSticky(loginInfo);
        finish();
    }

    @OnClick(R.id.btn_back)
    public void onBackClick() {
        finish();
    }

    private void loginBtnEnable(boolean isEnable) {
        if(mBtnLogin.isEnabled() == isEnable) return;
        mBtnLogin.setEnabled(isEnable);
    }

    private void login() {
        String name = mEtUsername.getText().toString().trim();
        String password = mEtPassword.getText().toString().trim();
        presenter.login(name, password);
    }

    private void register() {
    }
}
