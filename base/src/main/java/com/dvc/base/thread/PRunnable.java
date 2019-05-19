package com.dvc.base.thread;

import java.util.concurrent.BlockingQueue;

/**
 * Created by dvc on 2018/4/13.
 */

public abstract class PRunnable implements Runnable {
    public Object[] objectarray;
    public BlockingQueue<Object> queue;
    public PRunnable(Object... objects){
        objectarray = objects;
    }
}
