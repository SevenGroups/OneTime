package tuijian.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bw.com.onetimedemo.R;

import java.util.List;


import tuijian.Bean.Lunbo;
import tuijian.Bean.Shipin;
import tuijian.adapter.Sadapter;
import tuijian.presenter.Spresenter;
import tuijian.view.Tview;

/**
 * Created by Lenovo on 2018/4/25.
 */

public class guanzhu extends Fragment implements Tview{

    private RecyclerView rec;
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.guanmen,container,false);
        rec = inflate.findViewById(R.id.Re);
        Spresenter spresenter = new Spresenter(this);
        spresenter.guanS("android","101",1, 2);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void Success(Lunbo lunbo) {

    }

    @Override
    public void Shipin(Shipin shipin) {
        List<Shipin.DataBean> data = shipin.getData();
        Sadapter sadapter = new Sadapter(data, getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity() );
        rec.setLayoutManager(linearLayoutManager);
        rec.setAdapter(sadapter);
    }
}
