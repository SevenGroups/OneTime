package com.bw.com.onetimedemo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
<<<<<<< HEAD
=======

import base.BaseActivity;
>>>>>>> a035e0783f98ccd9c752614d4a51ab3bb8ea9a0a
import duanzi.view.fragment.Fragment_duanzi;
import shiping.view.fragment.Fragment_shiping;
import tuijian.view.Fragment.Fragment_tuijian;

public class ShowActivity extends BaseActivity {

    private FrameLayout zhan;
    private RadioGroup gr;
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
                        break;
                    case R.id.zixuan:
                        getSupportFragmentManager().beginTransaction().
                                replace(R.id.zhan,new Fragment_duanzi()).commit();
                        break;
                    case R.id.hangqing:
                        getSupportFragmentManager().beginTransaction().
                                replace(R.id.zhan,new Fragment_shiping()).commit();
                        break;

                }
            }
        });

    }
}
