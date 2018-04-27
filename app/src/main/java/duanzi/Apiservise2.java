package duanzi;

import duanzi.view.bean.DZBean;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by tangxueqin on 2018/4/25.
 */

public interface Apiservise2 {
    //https://www.zhaoapi.cn/quarter/getJokes?page=1&source=android&appVersion=101
    @GET("quarter/getJokes")
    Observable<DZBean> getDZList(@Query("page") String page);
}
