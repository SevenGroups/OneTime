package tuijian.model;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import tuijian.Apiservise1;
import tuijian.Bean.Lunbo;
import utils.RetrofitUtil;

/**
 * Created by Lenovo on 2018/4/26.
 */

public class Lmodel {
    //接口传里面
    public void  getdata(final OnGetListener onGetListener){
        Retrofit retrofit = RetrofitUtil.create();
        Apiservise1 apiservise1 = retrofit.create(Apiservise1.class);
        Observable<Lunbo> getlun = apiservise1.getlun();
        getlun.subscribeOn(Schedulers.io())
         .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Lunbo>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Lunbo lunbo) {
                        onGetListener.OnGetSuccessM(lunbo);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }

    //内部接口
    public interface OnGetListener{
        void OnGetSuccessM(Lunbo lunbo);
    }


}
