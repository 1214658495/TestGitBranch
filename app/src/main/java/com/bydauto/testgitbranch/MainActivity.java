package com.bydauto.testgitbranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: test");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
//dev1增加onStart方法
    @Override
    protected void onStart() {
        super.onStart();
    }
    //dev1增加onStop方法
    @Override
    protected void onStop() {
        Log.e(TAG, "onStop: ");
        super.onStop();
    }
}
