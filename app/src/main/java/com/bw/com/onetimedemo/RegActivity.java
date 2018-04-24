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

public class RegActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.reg_fanhui)
    ImageView regFanhui;
    @BindView(R.id.reg_1_text)
    TextView reg1Text;
    @BindView(R.id.reg_mobile)
    EditText regMobile;
    @BindView(R.id.reg_password)
    EditText regPassword;
    @BindView(R.id.reg_btn)
    Button regBtn;
    @BindView(R.id.you2)
    TextView you2;


    @Override
    public int bindLayout() {
        return R.layout.activity_reg;
    }

    @Override
    public void initData() {
        regFanhui.setOnClickListener(this);
        reg1Text.setOnClickListener(this);
        you2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.reg_fanhui:
                startActivity(LoginActivity.class);
                break;
            case R.id.reg_1_text:
                startActivity(LoginActivity.class);
                break;
            case R.id.you2:
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
