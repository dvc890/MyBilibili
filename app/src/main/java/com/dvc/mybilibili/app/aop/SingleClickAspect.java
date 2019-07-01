package com.dvc.mybilibili.app.aop;

import android.view.View;

import com.vondear.rxtool.RxLogTool;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Calendar;

import butterknife.OnClick;

@Aspect
public class SingleClickAspect {
    public static final String TAG="SingleClickAspect";
    public static final int MIN_CLICK_DELAY_TIME = 500;

    @OnClick
    @Pointcut("execution(@com.dvc.mybilibili.app.aop.annotation.SingleClick * *(..))")//方法切入点
    public void methodAnnotated(){

    }

    @Around("methodAnnotated()")//在连接点进行方法替换
    public void aroundJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable{
        View view=null;
        for (Object arg: joinPoint.getArgs()) {
            if (arg instanceof View) view= ((View) arg);
        }
        if (view!=null){
            Object tag=view.getTag(TAG.hashCode());
            long lastClickTime= (tag!=null)? (long) tag :0;
            RxLogTool.d(TAG, "lastClickTime:" + lastClickTime);
            long currentTime = Calendar.getInstance().getTimeInMillis();
            if (currentTime - lastClickTime > MIN_CLICK_DELAY_TIME) {//过滤掉600毫秒内的连续点击
                view.setTag(TAG.hashCode(), currentTime);
                RxLogTool.d(TAG, "currentTime:" + currentTime);
                joinPoint.proceed();//执行原方法
            }
        }
    }
}
