package com.example.ahuang.myframe.adapter; /**
 * CollDetailRecyAdapter  2017-06-21
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

import java.util.List;


/**
 * class description here
 * @author Borje
 * @version 1.0.0
 * since 2017 06 21
 */
public class CollDetailRecyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<CollectionDetailBean.DataBean.CollocationListBean> list;
    private OnItemClickLitener mOnItemClickLitener;

    public CollDetailRecyAdapter(Context context, List<CollectionDetailBean.DataBean.CollocationListBean> list) {
        this.mContext = context;
        this.list = list;
    }


    //上拉加载的方法
    public void addData(List<CollectionDetailBean.DataBean.CollocationListBean> list) {
        this.list.addAll(list);
       // notifyDataSetChanged();
    }

    //下拉刷新的方法
    public void setData(List<CollectionDetailBean.DataBean.CollocationListBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public void removeAll() {
        list.clear();
        notifyDataSetChanged();
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_collection_detail_recycler_layout,
                parent, false);
       MyViewHolder viewHolder = new MyViewHolder(view);
        viewHolder.ll_layout=(LinearLayout) view.findViewById(R.id.ll_layout);
        viewHolder.img_assort = (ImageView) view.findViewById(R.id.assort_picture);
        viewHolder.ll_user=(LinearLayout) view.findViewById(R.id.ll_user);
        viewHolder.tv_assort_name = (TextView) view.findViewById(R.id.assort_name);
        viewHolder.img_avater = (ImageView) view.findViewById(R.id.img_avater);
        viewHolder.tv_name = (TextView) view.findViewById(R.id.avater_name);
        viewHolder.img_plus = (ImageView) view.findViewById(R.id.img_plus);
        viewHolder.img_favor = (ImageView) view.findViewById(R.id.img_flavor);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        final MyViewHolder holder= (MyViewHolder) viewHolder;
        CollectionDetailBean.DataBean.CollocationListBean.MemberPOBean memberPOBean = list.get(position).getMemberPO();
        //获取数据
        //   LogUtil.d(position + "===");
        String img_url = list.get(position).getPicture(); //图片
        if (!TextUtils.isEmpty(img_url)) {
            RequestOptions options = new RequestOptions()
                    .placeholder(R.drawable.default_square_four)
                    .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
            Glide.with(mContext)
                    .load(img_url)
                    .apply(options)
                    .into(holder.img_assort);
        }
        String name = list.get(position).getName(); //名字
        if (!TextUtils.isEmpty(name)) {
            holder.tv_assort_name.setText(name);
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
                    .into(holder.img_avater);
        }
        String avater_name = list.get(position).getUserName();//用户名字
        if (!TextUtils.isEmpty(avater_name)) {
            holder.tv_name.setText(avater_name);
        }

        if (mOnItemClickLitener != null){
            holder.ll_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = holder.getLayoutPosition();
                    mOnItemClickLitener.onItemClick(holder.itemView, pos);
                }
            });
        }

    }



    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
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

    public void setOnItemClickLitener(OnItemClickLitener mOnItemClickLitener) {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }
    public interface OnItemClickLitener {
        void onItemClick(View view, int position);
        void onItemLongClick(View view , int position);
    }
}