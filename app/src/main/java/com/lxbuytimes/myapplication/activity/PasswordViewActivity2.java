package com.lxbuytimes.myapplication.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lxbuytimes.myapplication.R;
import com.lxbuytimes.myapplication.widget.IPasswordView;
import com.lxbuytimes.myapplication.widget.IPasswordView2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Create by JFZ
 * date: 2020-07-17 14:24
 **/
public class PasswordViewActivity2 extends AppCompatActivity {
    private IPasswordView2 pwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passwordview2_activity);
        setTitle("密码控件");
        pwd = findViewById(R.id.pwd);
        pwd.setPasswordListener(new IPasswordView2.PasswordListener() {
            @Override
            public void passwordChange(View view, String changeText) {
            }

            @Override
            public void passwordComplete(View view) {
                Toast.makeText(PasswordViewActivity2.this, pwd.getPassword(), Toast.LENGTH_SHORT).show();
            }

        });
    }
}
