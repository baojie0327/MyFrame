package com.example.ahuang.myframe.adapter; /**
 * RecyHeadAdapter  2017-06-27
 * Copyright (c) 2017 SSRJ Co.Ltd. All right reserved.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.bean.CollectionDetailBean;
import com.example.ahuang.myframe.util.GlideCircleTransform;

/**
 * class description here
 * @author Borje
 * @version 1.0.0
 * since 2017 06 27
 */
public class RecyHeadAdapter extends BaseRecyclerAdapter<CollectionDetailBean.DataBean.CollocationListBean>{

    private Context mContext;

    public RecyHeadAdapter(Context context){
        this.mContext=context;
    }


    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_collection_detail_recycler_layout, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBind(RecyclerView.ViewHolder viewHolder, int RealPosition, CollectionDetailBean.DataBean.CollocationListBean data) {
        CollectionDetailBean.DataBean.CollocationListBean.MemberPOBean memberPOBean = data.getMemberPO();
        if(viewHolder instanceof MyViewHolder) {

            String img_url = data.getPicture(); //图片
            if (!TextUtils.isEmpty(img_url)) {
                RequestOptions options = new RequestOptions()
                        .placeholder(R.drawable.default_square_four)
                        .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
                Glide.with(mContext)
                        .load(img_url)
                        .apply(options)
                        .into( ((MyViewHolder) viewHolder).img_assort);
            }

            String name = data.getName(); //名字
            if (!TextUtils.isEmpty(name)) {
                ((MyViewHolder) viewHolder).tv_assort_name.setText(name);
            }
            String avater_url = memberPOBean.getAvatar();//用户头像
            if (!TextUtils.isEmpty(avater_url)) {
                RequestOptions options = new RequestOptions()
                        .placeholder(R.drawable.default_square_four)
                        .transform(new GlideCircleTransform(mContext))
                        .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
                Glide.with(mContext)
                        .load(avater_url)
                        .apply(options)
                        .into(((MyViewHolder) viewHolder).img_avater);
            }
            String avater_name = data.getUserName();//用户名字
            if (!TextUtils.isEmpty(avater_name)) {
                ((MyViewHolder) viewHolder).tv_name.setText(avater_name);
            }




        }
    }

    class MyViewHolder extends BaseRecyclerAdapter.Holder{

        LinearLayout ll_layout;
        ImageView img_assort;
        TextView tv_assort_name;
        LinearLayout ll_user;
        ImageView img_avater;//头像
        TextView tv_name;  //名字
        ImageView img_plus;
        ImageView img_favor;
        public MyViewHolder(View itemView) {
            super(itemView);
            ll_layout=(LinearLayout) itemView.findViewById(R.id.ll_layout);
            img_assort = (ImageView) itemView.findViewById(R.id.assort_picture);
            ll_user=(LinearLayout) itemView.findViewById(R.id.ll_user);
            tv_assort_name = (TextView) itemView.findViewById(R.id.assort_name);
            img_avater = (ImageView) itemView.findViewById(R.id.img_avater);
            tv_name = (TextView) itemView.findViewById(R.id.avater_name);
           img_plus = (ImageView) itemView.findViewById(R.id.img_plus);
            img_favor = (ImageView) itemView.findViewById(R.id.img_flavor);
        }
    }
}