package duanzi.presenter;


import java.lang.ref.WeakReference;
import java.util.List;
import duanzi.bean.DZBean;
import duanzi.model.DZModel;
import duanzi.model.IDZModel;
import duanzi.view.DZView;

/**
 * Created by ruixuyao on 2018/04/27.
 */

public class DZPresenter {
    //防止内存泄漏，将view的对象使用弱引用来管理
    private WeakReference<DZView> reference;
    private final DZModel model;

    public DZPresenter(DZView view){

        model = new DZModel();
    }

    public void attachView(DZView view) {
        reference = new WeakReference<DZView>(view);
    }

    public void detachView(DZView view) {
        if (reference != null) {
            reference.clear();
            reference = null;
        }
    }
    public void getGoodsList(int page,String source,String appVersion){

        model.DZData(page, source, appVersion, new IDZModel() {
            @Override
            public void OnGetSuccessY(DZBean o) {
                List<DZBean.DataBean> data = o.getData();
                reference.get().getDZData(data);
            }
        });
    }
}
