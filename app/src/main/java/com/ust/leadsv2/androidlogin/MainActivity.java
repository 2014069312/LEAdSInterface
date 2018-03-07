package com.ust.leadsv2.androidlogin;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private TextView mTextMessage;
    BottomNavigationView navigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new FragmentHome());

    }

    private boolean loadFragment(android.support.v4.app.Fragment fragment) {
        if (fragment != null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).commit();

            return true;
        }

        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        android.support.v4.app.Fragment fragment = null;

        switch (item.getItemId()) {

            case R.id.BottombarHome:
                fragment = new FragmentHome();
                break;

            case R.id.BottombarFaqs:
                fragment = new FragmentFaqs();
                break;

            case R.id.BottombarSettings:
                fragment = new FragmentSettings();
                break;
        }

        return loadFragment(fragment);
    }
}
