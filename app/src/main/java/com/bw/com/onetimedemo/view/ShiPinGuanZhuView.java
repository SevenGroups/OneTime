package com.bw.com.onetimedemo.view;

import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.bean.ShiPinZuoPinBean;

import java.util.List;

/**
 * Created by tangxueqin on 2018/4/27.
 */

public interface ShiPinGuanZhuView {
    void getShiPinZuoPin(List<ShiPinZuoPinBean.DataBean> batabean);
    void Error(String error);
}
