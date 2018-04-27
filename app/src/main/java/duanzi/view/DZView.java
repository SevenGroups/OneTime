package duanzi.view;

import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;

import java.util.List;

import duanzi.bean.DZBean;

/**
 * Created by ruixuyao on 2018/04/27.
 */

public interface DZView {
    void getDZData(List<DZBean.DataBean> batabean);
    void Error(String error);
}
