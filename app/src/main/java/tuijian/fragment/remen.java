package tuijian.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bw.com.onetimedemo.R;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import tuijian.Ban.ImgApp;
import tuijian.Bean.Lunbo;
import tuijian.Bean.Shipin;
import tuijian.adapter.Sadapter;
import tuijian.presenter.Lpresenter;
import tuijian.presenter.Spresenter;
import tuijian.view.Tview;

/**
 * Created by Lenovo on 2018/4/25.
 */

public class remen extends Fragment implements Tview {
    Unbinder unbinder;
    @BindView(R.id.Re)
    RecyclerView Re;
    private List<Lunbo.DataBean> lists;
    private List<String> picurl = new ArrayList<>();
    @BindView(R.id.ban)
    Banner banner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//https://www.zhaoapi.cn/quarter/getHotVideos?token=7890F536F7A382B4F26DC16819C2CD48&source=android&appVersion=101&page=1
        View inflate = inflater.inflate(R.layout.remen, null);
        unbinder = ButterKnife.bind(this, inflate);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Lpresenter lpresenter = new Lpresenter(this);
        lpresenter.Lguan();
        Spresenter spresenter = new Spresenter(this);
        spresenter.guanS("android","101",1, 1);
    }

    //icon
    @Override
    public void Success(Lunbo lunbo) {
        List<Lunbo.DataBean> data = lunbo.getData();
        for (int i = 0; i < data.size(); i++) {
            picurl.add(data.get(i).getIcon());
        }
        banner.setImageLoader(new ImgApp());
        banner.setImages(picurl);
        banner.isAutoPlay(true);
        banner.setDelayTime(1500);
        banner.start();
    }

    @Override
    public void Shipin(Shipin shipin) {
        List<Shipin.DataBean> data = shipin.getData();
        Sadapter sadapter = new Sadapter(data, getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity() );
        Re.setLayoutManager(linearLayoutManager);
        Re.setAdapter(sadapter);


    }

    @Override
    public void onStart() {
        super.onStart();
        banner.startAutoPlay();
    }

    @Override
    public void onStop() {
        super.onStop();
        banner.startAutoPlay();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
