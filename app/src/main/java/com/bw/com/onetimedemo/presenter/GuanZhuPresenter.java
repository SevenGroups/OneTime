package com.bw.com.onetimedemo.presenter;

import android.util.Log;

import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.model.IModel;
import com.bw.com.onetimedemo.model.MyOnListener;
import com.bw.com.onetimedemo.view.MyGuanZhuView;

import java.lang.ref.WeakReference;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tangxueqin on 2018/4/27.
 */

public class GuanZhuPresenter {

    //防止内存泄漏，将view的对象使用弱引用来管理
    private WeakReference<MyGuanZhuView> reference;
    private final IModel model;

    public GuanZhuPresenter(MyGuanZhuView view){

        model = new IModel();
    }

    public void attachView(MyGuanZhuView view) {
        reference = new WeakReference<MyGuanZhuView>(view);
    }

    public void detachView(MyGuanZhuView view) {
        if (reference != null) {
            reference.clear();
            reference = null;
        }
    }
    public void getGoodsList(String page,String source,String appVersion,String token){

        model.GuanzhuData(page, source, appVersion, token, new MyOnListener() {
            @Override
            public void OnGetSuccessY(RemMenGuanZhuBean o) {
                List<RemMenGuanZhuBean.DataBean> data = o.getData();
                reference.get().getGuanZhu(data);
            }
        });
    }

}
