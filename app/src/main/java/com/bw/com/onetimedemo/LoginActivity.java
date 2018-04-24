package com.bw.com.onetimedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.login_fanhui)
    ImageView loginFanhui;
    @BindView(R.id.reg_text)
    TextView regText;
    @BindView(R.id.log_mobile)
    EditText logMobile;
    @BindView(R.id.log_password)
    EditText logPassword;
    @BindView(R.id.log_btn)
    Button logBtn;
    @BindView(R.id.updatepwd)
    TextView updatepwd;
    @BindView(R.id.you1)
    TextView you1;


    @Override
    public int bindLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initData() {
        loginFanhui.setOnClickListener(this);
        regText.setOnClickListener(this);
        you1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_fanhui:
                startActivity(MainActivity.class);
                break;
            case R.id.reg_text:
                startActivity(RegActivity.class);
                break;
            case R.id.you1:
                startActivity(ShowActivity.class);
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
