package duanzi.model;

import duanzi.api.Apiservice2;
import duanzi.bean.DZBean;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import utils.RetrofitUtil;

/**
 * Created by ruixuyao on 2018/04/27.
 */

public class DZModel {
    private CompositeDisposable disposables = new CompositeDisposable();
    public void DZData(int page,String source,String appVersion,final IDZModel listener) {
        Apiservice2 apiservice = RetrofitUtil.getInData().create().create(Apiservice2.class);
        apiservice.getDZList(page,source,appVersion)
                .subscribeOn(Schedulers.io())//网络是耗时操作,所以在io线程中去执行
                .observeOn(AndroidSchedulers.mainThread())//请求成功后回到主线程中
                .subscribe(new Observer<DZBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        //保存Disposable
                        disposables.add(d);
                    }

                    @Override
                    public void onNext(DZBean bean) {
                        listener.OnGetSuccessY(bean);
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
