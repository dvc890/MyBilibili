package com.dvc.mybilibili.app.aop.annotation;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.aop.LoginTipsLevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NeedLogin {
    int type() default LoginTipsLevel.NL_REDIRECT;
    int tips_id() default R.string.auth_login_pls;
    String tips() default "";
}
