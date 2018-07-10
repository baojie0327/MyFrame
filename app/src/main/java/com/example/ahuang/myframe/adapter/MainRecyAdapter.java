package com.example.ahuang.myframe.adapter; /**
 * MainRecyAdapter  2017-06-22
 * Copyright (c) 2017 SSRJ Co.Ltd. All right reserved.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ahuang.myframe.R;

import java.util.List;

/**
 * class description here
 *
 * @author Borje
 * @version 1.0.0
 *          since 2017 06 22
 */
public class MainRecyAdapter extends RecyclerView.Adapter<MainRecyAdapter.MyViewHolder> {

    private Context mContext;
    private List<String> list;
    private OnItemClickLitener mOnItemClickLitener;

    public MainRecyAdapter(Context context, List<String> data) {
        this.mContext = context;
        this.list = data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_main_recy_layout,parent,false);
        MyViewHolder viewHolder=new MyViewHolder(view);
        viewHolder.tv_data=(TextView) view.findViewById(R.id.tv_text);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.tv_data.setText(list.get(position).toString());
        if (mOnItemClickLitener!=null){
            holder.tv_data.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos=holder.getLayoutPosition();
                    mOnItemClickLitener.onItemClick(holder.tv_data,pos);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
        TextView tv_data;
    }


    public void setOnItemClickLitener(OnItemClickLitener onItemClickLitener){
        this.mOnItemClickLitener=onItemClickLitener;
    }

    public interface OnItemClickLitener{
        void onItemClick(View view,int position);
    }


}