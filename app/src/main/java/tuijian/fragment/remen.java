package tuijian.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bw.com.onetimedemo.R;
import com.youth.banner.Banner;

import butterknife.BindView;
import tuijian.Bean.Lunbo;
import tuijian.view.Tview;

/**
 * Created by Lenovo on 2018/4/25.
 */

public class remen extends Fragment implements Tview{
    @BindView(R.id.ban)
    Banner banner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.remen, null);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //icon

    }

    @Override
    public void Success(Lunbo lunbo) {

    }
}
