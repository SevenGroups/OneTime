package tuijian.fragment;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bw.com.onetimedemo.R;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import tuijian.Ban.ImgApp;
import tuijian.Bean.Lunbo;
import tuijian.presenter.Lpresenter;
import tuijian.view.Tview;

/**
 * Created by Lenovo on 2018/4/25.
 */

public class remen extends Fragment {
//    private List<Lunbo.DataBean> lists;
//    private List<String> picurl = new ArrayList<>();
//    @BindView(R.id.ban)
//    Banner banner;
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//
//        View inflate = inflater.inflate(R.layout.remen, null);
//        Log.e("tag","sdaad");
//
//        Lpresenter lpresenter = new Lpresenter(this);
//        lpresenter.Lguan();
//        return inflate;
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//    }
//    //icon
//    @Override
//    public void Success(Lunbo lunbo) {
//        Log.i(" fragmnent", "Success: "+lunbo.getData().get(0).getIcon());
//        List<Lunbo.DataBean> data = lunbo.getData();
//
//        lists.addAll(data);
//        for (int i = 0; i < data.size(); i++) {
//            picurl.add(data.get(i).getIcon());
//        }
//        banner.setImageLoader(new ImgApp());
//        banner.setImages(picurl);
//        banner.isAutoPlay(true);
//        banner.setDelayTime(1500);
//        banner.start();
//    }
//
//   /* @Override
//    public void onStart() {
//        super.onStart();
//        banner.startAutoPlay();
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        banner.startAutoPlay();
//    }*/
}
