package tuijian;
import io.reactivex.Observable;
import retrofit2.http.GET;

import tuijian.Bean.Lunbo;


/**
 * Created by tangxueqin on 2018/4/25.
 */

public interface Apiservise1 {
    @GET("quarter/getAd")
    Observable<Lunbo> getlun();
}
