package com.bw.com.onetimedemo.presenter;

import android.view.View;

import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.bean.ShiPinZuoPinBean;
import com.bw.com.onetimedemo.model.IModel;
import com.bw.com.onetimedemo.model.MyOnListener;
import com.bw.com.onetimedemo.view.MyGuanZhuView;
import com.bw.com.onetimedemo.view.ShiPinGuanZhuView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by tangxueqin on 2018/4/27.
 */

public class ShiPInZuoPinPresenter {

    //防止内存泄漏，将view的对象使用弱引用来管理
    private WeakReference<ShiPinGuanZhuView> reference;
    private final IModel model;

    public ShiPInZuoPinPresenter(ShiPinGuanZhuView view){

        model = new IModel();
    }

    public void attachView(ShiPinGuanZhuView view) {
        reference = new WeakReference<ShiPinGuanZhuView>(view);
    }

    public void detachView(ShiPinGuanZhuView view) {
        if (reference != null) {
            reference.clear();
            reference = null;
        }
    }
    public void getGoodsList(String uid,String page,String source,String appVersion,String token){

        model.ShiPinZuoPinData(uid,page, source, appVersion, token, new IModel.MyOnListener1(){

            @Override
            public void OnGetSuccessZ(ShiPinZuoPinBean o) {
                List<ShiPinZuoPinBean.DataBean> data = o.getData();
                reference.get().getShiPinZuoPin(data);
            }
        });
    }



}
