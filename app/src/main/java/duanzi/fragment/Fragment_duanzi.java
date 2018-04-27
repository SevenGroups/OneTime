package duanzi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bw.com.onetimedemo.R;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import java.util.List;
import duanzi.bean.DZBean;
import duanzi.presenter.DZPresenter;
import duanzi.view.DZView;

/**
 * Created by tangxueqin on 2018/4/25.
 */

public class Fragment_duanzi extends Fragment implements DZView{
    private XRecyclerView xrv;
    private int page;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_duanzi, container, false);
        xrv = (XRecyclerView) view.findViewById(R.id.xrv);
        DZPresenter presenter=new DZPresenter(this);
        presenter.attachView(this);
        presenter.getGoodsList(page,"android","101");
        return view;
    }

    @Override
    public void getDZData(List<DZBean.DataBean> batabean) {
        Log.i("lll",batabean.get(1).getCreateTime()+"");
    }

    @Override
    public void Error(String error) {

    }
}
