package duanzi.bean;

import java.util.List;

/**
 * Created by ruixuyao on 2018/04/26.
 */

public class DZBean {

    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"快要毕业了，别紧张","createTime":"2018-04-26T09:11:24","imgUrls":null,"jid":2249,"praiseNum":null,"shareNum":null,"uid":10962,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"傻子","createTime":"2018-04-26T08:53:05","imgUrls":"https://www.zhaoapi.cn/images/quarter/15247039856152018-04-26_08-52-30.jpg","jid":2248,"praiseNum":null,"shareNum":null,"uid":12882,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524568491723head_icon.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"这是发布的测试数据","createTime":"2018-04-26T08:40:23","imgUrls":null,"jid":2247,"praiseNum":null,"shareNum":null,"uid":11510,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524473753240spl.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"图片","createTime":"2018-04-25T22:26:33","imgUrls":null,"jid":2246,"praiseNum":null,"shareNum":null,"uid":2561,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"嗜血任心","praiseNum":"null"}},{"commentNum":null,"content":"图片","createTime":"2018-04-25T22:24:11","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524666251358一刻钟新版接口文档v1.9.2.docx","jid":2245,"praiseNum":null,"shareNum":null,"uid":2561,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"嗜血任心","praiseNum":"null"}},{"commentNum":null,"content":"嘻嘻嘻嘻嘻嘻嘻","createTime":"2018-04-25T22:00:20","imgUrls":null,"jid":2244,"praiseNum":null,"shareNum":null,"uid":13498,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524664486967crop_photo.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"13678525955","createTime":"2018-04-25T21:43:56","imgUrls":"https://www.zhaoapi.cn/images/quarter/15246638362131521881525286.jpg|https://www.zhaoapi.cn/images/quarter/15246638362131522655634143.jpg","jid":2243,"praiseNum":null,"shareNum":null,"uid":12400,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15236793605801523679359410.png","nickname":"日出东方","praiseNum":"null"}},{"commentNum":null,"content":"韩林朔哈哈哈哈哈哈哈","createTime":"2018-04-25T20:21:52","imgUrls":null,"jid":2242,"praiseNum":null,"shareNum":null,"uid":11196,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"山外有山，人外有人","createTime":"2018-04-25T19:50:38","imgUrls":null,"jid":2241,"praiseNum":null,"shareNum":null,"uid":13158,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524616643851newHead.jpg","nickname":"12346887585","praiseNum":"null"}},{"commentNum":null,"content":"？？？？","createTime":"2018-04-25T19:37:51","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524656271681mmexport1524324799375.jpg|https://www.zhaoapi.cn/images/quarter/1524656271681yuanxiao_small.png|https://www.zhaoapi.cn/images/quarter/1524656271681head.png","jid":2240,"praiseNum":null,"shareNum":null,"uid":10811,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524134297741gaga_icon.jpg","nickname":null,"praiseNum":"null"}}]
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
         * commentNum : null
         * content : 快要毕业了，别紧张
         * createTime : 2018-04-26T09:11:24
         * imgUrls : null
         * jid : 2249
         * praiseNum : null
         * shareNum : null
         * uid : 10962
         * user : {"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private Object imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(Object imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
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
            private String nickname;
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

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
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
