package com.dvc.mybilibili.player.danmaku;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.dvc.base.BaseMvpHolder;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.player.BiliVideoPlayer;
import com.dvc.mybilibili.player.utils.FontUtils;
import com.shuyu.gsyvideoplayer.utils.Debuger;

import java.io.InputStream;
import java.util.HashMap;

import butterknife.BindView;
import master.flame.danmaku.controller.IDanmakuView;
import master.flame.danmaku.danmaku.loader.ILoader;
import master.flame.danmaku.danmaku.loader.IllegalDataException;
import master.flame.danmaku.danmaku.loader.android.DanmakuLoaderFactory;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.model.android.SpannedCacheStuffer;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.parser.IDataSource;

public class DanMaKuHolder extends BaseMvpHolder {

    @Nullable
    @BindView(R.id.danmaku_view)
    IDanmakuView mDanmakuView;//弹幕view
    @Nullable
    @BindView(R.id.toogle_danmaku)
    ImageView mToogleDanmaku;
    private DanmakuContext mDanmakuContext;
    private BaseDanmakuParser mParser;

    private long mDanmakuStartSeekPosition = -1;

    private boolean mDanmaKuShow = true;
    private int aid;
    private long cid;
    private BiliVideoPlayer player;

    public DanMaKuHolder(BiliVideoPlayer view) {
        super(view);
        this.player = view;
//        if(mSendDanmaku != null) mSendDanmaku.setOnClickListener(this.player);
        if(mToogleDanmaku != null) mToogleDanmaku.setOnClickListener(v->resolveDanmakuShow());
    }

    public void initDanmaku(int aid, long cid) {
        this.aid = aid;
        this.cid = cid;
        // 设置最大显示行数
        HashMap<Integer, Integer> maxLinesPair = new HashMap<Integer, Integer>();
        maxLinesPair.put(BaseDanmaku.TYPE_SCROLL_RL, 10); // 滚动弹幕最大显示5行
        // 设置是否禁止重叠
        HashMap<Integer, Boolean> overlappingEnablePair = new HashMap<Integer, Boolean>();
        overlappingEnablePair.put(BaseDanmaku.TYPE_SCROLL_RL, true);
        overlappingEnablePair.put(BaseDanmaku.TYPE_FIX_TOP, true);
        overlappingEnablePair.put(BaseDanmaku.TYPE_FIX_BOTTOM, true);
        overlappingEnablePair.put(BaseDanmaku.TYPE_MOVEABLE_XXX, true);
        overlappingEnablePair.put(BaseDanmaku.TYPE_SPECIAL, true);

        DanamakuAdapter danamakuAdapter = new DanamakuAdapter(mDanmakuView);
        mDanmakuContext = DanmakuContext.create();
        mDanmakuContext.setDanmakuStyle(IDisplayer.DANMAKU_STYLE_STROKEN, 3)//描边
                .setDuplicateMergingEnabled(false)//重复不合并
                .setScrollSpeedFactor(2.5f)//弹幕滚动速度
//                .setScaleTextSize(1.2f)
                .setCacheStuffer(new SpannedCacheStuffer(), danamakuAdapter) // 图文混排使用SpannedCacheStuffer
                .setMaximumLines(maxLinesPair)
                .setMaximumVisibleSizeInScreen(-1) //同屏最大显示数量(弹幕密度(只对滚动有效))
                .preventOverlapping(overlappingEnablePair);
        Typeface font = FontUtils.loadFont2Assets(getContext(), "fonts/danmaku.ttf");
        if(font != null) mDanmakuContext.setTypeface(font);

        if (mDanmakuView != null) {
            initParser();

            mDanmakuView.setCallback(new master.flame.danmaku.controller.DrawHandler.Callback() {
                @Override
                public void updateTimer(DanmakuTimer timer) {
                }

                @Override
                public void drawingFinished() {

                }

                @Override
                public void danmakuShown(BaseDanmaku danmaku) {
                }

                @Override
                public void prepared() {
                    if (getDanmakuView() != null) {
                        getDanmakuView().start();
                        if (getDanmakuStartSeekPosition() != -1) {
                            resolveDanmakuSeek(player, getDanmakuStartSeekPosition());
                            setDanmakuStartSeekPosition(-1);
                        }
                        resolveDanmakuShow();
                    }
                }
            });
            mDanmakuView.enableDanmakuDrawingCache(true);
//            mDanmakuView.showFPS(true);
        }
    }

    /**
     开始播放弹幕
     */
    public void onPrepareDanmaku(BiliVideoPlayer gsyVideoPlayer) {
        if (getDanmakuView() != null && !getDanmakuView().isPrepared() && getParser() != null) {
            getDanmakuView().prepare(getParser(), getDanmakuContext());
        }
    }

