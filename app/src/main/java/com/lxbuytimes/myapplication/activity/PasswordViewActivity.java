package com.lxbuytimes.myapplication.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lxbuytimes.myapplication.R;
import com.lxbuytimes.myapplication.widget.IPasswordView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Create by JFZ
 * date: 2020-07-17 14:24
 **/
public class PasswordViewActivity extends AppCompatActivity {
    private IPasswordView pwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passwordview_activity);
        setTitle("密码控件");
        pwd = findViewById(R.id.pwd);
        pwd.setPasswordListener(new IPasswordView.PasswordListener() {
            @Override
            public void passwordChange(View view, String changeText) {
            }

            @Override
            public void passwordComplete(View view) {
                Toast.makeText(PasswordViewActivity.this, pwd.getPassword(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void keyEnterPress(View view, String password, boolean isComplete) {
            }
        });
    }
}
