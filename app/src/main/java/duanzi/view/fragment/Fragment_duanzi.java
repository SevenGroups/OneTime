package duanzi.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bw.com.onetimedemo.R;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

/**
 * Created by tangxueqin on 2018/4/25.
 */

public class Fragment_duanzi extends Fragment {
    private XRecyclerView xrv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_duanzi, container, false);
        xrv = (XRecyclerView) view.findViewById(R.id.xrv);
        return view;
    }
}
