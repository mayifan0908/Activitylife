package com.yf.fengmai.activitylife;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by fengmai on 2017/3/29.
 */

public class Bactivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bactivity);
        Log.d("yf","B的"+"onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("yf","B的"+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("yf","B的"+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("yf","B的"+"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("yf","B的"+"onRestart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("yf","B的"+"onPostResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("yf","B的"+"onDestroy");
    }
}
