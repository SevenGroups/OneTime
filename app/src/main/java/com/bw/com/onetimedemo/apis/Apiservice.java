package com.bw.com.onetimedemo.apis;

import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by tangxueqin on 2018/4/27.
 */

public interface Apiservice {
    //热门关注quarter/getHotVideos?page=2&source=android&appVersion=101&token=0
    @GET("quarter/getHotVideos")
    Observable<RemMenGuanZhuBean> getGuanZhu(@Query("page") String page, @Query("source") String source, @Query("appVersion") String appVersion, @Query("token") String token);

}
