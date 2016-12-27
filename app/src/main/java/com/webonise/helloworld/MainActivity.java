package com.webonise.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends Activity {
    String msg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "the onCreate() Event called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(msg, "thr onStart() event called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(msg, "the onStop() event called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "the onDestroy event was called");
    }

}

