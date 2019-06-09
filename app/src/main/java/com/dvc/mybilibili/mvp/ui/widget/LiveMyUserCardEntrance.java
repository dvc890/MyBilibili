package com.dvc.mybilibili.mvp.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

//@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\n\u00a8\u0006\u0010"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/ui/widget/LiveMyUserCardEntrance;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
//        "bindData", "", "avatarUrl", "", "showBadge", "", "hideBadge", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.ui.widget.LiveMyUserCardEntrance */
public final class LiveMyUserCardEntrance extends FrameLayout {
    /* renamed from: a */
    private HashMap f19506a;

    public LiveMyUserCardEntrance(@NotNull Context context) {
        this(context, null, 0, 6);
    }

    public LiveMyUserCardEntrance(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: a */
    public View findVidwById(int i) {
        if (this.f19506a == null) {
            this.f19506a = new HashMap();
        }
        View view = (View) this.f19506a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f19506a.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ LiveMyUserCardEntrance(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0?null:attributeSet, (i2 & 4) != 0?0:i);
    }

    public LiveMyUserCardEntrance(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.live_room_my_user_card_entrance, this);
    }

    /* renamed from: a */
    public final void avatarUrl(@Nullable String url, boolean isShowBadge) {
        if (!TextUtils.isEmpty(url)) {
            if ((((CharSequence) url).length() > 0 ? 1 : null) != null) {
                GlideUtils.Circle2ImageView((ImageView) findVidwById(R.id.user_mng_entrance_avatar), url);
            }
        }
        if (isShowBadge) {
            showBadge();
        } else {
            hideBadge();
        }
    }

    /* renamed from: a */
    public final void showBadge() {
        ImageView imageView = (ImageView) findVidwById(R.id.user_mng_entrance_avatar_badge);
        imageView.setVisibility(VISIBLE);
    }

    /* renamed from: b */
    public final void hideBadge() {
        ImageView imageView = (ImageView) findVidwById(R.id.user_mng_entrance_avatar_badge);
        imageView.setVisibility(GONE);
    }
}
