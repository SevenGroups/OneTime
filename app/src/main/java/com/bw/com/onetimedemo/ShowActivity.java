package com.bw.com.onetimedemo;



import android.graphics.Color;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import tuijian.fragment.tuijian;

import com.bw.com.onetimedemo.adapter.MysidepullAdapter;
import com.bw.com.onetimedemo.adapter.OnItemClickListner;
import com.bw.com.onetimedemo.bean.SidePullBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import base.BaseActivity;
import duanzi.view.fragment.Fragment_duanzi;
import shiping.view.fragment.Fragment_shiping;

public class ShowActivity extends BaseActivity {

    private FrameLayout zhan;
    private RadioGroup gr;
    private RadioButton zx,hq;
    private SimpleDraweeView sdv,sdv1;
    private String imageUrl = "http://a.hiphotos.baidu.com/image/pic/item/314e251f95cad1c847e70404733e6709c93d51b1.jpg";
    private DrawerLayout drawerLayout;
    private RelativeLayout menu;
    private TextView nc,text_gxqm,yjms;
    private RecyclerView r_v;
    private RadioGroup radio_group;
    private RadioButton radio_wdzp,radio_sz;
    private List<SidePullBean> list=new ArrayList<>();

    private void setTextColor(RadioButton sy,RadioButton zx,RadioButton hq){
        sy.setTextColor(Color.BLUE);
        zx.setTextColor(Color.BLACK);
        hq.setTextColor(Color.BLACK);
    }

    private RadioButton sy;


    @Override
    public int bindLayout() {
        return R.layout.activity_show;
    }

    @Override
    public void initData() {
        //找控件
        zhan = (FrameLayout)findViewById(R.id.zhan);
        gr = (RadioGroup) findViewById(R.id.gr);
        sy = (RadioButton) findViewById(R.id.shouye);
        zx = (RadioButton) findViewById(R.id.zixuan);
        hq = (RadioButton) findViewById(R.id.hangqing);
        sdv = (SimpleDraweeView) findViewById(R.id.sdv);
        sdv1 = (SimpleDraweeView) findViewById(R.id.sdv1);//侧拉页面的头像
        nc = (TextView) findViewById(R.id.text_nc);//昵称
        text_gxqm = (TextView) findViewById(R.id.text_gxqm);//个性签名
        r_v = (RecyclerView) findViewById(R.id.recycler_view);//侧拉列表
         yjms =(TextView) findViewById(R.id.text_yjms);//夜间模式
        radio_group = (RadioGroup) findViewById(R.id.radio_group1);
        radio_wdzp = (RadioButton) findViewById(R.id.radio_wdzp);
        radio_sz = (RadioButton) findViewById(R.id.radio_sz);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        menu = (RelativeLayout) findViewById(R.id.menu);
        sdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(menu);//打开菜单
            }
        });
        //Fresco的简单使用
        Uri uri = Uri.parse(imageUrl);
        sdv.setImageURI(uri);
        sdv1.setImageURI(uri);
        setImageSize();

        //设置初始fragment页面
        getSupportFragmentManager().beginTransaction().
                replace(R.id.zhan,new tuijian()).commit();

        gr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.shouye:
                        getSupportFragmentManager().beginTransaction().
                                replace(R.id.zhan,new tuijian()).commit();
                        setTextColor(sy,zx,hq);
                        break;
                    case R.id.zixuan:
                        getSupportFragmentManager().beginTransaction().
                                replace(R.id.zhan,new Fragment_duanzi()).commit();
                        setTextColor(zx,sy,hq);
                        break;
                    case R.id.hangqing:
                        getSupportFragmentManager().beginTransaction().
                                replace(R.id.zhan,new Fragment_shiping()).commit();
                        setTextColor(hq,sy,zx);
                        break;

                }
            }
        });
        SidePullBean bean=new SidePullBean(R.drawable.raw_1499933216,"我的关注");
        SidePullBean bean1=new SidePullBean(R.drawable.raw_1499947358,"我的收藏");
        SidePullBean bean2=new SidePullBean(R.drawable.raw_1499946865,"搜索好友");
        SidePullBean bean3=new SidePullBean(R.drawable.raw_1499947389,"消息通知");
        list.add(bean);
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);
        MysidepullAdapter adapter=new MysidepullAdapter(this,list);
        r_v.setLayoutManager(new LinearLayoutManager(ShowActivity.this));
        r_v.setAdapter(adapter);
        adapter.setClick(new OnItemClickListner() {
            @Override
            public void onItemClick(View view, int cid) {
                Log.i("+++",cid+"");
                switch (cid){
                    case 0:
                        startActivity(MyGuanZhuActivity.class);
                        break;
                }
            }
        });



    }
    /**
     * 动态设置图片大小
     */
    private void setImageSize() {
        final WindowManager manager = this.getWindowManager();
        //得出屏幕宽度
        DisplayMetrics outMetrics = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(outMetrics);
        int widthPixels = outMetrics.widthPixels;
        //重新计算高度
        ViewGroup.LayoutParams layoutParams = menu.getLayoutParams();
        layoutParams.width = (int) (0.778 * widthPixels);
        menu.setLayoutParams(layoutParams);
    }
    
}
