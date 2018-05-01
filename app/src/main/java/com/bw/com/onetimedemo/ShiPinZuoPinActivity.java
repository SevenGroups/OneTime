package com.bw.com.onetimedemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.com.onetimedemo.adapter.ShiPinZuoPinAdapter;
import com.bw.com.onetimedemo.bean.ShiPinZuoPinBean;
import com.bw.com.onetimedemo.presenter.ShiPInZuoPinPresenter;
import com.bw.com.onetimedemo.view.ShiPinGuanZhuView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

import base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ShiPinZuoPinActivity extends BaseActivity implements ShiPinGuanZhuView ,View.OnClickListener{

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
    @BindView(R.id.ic_fh)
    ImageView icFh;
    private String uid;
    private String icon;
    private String nickname;

    @Override
    public int bindLayout() {
        return R.layout.activity_shi_pin_zuo_pin;
    }

    @Override
    public void initData() {
        Intent intent = getIntent();
        uid = intent.getStringExtra("uid");
        //头像
        icon = intent.getStringExtra("icon");
        //昵称
        nickname = intent.getStringExtra("Nickname");
        icFh.setOnClickListener(this);
        Uri uri = Uri.parse(icon);
        sdv3.setImageURI(uri);
        if (uid != null) {
            Log.i("wid+++", uid);

        }
        xVShiping.setLayoutManager(new LinearLayoutManager(ShiPinZuoPinActivity.this));
        ShiPInZuoPinPresenter presenter = new ShiPInZuoPinPresenter(this);
        presenter.attachView(this);
        presenter.getGoodsList(uid, "1", "android", "101", "0");
    }

    @Override
    public void getShiPinZuoPin(List<ShiPinZuoPinBean.DataBean> batabean) {
        ShiPinZuoPinAdapter adapter = new ShiPinZuoPinAdapter(ShiPinZuoPinActivity.this, batabean, icon, nickname);
        xVShiping.setAdapter(adapter);
    }

    @Override
    public void Error(String error) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ic_fh:
                finish();
                break;
        }
    }
}
