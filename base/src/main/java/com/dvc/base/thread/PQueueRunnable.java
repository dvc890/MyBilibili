package com.dvc.base.thread;

import java.util.concurrent.BlockingQueue;

/**
 * Created by dvc on 2018/4/13.
 */

public abstract class PQueueRunnable  implements Runnable {

    public Object[] objectarray;
    public BlockingQueue<Object> queue;
    private PQueueRunnable(){}
    public PQueueRunnable(BlockingQueue<Object> mQueue, Object... objects){
        queue = mQueue;
        objectarray = objects;
    }
}