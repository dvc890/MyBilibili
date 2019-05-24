package com.dvc.mybilibili.app.utils;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.glide.RoundedCornersTransform;
import com.vondear.rxtool.RxImageTool;

public class GlideUtils {
    private static RequestManager manager = Glide.with(BiliApplication.getContext());

    public static RequestManager getGlide() {
        return manager;
    }

    public static void Default2ImageView(Activity activity, ImageView view, String url, int placeholderResId){
        RequestBuilder<Drawable> requestBuilder =
                Glide.with(activity).load(url)
//                .skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.ALL)
                        .transition(new DrawableTransitionOptions().crossFade(300));
        if(placeholderResId > 0)
            requestBuilder.placeholder(placeholderResId);
        requestBuilder.into(view);
    }

    public static void Default2ImageView(ImageView view, String url, int placeholderResId){
        RequestBuilder<Drawable> requestBuilder =
        manager.load(url)
//                .skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.ALL)
                .transition(new DrawableTransitionOptions().crossFade(300));
        if(placeholderResId > 0)
            requestBuilder.placeholder(placeholderResId);
        requestBuilder.into(view);
    }

    public static void RoundedCorners2ImageView(ImageView view, String url, int roundRadius){
        manager.load(url)
//                .placeholder(R.drawable.placeholder)
                .transition(new DrawableTransitionOptions().crossFade(300))
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(roundRadius)))
                .into(view);
    }

    public static void TopRoundedCorners2ImageView(ImageView view, String url, int roundRadius) {
        RoundedCorners2ImageView(view, url, roundRadius, true, true, false, false);
    }

    public static void RoundedCorners2ImageView(ImageView view, String url, int roundRadius, boolean leftTop, boolean rightTop, boolean leftBottom, boolean rightBottom) {
        RoundedCornersTransform transform = new RoundedCornersTransform(view.getContext(), RxImageTool.dip2px(roundRadius/3));
        transform.setNeedCorner(leftTop, rightTop, leftBottom, rightBottom);
        manager.load(url).apply(RequestOptions.bitmapTransform(transform)).into(view);
    }

    public static void Circle2ImageView(ImageView view, String url){
        manager.load(url)
//                .placeholder(R.drawable.placeholder)
                .transition(new DrawableTransitionOptions().crossFade(300))
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(view);
    }
}
