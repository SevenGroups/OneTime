package bean;

import java.util.List;

/**
 * Created by tangxueqin on 2018/4/24.
 * 获取某个用户的视频作品集
 */

public class UserShiPinBean {

    /**
     * msg : 获取作品列表成功
     * code : 0
     * data : []
     */

    private String msg;
    private String code;
    private List<?> data;

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

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
