package com.bw.com.onetimedemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bw.com.onetimedemo.R;
import com.bw.com.onetimedemo.ShiPinZuoPinActivity;
import com.bw.com.onetimedemo.ShiPingXQActivity;
import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.bean.SidePullBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangxueqin on 2018/4/26.
 */

public class GuanZhuAdapter extends RecyclerView.Adapter<GuanZhuAdapter.GoodsViewHoder>{
    private Context context;
    private List<RemMenGuanZhuBean.DataBean> list;
    private View view;

    public GuanZhuAdapter(Context context, List<RemMenGuanZhuBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public GoodsViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context).inflate(R.layout.itme_guanzhu_layout, parent,false);


        return new GoodsViewHoder(view);
    }

    @Override
    public void onBindViewHolder(GoodsViewHoder holder,final int position) {


        holder.titiel.setText(list.get(position).getUser().getNickname());
        holder.titiel1.setText(list.get(position).getWorkDesc());
        holder.time.setText(list.get(position).getCreateTime());
        Uri uri = Uri.parse(list.get(position).getUser().getIcon());
        holder.img1.setImageURI(uri);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,ShiPinZuoPinActivity.class);
                intent.putExtra("uid", list.get(position).getUid()+"");
                intent.putExtra("icon",list.get(position).getUser().getIcon());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class GoodsViewHoder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView titiel,titiel1,time;

        SimpleDraweeView img1;

        public GoodsViewHoder(View itemView) {
            super(itemView);
            img1 = (SimpleDraweeView) itemView.findViewById(R.id.sdv2);

            img =(ImageView) itemView.findViewById(R.id.you3);
            titiel = (TextView)itemView.findViewById(R.id.text_name);
            titiel1 = (TextView)itemView.findViewById(R.id.text_name1);
            time= (TextView)itemView.findViewById(R.id.t_time);



        }
    }
    //设置条目点击事件
    private OnItemClickListner listner;
    public void setClick(OnItemClickListner listner){
        this.listner=listner;
    }
}