    /**
     弹幕偏移
     */
    public void resolveDanmakuSeek(BiliVideoPlayer gsyVideoPlayer, long time) {
        if (gsyVideoPlayer.getHadPlay() && getDanmakuView() != null && getDanmakuView().isPrepared()) {
            getDanmakuView().seekTo(time);
        }
    }

    /**
     释放弹幕控件
     */
    public void releaseDanmaku(BiliVideoPlayer BiliVideoPlayer) {
        if (BiliVideoPlayer != null && getDanmakuView() != null) {
            Debuger.printfError("release Danmaku!");
            getDanmakuView().release();
        }
    }

    public void danmakuOnPause() {
        if (mDanmakuView != null && mDanmakuView.isPrepared()) {
            mDanmakuView.pause();
        }
    }

    public void danmakuOnResume() {
        if (mDanmakuView != null && mDanmakuView.isPrepared() && mDanmakuView.isPaused()) {
            mDanmakuView.resume();
        }
    }

    /**
     弹幕的显示与关闭
     */
    public void resolveDanmakuShow() {
            player.post(()->{
                if(getDanmaKuShow()) {
                    if (!getDanmakuView().isShown())
                        getDanmakuView().show();
                    mToogleDanmaku.setImageResource(R.drawable.live_ic_danmu_open);
                } else {
                    if (getDanmakuView().isShown()) {
                        getDanmakuView().hide();
                    }
                    mToogleDanmaku.setImageResource(R.drawable.live_ic_danmu_close);
                }
            });
    }
    /**
     创建解析器对象，解析输入流
     @param stream
     @return
     */
    private BaseDanmakuParser createParser(InputStream stream) {

        if (stream == null) {
            return new BaseDanmakuParser() {

                @Override
                protected Danmakus parse() {
                    return new Danmakus();
                }
            };
        }

        ILoader loader = DanmakuLoaderFactory.create(DanmakuLoaderFactory.TAG_BILI);

        try {
            loader.load(stream);
        } catch (IllegalDataException e) {
            e.printStackTrace();
        }
        BaseDanmakuParser parser = new BiliDanmukuParser();
        IDataSource<?> dataSource = loader.getDataSource();
        parser.load(dataSource);
        return parser;

    }

    private void initParser() {
        if(aid == 0 || cid == 0) {
            setParser(createParser(null));
            return;
        }
        BiliApplication.getDataManager().getApiHelper().getDanmakuStreamV2(aid, cid)
                .compose(RxSchedulersHelper.AllioThread())
                .subscribe(new ObserverCallback<InputStream>() {
                    @Override
                    public void onSuccess(InputStream inputStream) {
                        setParser(createParser(inputStream));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        mParser = null;
                    }
                });
    }

    public BaseDanmakuParser getParser() {
        if (mParser == null) {
            initParser();
        }
        return mParser;
    }

    public void setParser(BaseDanmakuParser baseDanmakuParser) {
        this.mParser = baseDanmakuParser;
    }

    public DanmakuContext getDanmakuContext() {
        return mDanmakuContext;
    }

    public void setDanmakuContext(DanmakuContext danmakuContext) {
        this.mDanmakuContext = danmakuContext;
    }

    public IDanmakuView getDanmakuView() {
        return mDanmakuView;
    }

    public long getDanmakuStartSeekPosition() {
        return mDanmakuStartSeekPosition;
    }

    public void setDanmakuStartSeekPosition(long danmakuStartSeekPosition) {
        this.mDanmakuStartSeekPosition = danmakuStartSeekPosition;
    }

    public void setDanmaKuShow(boolean danmaKuShow) {
        mDanmaKuShow = danmaKuShow;
    }

    public boolean getDanmaKuShow() {
        return mDanmaKuShow;
    }

    /**
     添加弹幕数据
     */
    public void addDanmaku(String text, int color, float textsize, boolean isLive) {
        BaseDanmaku danmaku = mDanmakuContext.mDanmakuFactory.createDanmaku(BaseDanmaku.TYPE_SCROLL_RL);
        if (danmaku == null || getDanmakuView() == null) {
            return;
        }
        danmaku.isLive = isLive;
        danmaku.textColor = color;
        danmaku.textShadowColor = color <= Color.BLACK ? Color.WHITE : Color.BLACK;
        danmaku.text = text;
        danmaku.padding = 5;
        danmaku.priority = 8;  // 可能会被各种过滤器过滤并隐藏显示，所以提高等级
        danmaku.textSize = textsize * (mParser.getDisplayer().getDensity() - 0.6f);
        danmaku.setTime(mDanmakuView.getCurrentTime() + 500);

        getDanmakuView().addDanmaku(danmaku);

    }
}
