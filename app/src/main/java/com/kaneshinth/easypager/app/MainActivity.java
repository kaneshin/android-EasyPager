package com.kaneshinth.easypager.app;

import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity {

    private PagerAdapter mPagerAdapter;
    private MyFragment mFragmentRED;
    private MyFragment mFragmentGREEN;
    private MyFragment mFragmentBLUE;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mPagerAdapter);
    }

    private class PagerAdapter extends FragmentStatePagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    if (mFragmentRED == null) {
                        mFragmentRED = new MyFragment();
                        mFragmentRED.setColor(MyFragment.RED);
                    }
                    return mFragmentRED;
                case 1:
                    if (mFragmentGREEN == null) {
                        mFragmentGREEN = new MyFragment();
                        mFragmentGREEN.setColor(MyFragment.GREEN);
                    }
                    return mFragmentGREEN;
                case 2:
                    if (mFragmentBLUE == null) {
                        mFragmentBLUE = new MyFragment();
                        mFragmentBLUE.setColor(MyFragment.BLUE);
                    }
                    return mFragmentBLUE;
            }
            return new MyFragment();
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Red";
                case 1:
                    return "Green";
                case 2:
                    return "Blue";
            }
            return "";
        }
    }

}
