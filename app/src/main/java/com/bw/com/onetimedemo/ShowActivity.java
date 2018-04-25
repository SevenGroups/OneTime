package com.bw.com.onetimedemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import base.BaseActivity;
import duanzi.view.fragment.Fragment_duanzi;
import shiping.view.fragment.Fragment_shiping;
import tuijian.view.fragment.Fragment_tuijian;

public class ShowActivity extends BaseActivity {

    private FrameLayout zhan;
    private RadioGroup gr;
<<<<<<< HEAD
    private RadioButton sy,zx,hq;
    private void setTextColor(RadioButton sy,RadioButton zx,RadioButton hq){
        sy.setTextColor(Color.BLUE);
        zx.setTextColor(Color.BLACK);
        hq.setTextColor(Color.BLACK);
    }
=======
    private RadioButton sy;


>>>>>>> a035e0783f98ccd9c752614d4a51ab3bb8ea9a0a
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
                replace(R.id.zhan,new Fragment_tuijian()).commit();

        gr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.shouye:
                        getSupportFragmentManager().beginTransaction().
                                replace(R.id.zhan,new Fragment_tuijian()).commit();
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
