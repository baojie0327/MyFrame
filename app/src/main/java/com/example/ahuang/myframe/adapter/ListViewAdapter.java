package com.example.ahuang.myframe.adapter; /**
 * ListViewAdapter  2017-06-23
 * Copyright (c) 2017 SSRJ Co.Ltd. All right reserved.
 */

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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

import static android.R.id.list;

/**
 * class description here
 * @author Borje
 * @version 1.0.0
 * since 2017 06 23
 */
public class ListViewAdapter extends BaseAdapter{

    private Context mContext;
    private List<CollectionDetailBean.DataBean.CollocationListBean> mDataList;

    public ListViewAdapter(Context context,List<CollectionDetailBean.DataBean.CollocationListBean> list){
        this.mContext=context;
        this.mDataList=list;
    }


    //上拉加载的方法
    public void addData(List<CollectionDetailBean.DataBean.CollocationListBean> list) {
        this.mDataList.addAll(list);
        notifyDataSetChanged();
    }

    //下拉刷新的方法
    public void setData(List<CollectionDetailBean.DataBean.CollocationListBean> list) {
        this.mDataList = list;
        notifyDataSetChanged();
    }

    public void removeAll() {
        mDataList.clear();
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(mContext).inflate(R.layout.item_collection_detail_layout,null);
            viewHolder.ll_layout=(LinearLayout) convertView.findViewById(R.id.ll_layout);
            viewHolder.img_assort = (ImageView) convertView.findViewById(R.id.assort_picture);
            viewHolder.ll_user=(LinearLayout) convertView.findViewById(R.id.ll_user);
            viewHolder.tv_assort_name = (TextView) convertView.findViewById(R.id.assort_name);
            viewHolder.img_avater = (ImageView) convertView.findViewById(R.id.img_avater);
            viewHolder.tv_name = (TextView) convertView.findViewById(R.id.avater_name);
            viewHolder.img_plus = (ImageView) convertView.findViewById(R.id.img_plus);
            viewHolder.img_favor = (ImageView) convertView.findViewById(R.id.img_flavor);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        CollectionDetailBean.DataBean.CollocationListBean.MemberPOBean memberPOBean = mDataList.get(position).getMemberPO();
        //获取数据
        //   LogUtil.d(position + "===");
        String img_url = mDataList.get(position).getPicture(); //图片
        if (!TextUtils.isEmpty(img_url)) {
            RequestOptions options = new RequestOptions()
                    .placeholder(R.drawable.default_square_four)
                    .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
            Glide.with(mContext)
                    .load(img_url)
                    .apply(options)
                    .into(viewHolder.img_assort);
        }
        String name = mDataList.get(position).getName(); //名字
        if (!TextUtils.isEmpty(name)) {
            viewHolder.tv_assort_name.setText(name);
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
                    .into(viewHolder.img_avater);
        }
        String avater_name = mDataList.get(position).getUserName();//用户名字
        if (!TextUtils.isEmpty(avater_name)) {
            viewHolder.tv_name.setText(avater_name);
        }

        return convertView;
    }

    class ViewHolder{
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