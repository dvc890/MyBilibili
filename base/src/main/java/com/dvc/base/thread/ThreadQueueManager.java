package com.dvc.base.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by dvc on 2018/4/13.
 */

public class ThreadQueueManager {
    private static ThreadQueueManager threadQueueManager = null;
    private Map<String,QueueThread> ThreadMap;
    private Map<String,BlockingQueue<Object>> QueueMap;

    private ThreadQueueManager(){
        ThreadMap = new HashMap<>();
        QueueMap = new HashMap<>();
    }

    public static ThreadQueueManager get(){
        if(threadQueueManager == null) {
            synchronized (ThreadQueueManager.class) {
                threadQueueManager = new ThreadQueueManager();
            }
        }
        return threadQueueManager;
    }

    public boolean isHas(String name){
        return ThreadMap.containsKey(name);
    }

    /**
     *
     * @param name
     * @param runnable 该运行代码会自动无限循环，所以无需手动在代码里面添加循环
     * @return
     */
    public boolean createThreadQueue(String name, Runnable runnable, BlockingQueue<Object> queue){
        if(runnable == null || queue == null) return false;
        if(isHas(name)){
            ThreadMap.get(name).quit();
            ThreadMap.remove(name);
            QueueMap.remove(name);
        }
        QueueThread thread = new QueueThread(runnable);
//        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        ThreadMap.put(name, thread);
        QueueMap.put(name, queue);
        return true;
    }
    public boolean createThreadQueue(String name, PQueueRunnable runnable){
        if(runnable == null) return false;
        if(isHas(name)){
            ThreadMap.get(name).quit();
            ThreadMap.remove(name);
            QueueMap.remove(name);
        }
        QueueThread thread = new QueueThread(runnable);
//        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        ThreadMap.put(name, thread);
        QueueMap.put(name, runnable.queue);
        return true;
    }

    public BlockingQueue<Object> getQueue(String name){
        if(isHas(name)) return  QueueMap.get(name);
        return null;
    }

    public void quit(String name){
        if(isHas(name)){
            ThreadMap.get(name).quit();
            ThreadMap.remove(name);
            QueueMap.remove(name);
        }
    }


    private class QueueThread extends Thread {

        private final Runnable target;
        private boolean state = true;
        public QueueThread(Runnable runnable){
            super();
            target = runnable;
        }
        @Override
        public void run() {
            if(target != null)
                while (state){
                    target.run();
                }
        }
        public void quit(){
            state = false;
        }
    }
}
