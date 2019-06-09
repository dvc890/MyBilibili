package com.dvc.mybilibili.mvp.ui.fragment.live;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;

import com.dvc.base.MvpBaseFragment;
import com.dvc.base.thread.ThreadManager;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.danmaku.live.LiveDanMuReceiver;
import com.dvc.mybilibili.danmaku.live.entity.BaseMsgEntity;
import com.dvc.mybilibili.danmaku.live.entity.DanMuMSGEntity;
import com.dvc.mybilibili.danmaku.live.entity.LiveEntity;
import com.dvc.mybilibili.danmaku.live.entity.NoticeMsgEntity;
import com.dvc.mybilibili.danmaku.live.entity.PreparingEntity;
import com.dvc.mybilibili.danmaku.live.entity.RoomAdminsEntity;
import com.dvc.mybilibili.danmaku.live.entity.SendGiftEntity;
import com.dvc.mybilibili.danmaku.live.entity.SysGiftEntity;
import com.dvc.mybilibili.danmaku.live.entity.WelcomeEntity;
import com.dvc.mybilibili.danmaku.live.entity.WelcomeGuardEntity;
import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveRoomHistoryMsg;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.dvc.mybilibili.mvp.presenter.fragment.LiveRoomInteractionPresenter;
import com.dvc.mybilibili.mvp.ui.adapter.LiveRoomInteractionAdapter;
import com.dvc.mybilibili.mvp.ui.fragment.live.holder.LiveRoomInteractionHolder;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LiveRoomInteractionFragment extends MvpBaseFragment<LiveRoomInteractionView, LiveRoomInteractionPresenter> implements LiveRoomInteractionView, ILiveDanMuCallback {

    @Inject
    LiveRoomInteractionPresenter liveRoomInteractionPresenter;

    @BindView(R.id.switcher)
    TextSwitcher switcher;
    @BindView(R.id.recycler)
    RecyclerView recycler;

    private LiveRoomInteractionHolder holder;
    private LiveRoomInteractionAdapter adapter;
    private long roomId = 0;
    private boolean notScrollInBottom = false;

    @NonNull
    @Override
    public LiveRoomInteractionPresenter createPresenter() {
        return liveRoomInteractionPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_fragment_live_interaction_v3;
    }

    @Override
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        this.roomId = args.getLong(Keys.KEY_ROOMID, 0);
    }

    @Override
    protected void initViews() {
        holder = new LiveRoomInteractionHolder(this);
        adapter = new LiveRoomInteractionAdapter();
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.bindToRecyclerView(recycler);
        recycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            //用来标记是否正在向最后一个滑动
            boolean isSlidingToLast = false;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
                // 当不滚动时
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    //获取最后一个完全显示的ItemPosition
                    int lastVisibleItem = manager.findLastCompletelyVisibleItemPosition();
                    int totalItemCount = manager.getItemCount();
                    // 判断是否滚动到底部，并且是向下滚动
                    if (lastVisibleItem == (totalItemCount - 1)
                            || (lastVisibleItem == (totalItemCount - 1) && isSlidingToLast))
                        notScrollInBottom = false;
                    else
                        notScrollInBottom = true;
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                //dx用来判断横向滑动方向，dy用来判断纵向滑动方向
                if (dy > 0) {
                    //大于0表示正在向下滚动
                    isSlidingToLast = true;
                } else {
                    //小于等于0表示停止或向上滚动
                    isSlidingToLast = false;
                }
            }
        });
    }

    @Override
    protected void loadDatas() {
        if (this.roomId != 0) {
            presenter.loadRoomInfo(this.roomId);
            presenter.getHistoryMsg(this.roomId);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LiveDanMuReceiver.getInstance().addCallback(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LiveDanMuReceiver.getInstance().removeCallback(this);
    }

    @Override
    public void onRoomInfo(BiliLiveRoomInfo biliLiveRoomInfo) {
        holder.convertData(biliLiveRoomInfo);
    }

    @Override
    public void onRoomInfoError(BiliApiException apiException) {

    }

    @Override
    public void onRoomHistoryMsg(List<BiliLiveRoomHistoryMsg.Msg> mRooms) {
        if (mRooms.size() == 0) return;
        List<BaseMsgEntity> danMuMSGEntityList = new ArrayList<>();
        for (BiliLiveRoomHistoryMsg.Msg msg : mRooms)
            danMuMSGEntityList.add(new DanMuMSGEntity(msg));
        adapter.setNewData(danMuMSGEntityList);
    }

    @Override
    public void onConnect() {

    }

    @Override
    public void onDisconnect() {

    }

    @Override
    public void onOnlineCountPackage(int onlineCount) {
        holder.infoOnline.setText(getContext().getString(R.string.live_info_online, onlineCount + ""));
        holder.infoOnline.setVisibility(View.VISIBLE);
    }

    @Override
    public void onDanMuMSGPackage(DanMuMSGEntity danMuMSGEntity) {
        ThreadManager.get().getMainHandler().postAtFrontOfQueue(() -> {
            try {
                adapter.addData(danMuMSGEntity);
                if (!notScrollInBottom)
                    onNewMsgClicked();
                else {
                    holder.showNewMsgTips();
                }
            } catch (Exception e) {
            }
        });
    }

    @Override
    public void onNoticeMsgPackage(NoticeMsgEntity sysMSGEntity) {

    }

    @Override
    public void onSendGiftPackage(SendGiftEntity sendGiftEntity) {

    }

    @Override
    public void onSysGiftPackage(SysGiftEntity sysGiftEntity) {

    }

    @Override
    public void onWelcomePackage(WelcomeEntity welcomeEntity) {

    }

    @Override
    public void onWelcomeGuardPackage(WelcomeGuardEntity welcomeGuardEntity) {

    }

    @Override
    public void onLivePackage(LiveEntity liveEntity) {

    }

    @Override
    public void onPreparingPackage(PreparingEntity preparingEntity) {

    }

    @Override
    public void onRoomAdminsPackage(RoomAdminsEntity roomAdminsEntity) {

    }

    @Override
    public void onConnectError(BiliApiException apiException) {

    }

    @OnClick(R.id.ll_new_msg)
    public void onNewMsgClicked() {
        recycler.scrollToPosition(adapter.getData().size() - 1);
        holder.hideNewMsgTips();
        notScrollInBottom = false;
    }
}
