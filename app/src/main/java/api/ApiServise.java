package api;

import bean.BanBenGengXinBean;
import bean.FaBuDuanZiBean;
import bean.GengGaiPwdBean;
import bean.GuangGaoBean;
import bean.HuoQuDuanZiBean;
import bean.HuoQuShiPinZuoPinBean;
import bean.LoginBean;
import bean.RegBean;
import bean.ShangChuanTouXiangBean;
import bean.UserBean;
import bean.UserShiPinBean;
import bean.WangJiPwdBean;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by tangxueqin on 2018/4/24.
 * 公共参数：token=、source=android、appVersion=101
 强制要求：使用okhttp拦截器，封装这些公共请求参数，必须retrofit做为网络请求框架，两者之间关联起来
 */

public interface ApiServise {
    //广告接口https://www.zhaoapi.cn/quarter/getAd
    @GET("quarter/getAd")
    Observable<GuangGaoBean> getGuangGao();
    //版本更新https://www.zhaoapi.cn/quarter/getVersion
    @GET("quarter/getVersion")
    Observable<BanBenGengXinBean> getBanBenGengXin();
    //登录https://www.zhaoapi.cn/user/login?mobile=15282234654&password=123456
    @GET("user/login")
    Observable<LoginBean> getLogin(@Query("mobile") String mobile,@Query("password") String password);
    //本地注册https://www.zhaoapi.cn/quarter/register?regType=0&mobile=15282234654&password=123456
    @GET("quarter/register")
    Observable<RegBean> getReg(@Query("regType") String regType, @Query("mobile") String mobile,@Query("password") String password);
    //修改密码https://www.zhaoapi.cn/quarter/resetPass?uid=1&oldPassword=123456&newPassword=23456
    @GET("quarter/resetPass")
    Observable<GengGaiPwdBean> getGengGaiPwd(@Query("uid") String uid, @Query("oldPassword") String oldPassword, @Query("newPassword") String newPassword);
    //忘记密码https://www.zhaoapi.cn/quarter/getPass?mobile=15282234654&newPass=123456&token=0
    @GET("quarter/getPass")
    Observable<WangJiPwdBean> getWangJiPwd(@Query("mobile") String mobile, @Query("newPass") String newPass, @Query("token") String token);
    //上传头像https://www.zhaoapi.cn/file/upload?uid=1&file=?&token=0
    @GET("file/upload")
    Observable<ShangChuanTouXiangBean> getShangChuanTouXiang(@Query("uid") String uid, @Query("file") String file, @Query("token") String token);
    //获取用户信息https://www.zhaoapi.cn/user/getUserInfo?uid=1&token=0
    @GET("user/getUserInfo")
    Observable<UserBean> getShangChuanTouXiang(@Query("uid") String uid, @Query("token") String token);
    //修改昵称https://www.zhaoapi.cn/user/updateNickName?uid=1&nickname=糖糖&token=0

    //发布段子https://www.zhaoapi.cn/quarter/publishJoke?uid=1&content=%E5%91%B5%E5%91%B5&token=0&source=android&appVersion=101
    @GET("quarter/publishJoke")
    Observable<FaBuDuanZiBean> getFaBuDuanZi(@Query("uid") String uid, @Query("content") String content,@Query("token") String token);
    //获取段子列表https://www.zhaoapi.cn/quarter/getJokes?page=1&token=0
    @GET("quarter/getJokes")
    Observable<HuoQuDuanZiBean> getHuoQuDuanZi(@Query("page") String page, @Query("token") String token);
    //11.发布视频作品
    //12.获取视频作品列表https://www.zhaoapi.cn/quarter/getVideos?uid=是&type=1&page=1&source=android&appVersion=101
    @GET("quarter/getVideos")
    Observable<HuoQuShiPinZuoPinBean> getHuoQuShiPinZuoPin(@Query("uid") String uid, @Query("type") String type,@Query("page") String page);
    //获取某个用户的视频作品集https://www.zhaoapi.cn/quarter/getUserVideos?uid=是&page=1
    @GET("quarter/getUserVideos")
    Observable<UserShiPinBean> getUserShiPin(@Query("uid") String uid, @Query("page") String page);
    //14.关注https://www.zhaoapi.cn/quarter/follow?uid=1&followId=2&token=0
    //15.获取关注用户列表 接口地址：https://www.zhaoapi.cn/quarter/getFollowUsers?uid=1&token=0
    //16作品点赞 接口地址：https://www.zhaoapi.cn/quarter/praise?uid=1&wid=1&token=0
    //17.收藏作品 接口地址：https://www.zhaoapi.cn/quarter/addFavorite?uid=1&wid=1&token=0
    //18.取消收藏 接口地址：https://www.zhaoapi.cn/quarter/cancelFavorite?uid=1&wid=1&token=0
    //19.作品评论 接口地址：https://www.zhaoapi.cn/quarter/comment?uid=1&wid=1&content=你就&token=0
    //20.视频作品详情 接口地址：https://www.zhaoapi.cn/quarter/getVideoDetail?wid=1
    //21.段子详情 接口地址：https://www.zhaoapi.cn/quarter/getJokeDetail?jid=1
    //21.段子点赞 接口地址：https://www.zhaoapi.cn/quarter/jokePraise?uid=1&jid=1
    //22.段子评论 接口地址：https://www.zhaoapi.cn/quarter/commentJoke?uid=1&jid=1
    //23.随机钟友 接口地址：https://www.zhaoapi.cn/quarter/randomFriends
    //24.搜索钟友 接口地址：https://www.zhaoapi.cn/quarter/searchFriends?keywords=关键词&page=1
    //25.获取热门视频列表 接口地址：https://www.zhaoapi.cn/quarter/getHotVideos?page=1
    //26.获取附近视频列表 接口地址：https://www.zhaoapi.cn/quarter/getNearVideos?page=1&latitude=纬度&longitude=经度
    //27.删除收藏 接口地址：https://www.zhaoapi.cn/quarter/removeFavorite?uid=1&fid=纬度
    //28.删除作品 接口地址：https://www.zhaoapi.cn/quarter/removeWork?uid=1&wid=1
    //29.获取作品个人中心（新增） 接口地址：https://www.zhaoapi.cn/quarter/getWorkInfo?uid=1
    //30.收藏列表 接口地址：https://www.zhaoapi.cn/quarter/getFavorites?uid=1
    //31.修改年龄 接口地址：https://www.zhaoapi.cn/user/updateAge?uid=1&age=日期字符串





}
