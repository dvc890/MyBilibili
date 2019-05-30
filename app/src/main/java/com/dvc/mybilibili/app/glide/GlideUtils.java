package com.dvc.mybilibili.app.glide;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.glide.RoundedCornersTransform;
import com.dvc.mybilibili.R;
import com.vondear.rxtool.RxImageTool;

public class GlideUtils {
    private static RequestManager manager = Glide.with(BiliApplication.getContext());

    public static RequestManager getGlide() {
        return manager;
    }

    public static void Default2ImageView(ImageView view, String url, int placeholderResId, RequestOptions options){
        options = options
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                .dontAnimate();
        RequestBuilder<Drawable> requestBuilder =
                manager.load(url)
                        .transition(new DrawableTransitionOptions().crossFade(300))
                        .apply(options);
        if(placeholderResId > 0)
            requestBuilder.placeholder(placeholderResId);
        else
            requestBuilder.placeholder(R.drawable.bili_default_image_tv);
        requestBuilder.into(view);
    }

    public static void Default2ImageView(ImageView view, String url, int placeholderResId){
        Default2ImageView(view, url, placeholderResId, new RequestOptions());
    }

    public static void RoundedCorners2ImageView(ImageView view, String url, int roundRadius){
        RequestOptions options = new RequestOptions()
                .bitmapTransform(new RoundedCorners(roundRadius));
        Default2ImageView(view, url, 0, options);
    }

    public static void TopRoundedCorners2ImageView(ImageView view, String url, int roundRadius) {
        RoundedCorners2ImageView(view, url, roundRadius, true, true, false, false);
    }

    public static void RoundedCorners2ImageView(ImageView view, String url, int roundRadius, boolean leftTop, boolean rightTop, boolean leftBottom, boolean rightBottom) {
        RoundedCornersTransform transform = new RoundedCornersTransform(view.getContext(), RxImageTool.dip2px(roundRadius/3));
        transform.setNeedCorner(leftTop, rightTop, leftBottom, rightBottom);
        Default2ImageView(view, url, 0, RequestOptions.bitmapTransform(transform));
    }

    public static void Circle2ImageView(ImageView view, String url){
        Default2ImageView(view, url, 0, RequestOptions.bitmapTransform(new CircleCrop()));
    }
}
