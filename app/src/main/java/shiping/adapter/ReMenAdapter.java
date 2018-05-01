package shiping.adapter;

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
import com.bw.com.onetimedemo.adapter.OnItemClickListner;
import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import shiping.view.activity.KanShiPinActivity;

/**
 * Created by tangxueqin on 2018/4/26.
 */

public class ReMenAdapter extends RecyclerView.Adapter<ReMenAdapter.GoodsViewHoder>{
    private Context context;
    private List<RemMenGuanZhuBean.DataBean> list;
    private View view;

    public ReMenAdapter(Context context, List<RemMenGuanZhuBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public GoodsViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context).inflate(R.layout.itme_remen_layout, parent,false);


        return new GoodsViewHoder(view);
    }

    @Override
    public void onBindViewHolder(GoodsViewHoder holder,final int position) {




        Glide.with(context).load(list.get(position).getCover()).error(R.mipmap.ic_launcher).into(holder.img);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,KanShiPinActivity.class);
                intent.putExtra("uid", list.get(position).getUid()+"");
                intent.putExtra("icon",list.get(position).getUser().getIcon());
                intent.putExtra("mp4",list.get(position).getVideoUrl());
                intent.putExtra("cover",list.get(position).getCover());


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


        public GoodsViewHoder(View itemView) {
            super(itemView);


            img =(ImageView) itemView.findViewById(R.id.img1);




        }
    }
    //设置条目点击事件
    private OnItemClickListner listner;
    public void setClick(OnItemClickListner listner){
        this.listner=listner;
    }
}
