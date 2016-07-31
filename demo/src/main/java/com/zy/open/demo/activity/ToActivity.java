package com.zy.open.demo.activity;

import android.os.Bundle;
import android.util.Log;
import com.zy.demo.lib.ZYActivity;
import com.zy.open.demo.R;

public class ToActivity extends ZYActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

    }

    @Override
    protected void initData(Bundle savedBundle) {
        super.initData(savedBundle);
        Log.i("data", " data =  " + savedBundle.getInt("data"));
        saveToBundle("IntData", savedBundle.getInt("data") + 23);
        Log.i("data", " data =  " + savedBundle.getInt("IntData"));
    }
}