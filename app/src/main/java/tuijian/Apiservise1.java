package tuijian;



import retrofit2.http.GET;
import rx.Observable;
import tuijian.Bean.Lunbo;

/**
 * Created by tangxueqin on 2018/4/25.
 */

public interface Apiservise1 {
    @GET("uarter/getAd")
    Observable<Lunbo> getlun();
}
