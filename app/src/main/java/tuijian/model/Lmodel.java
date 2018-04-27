package tuijian.model;

import android.util.Log;
import api.Api;

import tuijian.Apiservise1;
import tuijian.Bean.Lunbo;
import utils.RetrofitUtil;

/**
 * Created by Lenovo on 2018/4/26.
 */

public class Lmodel {
//    //接口传里面
//    public void  getdata(final OnGetListener onGetListener){
//        RetrofitUtil inData = RetrofitUtil.getInData();
//        Apiservise1 retrofit = inData.getRetrofit(Api.URL, Apiservise1.class);
//        Observable<Lunbo> getlun = retrofit.getlun();
//        getlun.subscribeOn(Schedulers.io())
//         .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<Lunbo>() {
//                    @Override
//                    public void onCompleted() {
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                     Log.e("吾问无为谓无",e.getMessage()+"");
//                    }
//
//                    @Override
//                    public void onNext(Lunbo lunbo) {
//                        Log.i("的点点滴滴多",lunbo.getCode());
//                        onGetListener.OnGetSuccessM(lunbo);
//                    }
//                });
//
//
//    }
//
//    //内部接口
//    public interface OnGetListener{
//        void OnGetSuccessM(Lunbo lunbo);
//    }


}
