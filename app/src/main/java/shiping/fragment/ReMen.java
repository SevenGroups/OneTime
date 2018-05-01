package shiping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bw.com.onetimedemo.MyGuanZhuActivity;
import com.bw.com.onetimedemo.R;
import com.bw.com.onetimedemo.bean.RemMenGuanZhuBean;
import com.bw.com.onetimedemo.presenter.GuanZhuPresenter;
import com.bw.com.onetimedemo.view.MyGuanZhuView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import shiping.adapter.ReMenAdapter;

/**
 * Created by ruixuyao on 2018/04/27.
 */

public class ReMen extends Fragment implements MyGuanZhuView{
    @BindView(R.id.x_rv1)
    XRecyclerView xRv1;
    Unbinder unbinder;
    private GuanZhuPresenter presenter;
    private ReMenAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.remen_layout, null);

        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        presenter = new GuanZhuPresenter(this);
        presenter.attachView(this);
        xRv1.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        //page=2&source=android&appVersion=101&token=0
        presenter.getGoodsList("1", "android", "101", "0");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void getGuanZhu(List<RemMenGuanZhuBean.DataBean> batabean) {
        adapter = new ReMenAdapter(getActivity(),batabean);
        xRv1.setAdapter(adapter);
    }

    @Override
    public void Error(String error) {

    }
}
