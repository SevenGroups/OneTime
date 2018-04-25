package com.bw.com.onetimedemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.ym_fanhui)
    ImageView ymFanhui;
    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.qt_login)
    TextView qtLogin;
    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        qtLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.qt_login:
                //其他登录方式
                startActivity(LoginActivity.class);
                break;
            case R.id.btn1:
                //微信登录
                break;
            case R.id.btn2:
                //qq登录
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
