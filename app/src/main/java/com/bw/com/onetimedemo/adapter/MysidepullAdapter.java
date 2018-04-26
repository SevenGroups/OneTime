package com.bw.com.onetimedemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bw.com.onetimedemo.R;
import com.bw.com.onetimedemo.bean.SidePullBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangxueqin on 2018/4/26.
 */

public class MysidepullAdapter extends RecyclerView.Adapter<MysidepullAdapter.GoodsViewHoder>{
    private Context context;
    private List<SidePullBean> list=new ArrayList<>();

    public MysidepullAdapter(Context context, List<SidePullBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public GoodsViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.itme_side_pull, parent,false);


        return new GoodsViewHoder(view);
    }

    @Override
    public void onBindViewHolder(GoodsViewHoder holder,final int position) {

        holder.titiel.setText(list.get(position).getName());
        Glide.with(context).load(list.get(position).getImg()).into(holder.img);
        holder.titiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Log.i("+++",position+"");
                listner.onItemClick(view,position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class GoodsViewHoder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView titiel;
        public GoodsViewHoder(View itemView) {
            super(itemView);
            img =(ImageView) itemView.findViewById(R.id.img_view);
            titiel = (TextView)itemView.findViewById(R.id.text_n);

        }
    }
    //设置条目点击事件
    private OnItemClickListner listner;
    public void setClick(OnItemClickListner listner){
        this.listner=listner;
    }
}
