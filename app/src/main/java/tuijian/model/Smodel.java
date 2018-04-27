package tuijian.model;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import tuijian.Apiservise1;
import tuijian.Bean.Lunbo;
import tuijian.Bean.Shipin;
import utils.RetrofitUtil;

/**
 * Created by Lenovo on 2018/4/27.
 */

public class Smodel {
    public void Shipin(String s, String a, int type,int page, final OnGetListener onGetListener){
        Apiservise1 apiservise1 = RetrofitUtil.create().create(Apiservise1.class);
        Observable<Shipin> getshi = apiservise1.getshi(type, page,s,a);
        getshi.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
               .subscribe(new Observer<Shipin>() {
                   @Override
                   public void onSubscribe(Disposable d) {

                   }

                   @Override
                   public void onNext(Shipin shipin) {
                          onGetListener.OnGetSuccessM(shipin);
                   }

                   @Override
                   public void onError(Throwable e) {

                   }

                   @Override
                   public void onComplete() {

                   }
               });

    }
    public interface OnGetListener{
        void OnGetSuccessM(Shipin shipin);
    }

}
