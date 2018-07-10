package com.example.ahuang.myframe.adapter; /**
 * SmartHelperAdapter  2017-09-20
 * Copyright (c) 2017 KL Co.Ltd. All right reserved.
 */

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.util.GlideCircleTransform;

import java.util.List;

/**
 * SmartBaseRecyAdapterHelperActivity的适配器
 * @author Jackson
 * @version 1.0.0
 * since 2017 09 20
 */
public class SmartHelperAdapter extends BaseQuickAdapter<CollectionDetailBean.DataBean.CollocationListBean,SmartHelperAdapter.MyViewHolder> {


    public SmartHelperAdapter(@LayoutRes int layoutResId, @Nullable List<CollectionDetailBean.DataBean.CollocationListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(MyViewHolder helper, CollectionDetailBean.DataBean.CollocationListBean item) {
        String img_url = item.getPicture(); //图片
        if (!TextUtils.isEmpty(img_url)) {
            RequestOptions options = new RequestOptions()
                    .placeholder(R.drawable.default_square_four)
                    .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
            Glide.with(mContext)
                    .load(img_url)
                    .apply(options)
                    .into((ImageView) helper.getView(R.id.assort_picture));
        }

        String name = item.getName(); //名字
        if (!TextUtils.isEmpty(name)) {
            helper.setText(R.id.assort_name,name);
        }

        String avater_url = item.getMemberPO().getAvatar();//用户头像
        if (!TextUtils.isEmpty(avater_url)) {
            RequestOptions options = new RequestOptions()
                    .placeholder(R.drawable.default_square_four)
                    .transform(new GlideCircleTransform(mContext))
                    .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
            Glide.with(mContext)
                    .load(avater_url)
                    .apply(options)
                    .into((ImageView) helper.getView(R.id.img_avater));
        }

        String avater_name = item.getUserName();//用户名字
        if (!TextUtils.isEmpty(avater_name)) {
            helper.setText(R.id.avater_name,avater_name);
        }

        helper.addOnClickListener(R.id.assort_picture).addOnClickListener(R.id.assort_name);

    }



    public class MyViewHolder extends BaseViewHolder{

        public MyViewHolder(View view) {
            super(view);
        }
        LinearLayout ll_layout;
        ImageView img_assort;
        TextView tv_assort_name;
        LinearLayout ll_user;
        ImageView img_avater;//头像
        TextView tv_name;  //名字
        ImageView img_plus;
        ImageView img_favor;
    }
}

