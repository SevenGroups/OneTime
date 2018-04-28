package shiping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bw.com.onetimedemo.R;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by tangxueqin on 2018/4/25.
 */

public class Fragment_shiping extends Fragment {
    @BindView(R.id.sp_tab)
    TabLayout mSpTab;
    @BindView(R.id.sp_pager)
    ViewPager mSpPager;
    private View view;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shiping, container, false);
        unbinder = ButterKnife.bind(this, view);
        mSpTab.setTabGravity(TabLayout.GRAVITY_FILL);
        mSpTab.setTabMode(TabLayout.MODE_FIXED);
        final List<String> list = new ArrayList<>();
        //add 2条数据,作为tablayout标签
        list.add("热门");
        list.add("附近");
        mSpPager.setOffscreenPageLimit(list.size());
        mSpPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            private ReMen remen;
            private FuJin fujin;

            @Override
            public CharSequence getPageTitle(int position) {
                return list.get(position);
            }

            @Override
            public Fragment getItem(int position) {

                if (position == 0) {
                    //当选中第一个tablayout标签时候,展示这个fragment
                    remen = new ReMen();
                    return remen;
                } else {
                    //选中其他tablayou标签时候,展示这个fragment
                    fujin = new FuJin();
                    return fujin;
                }
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        mSpTab.setupWithViewPager(mSpPager);
        return view;

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
