package com.dvc.mybilibili.mvp.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dvc.base.utils.Reflect;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliComment;
import com.shuyu.textutillib.RichTextView;
import com.shuyu.textutillib.model.UserModel;
import com.vondear.rxtool.RxImageTool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import butterknife.ButterKnife;

public class CommentReplyView<T> extends LinearLayout {

    private List<T> items;
    private LinkedList<RichTextView> textViews;
    private int maxNum = 3;
    private CommentReplyViewPresenter<T> presenter;


    public CommentReplyView(Context context) {
        super(context);
        init();
    }

    public CommentReplyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CommentReplyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        items = new ArrayList<>();
        textViews = new LinkedList<>();
        setOrientation(LinearLayout.VERTICAL);
    }

    public void setMaxShowItem(int num) {
        this.maxNum = num;
    }

    public void setData(Collection<T> items, CommentReplyViewPresenter<T> presenter) {
        this.items.clear();
        this.items.addAll(items);
        this.presenter = presenter;
        notifyDataSetChanged();
    }

    private void notifyDataSetChanged() {
        removeAllViewsInLayout();
        for(int i = 0 ; i < items.size(); i++) {
            if(i >= maxNum) {
                break;
            }
            T item = items.get(i);
            RichTextView view = new RichTextView(getContext());
            view.setPadding(RxImageTool.dip2px(4f),RxImageTool.dip2px(4f),RxImageTool.dip2px(12f),RxImageTool.dip2px(4f));
            view.setAtColor(getResources().getColor(R.color.comment2_high_light_1));
            view.setLinkColor(getResources().getColor(R.color.comment2_high_light_1));
            view.setTextColor(getResources().getColor(R.color.daynight_color_text_body_primary));
            view.setTextSize(14);
            view.setMaxLines(2);
            view.setEllipsize(TextUtils.TruncateAt.END);
            presenter.convert(item, view);
            addView(view);
        }
        View view = presenter.createMoreView(LayoutInflater.from(getContext()),maxNum);
        if(view != null) addView(view);
    }

    public void setItemOnClickListener(OnClickListener onClickListener) {
        for(int i = 0 ; i < getChildCount() - 1; i++)
            getChildAt(i).setOnClickListener(onClickListener);
    }

    public View getMoreView() {
        if(getChildCount() > 3)
            return getChildAt(getChildCount() - 1);
        return null;
    }

    public void setMoreOnClickListener(OnClickListener onClickListener) {
        if(getMoreView() != null)
            getMoreView().setOnClickListener(onClickListener);
    }

    public static class BiliCommentReplyViewPresenter extends CommentReplyViewPresenter<BiliComment>{

        private BiliComment root;
        private List<UserModel> userModels;

        public BiliCommentReplyViewPresenter(BiliComment root) {
            this.root = root;
            this.userModels = new CopyOnWriteArrayList<>();
            search(root);
        }

        private void search(BiliComment comment) {
            if(comment == null) return;
            this.userModels.add(new UserModel(comment.mMember.mNick, comment.mMember.mMid));
            if(comment.mReply != null) {
                for (BiliComment reply : comment.mReply) {
                    search(reply);
                }
            }
        }

        @Override
        public void convert(BiliComment item, RichTextView view) {
            view.setRichTextUser("@"+item.getNickName()+" : "+item.getMsg(), this.userModels);
        }

        @Override
        public View createMoreView(LayoutInflater inflater, int maxNum) {
            if(root.mReplyCount <= maxNum) return null;
            View view = inflater.inflate(R.layout.bili_app_list_item_comment2_secondary_reply_more, null);
            View upperreply = view.findViewWithTag("binding_1");
            TextView replynumtip =view.findViewWithTag("binding_2");
            upperreply.setVisibility(root.isUpperReplied()?VISIBLE:GONE);
            replynumtip.setText(view.getResources().getString(R.string.reply_count_in_primary_comment, root.mReplyCount+""));
            return view;
        }
    }

    public static abstract class CommentReplyViewPresenter<T> {
        public abstract void convert(T item, RichTextView view);
        public abstract View createMoreView(LayoutInflater inflater, int maxNum);
    }
}
