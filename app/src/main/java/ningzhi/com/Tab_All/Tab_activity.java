package ningzhi.com.Tab_All;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import ningzhi.com.ToolUtils.LogUtils;
import ningzhi.com.gaojibang.R;

/**
 * Created by admin on 2016/8/4.
 */

public class Tab_activity extends AppCompatActivity {

    //定义tablayout作为底部tab按钮
    private TabLayout mTablayout;
    //界面的信息
    private ViewPager mViewPager;
    //底部维修的Tab选项
    private TabLayout.Tab Tab_Fxi;
    //底部商店的Tab选项
    private TabLayout.Tab Tab_Store;
    //底部论坛Tab选项
    private TabLayout.Tab Tab_Forum;
    //底部我的Tab选项
    private TabLayout.Tab Tab_My;
    //Tab字符集
    private String[] mTitles = new String[]{"维修", "商城", "论坛", "我的"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabactivity);
        initViews();
    }

    //初始化程序
    private void initViews() {
        mTablayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        //为viewpage配置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {

                if (position == 1) {
                    //适配Fix界面信息
                    LogUtils.d("适配Fix界面信息");
                    return new Tab_Fix_Fragment();
                } else if (position == 2) {
                    //适配商城界面信息
                    LogUtils.d("适配商城界面信息");
                    return new Tab_Fix_Fragment();
                } else if (position == 3) {
                    //适配论坛信息
                    LogUtils.d("适配论坛信息");
                    return new Tab_Fix_Fragment();
                } else
                    //适配我的信息
                Tab_My.setIcon(getResources().getDrawable(R.drawable.tab_my_avtivity));
                return new Tab_Fix_Fragment();
            }

            @Override
            public int getCount() {
                return mTitles.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitles[position];
            }
        });
        mTablayout.setupWithViewPager(mViewPager);
        Tab_Fxi = mTablayout.getTabAt(0);
        Tab_Store = mTablayout.getTabAt(1);
        Tab_Forum = mTablayout.getTabAt(2);
        Tab_My = mTablayout.getTabAt(3);
        Tab_Fxi.setIcon(getResources().getDrawable(R.drawable.tab_fix));
        Tab_Store.setIcon(getResources().getDrawable(R.drawable.tab_ftore));
        Tab_Forum.setIcon(getResources().getDrawable(R.drawable.tab_forum));
        Tab_My.setIcon(getResources().getDrawable(R.drawable.tab_my));
    }
}
