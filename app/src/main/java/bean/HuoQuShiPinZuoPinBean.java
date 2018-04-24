package bean;

import java.util.List;

/**
 * Created by tangxueqin on 2018/4/24.
 * 获取视频作品列表
 */

public class HuoQuShiPinZuoPinBean {

    /**
     * msg : 获取作品列表成功
     * code : 0
     * data : [{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524566275788nv.png","createTime":"2018-04-24T18:37:55","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13315,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524566275788recording131412904.mp4","wid":406,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524566270687nv.png","createTime":"2018-04-24T18:37:50","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13315,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524566270687recording131412904.mp4","wid":405,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524566254086nv.png","createTime":"2018-04-24T18:37:34","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13315,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524566254086recording131412904.mp4","wid":404,"workDesc":"这个视屏非常好看！"},{"commentNum":1,"comments":[{"cid":342,"content":"长得真丑","createTime":"2018-04-24T18:33:58","jid":null,"mvp":null,"nickname":"你吃饱了没","praiseNum":0,"uid":11555,"wid":403}],"cover":"https://www.zhaoapi.cn/images/quarter/1524557798691head.jpg","createTime":"2018-04-24T16:16:38","favoriteNum":1,"latitude":"39.1","localUri":null,"longitude":"32.1","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/152455779869113e25496-c4bb-499d-bb3d-4c63da1e1afb.mp4","wid":403,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524540749654recording-1810679520.mp4","createTime":"2018-04-24T11:32:29","favoriteNum":1,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13563,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524558224428nv.png","nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524540749654recording-1810679520.mp4","wid":402,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524539968971recording-1736455582.mp4","createTime":"2018-04-24T11:19:28","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13563,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524558224428nv.png","nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524539968971recording-1736455582.mp4","wid":401,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524539343004head.jpg","createTime":"2018-04-24T11:09:03","favoriteNum":0,"latitude":"39.1","localUri":null,"longitude":"32.1","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524539343004e480e5f0-2f4a-4268-9364-1a78ede8be76.mp4","wid":400,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524538435554head.jpg","createTime":"2018-04-24T10:53:55","favoriteNum":0,"latitude":"39.1","localUri":null,"longitude":"32.1","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/152453843555408641fc6-ba4d-4bc8-b473-4b68c60869eb.mp4","wid":399,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524533292526head.jpg","createTime":"2018-04-24T09:28:12","favoriteNum":1,"latitude":"39.1","localUri":null,"longitude":"32.1","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524533292526e3d88e67-855e-4032-b7fd-652d8cf02340.mp4","wid":398,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524529284756head.jpg","createTime":"2018-04-24T08:21:24","favoriteNum":0,"latitude":"39.1","localUri":null,"longitude":"32.1","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524529284756c9f54dd8-5400-4fe8-b6ae-46a88d1a9d5f.mp4","wid":397,"workDesc":null}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * commentNum : 0
         * comments : []
         * cover : https://www.zhaoapi.cn/images/quarter/1524566275788nv.png
         * createTime : 2018-04-24T18:37:55
         * favoriteNum : 0
         * latitude : 39.95
         * localUri : null
         * longitude : 116.30
         * playNum : 0
         * praiseNum : 0
         * uid : 13315
         * user : {"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}
         * videoUrl : https://www.zhaoapi.cn/images/quarter/1524566275788recording131412904.mp4
         * wid : 406
         * workDesc : 这个视屏非常好看！
         */

        private int commentNum;
        private String cover;
        private String createTime;
        private int favoriteNum;
        private String latitude;
        private Object localUri;
        private String longitude;
        private int playNum;
        private int praiseNum;
        private int uid;
        private UserBean user;
        private String videoUrl;
        private int wid;
        private String workDesc;
        private List<?> comments;

        public int getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(int commentNum) {
            this.commentNum = commentNum;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public int getFavoriteNum() {
            return favoriteNum;
        }

        public void setFavoriteNum(int favoriteNum) {
            this.favoriteNum = favoriteNum;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public Object getLocalUri() {
            return localUri;
        }

        public void setLocalUri(Object localUri) {
            this.localUri = localUri;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public int getPlayNum() {
            return playNum;
        }

        public void setPlayNum(int playNum) {
            this.playNum = playNum;
        }

        public int getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(int praiseNum) {
            this.praiseNum = praiseNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public int getWid() {
            return wid;
        }

        public void setWid(int wid) {
            this.wid = wid;
        }

        public String getWorkDesc() {
            return workDesc;
        }

        public void setWorkDesc(String workDesc) {
            this.workDesc = workDesc;
        }

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : null
             * nickname : null
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private Object icon;
            private Object nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public Object getIcon() {
                return icon;
            }

            public void setIcon(Object icon) {
                this.icon = icon;
            }

            public Object getNickname() {
                return nickname;
            }

            public void setNickname(Object nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}
