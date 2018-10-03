package com.example.rakusale.rakusale;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0){
            return new FavoriteFragment();
        }
        else if(i == 1){
            return new ShopFragment();
        }
        else {
            return new SearchFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "お気に入り";
        }
        else if(position == 1){
            return "お店";
        }
        else {
            return "検索";
        }
    }
}
