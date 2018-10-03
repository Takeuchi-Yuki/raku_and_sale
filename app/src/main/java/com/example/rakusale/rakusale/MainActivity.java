package com.example.rakusale.rakusale;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_fav);

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new MainViewPagerAdapter((getSupportFragmentManager())));

        TabLayout tablayout = findViewById(R.id.shop_tab);
        tablayout.setupWithViewPager(viewPager);



    }
}
