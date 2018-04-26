package com.bw.com.onetimedemo;
import base.BaseActivity;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import duanzi.view.fragment.Fragment_duanzi;
import shiping.view.fragment.Fragment_shiping;
import tuijian.fragment.tuijian;


public class ShowActivity extends BaseActivity {

    private FrameLayout zhan;
    private RadioGroup gr;

    private RadioButton zx,hq;
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

    }
}
