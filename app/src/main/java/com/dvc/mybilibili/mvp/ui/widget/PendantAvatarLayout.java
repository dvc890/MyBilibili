package com.dvc.mybilibili.mvp.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.DrawableRes;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.vondear.rxtool.RxImageTool;

/* compiled from: BL */
public class PendantAvatarLayout extends RelativeLayout {
    /* renamed from: a */
    private ImageView avatar;
    /* renamed from: b */
    private ImageView pendant;
    /* renamed from: c */
    private ImageView verify;

    public enum VerifySize {
        SMALL(10),
        MIDDLE(12),
        LARGE(16),
        SUPER(22);

        public int dp;

        private VerifySize(int i) {
            this.dp = i;
        }
    }

    public PendantAvatarLayout(Context context) {
        this(context, null);
    }

    public PendantAvatarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PendantAvatarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    /* renamed from: a */
    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.layout_height});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, RxImageTool.dip2px(60.0f));
        obtainStyledAttributes.recycle();
        int i = (int) (((float) dimensionPixelSize) * 0.5f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.bili_app_layout_comment2_pendant_avatar, this, true);
        this.avatar = inflate.findViewById(R.id.avatar);
        this.pendant = inflate.findViewById(R.id.pendant);
        this.verify = inflate.findViewById(R.id.verify);
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.addRule(13);
        this.avatar.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static void setAvatarInView(PendantAvatarLayout pendantAvatarLayout, String str) {
        pendantAvatarLayout.setAvatarUrl(str);
    }

    /* renamed from: b */
    public static void setPendantInView(PendantAvatarLayout pendantAvatarLayout, String str) {
        pendantAvatarLayout.setPendantUrl(str);
    }

    /* renamed from: a */
    public static void setVerifyInView(PendantAvatarLayout pendantAvatarLayout, boolean z, boolean z2, VerifySize verifySize) {
        pendantAvatarLayout.setVerify(z, z2, verifySize);
    }

    public void setAvatarUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            this.avatar.setImageResource(R.drawable.bili_default_avatar);
        } else {
            GlideUtils.Circle2ImageView(this.avatar, str);
        }
    }

    public void setPendantUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            this.pendant.setImageResource(0);
        } else {
            GlideUtils.Default2ImageView(this.pendant, str, 0);
        }
    }

    /* renamed from: a */
    public void setVerify(boolean isPresonal, boolean hasVerify, VerifySize verifySize) {
        if (isPresonal || hasVerify) {
            int a = RxImageTool.dip2px(verifySize.dp);
            this.verify.getLayoutParams().width = a;
            this.verify.getLayoutParams().height = a;
            if (isPresonal) {
                this.verify.setImageResource(setPresonal(verifySize));
            } else {
                this.verify.setImageResource(setOragnization(verifySize));
            }
            return;
        }
        setVerifyImageRes(0);
    }

    /* renamed from: a */
    public void setVerifyImageRes(@DrawableRes int i) {
        this.verify.setImageResource(i);
    }

    /* renamed from: a */
    private int setOragnization(VerifySize verifySize) {
        switch (verifySize) {
            case SMALL:
                return R.drawable.ic_authentication_organization_size_8;
            case MIDDLE:
                return R.drawable.ic_authentication_organization_size_10;
            case LARGE:
                return R.drawable.ic_authentication_organization_size_16;
            case SUPER:
                return R.drawable.ic_authentication_organization_size_22;
            default:
                return R.drawable.ic_authentication_organization_size_8;
        }
    }

    /* renamed from: b */
    private int setPresonal(VerifySize verifySize) {
        switch (verifySize) {
            case SMALL:
                return R.drawable.ic_authentication_personal_size_8;
            case MIDDLE:
                return R.drawable.ic_authentication_personal_size_10;
            case LARGE:
                return R.drawable.ic_authentication_personal_size_16;
            case SUPER:
                return R.drawable.ic_authentication_personal_size_22;
            default:
                return R.drawable.ic_authentication_personal_size_8;
        }
    }
}
