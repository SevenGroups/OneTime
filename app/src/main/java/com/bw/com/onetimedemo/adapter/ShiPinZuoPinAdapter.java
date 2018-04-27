package com.bw.com.onetimedemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bw.com.onetimedemo.R;
import com.bw.com.onetimedemo.ShiPinZuoPinActivity;
import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.bean.ShiPinZuoPinBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by tangxueqin on 2018/4/26.
 */

public class ShiPinZuoPinAdapter extends RecyclerView.Adapter<ShiPinZuoPinAdapter.GoodsViewHoder>{
    private Context context;
    private List<ShiPinZuoPinBean.DataBean> list;
    private View view;
    private String icon;
   private String Nickname;
    public ShiPinZuoPinAdapter(Context context, List<ShiPinZuoPinBean.DataBean> list,String icon,String Nickname) {
        this.context = context;
        this.list = list;
        this.icon=icon;
        this.Nickname=Nickname;
    }

    @Override
    public GoodsViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context).inflate(R.layout.itme_spzp_layout, parent,false);


        return new GoodsViewHoder(view);
    }

    @Override
    public void onBindViewHolder(GoodsViewHoder holder,final int position) {
      holder.t_ncc.setText(Nickname);
      holder.itme_1.setText(list.get(position).getCreateTime());
        Uri uri = Uri.parse(icon);
        holder.img1.setImageURI(uri);
        Glide.with(context).load(list.get(position).getCover()).into(holder.img_sp);
        holder.img_bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //播放视频

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class GoodsViewHoder extends RecyclerView.ViewHolder{
        ImageView img_sp,img_bf;
        TextView t_ncc,itme_1,time;

        SimpleDraweeView img1;

        public GoodsViewHoder(View itemView) {
            super(itemView);
            img1 = (SimpleDraweeView) itemView.findViewById(R.id.sdv4);
            img_sp =(ImageView) itemView.findViewById(R.id.img_sp);
            img_bf =(ImageView) itemView.findViewById(R.id.img_bf);
            t_ncc = (TextView)itemView.findViewById(R.id.t_ncc);
            itme_1 = (TextView)itemView.findViewById(R.id.itme_1);




        }
    }
    //设置条目点击事件
    private OnItemClickListner listner;
    public void setClick(OnItemClickListner listner){
        this.listner=listner;
    }
}
