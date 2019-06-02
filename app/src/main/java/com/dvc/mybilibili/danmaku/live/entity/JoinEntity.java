package com.dvc.mybilibili.danmaku.live.entity;

import com.dvc.mybilibili.app.application.BiliApplication;

import java.util.Random;

/**
 * Created by czp on 17-5-24.
 */
public class JoinEntity {
    public long roomid;
    public long uid;

    public JoinEntity(long roomid) {
        this.roomid = roomid;
        if(BiliApplication.getUser().isLogin()) {
            uid = BiliApplication.getUser().getAccountInfo().getMid();
        }else
            uid = (long) (1e14 + 2e14 * new Random().nextDouble());
    }
}
