package utils;

import android.util.Log;

import com.bw.com.onetimedemo.BuildConfig;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import api.Api;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tangxueqin on 2018/4/24.
 */

public class RetrofitUtil {
    private static RetrofitUtil RETROFIT_UTILS = null;

    private RetrofitUtil() {
    }

    public static RetrofitUtil getInData() {
        if (RETROFIT_UTILS == null){
            synchronized (RetrofitUtil.class){
                if (RETROFIT_UTILS == null){
                    RETROFIT_UTILS = new RetrofitUtil();
                }
            }
        }
        return RETROFIT_UTILS;
    }

    public  static Retrofit create() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(10, TimeUnit.SECONDS);
        builder.connectTimeout(10, TimeUnit.SECONDS);
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(interceptor);
        }
        return new Retrofit.Builder()
                .baseUrl(Api.URL)
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


}
