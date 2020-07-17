package com.lxbuytimes.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lxbuytimes.myapplication.activity.PasswordViewActivity;
import com.lxbuytimes.myapplication.activity.PasswordViewActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void passwordView(View view) {
        startActivity(new Intent(this, PasswordViewActivity.class));
    }
    public void passwordView2(View view) {
        startActivity(new Intent(this, PasswordViewActivity2.class));
    }
}
