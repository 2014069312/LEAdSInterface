package com.ust.leadsv2.androidlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SigninActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


    }

    public void forgotPassword (View view) {
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);
    }

    public void goToSignUp (View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    public void goToMainScreen (View view) {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }
}
