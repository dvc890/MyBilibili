package com.dvc.base.thread;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dvc on 2018/4/12.
 */

public final class ThreadManager {
    private static ThreadManager threadManager = null;
    private Map<String,WeakReference<HandlerThread>> ThreadMap;
    private Map<String,Handler> HandlerMap;
    private Handler MainHandler;

    private ThreadManager(){
        ThreadMap = new HashMap<>();
        HandlerMap = new HashMap<>();
    }

    public static ThreadManager get(){
        if(threadManager == null) {
            synchronized (ThreadManager.class) {
                threadManager = new ThreadManager();
            }
        }
        return threadManager;
    }

    public boolean isHas(String name){
        return ThreadMap.containsKey(name);
    }


    public Handler getMainHandler() {
        if(MainHandler == null) {
            synchronized(ThreadManager.class) {
                if(MainHandler == null) {
                    MainHandler = new Handler(Looper.getMainLooper());
                }
            }
        }

        return MainHandler;
    }

    public Handler getHandler(Object o) {
        return getHandler(o.getClass().getSimpleName());
    }

    public Handler getHandler(String name){
        if(!isHas(name)) {
            HandlerThread handlerThread = new HandlerThread(name, Thread.MAX_PRIORITY);
            handlerThread.start();
            WeakReference<HandlerThread> weakReference = new WeakReference<HandlerThread>(handlerThread);
            Handler handler = new Handler(handlerThread.getLooper());
            ThreadMap.put(name, weakReference);
            HandlerMap.put(name, handler);
        }
        return HandlerMap.get(name);
    }

    public void remove(String name){
        if(isHas(name)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                ThreadMap.get(name).get().quitSafely();
            }else
                ThreadMap.get(name).get().quit();
            ThreadMap.remove(name);
            HandlerMap.remove(name);
        }
    }

    public static void executeThread(String name, Runnable runnable) {
        get().getHandler(name).post(runnable);
    }
}
