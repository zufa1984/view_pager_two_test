package uz.eskishahar.app.viewpager2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MyPagerAdapter.class.getName();

    private MyPagerAdapter mFragmentAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFragmentAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(mFragmentAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch(position) {
                case 0:
                    return new FragmentTwo();

                case 1:
                    return new FragmentThree();

                case 2:
                    return new FragmentFour();

                case 3:
                    return new FragmentFive();

                case 4:
                    return new FragmentOne();


                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch(position) {

                case 0:
                    return "Khazrati\nImam";

                case 1:
                    return "Sheikh\nZayniddin";

                case 2:
                    return "Minor";

                case 3:
                    return "Islam\nOta";

                case 4:
                    return "Sheikh Muhammad Sadiq\nMuhammad Yusuf";

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}