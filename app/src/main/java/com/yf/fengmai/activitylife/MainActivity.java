package com.yf.fengmai.activitylife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("yf","A的"+"onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("yf","A的"+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("yf","A的"+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("yf","A的"+"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("yf","A的"+"onRestart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("yf","A的"+"onPostResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("yf","A的"+"onDestroy");
    }
    public void onClick(View view){
        Intent intent=new Intent(this,Bactivity.class);
        startActivity(intent);
    }
}
