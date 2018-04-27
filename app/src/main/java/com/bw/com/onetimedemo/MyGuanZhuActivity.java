package com.bw.com.onetimedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.bw.com.onetimedemo.adapter.GuanZhuAdapter;
import com.bw.com.onetimedemo.adapter.OnItemClickListner;
import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.presenter.GuanZhuPresenter;
import com.bw.com.onetimedemo.view.MyGuanZhuView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

import base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MyGuanZhuActivity extends BaseActivity implements MyGuanZhuView,View.OnClickListener {

    @BindView(R.id.t_fh)
    TextView tFh;
    @BindView(R.id.t_gz)
    TextView tGz;
    @BindView(R.id.t_rmgz)
    TextView tRmgz;
    @BindView(R.id.edit_text)
    EditText editText;
    @BindView(R.id.x_v_gz)
    XRecyclerView xVGz;
    private GuanZhuPresenter presenter;
    private GuanZhuAdapter adapter;


    @Override
    public int bindLayout() {
        return R.layout.activity_my_guan_zhu;
    }

    @Override
    public void initData() {
        presenter = new GuanZhuPresenter(this);
        presenter.attachView(this);
        xVGz.setLayoutManager(new LinearLayoutManager(MyGuanZhuActivity.this));
        //page=2&source=android&appVersion=101&token=0
        presenter.getGoodsList("2", "android", "101", "0");
        tFh.setOnClickListener(this);
        tGz.setOnClickListener(this);
        tRmgz.setOnClickListener(this);
        editText.setOnClickListener(this);

    }

    @Override
    public void getGuanZhu(final List<RemMenGuanZhuBean.DataBean> batabean) {

        adapter = new GuanZhuAdapter(this,batabean);
        xVGz.setAdapter(adapter);

    }

    @Override
    public void Error(String error) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.t_fh:
                //返回
               tFh.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       finish();
                   }
               });
                break;
            case R.id.t_gz:
                //我的关注
                break;
            case R.id.t_rmgz:
                //热门关注
                tRmgz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tGz.setText("热门关注");
                        editText.setVisibility(View.VISIBLE);

                    }
                });
                break;
            case R.id.edit_text:
                //输入框 搜索
                break;
        }

    }
}
