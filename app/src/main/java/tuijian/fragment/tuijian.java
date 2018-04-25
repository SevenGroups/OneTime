package tuijian.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TableLayout;

import com.bw.com.onetimedemo.R;

import butterknife.BindView;

/**
 * Created by Lenovo on 2018/4/25.
 */
     //TableLayout+Viewpager+Fragmnet
public class tuijian extends Fragment {
    private TableLayout tab;
    private ViewParent vp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_tuijian, null);
        tab = inflate.findViewById(R.id.tl_tab);
        vp = inflate.findViewById(R.id.vp_pager);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }
}
