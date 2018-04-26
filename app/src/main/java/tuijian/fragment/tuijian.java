package tuijian.fragment;

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
 * Created by Lenovo on 2018/4/25.
 */
     //TableLayout+Viewpager+Fragmnet
public class tuijian extends Fragment {

    @BindView(R.id.tl_tab)
    TabLayout tabLayout;
    @BindView(R.id.vp_pager)
    ViewPager viewPager;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_tuijian, null);
        unbinder = ButterKnife.bind(this, inflate);

        final List<String> list = new ArrayList<>();
        //添加 2条数据,作为tablayout标签
        list.add("热门");
        list.add("关注");
        tabLayout.addTab(tabLayout.newTab().setText(list.get(0)),true);
        tabLayout.addTab(tabLayout.newTab().setText(list.get(1)),false);
        viewPager.setOffscreenPageLimit(list.size());
        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            private remen remen;
            private guanzhu guanzhu;

            @Override
            public CharSequence getPageTitle(int position) {
                return list.get(position);
            }

            @Override
            public Fragment getItem(int position) {

                if (position == 0) {
                    //当选中第一个tablayout标签时候,展示这个fragment
                    remen = new remen();
                    return remen;
                } else {
                    //选中其他tablayou标签时候,展示这个fragment
                    guanzhu = new guanzhu();
                    return guanzhu;
                }
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        //设置tablayout和viewpager联动
        tabLayout.setupWithViewPager(viewPager);
        return inflate;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
