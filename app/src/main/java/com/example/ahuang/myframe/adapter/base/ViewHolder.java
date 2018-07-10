package com.example.ahuang.myframe.adapter.base; /**
 * ViewHolder  2017-06-29
 * Copyright (c) 2017 SSRJ Co.Ltd. All right reserved.
 */

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.util.GlideCircleTransform;

/**
 * ViewHolder，RecycleView的适配器的ViewHolder，继承自RecycleView.ViewHolder
 *
 * @author Borje
 * @version 1.0.0
 *          since 2017 06 29
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    private Context mContext;
    private SparseArray<View> mViews;  //存放一个布局的全部控件，已key-value的形式存放
    private View mConvertView;


    /**
     * 构造方法
     *
     * @param context
     * @param itemView
     */
    public ViewHolder(Context context, View itemView) {
        super(itemView);
        this.mContext = context;
        this.mConvertView = itemView;
        mViews = new SparseArray<>();
    }

    /**
     * 生成ViewHolder的方法，在Adapter的onCreateViewHolder（）方法里使用
     *
     * @param context
     * @param itemView
     * @return
     */
    public static ViewHolder createViewHolder(Context context, View itemView) {
        ViewHolder holder = new ViewHolder(context, itemView);
        return holder;
    }

    /**
     * 生成ViewHolder的方法，itemView是通过布局导入器产生
     *
     * @param context
     * @param parent
     * @param layoutId
     * @return
     */
    public static ViewHolder createViewHolder(Context context, ViewGroup parent, int layoutId) {
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        ViewHolder holder = new ViewHolder(context, itemView);
        return holder;
    }

    /**
     * 通过viewId获取控件
     *
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    /**
     * 获取mConvertView
     *
     * @return
     */
    public View getConvertView() {
        return mConvertView;
    }


    /**
     * 设置TextView的值
     *
     * @param viewId
     * @param text
     * @return
     */
    public ViewHolder setText(int viewId, String text) {
        TextView tv = getView(viewId);
        tv.setText(text);
        return this;
    }


    /**
     * 设置本地图片
     *
     * @param viewId
     * @param resId
     * @return
     */
    public ViewHolder setImageResource(int viewId, int resId) {
        ImageView imageView = getView(viewId);
        imageView.setImageResource(resId);
        return this;
    }

    /**
     * 设置网络图片
     *
     * @param viewId
     * @param url
     * @return
     */
    public ViewHolder setImageNet(int viewId, String url) {
        ImageView imageView = getView(viewId);
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.default_square_four)
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
        Glide.with(mContext)
                .load(url)
                .apply(options)
                .into(imageView);
        return this;
    }

    /**
     * 设置头像，圆形
     *
     * @param viewId
     * @param url
     * @return
     */
    public ViewHolder setImageNetRound(int viewId, String url) {
        ImageView imageView = getView(viewId);
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.default_square_four)
                .transform(new GlideCircleTransform(mContext))
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
        Glide.with(mContext)
                .load(url)
                .apply(options)
                .into(imageView);
        return this;
    }

    /**
     * 设置是否显示
     *
     * @param viewId
     * @param visible
     * @return
     */
    public ViewHolder setVisible(int viewId, boolean visible) {
        View view = getView(viewId);
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
        return this;
    }

    /**
     * 设置TextView的字体颜色
     *
     * @param viewId
     * @param textColor
     * @return
     */
    public ViewHolder setTextColor(int viewId, int textColor) {
        TextView textView = getView(viewId);
        textView.setTextColor(textColor);
        return this;
    }

    /**
     * 从colors.xml里设置颜色
     *
     * @param viewId
     * @param textColorRes
     * @return
     */
    public ViewHolder setTextColorRes(int viewId, int textColorRes) {
        TextView view = getView(viewId);
        view.setTextColor(mContext.getResources().getColor(textColorRes));
        return this;
    }

    /**
     * 设置bitmap
     *
     * @param viewId
     * @param bitmap
     * @return
     */
    public ViewHolder setImageBitmap(int viewId, Bitmap bitmap) {
        ImageView view = getView(viewId);
        view.setImageBitmap(bitmap);
        return this;
    }

    /**
     * setImageDrawable
     *
     * @param viewId
     * @param drawable
     * @return
     */
    public ViewHolder setImageDrawable(int viewId, Drawable drawable) {
        ImageView view = getView(viewId);
        view.setImageDrawable(drawable);
        return this;
    }

    /**
     * setBackgroundColor
     *
     * @param viewId
     * @param color
     * @return
     */
    public ViewHolder setBackgroundColor(int viewId, int color) {
        View view = getView(viewId);
        view.setBackgroundColor(color);
        return this;
    }

    /**
     * setBackgroundRes
     *
     * @param viewId
     * @param backgroundRes
     * @return
     */
    public ViewHolder setBackgroundRes(int viewId, int backgroundRes) {
        View view = getView(viewId);
        view.setBackgroundResource(backgroundRes);
        return this;
    }

    /**
     * setAlpha
     * @param viewId
     * @param value
     * @return
     */
    public ViewHolder setAlpha(int viewId, float value) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
            getView(viewId).setAlpha(value);
        }else {
            AlphaAnimation alphaAnimation=new AlphaAnimation(value,value);
            alphaAnimation.setDuration(0);
            alphaAnimation.setFillAfter(true);
            getView(viewId).startAnimation(alphaAnimation);
        }
        return this;
    }

    /**
     * linkify
     * @param viewId
     * @return
     */
    public ViewHolder linkify(int viewId) {
        TextView view = getView(viewId);
        Linkify.addLinks(view, Linkify.ALL);
        return this;
    }

    public ViewHolder setTypeface(Typeface typeface, int... viewIds) {
        for (int viewId : viewIds) {
            TextView view = getView(viewId);
            view.setTypeface(typeface);
            view.setPaintFlags(view.getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG);
        }
        return this;
    }

    public ViewHolder setProgress(int viewId, int progress) {
        ProgressBar view = getView(viewId);
        view.setProgress(progress);
        return this;
    }

    public ViewHolder setProgress(int viewId, int progress, int max) {
        ProgressBar view = getView(viewId);
        view.setMax(max);
        view.setProgress(progress);
        return this;
    }

    public ViewHolder setMax(int viewId, int max) {
        ProgressBar view = getView(viewId);
        view.setMax(max);
        return this;
    }

    public ViewHolder setRating(int viewId, float rating) {
        RatingBar view = getView(viewId);
        view.setRating(rating);
        return this;
    }

    public ViewHolder setRating(int viewId, float rating, int max) {
        RatingBar view = getView(viewId);
        view.setMax(max);
        view.setRating(rating);
        return this;
    }

    public ViewHolder setTag(int viewId, Object tag) {
        View view = getView(viewId);
        view.setTag(tag);
        return this;
    }

    public ViewHolder setTag(int viewId, int key, Object tag) {
        View view = getView(viewId);
        view.setTag(key, tag);
        return this;
    }

    public ViewHolder setChecked(int viewId, boolean checked) {
        Checkable view = (Checkable) getView(viewId);
        view.setChecked(checked);
        return this;
    }

    /**
     * 关于事件的
     */
    public ViewHolder setOnClickListener(int viewId, View.OnClickListener listener) {
        View view = getView(viewId);
        view.setOnClickListener(listener);
        return this;
    }

    public ViewHolder setOnTouchListener(int viewId, View.OnTouchListener listener) {
        View view = getView(viewId);
        view.setOnTouchListener(listener);
        return this;
    }

    public ViewHolder setOnLongClickListener(int viewId, View.OnLongClickListener listener) {
        View view = getView(viewId);
        view.setOnLongClickListener(listener);
        return this;
    }


}