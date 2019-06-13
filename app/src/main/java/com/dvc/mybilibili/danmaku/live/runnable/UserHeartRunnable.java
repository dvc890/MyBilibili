package com.dvc.mybilibili.danmaku.live.runnable;

public class UserHeartRunnable implements Runnable {

    long roomId;

    public UserHeartRunnable(long roomId) {
        this.roomId = roomId;
    }

    @Override
    public void run() {
        while (true) {
            try {
//                BiliApplication.getDataManager().getApiHelper().getUserOnlineHeart(roomId)
//                        .subscribeOn(Schedulers.single())
//                        .observeOn(Schedulers.single())
//                        .subscribe(new ObserverCallback<BiliLiveActivityReceiveInfo>() {
//                            @Override
//                            public void onSuccess(BiliLiveActivityReceiveInfo biliLiveActivityReceiveInfo) throws IOException {
//
//                            }
//
//                            @Override
//                            public void onError(BiliApiException apiException, int code) {
//
//                            }
//                        });
                Thread.sleep(300000);
            } catch (Exception e) {
                break;
            }
        }
    }
}
