package duanzi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bw.com.onetimedemo.R;
import java.util.List;
import duanzi.bean.DZBean;

/**
 * Created by ruixuyao on 2018/04/27.
 */

public class MyXRVAdapter extends RecyclerView.Adapter<MyXRVAdapter.MyViewHoder>{
    private Context context;
    private List<DZBean.DataBean> batabean;

    public MyXRVAdapter(Context context, List<DZBean.DataBean> batabean) {
        this.context = context;
        this.batabean = batabean;
    }

    @Override
    public MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        MyViewHoder viewHoder=new MyViewHoder(view);
        return viewHoder;
    }

    @Override
    public void onBindViewHolder(MyViewHoder holder, int position) {
        Glide.with(context).load(batabean.get(position).getUser().getIcon()).error(R.mipmap.ic_launcher).into(holder.dz_img);
        holder.dz_title.setText(batabean.get(position).getUser().getNickname());
        holder.dz_time.setText(batabean.get(position).getCreateTime());
        holder.dz_nr.setText(batabean.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return batabean.size();
    }

    class MyViewHoder extends RecyclerView.ViewHolder{
        private ImageView dz_img,dz_add;
        private TextView dz_nr,dz_time,dz_title;
        public MyViewHoder(View itemView) {
            super(itemView);
            dz_img =(ImageView) itemView.findViewById(R.id.dz_img);
            dz_nr = (TextView) itemView.findViewById(R.id.dz_nr);
            dz_time = (TextView) itemView.findViewById(R.id.dz_time);
            dz_title = (TextView) itemView.findViewById(R.id.dz_title);
        }
    }
}
