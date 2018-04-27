package com.bw.com.onetimedemo.model;


import android.util.Log;

import com.bw.com.onetimedemo.apis.Apiservice;
import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import utils.RetrofitUtil;

/**
 * Created by tangxueqin on 2018/4/27.
 */

public class IModel {
    /**
     * 如果在请求的过程中Activity已经退出了, 这个时候如果回到主线程去更新UI, 那么APP肯定就崩溃了
     * 使用Disposable 是个开关, 调用它的dispose()方法时就会切断水管, 使得下游收不到事件, 既然收不到事件,
     * 那么也就不会再去更新UI了. 因此我们可以在Activity中将这个Disposable 保存起来, 当Activity退出时,
     * 切断它即可.
     * RxJava中已经内置了一个容器CompositeDisposable,
     * 每当我们得到一个Disposable时就调用
     * CompositeDisposable.add()将它添加到容器中,
     * 在退出的时候, 调用CompositeDisposable.clear()
     * 即可切断所有的水管.
     */

    private CompositeDisposable disposables = new CompositeDisposable();
    public void GuanzhuData(String page,String source,String appVersion,String token,final MyOnListener listener) {
        Apiservice apiservice = RetrofitUtil.getInData().create().create(Apiservice.class);
        apiservice.getGuanZhu(page,source,appVersion,token)
                .subscribeOn(Schedulers.io())//网络是耗时操作,所以在io线程中去执行
                .observeOn(AndroidSchedulers.mainThread())//请求成功后回到主线程中
                .subscribe(new Observer<RemMenGuanZhuBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        //保存Disposable
                        disposables.add(d);
                    }

                    @Override
                    public void onNext(RemMenGuanZhuBean loginResponse) {
                        Log.d("MainActivity", "登录成功:"+loginResponse.getCode());

                        listener.OnGetSuccessY(loginResponse);
                    }

                    @Override
                    public void onError(Throwable e) {

                       // Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {
                      //  Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    }
                });

    }

}
