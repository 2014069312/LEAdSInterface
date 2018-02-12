package com.ust.leadsv2.androidlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void backToSignIn2 (View view) {
        Intent intent = new Intent(this,SigninActivity.class);
        startActivity(intent);
    }
}
