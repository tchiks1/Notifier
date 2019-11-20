package com.be_group.notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import huxy.huxy.huxylab2.HuxyApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HuxyApp.successToast(MainActivity.this, "Good Internet Connection")
                .setPadding(3)
                .setPositionAndOffSet(Gravity.CENTER,0,0);
    }
}
