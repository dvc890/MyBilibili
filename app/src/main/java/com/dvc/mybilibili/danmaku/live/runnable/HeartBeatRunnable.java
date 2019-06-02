package com.dvc.mybilibili.danmaku.live.runnable;

import com.dvc.mybilibili.danmaku.live.PackageRepository;

import java.io.OutputStream;

/**
 * Created by czp on 17-5-24.
 */
public class HeartBeatRunnable implements Runnable {
    private OutputStream outputStream;

    public HeartBeatRunnable(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        while (true) {
            try {
                outputStream.write(PackageRepository.getHeartBeatPackageBytes());
                outputStream.flush();
                Thread.sleep(30000);
            } catch (Exception e) {
                break;
            }
        }
    }
}
