package tuijian.model;

import api.Api;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import tuijian.Apiservise1;
import tuijian.Bean.Lunbo;
import utils.RetrofitUtil;

/**
 * Created by Lenovo on 2018/4/26.
 */

public class Lmodel {
    //接口传里面
    public void  getdata(final OnGetListener onGetListener ){
        RetrofitUtil inData = RetrofitUtil.getInData();
        Apiservise1 retrofit = inData.getRetrofit(Api.URL, Apiservise1.class);
        Observable<Lunbo> getlun = retrofit.getlun();
        getlun.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Lunbo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Lunbo lunbo) {
                      onGetListener.OnGetSuccessM(lunbo);
                    }
                });


    }
    //内部接口
    public interface OnGetListener{
        void OnGetSuccessM(Lunbo lunbo);
    }


}
