package com.dvc.mybilibili.app.aop;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;

import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.utils.CommandActionUtils;
import com.vondear.rxtool.view.RxToast;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class LoginAspectJ {
    private static final String TAG = "LoginAspectJ";

    @Around("execution(@com.dvc.mybilibili.app.aop.NeedLogin * *..*.*(..))")
    public void needLogin(ProceedingJoinPoint joinPoint) throws Throwable {
        NeedLogin xjNeedLogin = getAnnotation(joinPoint);
        if (BiliApplication.getUser().isLogin()){
            joinPoint.proceed();
            return;
        }
        Object target = joinPoint.getTarget();
        Context context = null;
        if (target instanceof ContextAble) {
            context = ((ContextAble) target).getContext();
        } else if (target instanceof Activity) {
            context = ((Activity) target).getApplicationContext();
        } else {
            context = BiliApplication.getContext();
        }
        String tips = "";
        if(TextUtils.isEmpty(xjNeedLogin.tips()))
            tips = context.getResources().getString(xjNeedLogin.tips_id());
        else
            tips = xjNeedLogin.tips();
        switch (xjNeedLogin.type()) {
            case LoginTipsLevel.NL_REDIRECT:
                // TODO: 2018/11/29 跳转到登陆界面
                CommandActionUtils.toMainLogin(context);
                break;
            case LoginTipsLevel.NL_TOAST:
                    RxToast.normal(tips);
                break;
            case LoginTipsLevel.NL_BOTH:
                // TODO: 2018/11/29 跳转到登陆界面
                CommandActionUtils.toMainLogin(context);
                RxToast.normal(tips);
                break;
            case LoginTipsLevel.NL_NONE:
                // Do nothing
                break;
        }
    }

    private NeedLogin getAnnotation(ProceedingJoinPoint joinPoint) throws NoSuchMethodException {
        String methodName = joinPoint.getSignature().getName();
        Class<?> classTarget = joinPoint.getTarget().getClass();
        Class<?>[] par = ((MethodSignature) joinPoint.getSignature()).getParameterTypes();
        Method objMethod;
        try {
            objMethod = classTarget.getDeclaredMethod(methodName, par);
        } catch (NoSuchMethodException e) {
            objMethod = classTarget.getMethod(methodName, par);
        }
        NeedLogin xjNeedLogin = objMethod.getAnnotation(NeedLogin.class);
        return xjNeedLogin;
    }
}
