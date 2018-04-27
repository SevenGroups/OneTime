package com.bw.com.onetimedemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShiPinZuoPinActivity extends AppCompatActivity {

    @BindView(R.id.sdv_3)
    SimpleDraweeView sdv3;
    @BindView(R.id.t_fs)
    TextView tFs;
    @BindView(R.id.t_s)
    TextView tS;
    @BindView(R.id.t_gz)
    TextView tGz;
    @BindView(R.id.jia_gz)
    TextView jiaGz;
    @BindView(R.id.x_v_shiping)
    XRecyclerView xVShiping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shi_pin_zuo_pin);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String uid = intent.getStringExtra("uid");
        String icon = intent.getStringExtra("icon");//头像
        String Nickname = intent.getStringExtra("Nickname");//昵称

        Uri uri = Uri.parse(icon);
        sdv3.setImageURI(uri);
        if (uid != null) {
            Log.i("wid+++", uid);

        }




    }
}
