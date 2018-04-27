package com.bw.com.onetimedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.presenter.GuanZhuPresenter;
import com.bw.com.onetimedemo.view.MyGuanZhuView;

import java.util.List;

public class MyGuanZhuActivity extends AppCompatActivity implements MyGuanZhuView {

    private GuanZhuPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_guan_zhu);
        presenter = new GuanZhuPresenter(this);
        presenter.attachView(this);
        //page=2&source=android&appVersion=101&token=0
        presenter.getGoodsList("2","android","101","0");
    }

    @Override
    public void getGuanZhu(List<RemMenGuanZhuBean.DataBean> batabean) {

    }

    @Override
    public void Error(String error) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView(this);
    }
}
