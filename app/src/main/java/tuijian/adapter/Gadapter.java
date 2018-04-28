package tuijian.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.com.onetimedemo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
import tuijian.Bean.Shipin;

/**
 * Created by Lenovo on 2018/4/27.
 */

public class Gadapter extends RecyclerView.Adapter<Gadapter.Sviewholder> {
    List<Shipin.DataBean> shipin;
    Context context;
    private View inflate;

    public Gadapter(List<Shipin.DataBean> shipin, Context context) {
        this.shipin = shipin;
        this.context = context;
    }

    @Override
    public Sviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflate = View.inflate(context, R.layout.guan,null);
        Sviewholder sviewholder = new Sviewholder(inflate);
        return sviewholder;
    }

    @Override
    public void onBindViewHolder(Sviewholder holder, int position) {
         holder.biao.setText(shipin.get(position).getWorkDesc());
         holder.time.setText(shipin.get(position).getCreateTime());
         holder.name.setText( shipin.get(position).getUser().getNickname()+"");
         Picasso.with(context).load(shipin.get(position).getCover()).into(holder.im);
        JCVideoPlayerStandard jcVideoPlayerStandard = (JCVideoPlayerStandard) inflate.findViewById(R.id.videoplayer);
        jcVideoPlayerStandard.TOOL_BAR_EXIST = false;
        jcVideoPlayerStandard.setUp(shipin.get(position).getVideoUrl()
                ,JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL);
        Picasso.with(context).load(shipin.get(position).getUser().getIcon()).into(jcVideoPlayerStandard.thumbImageView);
        jcVideoPlayerStandard.widthRatio = 4;//播放比例
        jcVideoPlayerStandard.heightRatio = 3;
    }

    @Override
    public int getItemCount() {
        return shipin.size();
    }

    class Sviewholder extends RecyclerView.ViewHolder{
        public ImageView im;
        public TextView name,time,biao;
        public Sviewholder(View itemView) {
            super(itemView);
         biao=   itemView.findViewById(R.id.biao);
          im=itemView.findViewById(R.id.im);
          name= itemView.findViewById(R.id.te_name);
          time=itemView.findViewById(R.id.time);
        }
    }
}
