package com.bw.com.onetimedemo.view;

import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;

import java.util.List;

/**
 * Created by tangxueqin on 2018/4/27.
 */

public interface MyGuanZhuView {
    void getGuanZhu(List<RemMenGuanZhuBean.DataBean> batabean);
    void Error(String error);
}
