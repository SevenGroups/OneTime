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
import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.bean.ShiPinZuoPinBean;
import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

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
        Uri uri1 = Uri.parse( list.get(position).getCover());
        JCVideoPlayerStandard jcVideoPlayerStandard = (JCVideoPlayerStandard) view.findViewById(R.id.img_sp);
        jcVideoPlayerStandard.TOOL_BAR_EXIST = false;
        jcVideoPlayerStandard.setUp(list.get(position).getVideoUrl(),JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL);
        Picasso.with(context).load(list.get(position).getCover()).into(jcVideoPlayerStandard.thumbImageView);
        jcVideoPlayerStandard.widthRatio = 4;//播放比例
        jcVideoPlayerStandard.heightRatio = 3;

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class GoodsViewHoder extends RecyclerView.ViewHolder{
        TextView t_ncc,itme_1,time;

        SimpleDraweeView img1;

        public GoodsViewHoder(View itemView) {
            super(itemView);
            img1 = (SimpleDraweeView) itemView.findViewById(R.id.sdv4);
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
