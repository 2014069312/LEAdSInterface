package com.ust.leadsv2.androidlogin;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        tabLayout = (TabLayout) findViewById(R.id.id_tablayout);
        appBarLayout = (AppBarLayout) findViewById(R.id.id_appbar);
        viewPager = (ViewPager) findViewById(R.id.id_viewpager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentHome(),"HOME");
        adapter.AddFragment(new FragmentFaqs(),"FAQs");
        adapter.AddFragment(new FragmentSettings(),"SETTINGS");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
