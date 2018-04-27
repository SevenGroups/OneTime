package tuijian;
import io.reactivex.Observable;
import retrofit2.http.GET;

import retrofit2.http.Query;
import tuijian.Bean.Lunbo;
import tuijian.Bean.Shipin;


/**
 * Created by tangxueqin on 2018/4/25.
 */

public interface Apiservise1 {
    @GET("quarter/getAd")
    Observable<Lunbo> getlun();
    // Observable<RemMenGuanZhuBean> getGuanZhu(@Query("page") String page, @Query("source") String source, @Query("appVersion") String appVersion, @Query("token") String token);
    @GET("quarter/getVideos")
    Observable<Shipin> getshi(@Query("type") int type,@Query("page") int page,@Query("source") String source, @Query("appVersion") String appVersion);

}
